package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This base class is for audio decoders turning encoded data into
 * raw audio samples.
 * <p>
 * GstAudioDecoder and subclass should cooperate as follows.
 * <p>
 * <strong>Configuration</strong><br/>
 *   * Initially, GstAudioDecoder calls {@code start} when the decoder element
 *     is activated, which allows subclass to perform any global setup.
 *     Base class (context) parameters can already be set according to subclass
 *     capabilities (or possibly upon receive more information in subsequent
 *     {@code set_format}).
 *   * GstAudioDecoder calls {@code set_format} to inform subclass of the format
 *     of input audio data that it is about to receive.
 *     While unlikely, it might be called more than once, if changing input
 *     parameters require reconfiguration.
 *   * GstAudioDecoder calls {@code stop} at end of all processing.
 * <p>
 * As of configuration stage, and throughout processing, GstAudioDecoder
 * provides various (context) parameters, e.g. describing the format of
 * output audio data (valid when output caps have been set) or current parsing state.
 * Conversely, subclass can and should configure context to inform
 * base class of its expectation w.r.t. buffer handling.
 * <p>
 * <strong>Data processing</strong><br/>
 *     * Base class gathers input data, and optionally allows subclass
 *       to parse this into subsequently manageable (as defined by subclass)
 *       chunks.  Such chunks are subsequently referred to as 'frames',
 *       though they may or may not correspond to 1 (or more) audio format frame.
 *     * Input frame is provided to subclass' {@code handle_frame}.
 *     * If codec processing results in decoded data, subclass should call
 *       {@code gst_audio_decoder_finish_frame} to have decoded data pushed
 *       downstream.
 *     * Just prior to actually pushing a buffer downstream,
 *       it is passed to {@code pre_push}.  Subclass should either use this callback
 *       to arrange for additional downstream pushing or otherwise ensure such
 *       custom pushing occurs after at least a method call has finished since
 *       setting src pad caps.
 *     * During the parsing process GstAudioDecoderClass will handle both
 *       srcpad and sinkpad events. Sink events will be passed to subclass
 *       if {@code event} callback has been provided.
 * <p>
 * <strong>Shutdown phase</strong><br/>
 *   * GstAudioDecoder class calls {@code stop} to inform the subclass that data
 *     parsing will be stopped.
 * <p>
 * Subclass is responsible for providing pad template caps for
 * source and sink pads. The pads need to be named "sink" and "src". It also
 * needs to set the fixed caps on srcpad, when the format is ensured.  This
 * is typically when base class calls subclass' {@code set_format} function, though
 * it might be delayed until calling {@code gst_audio_decoder_finish_frame}.
 * <p>
 * In summary, above process should have subclass concentrating on
 * codec data processing while leaving other matters to base class,
 * such as most notably timestamp handling.  While it may exert more control
 * in this area (see e.g. {@code pre_push}), it is very much not recommended.
 * <p>
 * In particular, base class will try to arrange for perfect output timestamps
 * as much as possible while tracking upstream timestamps.
 * To this end, if deviation between the next ideal expected perfect timestamp
 * and upstream exceeds {@link AudioDecoder}:tolerance, then resync to upstream
 * occurs (which would happen always if the tolerance mechanism is disabled).
 * <p>
 * In non-live pipelines, baseclass can also (configurably) arrange for
 * output buffer aggregation which may help to redue large(r) numbers of
 * small(er) buffers being pushed and processed downstream. Note that this
 * feature is only available if the buffer layout is interleaved. For planar
 * buffers, the decoder implementation is fully responsible for the output
 * buffer size.
 * <p>
 * On the other hand, it should be noted that baseclass only provides limited
 * seeking support (upon explicit subclass request), as full-fledged support
 * should rather be left to upstream demuxer, parser or alike.  This simple
 * approach caters for seeking and duration reporting using estimated input
 * bitrates.
 * <p>
 * Things that subclass need to take care of:
 * <p>
 *   * Provide pad templates
 *   * Set source pad caps when appropriate
 *   * Set user-configurable properties to sane defaults for format and
 *      implementing codec at hand, and convey some subclass capabilities and
 *      expectations in context.
 * <p>
 *   * Accept data in {@code handle_frame} and provide encoded results to
 *      {@code gst_audio_decoder_finish_frame}.  If it is prepared to perform
 *      PLC, it should also accept NULL data in {@code handle_frame} and provide for
 *      data for indicated duration.
 */
