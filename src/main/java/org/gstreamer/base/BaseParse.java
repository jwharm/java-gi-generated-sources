package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This base class is for parser elements that process data and splits it
 * into separate audio/video/whatever frames.
 * <p>
 * It provides for:
 * <p>
 *   * provides one sink pad and one source pad
 *   * handles state changes
 *   * can operate in pull mode or push mode
 *   * handles seeking in both modes
 *   * handles events (SEGMENT/EOS/FLUSH)
 *   * handles queries (POSITION/DURATION/SEEKING/FORMAT/CONVERT)
 *   * handles flushing
 * <p>
 * The purpose of this base class is to provide the basic functionality of
 * a parser and share a lot of rather complex code.
 * <p>
 * <strong>Description of the parsing mechanism:</strong><br/>
 * <strong>Set-up phase</strong><br/>
 *  * {@link BaseParse} calls {@link BaseParseClass}::start to inform subclass
 *    that data processing is about to start now.
 * <p>
 *  * {@link BaseParse} class calls {@link BaseParseClass}::set_sink_caps to
 *    inform the subclass about incoming sinkpad caps. Subclass could
 *    already set the srcpad caps accordingly, but this might be delayed
 *    until calling gst_base_parse_finish_frame() with a non-queued frame.
 * <p>
 *  * At least at this point subclass needs to tell the {@link BaseParse} class
 *    how big data chunks it wants to receive (minimum frame size ). It can
 *    do this with gst_base_parse_set_min_frame_size().
 * <p>
 *  * {@link BaseParse} class sets up appropriate data passing mode (pull/push)
 *    and starts to process the data.
 * <p>
 * <strong>Parsing phase</strong><br/>
 *  * {@link BaseParse} gathers at least min_frame_size bytes of data either
 *    by pulling it from upstream or collecting buffers in an internal
 *    {@link Adapter}.
 * <p>
 *  * A buffer of (at least) min_frame_size bytes is passed to subclass
 *    with {@link BaseParseClass}::handle_frame. Subclass checks the contents
 *    and can optionally return {@code GST_FLOW_OK} along with an amount of data
 *    to be skipped to find a valid frame (which will result in a
 *    subsequent DISCONT).  If, otherwise, the buffer does not hold a
 *    complete frame, {@link BaseParseClass}::handle_frame can merely return
 *    and will be called again when additional data is available.  In push
 *    mode this amounts to an additional input buffer (thus minimal
 *    additional latency), in pull mode this amounts to some arbitrary
 *    reasonable buffer size increase.
 * <p>
 *    Of course, gst_base_parse_set_min_frame_size() could also be used if
 *    a very specific known amount of additional data is required.  If,
 *    however, the buffer holds a complete valid frame, it can pass the
 *    size of this frame to gst_base_parse_finish_frame().
 * <p>
 *    If acting as a converter, it can also merely indicate consumed input
 *    data while simultaneously providing custom output data.  Note that
 *    baseclass performs some processing (such as tracking overall consumed
 *    data rate versus duration) for each finished frame, but other state
 *    is only updated upon each call to {@link BaseParseClass}::handle_frame
 *    (such as tracking upstream input timestamp).
 * <p>
 *    Subclass is also responsible for setting the buffer metadata
 *    (e.g. buffer timestamp and duration, or keyframe if applicable).
 *    (although the latter can also be done by {@link BaseParse} if it is
 *    appropriately configured, see below).  Frame is provided with
 *    timestamp derived from upstream (as much as generally possible),
 *    duration obtained from configuration (see below), and offset
 *    if meaningful (in pull mode).
 * <p>
 *    Note that {@link BaseParseClass}::handle_frame might receive any small
 *    amount of input data when leftover data is being drained (e.g. at
 *    EOS).
 * <p>
 *  * As part of finish frame processing, just prior to actually pushing
 *    the buffer in question, it is passed to
 *    {@link BaseParseClass}::pre_push_frame which gives subclass yet one last
 *    chance to examine buffer metadata, or to send some custom (tag)
 *    events, or to perform custom (segment) filtering.
 * <p>
 *  * During the parsing process {@link BaseParseClass} will handle both srcpad
 *    and sinkpad events. They will be passed to subclass if
 *    {@link BaseParseClass}::sink_event or {@link BaseParseClass}::src_event
 *    implementations have been provided.
 * <p>
 * <strong>Shutdown phase</strong><br/>
 * * {@link BaseParse} class calls {@link BaseParseClass}::stop to inform the
 *   subclass that data parsing will be stopped.
 * <p>
 * Subclass is responsible for providing pad template caps for source and
 * sink pads. The pads need to be named "sink" and "src". It also needs to
 * set the fixed caps on srcpad, when the format is ensured (e.g.  when
 * base class calls subclass' {@link BaseParseClass}::set_sink_caps function).
 * <p>
 * This base class uses {@link org.gstreamer.gst.Format#DEFAULT} as a meaning of frames. So,
 * subclass conversion routine needs to know that conversion from
 * {@link org.gstreamer.gst.Format#TIME} to {@link org.gstreamer.gst.Format#DEFAULT} must return the
 * frame number that can be found from the given byte position.
 * <p>
 * {@link BaseParse} uses subclasses conversion methods also for seeking (or
 * otherwise uses its own default one, see also below).
 * <p>
 * Subclass {@code start} and {@code stop} functions will be called to inform the beginning
 * and end of data processing.
 * <p>
 * Things that subclass need to take care of:
 * <p>
 * * Provide pad templates
 * * Fixate the source pad caps when appropriate
 * * Inform base class how big data chunks should be retrieved. This is
 *   done with gst_base_parse_set_min_frame_size() function.
 * * Examine data chunks passed to subclass with
 *   {@link BaseParseClass}::handle_frame and pass proper frame(s) to
 *   gst_base_parse_finish_frame(), and setting src pad caps and timestamps
 *   on frame.
 * * Provide conversion functions
 * * Update the duration information with gst_base_parse_set_duration()
 * * Optionally passthrough using gst_base_parse_set_passthrough()
 * * Configure various baseparse parameters using
 *   gst_base_parse_set_average_bitrate(), gst_base_parse_set_syncable()
 *   and gst_base_parse_set_frame_rate().
 * <p>
 * * In particular, if subclass is unable to determine a duration, but
 *   parsing (or specs) yields a frames per seconds rate, then this can be
 *   provided to {@link BaseParse} to enable it to cater for buffer time
 *   metadata (which will be taken from upstream as much as
 *   possible). Internally keeping track of frame durations and respective
 *   sizes that have been pushed provides {@link BaseParse} with an estimated
 *   bitrate. A default {@link BaseParseClass}::convert (used if not
 *   overridden) will then use these rates to perform obvious conversions.
 *   These rates are also used to update (estimated) duration at regular
 *   frame intervals.
 */
public class BaseParse extends org.gstreamer.gst.Element {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseParse";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
        Interop.valueLayout.ADDRESS.withName("sinkpad"),
        Interop.valueLayout.ADDRESS.withName("srcpad"),
        Interop.valueLayout.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        org.gstreamer.gst.Segment.getMemoryLayout().withName("segment"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a BaseParse proxy instance for the provided memory address.
     * <p>
     * Because BaseParse is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BaseParse(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to BaseParse if its GType is a (or inherits from) "GstBaseParse".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BaseParse} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstBaseParse", a ClassCastException will be thrown.
     */
    public static BaseParse castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), BaseParse.getType())) {
            return new BaseParse(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstBaseParse");
        }
    }
    
    /**
     * Adds an entry to the index associating {@code offset} to {@code ts}.  It is recommended
     * to only add keyframe entries.  {@code force} allows to bypass checks, such as
     * whether the stream is (upstream) seekable, another entry is already "close"
     * to the new entry, etc.
     * @param offset offset of entry
     * @param ts timestamp associated with offset
     * @param key whether entry refers to keyframe
     * @param force add entry disregarding sanity checks
     * @return {@code gboolean} indicating whether entry was added
     */
    public boolean addIndexEntry(long offset, @NotNull org.gstreamer.gst.ClockTime ts, boolean key, boolean force) {
        java.util.Objects.requireNonNull(ts, "Parameter 'ts' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_parse_add_index_entry.invokeExact(
                    handle(),
                    offset,
                    ts.getValue().longValue(),
                    key ? 1 : 0,
                    force ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Default implementation of {@link BaseParseClass}::convert.
     * @param srcFormat {@link org.gstreamer.gst.Format} describing the source format.
     * @param srcValue Source value to be converted.
     * @param destFormat {@link org.gstreamer.gst.Format} defining the converted format.
     * @param destValue Pointer where the conversion result will be put.
     * @return {@code true} if conversion was successful.
     */
    public boolean convertDefault(@NotNull org.gstreamer.gst.Format srcFormat, long srcValue, @NotNull org.gstreamer.gst.Format destFormat, Out<Long> destValue) {
        java.util.Objects.requireNonNull(srcFormat, "Parameter 'srcFormat' must not be null");
        java.util.Objects.requireNonNull(destFormat, "Parameter 'destFormat' must not be null");
        java.util.Objects.requireNonNull(destValue, "Parameter 'destValue' must not be null");
        MemorySegment destValuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_parse_convert_default.invokeExact(
                    handle(),
                    srcFormat.getValue(),
                    srcValue,
                    destFormat.getValue(),
                    (Addressable) destValuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        destValue.set(destValuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Drains the adapter until it is empty. It decreases the min_frame_size to
     * match the current adapter size and calls chain method until the adapter
     * is emptied or chain returns with error.
     */
    public void drain() {
        try {
            DowncallHandles.gst_base_parse_drain.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Collects parsed data and pushes this downstream.
     * Source pad caps must be set when this is called.
     * <p>
     * If {@code frame}'s out_buffer is set, that will be used as subsequent frame data.
     * Otherwise, {@code size} samples will be taken from the input and used for output,
     * and the output's metadata (timestamps etc) will be taken as (optionally)
     * set by the subclass on {@code frame}'s (input) buffer (which is otherwise
     * ignored for any but the above purpose/information).
     * <p>
     * Note that the latter buffer is invalidated by this call, whereas the
     * caller retains ownership of {@code frame}.
     * @param frame a {@link BaseParseFrame}
     * @param size consumed input data represented by frame
     * @return a {@link org.gstreamer.gst.FlowReturn} that should be escalated to caller (of caller)
     */
    public @NotNull org.gstreamer.gst.FlowReturn finishFrame(@NotNull org.gstreamer.base.BaseParseFrame frame, int size) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_parse_finish_frame.invokeExact(
                    handle(),
                    frame.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Sets the parser subclass's tags and how they should be merged with any
     * upstream stream tags. This will override any tags previously-set
     * with gst_base_parse_merge_tags().
     * <p>
     * Note that this is provided for convenience, and the subclass is
     * not required to use this and can still do tag handling on its own.
     * @param tags a {@link org.gstreamer.gst.TagList} to merge, or NULL to unset
     *     previously-set tags
     * @param mode the {@link org.gstreamer.gst.TagMergeMode} to use, usually {@code GST_TAG_MERGE_REPLACE}
     */
    public void mergeTags(@Nullable org.gstreamer.gst.TagList tags, @NotNull org.gstreamer.gst.TagMergeMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gst_base_parse_merge_tags.invokeExact(
                    handle(),
                    (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pushes the frame's buffer downstream, sends any pending events and
     * does some timestamp and segment handling. Takes ownership of
     * frame's buffer, though caller retains ownership of {@code frame}.
     * <p>
     * This must be called with sinkpad STREAM_LOCK held.
     * @param frame a {@link BaseParseFrame}
     * @return {@link org.gstreamer.gst.FlowReturn}
     */
    public @NotNull org.gstreamer.gst.FlowReturn pushFrame(@NotNull org.gstreamer.base.BaseParseFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_parse_push_frame.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Optionally sets the average bitrate detected in media (if non-zero),
     * e.g. based on metadata, as it will be posted to the application.
     * <p>
     * By default, announced average bitrate is estimated. The average bitrate
     * is used to estimate the total duration of the stream and to estimate
     * a seek position, if there's no index and the format is syncable
     * (see gst_base_parse_set_syncable()).
     * @param bitrate average bitrate in bits/second
     */
    public void setAverageBitrate(int bitrate) {
        try {
            DowncallHandles.gst_base_parse_set_average_bitrate.invokeExact(
                    handle(),
                    bitrate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the duration of the currently playing media. Subclass can use this
     * when it is able to determine duration and/or notices a change in the media
     * duration.  Alternatively, if {@code interval} is non-zero (default), then stream
     * duration is determined based on estimated bitrate, and updated every {@code interval}
     * frames.
     * @param fmt {@link org.gstreamer.gst.Format}.
     * @param duration duration value.
     * @param interval how often to update the duration estimate based on bitrate, or 0.
     */
    public void setDuration(@NotNull org.gstreamer.gst.Format fmt, long duration, int interval) {
        java.util.Objects.requireNonNull(fmt, "Parameter 'fmt' must not be null");
        try {
            DowncallHandles.gst_base_parse_set_duration.invokeExact(
                    handle(),
                    fmt.getValue(),
                    duration,
                    interval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If frames per second is configured, parser can take care of buffer duration
     * and timestamping.  When performing segment clipping, or seeking to a specific
     * location, a corresponding decoder might need an initial {@code lead_in} and a
     * following {@code lead_out} number of frames to ensure the desired segment is
     * entirely filled upon decoding.
     * @param fpsNum frames per second (numerator).
     * @param fpsDen frames per second (denominator).
     * @param leadIn frames needed before a segment for subsequent decode
     * @param leadOut frames needed after a segment
     */
    public void setFrameRate(int fpsNum, int fpsDen, int leadIn, int leadOut) {
        try {
            DowncallHandles.gst_base_parse_set_frame_rate.invokeExact(
                    handle(),
                    fpsNum,
                    fpsDen,
                    leadIn,
                    leadOut);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set if frames carry timing information which the subclass can (generally)
     * parse and provide.  In particular, intrinsic (rather than estimated) time
     * can be obtained following a seek.
     * @param hasTiming whether frames carry timing information
     */
    public void setHasTimingInfo(boolean hasTiming) {
        try {
            DowncallHandles.gst_base_parse_set_has_timing_info.invokeExact(
                    handle(),
                    hasTiming ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * By default, the base class might try to infer PTS from DTS and vice
     * versa.  While this is generally correct for audio data, it may not
     * be otherwise. Sub-classes implementing such formats should disable
     * timestamp inferring.
     * @param inferTs {@code true} if parser should infer DTS/PTS from each other
     */
    public void setInferTs(boolean inferTs) {
        try {
            DowncallHandles.gst_base_parse_set_infer_ts.invokeExact(
                    handle(),
                    inferTs ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum and maximum (which may likely be equal) latency introduced
     * by the parsing process.  If there is such a latency, which depends on the
     * particular parsing of the format, it typically corresponds to 1 frame duration.
     * @param minLatency minimum parse latency
     * @param maxLatency maximum parse latency
     */
    public void setLatency(@NotNull org.gstreamer.gst.ClockTime minLatency, @NotNull org.gstreamer.gst.ClockTime maxLatency) {
        java.util.Objects.requireNonNull(minLatency, "Parameter 'minLatency' must not be null");
        java.util.Objects.requireNonNull(maxLatency, "Parameter 'maxLatency' must not be null");
        try {
            DowncallHandles.gst_base_parse_set_latency.invokeExact(
                    handle(),
                    minLatency.getValue().longValue(),
                    maxLatency.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Subclass can use this function to tell the base class that it needs to
     * be given buffers of at least {@code min_size} bytes.
     * @param minSize Minimum size in bytes of the data that this base class should
     *       give to subclass.
     */
    public void setMinFrameSize(int minSize) {
        try {
            DowncallHandles.gst_base_parse_set_min_frame_size.invokeExact(
                    handle(),
                    minSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set if the nature of the format or configuration does not allow (much)
     * parsing, and the parser should operate in passthrough mode (which only
     * applies when operating in push mode). That is, incoming buffers are
     * pushed through unmodified, i.e. no {@link BaseParseClass}::handle_frame
     * will be invoked, but {@link BaseParseClass}::pre_push_frame will still be
     * invoked, so subclass can perform as much or as little is appropriate for
     * passthrough semantics in {@link BaseParseClass}::pre_push_frame.
     * @param passthrough {@code true} if parser should run in passthrough mode
     */
    public void setPassthrough(boolean passthrough) {
        try {
            DowncallHandles.gst_base_parse_set_passthrough.invokeExact(
                    handle(),
                    passthrough ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * By default, the base class will guess PTS timestamps using a simple
     * interpolation (previous timestamp + duration), which is incorrect for
     * data streams with reordering, where PTS can go backward. Sub-classes
     * implementing such formats should disable PTS interpolation.
     * @param ptsInterpolate {@code true} if parser should interpolate PTS timestamps
     */
    public void setPtsInterpolation(boolean ptsInterpolate) {
        try {
            DowncallHandles.gst_base_parse_set_pts_interpolation.invokeExact(
                    handle(),
                    ptsInterpolate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set if frame starts can be identified. This is set by default and
     * determines whether seeking based on bitrate averages
     * is possible for a format/stream.
     * @param syncable set if frame starts can be identified
     */
    public void setSyncable(boolean syncable) {
        try {
            DowncallHandles.gst_base_parse_set_syncable.invokeExact(
                    handle(),
                    syncable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function should only be called from a {@code handle_frame} implementation.
     * <p>
     * {@link BaseParse} creates initial timestamps for frames by using the last
     * timestamp seen in the stream before the frame starts.  In certain
     * cases, the correct timestamps will occur in the stream after the
     * start of the frame, but before the start of the actual picture data.
     * This function can be used to set the timestamps based on the offset
     * into the frame data that the picture starts.
     * @param offset offset into current buffer
     */
    public void setTsAtOffset(long offset) {
        try {
            DowncallHandles.gst_base_parse_set_ts_at_offset.invokeExact(
                    handle(),
                    offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_parse_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Element.Build {
        
         /**
         * A {@link BaseParse.Build} object constructs a {@link BaseParse} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link BaseParse} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BaseParse} using {@link BaseParse#castFrom}.
         * @return A new instance of {@code BaseParse} with the properties 
         *         that were set in the Build object.
         */
        public BaseParse construct() {
            return BaseParse.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    BaseParse.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If set to {@code true}, baseparse will unconditionally force parsing of the
         * incoming data. This can be required in the rare cases where the incoming
         * side-data (caps, pts, dts, ...) is not trusted by the user and wants to
         * force validation and parsing of the incoming data.
         * If set to {@code false}, decision of whether to parse the data or not is up to
         * the implementation (standard behaviour).
         * @param disablePassthrough The value for the {@code disable-passthrough} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisablePassthrough(boolean disablePassthrough) {
            names.add("disable-passthrough");
            values.add(org.gtk.gobject.Value.create(disablePassthrough));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_base_parse_add_index_entry = Interop.downcallHandle(
            "gst_base_parse_add_index_entry",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_convert_default = Interop.downcallHandle(
            "gst_base_parse_convert_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_parse_drain = Interop.downcallHandle(
            "gst_base_parse_drain",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_parse_finish_frame = Interop.downcallHandle(
            "gst_base_parse_finish_frame",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_merge_tags = Interop.downcallHandle(
            "gst_base_parse_merge_tags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_push_frame = Interop.downcallHandle(
            "gst_base_parse_push_frame",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_average_bitrate = Interop.downcallHandle(
            "gst_base_parse_set_average_bitrate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_duration = Interop.downcallHandle(
            "gst_base_parse_set_duration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_frame_rate = Interop.downcallHandle(
            "gst_base_parse_set_frame_rate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_has_timing_info = Interop.downcallHandle(
            "gst_base_parse_set_has_timing_info",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_infer_ts = Interop.downcallHandle(
            "gst_base_parse_set_infer_ts",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_latency = Interop.downcallHandle(
            "gst_base_parse_set_latency",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_min_frame_size = Interop.downcallHandle(
            "gst_base_parse_set_min_frame_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_passthrough = Interop.downcallHandle(
            "gst_base_parse_set_passthrough",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_pts_interpolation = Interop.downcallHandle(
            "gst_base_parse_set_pts_interpolation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_syncable = Interop.downcallHandle(
            "gst_base_parse_set_syncable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_set_ts_at_offset = Interop.downcallHandle(
            "gst_base_parse_set_ts_at_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_base_parse_get_type = Interop.downcallHandle(
            "gst_base_parse_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