public class AudioDecoder extends org.gstreamer.gst.Element {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioDecoder";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
            Interop.valueLayout.ADDRESS.withName("sinkpad"),
            Interop.valueLayout.ADDRESS.withName("srcpad"),
            org.gtk.glib.RecMutex.getMemoryLayout().withName("stream_lock"),
            org.gstreamer.gst.Segment.getMemoryLayout().withName("input_segment"),
            org.gstreamer.gst.Segment.getMemoryLayout().withName("output_segment"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioDecoder proxy instance for the provided memory address.
     * <p>
     * Because AudioDecoder is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioDecoder(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioDecoder> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioDecoder(input, ownership);
    
    /**
     * Helper function that allocates a buffer to hold an audio frame
     * for {@code dec}'s current output format.
     * @param size size of the buffer
     * @return allocated buffer
     */
    public org.gstreamer.gst.Buffer allocateOutputBuffer(long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_decoder_allocate_output_buffer.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Collects decoded data and pushes it downstream.
     * <p>
     * {@code buf} may be NULL in which case the indicated number of frames
     * are discarded and considered to have produced no output
     * (e.g. lead-in or setup frames).
     * Otherwise, source pad caps must be set when it is called with valid
     * data in {@code buf}.
     * <p>
     * Note that a frame received in {@link AudioDecoderClass}.handle_frame() may be
     * invalidated by a call to this function.
     * @param buf decoded data
     * @param frames number of decoded frames represented by decoded data
     * @return a {@link org.gstreamer.gst.FlowReturn} that should be escalated to caller (of caller)
     */
    public org.gstreamer.gst.FlowReturn finishFrame(@Nullable org.gstreamer.gst.Buffer buf, int frames) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_finish_frame.invokeExact(
                    handle(),
                    (Addressable) (buf == null ? MemoryAddress.NULL : buf.handle()),
                    frames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buf.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Collects decoded data and pushes it downstream. This function may be called
     * multiple times for a given input frame.
     * <p>
     * {@code buf} may be NULL in which case it is assumed that the current input frame is
     * finished. This is equivalent to calling gst_audio_decoder_finish_subframe()
     * with a NULL buffer and frames=1 after having pushed out all decoded audio
     * subframes using this function.
     * <p>
     * When called with valid data in {@code buf} the source pad caps must have been set
     * already.
     * <p>
     * Note that a frame received in {@link AudioDecoderClass}.handle_frame() may be
     * invalidated by a call to this function.
     * @param buf decoded data
     * @return a {@link org.gstreamer.gst.FlowReturn} that should be escalated to caller (of caller)
     */
    public org.gstreamer.gst.FlowReturn finishSubframe(@Nullable org.gstreamer.gst.Buffer buf) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_finish_subframe.invokeExact(
                    handle(),
                    (Addressable) (buf == null ? MemoryAddress.NULL : buf.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buf.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Lets {@link AudioDecoder} sub-classes to know the memory {@code allocator}
     * used by the base class and its {@code params}.
     * <p>
     * Unref the {@code allocator} after use it.
     * @param allocator the {@link org.gstreamer.gst.Allocator}
     * used
     * @param params the
     * {@link org.gstreamer.gst.AllocationParams} of {@code allocator}
     */
    public void getAllocator(@Nullable Out<org.gstreamer.gst.Allocator> allocator, @Nullable org.gstreamer.gst.AllocationParams params) {
        MemorySegment allocatorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_audio_decoder_get_allocator.invokeExact(
                    handle(),
                    (Addressable) (allocator == null ? MemoryAddress.NULL : (Addressable) allocatorPOINTER.address()),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (allocator != null) allocator.set((org.gstreamer.gst.Allocator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gst.Allocator.fromAddress).marshal(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        params.yieldOwnership();
    }
    
    public org.gstreamer.audio.AudioInfo getAudioInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_decoder_get_audio_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    public int getDelay() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_get_delay.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries decoder drain handling.
     * @return TRUE if drainable handling is enabled.
     * <p>
     * MT safe.
     */
    public boolean getDrainable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_get_drainable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public int getEstimateRate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_get_estimate_rate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the variables pointed to by {@code min} and {@code max} to the currently configured
     * latency.
     * @param min a pointer to storage to hold minimum latency
     * @param max a pointer to storage to hold maximum latency
     */
    public void getLatency(@Nullable org.gstreamer.gst.ClockTime min, @Nullable org.gstreamer.gst.ClockTime max) {
        MemorySegment minPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment maxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_audio_decoder_get_latency.invokeExact(
                    handle(),
                    (Addressable) (min == null ? MemoryAddress.NULL : (Addressable) minPOINTER.address()),
                    (Addressable) (max == null ? MemoryAddress.NULL : (Addressable) maxPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (min != null) min.setValue(minPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (max != null) max.setValue(maxPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    public int getMaxErrors() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_get_max_errors.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries decoder's latency aggregation.
     * @return aggregation latency.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.ClockTime getMinLatency() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_decoder_get_min_latency.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Queries decoder required format handling.
     * @return TRUE if required format handling is enabled.
     * <p>
     * MT safe.
     */
    public boolean getNeedsFormat() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_get_needs_format.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Return current parsing (sync and eos) state.
     * @param sync a pointer to a variable to hold the current sync state
     * @param eos a pointer to a variable to hold the current eos state
     */
    public void getParseState(Out<Boolean> sync, Out<Boolean> eos) {
        MemorySegment syncPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment eosPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_audio_decoder_get_parse_state.invokeExact(
                    handle(),
                    (Addressable) (sync == null ? MemoryAddress.NULL : (Addressable) syncPOINTER.address()),
                    (Addressable) (eos == null ? MemoryAddress.NULL : (Addressable) eosPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (sync != null) sync.set(syncPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        if (eos != null) eos.set(eosPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Queries decoder packet loss concealment handling.
     * @return TRUE if packet loss concealment is enabled.
     * <p>
     * MT safe.
     */
    public boolean getPlc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_get_plc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public int getPlcAware() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_get_plc_aware.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries current audio jitter tolerance threshold.
     * @return decoder audio jitter tolerance threshold.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.ClockTime getTolerance() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_decoder_get_tolerance.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Sets the audio decoder tags and how they should be merged with any
     * upstream stream tags. This will override any tags previously-set
     * with gst_audio_decoder_merge_tags().
     * <p>
     * Note that this is provided for convenience, and the subclass is
     * not required to use this and can still do tag handling on its own.
     * @param tags a {@link org.gstreamer.gst.TagList} to merge, or NULL
     * @param mode the {@link org.gstreamer.gst.TagMergeMode} to use, usually {@code GST_TAG_MERGE_REPLACE}
     */
    public void mergeTags(@Nullable org.gstreamer.gst.TagList tags, org.gstreamer.gst.TagMergeMode mode) {
        try {
            DowncallHandles.gst_audio_decoder_merge_tags.invokeExact(
                    handle(),
                    (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Negotiate with downstream elements to currently configured {@link AudioInfo}.
     * Unmark GST_PAD_FLAG_NEED_RECONFIGURE in any case. But mark it again if
     * negotiate fails.
     * @return {@code true} if the negotiation succeeded, else {@code false}.
     */
    public boolean negotiate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_negotiate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns caps that express {@code caps} (or sink template caps if {@code caps} == NULL)
     * restricted to rate/channels/... combinations supported by downstream
     * elements.
     * @param caps initial caps
     * @param filter filter caps
     * @return a {@link org.gstreamer.gst.Caps} owned by caller
     */
    public org.gstreamer.gst.Caps proxyGetcaps(@Nullable org.gstreamer.gst.Caps caps, @Nullable org.gstreamer.gst.Caps filter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_decoder_proxy_getcaps.invokeExact(
                    handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets a caps in allocation query which are different from the set
     * pad's caps. Use this function before calling
     * gst_audio_decoder_negotiate(). Setting to {@code null} the allocation
     * query will use the caps from the pad.
     * @param allocationCaps a {@link org.gstreamer.gst.Caps} or {@code null}
     */
    public void setAllocationCaps(@Nullable org.gstreamer.gst.Caps allocationCaps) {
        try {
            DowncallHandles.gst_audio_decoder_set_allocation_caps.invokeExact(
                    handle(),
                    (Addressable) (allocationCaps == null ? MemoryAddress.NULL : allocationCaps.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures decoder drain handling.  If drainable, subclass might
     * be handed a NULL buffer to have it return any leftover decoded data.
     * Otherwise, it is not considered so capable and will only ever be passed
     * real data.
     * <p>
     * MT safe.
     * @param enabled new state
     */
    public void setDrainable(boolean enabled) {
        try {
            DowncallHandles.gst_audio_decoder_set_drainable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allows baseclass to perform byte to time estimated conversion.
     * @param enabled whether to enable byte to time conversion
     */
    public void setEstimateRate(boolean enabled) {
        try {
            DowncallHandles.gst_audio_decoder_set_estimate_rate.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets decoder latency.
     * @param min minimum latency
     * @param max maximum latency
     */
    public void setLatency(org.gstreamer.gst.ClockTime min, org.gstreamer.gst.ClockTime max) {
        try {
            DowncallHandles.gst_audio_decoder_set_latency.invokeExact(
                    handle(),
                    min.getValue().longValue(),
                    max.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets numbers of tolerated decoder errors, where a tolerated one is then only
     * warned about, but more than tolerated will lead to fatal error. You can set
     * -1 for never returning fatal errors. Default is set to
     * GST_AUDIO_DECODER_MAX_ERRORS.
     * @param num max tolerated errors
     */
    public void setMaxErrors(int num) {
        try {
            DowncallHandles.gst_audio_decoder_set_max_errors.invokeExact(
                    handle(),
                    num);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets decoder minimum aggregation latency.
     * <p>
     * MT safe.
     * @param num new minimum latency
     */
    public void setMinLatency(org.gstreamer.gst.ClockTime num) {
        try {
            DowncallHandles.gst_audio_decoder_set_min_latency.invokeExact(
                    handle(),
                    num.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures decoder format needs.  If enabled, subclass needs to be
     * negotiated with format caps before it can process any data.  It will then
     * never be handed any data before it has been configured.
     * Otherwise, it might be handed data without having been configured and
     * is then expected being able to do so either by default
     * or based on the input data.
     * <p>
     * MT safe.
     * @param enabled new state
     */
    public void setNeedsFormat(boolean enabled) {
        try {
            DowncallHandles.gst_audio_decoder_set_needs_format.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configure output caps on the srcpad of {@code dec}. Similar to
     * gst_audio_decoder_set_output_format(), but allows subclasses to specify
     * output caps that can't be expressed via {@link AudioInfo} e.g. caps that have
     * caps features.
     * @param caps (fixed) {@link org.gstreamer.gst.Caps}
     * @return {@code true} on success.
     */
    public boolean setOutputCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_set_output_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Configure output info on the srcpad of {@code dec}.
     * @param info {@link AudioInfo}
     * @return {@code true} on success.
     */
    public boolean setOutputFormat(org.gstreamer.audio.AudioInfo info) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_decoder_set_output_format.invokeExact(
                    handle(),
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Enable or disable decoder packet loss concealment, provided subclass
     * and codec are capable and allow handling plc.
     * <p>
     * MT safe.
     * @param enabled new state
     */
    public void setPlc(boolean enabled) {
        try {
            DowncallHandles.gst_audio_decoder_set_plc.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Indicates whether or not subclass handles packet loss concealment (plc).
     * @param plc new plc state
     */
    public void setPlcAware(boolean plc) {
        try {
            DowncallHandles.gst_audio_decoder_set_plc_aware.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(plc, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures decoder audio jitter tolerance threshold.
     * <p>
     * MT safe.
     * @param tolerance new tolerance
     */
    public void setTolerance(org.gstreamer.gst.ClockTime tolerance) {
        try {
            DowncallHandles.gst_audio_decoder_set_tolerance.invokeExact(
                    handle(),
                    tolerance.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Lets {@link AudioDecoder} sub-classes decide if they want the sink pad
     * to use the default pad query handler to reply to accept-caps queries.
     * <p>
     * By setting this to true it is possible to further customize the default
     * handler with {@code GST_PAD_SET_ACCEPT_INTERSECT} and
     * {@code GST_PAD_SET_ACCEPT_TEMPLATE}
     * @param use if the default pad accept-caps query handling should be used
     */
    public void setUseDefaultPadAcceptcaps(boolean use) {
        try {
            DowncallHandles.gst_audio_decoder_set_use_default_pad_acceptcaps.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(use, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_decoder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioDecoder.Builder} object constructs a {@link AudioDecoder} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioDecoder.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Element.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioDecoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioDecoder}.
         * @return A new instance of {@code AudioDecoder} with the properties 
         *         that were set in the Builder object.
         */
        public AudioDecoder build() {
            return (AudioDecoder) org.gtk.gobject.GObject.newWithProperties(
                AudioDecoder.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Maximum number of tolerated consecutive decode errors. See
         * gst_audio_decoder_set_max_errors() for more details.
         * @param maxErrors The value for the {@code max-errors} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxErrors(int maxErrors) {
            names.add("max-errors");
            values.add(org.gtk.gobject.Value.create(maxErrors));
            return this;
        }
        
        public Builder setMinLatency(long minLatency) {
            names.add("min-latency");
            values.add(org.gtk.gobject.Value.create(minLatency));
            return this;
        }
        
        public Builder setPlc(boolean plc) {
            names.add("plc");
            values.add(org.gtk.gobject.Value.create(plc));
            return this;
        }
        
        public Builder setTolerance(long tolerance) {
            names.add("tolerance");
            values.add(org.gtk.gobject.Value.create(tolerance));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_decoder_allocate_output_buffer = Interop.downcallHandle(
            "gst_audio_decoder_allocate_output_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_finish_frame = Interop.downcallHandle(
            "gst_audio_decoder_finish_frame",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_finish_subframe = Interop.downcallHandle(
            "gst_audio_decoder_finish_subframe",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_allocator = Interop.downcallHandle(
            "gst_audio_decoder_get_allocator",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_audio_info = Interop.downcallHandle(
            "gst_audio_decoder_get_audio_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_delay = Interop.downcallHandle(
            "gst_audio_decoder_get_delay",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_drainable = Interop.downcallHandle(
            "gst_audio_decoder_get_drainable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_estimate_rate = Interop.downcallHandle(
            "gst_audio_decoder_get_estimate_rate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_latency = Interop.downcallHandle(
            "gst_audio_decoder_get_latency",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_max_errors = Interop.downcallHandle(
            "gst_audio_decoder_get_max_errors",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_min_latency = Interop.downcallHandle(
            "gst_audio_decoder_get_min_latency",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_needs_format = Interop.downcallHandle(
            "gst_audio_decoder_get_needs_format",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_parse_state = Interop.downcallHandle(
            "gst_audio_decoder_get_parse_state",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_plc = Interop.downcallHandle(
            "gst_audio_decoder_get_plc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_plc_aware = Interop.downcallHandle(
            "gst_audio_decoder_get_plc_aware",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_tolerance = Interop.downcallHandle(
            "gst_audio_decoder_get_tolerance",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_merge_tags = Interop.downcallHandle(
            "gst_audio_decoder_merge_tags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_negotiate = Interop.downcallHandle(
            "gst_audio_decoder_negotiate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_proxy_getcaps = Interop.downcallHandle(
            "gst_audio_decoder_proxy_getcaps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_allocation_caps = Interop.downcallHandle(
            "gst_audio_decoder_set_allocation_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_drainable = Interop.downcallHandle(
            "gst_audio_decoder_set_drainable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_estimate_rate = Interop.downcallHandle(
            "gst_audio_decoder_set_estimate_rate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_latency = Interop.downcallHandle(
            "gst_audio_decoder_set_latency",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_max_errors = Interop.downcallHandle(
            "gst_audio_decoder_set_max_errors",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_min_latency = Interop.downcallHandle(
            "gst_audio_decoder_set_min_latency",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_needs_format = Interop.downcallHandle(
            "gst_audio_decoder_set_needs_format",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_output_caps = Interop.downcallHandle(
            "gst_audio_decoder_set_output_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_output_format = Interop.downcallHandle(
            "gst_audio_decoder_set_output_format",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_plc = Interop.downcallHandle(
            "gst_audio_decoder_set_plc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_plc_aware = Interop.downcallHandle(
            "gst_audio_decoder_set_plc_aware",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_tolerance = Interop.downcallHandle(
            "gst_audio_decoder_set_tolerance",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_set_use_default_pad_acceptcaps = Interop.downcallHandle(
            "gst_audio_decoder_set_use_default_pad_acceptcaps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_decoder_get_type = Interop.downcallHandle(
            "gst_audio_decoder_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
