package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link BaseSink} is the base class for sink elements in GStreamer, such as
 * xvimagesink or filesink. It is a layer on top of {@link org.gstreamer.gst.Element} that provides a
 * simplified interface to plugin writers. {@link BaseSink} handles many details
 * for you, for example: preroll, clock synchronization, state changes,
 * activation in push or pull mode, and queries.
 * <p>
 * In most cases, when writing sink elements, there is no need to implement
 * class methods from {@link org.gstreamer.gst.Element} or to set functions on pads, because the
 * {@link BaseSink} infrastructure should be sufficient.
 * <p>
 * {@link BaseSink} provides support for exactly one sink pad, which should be
 * named "sink". A sink implementation (subclass of {@link BaseSink}) should
 * install a pad template in its class_init function, like so:
 * <pre>{@code <!-- language="C" -->
 * static void
 * my_element_class_init (GstMyElementClass *klass)
 * {
 *   GstElementClass *gstelement_class = GST_ELEMENT_CLASS (klass);
 * 
 *   // sinktemplate should be a #GstStaticPadTemplate with direction
 *   // %GST_PAD_SINK and name "sink"
 *   gst_element_class_add_static_pad_template (gstelement_class, &sinktemplate);
 * 
 *   gst_element_class_set_static_metadata (gstelement_class,
 *       "Sink name",
 *       "Sink",
 *       "My Sink element",
 *       "The author <my.sink@my.email>");
 * }
 * }</pre>
 * <p>
 * {@link BaseSink} will handle the prerolling correctly. This means that it will
 * return {@link org.gstreamer.gst.StateChangeReturn#ASYNC} from a state change to PAUSED until the first
 * buffer arrives in this element. The base class will call the
 * {@link BaseSinkClass}::preroll vmethod with this preroll buffer and will then
 * commit the state change to the next asynchronously pending state.
 * <p>
 * When the element is set to PLAYING, {@link BaseSink} will synchronise on the
 * clock using the times returned from {@link BaseSinkClass}::get_times. If this
 * function returns {@code GST_CLOCK_TIME_NONE} for the start time, no synchronisation
 * will be done. Synchronisation can be disabled entirely by setting the object
 * {@link BaseSink}:sync property to {@code false}.
 * <p>
 * After synchronisation the virtual method {@link BaseSinkClass}::render will be
 * called. Subclasses should minimally implement this method.
 * <p>
 * Subclasses that synchronise on the clock in the {@link BaseSinkClass}::render
 * method are supported as well. These classes typically receive a buffer in
 * the render method and can then potentially block on the clock while
 * rendering. A typical example is an audiosink.
 * These subclasses can use gst_base_sink_wait_preroll() to perform the
 * blocking wait.
 * <p>
 * Upon receiving the EOS event in the PLAYING state, {@link BaseSink} will wait
 * for the clock to reach the time indicated by the stop time of the last
 * {@link BaseSinkClass}::get_times call before posting an EOS message. When the
 * element receives EOS in PAUSED, preroll completes, the event is queued and an
 * EOS message is posted when going to PLAYING.
 * <p>
 * {@link BaseSink} will internally use the {@link org.gstreamer.gst.EventType#SEGMENT} events to schedule
 * synchronisation and clipping of buffers. Buffers that fall completely outside
 * of the current segment are dropped. Buffers that fall partially in the
 * segment are rendered (and prerolled). Subclasses should do any subbuffer
 * clipping themselves when needed.
 * <p>
 * {@link BaseSink} will by default report the current playback position in
 * {@link org.gstreamer.gst.Format#TIME} based on the current clock time and segment information.
 * If no clock has been set on the element, the query will be forwarded
 * upstream.
 * <p>
 * The {@link BaseSinkClass}::set_caps function will be called when the subclass
 * should configure itself to process a specific media type.
 * <p>
 * The {@link BaseSinkClass}::start and {@link BaseSinkClass}::stop virtual methods
 * will be called when resources should be allocated. Any
 * {@link BaseSinkClass}::preroll, {@link BaseSinkClass}::render and
 * {@link BaseSinkClass}::set_caps function will be called between the
 * {@link BaseSinkClass}::start and {@link BaseSinkClass}::stop calls.
 * <p>
 * The {@link BaseSinkClass}::event virtual method will be called when an event is
 * received by {@link BaseSink}. Normally this method should only be overridden by
 * very specific elements (such as file sinks) which need to handle the
 * newsegment event specially.
 * <p>
 * The {@link BaseSinkClass}::unlock method is called when the elements should
 * unblock any blocking operations they perform in the
 * {@link BaseSinkClass}::render method. This is mostly useful when the
 * {@link BaseSinkClass}::render method performs a blocking write on a file
 * descriptor, for example.
 * <p>
 * The {@link BaseSink}:max-lateness property affects how the sink deals with
 * buffers that arrive too late in the sink. A buffer arrives too late in the
 * sink when the presentation time (as a combination of the last segment, buffer
 * timestamp and element base_time) plus the duration is before the current
 * time of the clock.
 * If the frame is later than max-lateness, the sink will drop the buffer
 * without calling the render method.
 * This feature is disabled if sync is disabled, the
 * {@link BaseSinkClass}::get_times method does not return a valid start time or
 * max-lateness is set to -1 (the default).
 * Subclasses can use gst_base_sink_set_max_lateness() to configure the
 * max-lateness value.
 * <p>
 * The {@link BaseSink}:qos property will enable the quality-of-service features of
 * the basesink which gather statistics about the real-time performance of the
 * clock synchronisation. For each buffer received in the sink, statistics are
 * gathered and a QOS event is sent upstream with these numbers. This
 * information can then be used by upstream elements to reduce their processing
 * rate, for example.
 * <p>
 * The {@link BaseSink}:async property can be used to instruct the sink to never
 * perform an ASYNC state change. This feature is mostly usable when dealing
 * with non-synchronized streams or sparse streams.
 */
public class BaseSink extends org.gstreamer.gst.Element {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseSink";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
            Interop.valueLayout.ADDRESS.withName("sinkpad"),
            Interop.valueLayout.C_INT.withName("pad_mode"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("offset"),
            Interop.valueLayout.C_INT.withName("can_activate_pull"),
            Interop.valueLayout.C_INT.withName("can_activate_push"),
            org.gtk.glib.Mutex.getMemoryLayout().withName("preroll_lock"),
            org.gtk.glib.Cond.getMemoryLayout().withName("preroll_cond"),
            Interop.valueLayout.C_INT.withName("eos"),
            Interop.valueLayout.C_INT.withName("need_preroll"),
            Interop.valueLayout.C_INT.withName("have_preroll"),
            Interop.valueLayout.C_INT.withName("playing_async"),
            Interop.valueLayout.C_INT.withName("have_newsegment"),
            MemoryLayout.paddingLayout(32),
            org.gstreamer.gst.Segment.getMemoryLayout().withName("segment"),
            Interop.valueLayout.ADDRESS.withName("clock_id"),
            Interop.valueLayout.C_INT.withName("sync"),
            Interop.valueLayout.C_INT.withName("flushing"),
            Interop.valueLayout.C_INT.withName("running"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("max_lateness"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a BaseSink proxy instance for the provided memory address.
     * <p>
     * Because BaseSink is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BaseSink(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, BaseSink> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BaseSink(input, ownership);
    
    /**
     * If the {@code sink} spawns its own thread for pulling buffers from upstream it
     * should call this method after it has pulled a buffer. If the element needed
     * to preroll, this function will perform the preroll and will then block
     * until the element state is changed.
     * <p>
     * This function should be called with the PREROLL_LOCK held.
     * @param obj the mini object that caused the preroll
     * @return {@link org.gstreamer.gst.FlowReturn#OK} if the preroll completed and processing can
     * continue. Any other return value should be returned from the render vmethod.
     */
    public org.gstreamer.gst.FlowReturn doPreroll(org.gstreamer.gst.MiniObject obj) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_do_preroll.invokeExact(
                    handle(),
                    obj.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Get the number of bytes that the sink will pull when it is operating in pull
     * mode.
     * @return the number of bytes {@code sink} will pull in pull mode.
     */
    public int getBlocksize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_get_blocksize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if {@code sink} is currently configured to drop buffers which are outside
     * the current segment
     * @return {@code true} if the sink is configured to drop buffers outside the
     * current segment.
     */
    public boolean getDropOutOfSegment() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_get_drop_out_of_segment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the last sample that arrived in the sink and was used for preroll or for
     * rendering. This property can be used to generate thumbnails.
     * <p>
     * The {@link org.gstreamer.gst.Caps} on the sample can be used to determine the type of the buffer.
     * <p>
     * Free-function: gst_sample_unref
     * @return a {@link org.gstreamer.gst.Sample}. gst_sample_unref() after
     *     usage.  This function returns {@code null} when no buffer has arrived in the
     *     sink yet or when the sink is not in PAUSED or PLAYING.
     */
    public @Nullable org.gstreamer.gst.Sample getLastSample() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_base_sink_get_last_sample.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Sample.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the currently configured latency.
     * @return The configured latency.
     */
    public org.gstreamer.gst.ClockTime getLatency() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_sink_get_latency.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the maximum amount of bits per second that the sink will render.
     * @return the maximum number of bits per second {@code sink} will render.
     */
    public long getMaxBitrate() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_sink_get_max_bitrate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the max lateness value. See gst_base_sink_set_max_lateness() for
     * more details.
     * @return The maximum time in nanoseconds that a buffer can be late
     * before it is dropped and not rendered. A value of -1 means an
     * unlimited time.
     */
    public long getMaxLateness() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_sink_get_max_lateness.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the processing deadline of {@code sink}. see
     * gst_base_sink_set_processing_deadline() for more information about
     * the processing deadline.
     * @return the processing deadline
     */
    public org.gstreamer.gst.ClockTime getProcessingDeadline() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_sink_get_processing_deadline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the render delay of {@code sink}. see gst_base_sink_set_render_delay() for more
     * information about the render delay.
     * @return the render delay of {@code sink}.
     */
    public org.gstreamer.gst.ClockTime getRenderDelay() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_sink_get_render_delay.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Return various {@link BaseSink} statistics. This function returns a {@link org.gstreamer.gst.Structure}
     * with name {@code application/x-gst-base-sink-stats} with the following fields:
     * <ul>
     * <li>"average-rate" G_TYPE_DOUBLE   average frame rate
     * <li>"dropped" G_TYPE_UINT64   Number of dropped frames
     * <li>"rendered" G_TYPE_UINT64   Number of rendered frames
     * </ul>
     * @return pointer to {@link org.gstreamer.gst.Structure}
     */
    public org.gstreamer.gst.Structure getStats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_base_sink_get_stats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Checks if {@code sink} is currently configured to synchronize against the
     * clock.
     * @return {@code true} if the sink is configured to synchronize against the clock.
     */
    public boolean getSync() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_get_sync.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the time that will be inserted between frames to control the
     * maximum buffers per second.
     * @return the number of nanoseconds {@code sink} will put between frames.
     */
    public long getThrottleTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_sink_get_throttle_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the synchronisation offset of {@code sink}.
     * @return The synchronisation offset.
     */
    public org.gstreamer.gst.ClockTimeDiff getTsOffset() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_sink_get_ts_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTimeDiff(RESULT);
    }
    
    /**
     * Checks if {@code sink} is currently configured to perform asynchronous state
     * changes to PAUSED.
     * @return {@code true} if the sink is configured to perform asynchronous state
     * changes.
     */
    public boolean isAsyncEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_is_async_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code sink} is currently configured to store the last received sample in
     * the last-sample property.
     * @return {@code true} if the sink is configured to store the last received sample.
     */
    public boolean isLastSampleEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_is_last_sample_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code sink} is currently configured to send Quality-of-Service events
     * upstream.
     * @return {@code true} if the sink is configured to perform Quality-of-Service.
     */
    public boolean isQosEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_is_qos_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Query the sink for the latency parameters. The latency will be queried from
     * the upstream elements. {@code live} will be {@code true} if {@code sink} is configured to
     * synchronize against the clock. {@code upstream_live} will be {@code true} if an upstream
     * element is live.
     * <p>
     * If both {@code live} and {@code upstream_live} are {@code true}, the sink will want to compensate
     * for the latency introduced by the upstream elements by setting the
     * {@code min_latency} to a strictly positive value.
     * <p>
     * This function is mostly used by subclasses.
     * @param live if the sink is live
     * @param upstreamLive if an upstream element is live
     * @param minLatency the min latency of the upstream elements
     * @param maxLatency the max latency of the upstream elements
     * @return {@code true} if the query succeeded.
     */
    public boolean queryLatency(Out<Boolean> live, Out<Boolean> upstreamLive, @Nullable org.gstreamer.gst.ClockTime minLatency, @Nullable org.gstreamer.gst.ClockTime maxLatency) {
        MemorySegment livePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment upstreamLivePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment minLatencyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment maxLatencyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_query_latency.invokeExact(
                    handle(),
                    (Addressable) (live == null ? MemoryAddress.NULL : (Addressable) livePOINTER.address()),
                    (Addressable) (upstreamLive == null ? MemoryAddress.NULL : (Addressable) upstreamLivePOINTER.address()),
                    (Addressable) (minLatency == null ? MemoryAddress.NULL : (Addressable) minLatencyPOINTER.address()),
                    (Addressable) (maxLatency == null ? MemoryAddress.NULL : (Addressable) maxLatencyPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (live != null) live.set(livePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        if (upstreamLive != null) upstreamLive.set(upstreamLivePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        if (minLatency != null) minLatency.setValue(minLatencyPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (maxLatency != null) maxLatency.setValue(maxLatencyPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Configures {@code sink} to perform all state changes asynchronously. When async is
     * disabled, the sink will immediately go to PAUSED instead of waiting for a
     * preroll buffer. This feature is useful if the sink does not synchronize
     * against the clock or when it is dealing with sparse streams.
     * @param enabled the new async value.
     */
    public void setAsyncEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_base_sink_set_async_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the number of bytes that the sink will pull when it is operating in pull
     * mode.
     * @param blocksize the blocksize in bytes
     */
    public void setBlocksize(int blocksize) {
        try {
            DowncallHandles.gst_base_sink_set_blocksize.invokeExact(
                    handle(),
                    blocksize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configure {@code sink} to drop buffers which are outside the current segment
     * @param dropOutOfSegment drop buffers outside the segment
     */
    public void setDropOutOfSegment(boolean dropOutOfSegment) {
        try {
            DowncallHandles.gst_base_sink_set_drop_out_of_segment.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(dropOutOfSegment, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures {@code sink} to store the last received sample in the last-sample
     * property.
     * @param enabled the new enable-last-sample value.
     */
    public void setLastSampleEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_base_sink_set_last_sample_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the maximum amount of bits per second that the sink will render.
     * @param maxBitrate the max_bitrate in bits per second
     */
    public void setMaxBitrate(long maxBitrate) {
        try {
            DowncallHandles.gst_base_sink_set_max_bitrate.invokeExact(
                    handle(),
                    maxBitrate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the new max lateness value to {@code max_lateness}. This value is
     * used to decide if a buffer should be dropped or not based on the
     * buffer timestamp and the current clock time. A value of -1 means
     * an unlimited time.
     * @param maxLateness the new max lateness value.
     */
    public void setMaxLateness(long maxLateness) {
        try {
            DowncallHandles.gst_base_sink_set_max_lateness.invokeExact(
                    handle(),
                    maxLateness);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Maximum amount of time (in nanoseconds) that the pipeline can take
     * for processing the buffer. This is added to the latency of live
     * pipelines.
     * <p>
     * This function is usually called by subclasses.
     * @param processingDeadline the new processing deadline in nanoseconds.
     */
    public void setProcessingDeadline(org.gstreamer.gst.ClockTime processingDeadline) {
        try {
            DowncallHandles.gst_base_sink_set_processing_deadline.invokeExact(
                    handle(),
                    processingDeadline.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures {@code sink} to send Quality-of-Service events upstream.
     * @param enabled the new qos value.
     */
    public void setQosEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_base_sink_set_qos_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the render delay in {@code sink} to {@code delay}. The render delay is the time
     * between actual rendering of a buffer and its synchronisation time. Some
     * devices might delay media rendering which can be compensated for with this
     * function.
     * <p>
     * After calling this function, this sink will report additional latency and
     * other sinks will adjust their latency to delay the rendering of their media.
     * <p>
     * This function is usually called by subclasses.
     * @param delay the new delay
     */
    public void setRenderDelay(org.gstreamer.gst.ClockTime delay) {
        try {
            DowncallHandles.gst_base_sink_set_render_delay.invokeExact(
                    handle(),
                    delay.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures {@code sink} to synchronize on the clock or not. When
     * {@code sync} is {@code false}, incoming samples will be played as fast as
     * possible. If {@code sync} is {@code true}, the timestamps of the incoming
     * buffers will be used to schedule the exact render time of its
     * contents.
     * @param sync the new sync value.
     */
    public void setSync(boolean sync) {
        try {
            DowncallHandles.gst_base_sink_set_sync.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(sync, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the time that will be inserted between rendered buffers. This
     * can be used to control the maximum buffers per second that the sink
     * will render.
     * @param throttle the throttle time in nanoseconds
     */
    public void setThrottleTime(long throttle) {
        try {
            DowncallHandles.gst_base_sink_set_throttle_time.invokeExact(
                    handle(),
                    throttle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adjust the synchronisation of {@code sink} with {@code offset}. A negative value will
     * render buffers earlier than their timestamp. A positive value will delay
     * rendering. This function can be used to fix playback of badly timestamped
     * buffers.
     * @param offset the new offset
     */
    public void setTsOffset(org.gstreamer.gst.ClockTimeDiff offset) {
        try {
            DowncallHandles.gst_base_sink_set_ts_offset.invokeExact(
                    handle(),
                    offset.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function will wait for preroll to complete and will then block until {@code time}
     * is reached. It is usually called by subclasses that use their own internal
     * synchronisation but want to let some synchronization (like EOS) be handled
     * by the base class.
     * <p>
     * This function should only be called with the PREROLL_LOCK held (like when
     * receiving an EOS event in the ::event vmethod or when handling buffers in
     * ::render).
     * <p>
     * The {@code time} argument should be the running_time of when the timeout should happen
     * and will be adjusted with any latency and offset configured in the sink.
     * @param time the running_time to be reached
     * @param jitter the jitter to be filled with time diff, or {@code null}
     * @return {@link org.gstreamer.gst.FlowReturn}
     */
    public org.gstreamer.gst.FlowReturn wait_(org.gstreamer.gst.ClockTime time, @Nullable org.gstreamer.gst.ClockTimeDiff jitter) {
        MemorySegment jitterPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_wait.invokeExact(
                    handle(),
                    time.getValue().longValue(),
                    (Addressable) (jitter == null ? MemoryAddress.NULL : (Addressable) jitterPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (jitter != null) jitter.setValue(jitterPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * This function will block until {@code time} is reached. It is usually called by
     * subclasses that use their own internal synchronisation.
     * <p>
     * If {@code time} is not valid, no synchronisation is done and {@link org.gstreamer.gst.ClockReturn#BADTIME} is
     * returned. Likewise, if synchronisation is disabled in the element or there
     * is no clock, no synchronisation is done and {@link org.gstreamer.gst.ClockReturn#BADTIME} is returned.
     * <p>
     * This function should only be called with the PREROLL_LOCK held, like when
     * receiving an EOS event in the {@link BaseSinkClass}::event vmethod or when
     * receiving a buffer in
     * the {@link BaseSinkClass}::render vmethod.
     * <p>
     * The {@code time} argument should be the running_time of when this method should
     * return and is not adjusted with any latency or offset configured in the
     * sink.
     * @param time the running_time to be reached
     * @param jitter the jitter to be filled with time diff, or {@code null}
     * @return {@link org.gstreamer.gst.ClockReturn}
     */
    public org.gstreamer.gst.ClockReturn waitClock(org.gstreamer.gst.ClockTime time, @Nullable org.gstreamer.gst.ClockTimeDiff jitter) {
        MemorySegment jitterPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_wait_clock.invokeExact(
                    handle(),
                    time.getValue().longValue(),
                    (Addressable) (jitter == null ? MemoryAddress.NULL : (Addressable) jitterPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (jitter != null) jitter.setValue(jitterPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return org.gstreamer.gst.ClockReturn.of(RESULT);
    }
    
    /**
     * If the {@link BaseSinkClass}::render method performs its own synchronisation
     * against the clock it must unblock when going from PLAYING to the PAUSED state
     * and call this method before continuing to render the remaining data.
     * <p>
     * If the {@link BaseSinkClass}::render method can block on something else than
     * the clock, it must also be ready to unblock immediately on
     * the {@link BaseSinkClass}::unlock method and cause the
     * {@link BaseSinkClass}::render method to immediately call this function.
     * In this case, the subclass must be prepared to continue rendering where it
     * left off if this function returns {@link org.gstreamer.gst.FlowReturn#OK}.
     * <p>
     * This function will block until a state change to PLAYING happens (in which
     * case this function returns {@link org.gstreamer.gst.FlowReturn#OK}) or the processing must be stopped due
     * to a state change to READY or a FLUSH event (in which case this function
     * returns {@link org.gstreamer.gst.FlowReturn#FLUSHING}).
     * <p>
     * This function should only be called with the PREROLL_LOCK held, like in the
     * render function.
     * @return {@link org.gstreamer.gst.FlowReturn#OK} if the preroll completed and processing can
     * continue. Any other return value should be returned from the render vmethod.
     */
    public org.gstreamer.gst.FlowReturn waitPreroll() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_sink_wait_preroll.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_sink_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link BaseSink.Builder} object constructs a {@link BaseSink} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link BaseSink.Builder#build()}. 
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
         * Finish building the {@link BaseSink} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BaseSink}.
         * @return A new instance of {@code BaseSink} with the properties 
         *         that were set in the Builder object.
         */
        public BaseSink build() {
            return (BaseSink) org.gtk.gobject.GObject.newWithProperties(
                BaseSink.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If set to {@code true}, the basesink will perform asynchronous state changes.
         * When set to {@code false}, the sink will not signal the parent when it prerolls.
         * Use this option when dealing with sparse streams or when synchronisation is
         * not required.
         * @param async The value for the {@code async} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAsync(boolean async) {
            names.add("async");
            values.add(org.gtk.gobject.Value.create(async));
            return this;
        }
        
        /**
         * The amount of bytes to pull when operating in pull mode.
         * @param blocksize The value for the {@code blocksize} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBlocksize(int blocksize) {
            names.add("blocksize");
            values.add(org.gtk.gobject.Value.create(blocksize));
            return this;
        }
        
        /**
         * Enable the last-sample property. If {@code false}, basesink doesn't keep a
         * reference to the last buffer arrived and the last-sample property is always
         * set to {@code null}. This can be useful if you need buffers to be released as soon
         * as possible, eg. if you're using a buffer pool.
         * @param enableLastSample The value for the {@code enable-last-sample} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnableLastSample(boolean enableLastSample) {
            names.add("enable-last-sample");
            values.add(org.gtk.gobject.Value.create(enableLastSample));
            return this;
        }
        
        /**
         * The last buffer that arrived in the sink and was used for preroll or for
         * rendering. This property can be used to generate thumbnails. This property
         * can be {@code null} when the sink has not yet received a buffer.
         * @param lastSample The value for the {@code last-sample} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLastSample(org.gstreamer.gst.Sample lastSample) {
            names.add("last-sample");
            values.add(org.gtk.gobject.Value.create(lastSample));
            return this;
        }
        
        /**
         * Control the maximum amount of bits that will be rendered per second.
         * Setting this property to a value bigger than 0 will make the sink delay
         * rendering of the buffers when it would exceed to max-bitrate.
         * @param maxBitrate The value for the {@code max-bitrate} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxBitrate(long maxBitrate) {
            names.add("max-bitrate");
            values.add(org.gtk.gobject.Value.create(maxBitrate));
            return this;
        }
        
        public Builder setMaxLateness(long maxLateness) {
            names.add("max-lateness");
            values.add(org.gtk.gobject.Value.create(maxLateness));
            return this;
        }
        
        /**
         * Maximum amount of time (in nanoseconds) that the pipeline can take
         * for processing the buffer. This is added to the latency of live
         * pipelines.
         * @param processingDeadline The value for the {@code processing-deadline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProcessingDeadline(long processingDeadline) {
            names.add("processing-deadline");
            values.add(org.gtk.gobject.Value.create(processingDeadline));
            return this;
        }
        
        public Builder setQos(boolean qos) {
            names.add("qos");
            values.add(org.gtk.gobject.Value.create(qos));
            return this;
        }
        
        /**
         * The additional delay between synchronisation and actual rendering of the
         * media. This property will add additional latency to the device in order to
         * make other sinks compensate for the delay.
         * @param renderDelay The value for the {@code render-delay} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRenderDelay(long renderDelay) {
            names.add("render-delay");
            values.add(org.gtk.gobject.Value.create(renderDelay));
            return this;
        }
        
        /**
         * Various {@link BaseSink} statistics. This property returns a {@link org.gstreamer.gst.Structure}
         * with name {@code application/x-gst-base-sink-stats} with the following fields:
         * <ul>
         * <li>"average-rate"  G_TYPE_DOUBLE   average frame rate
         * <li>"dropped" G_TYPE_UINT64   Number of dropped frames
         * <li>"rendered" G_TYPE_UINT64   Number of rendered frames
         * </ul>
         * @param stats The value for the {@code stats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStats(org.gstreamer.gst.Structure stats) {
            names.add("stats");
            values.add(org.gtk.gobject.Value.create(stats));
            return this;
        }
        
        public Builder setSync(boolean sync) {
            names.add("sync");
            values.add(org.gtk.gobject.Value.create(sync));
            return this;
        }
        
        /**
         * The time to insert between buffers. This property can be used to control
         * the maximum amount of buffers per second to render. Setting this property
         * to a value bigger than 0 will make the sink create THROTTLE QoS events.
         * @param throttleTime The value for the {@code throttle-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setThrottleTime(long throttleTime) {
            names.add("throttle-time");
            values.add(org.gtk.gobject.Value.create(throttleTime));
            return this;
        }
        
        /**
         * Controls the final synchronisation, a negative value will render the buffer
         * earlier while a positive value delays playback. This property can be
         * used to fix synchronisation in bad files.
         * @param tsOffset The value for the {@code ts-offset} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTsOffset(long tsOffset) {
            names.add("ts-offset");
            values.add(org.gtk.gobject.Value.create(tsOffset));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_base_sink_do_preroll = Interop.downcallHandle(
            "gst_base_sink_do_preroll",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_blocksize = Interop.downcallHandle(
            "gst_base_sink_get_blocksize",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_drop_out_of_segment = Interop.downcallHandle(
            "gst_base_sink_get_drop_out_of_segment",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_last_sample = Interop.downcallHandle(
            "gst_base_sink_get_last_sample",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_latency = Interop.downcallHandle(
            "gst_base_sink_get_latency",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_max_bitrate = Interop.downcallHandle(
            "gst_base_sink_get_max_bitrate",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_max_lateness = Interop.downcallHandle(
            "gst_base_sink_get_max_lateness",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_processing_deadline = Interop.downcallHandle(
            "gst_base_sink_get_processing_deadline",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_render_delay = Interop.downcallHandle(
            "gst_base_sink_get_render_delay",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_stats = Interop.downcallHandle(
            "gst_base_sink_get_stats",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_sync = Interop.downcallHandle(
            "gst_base_sink_get_sync",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_throttle_time = Interop.downcallHandle(
            "gst_base_sink_get_throttle_time",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_ts_offset = Interop.downcallHandle(
            "gst_base_sink_get_ts_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_is_async_enabled = Interop.downcallHandle(
            "gst_base_sink_is_async_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_is_last_sample_enabled = Interop.downcallHandle(
            "gst_base_sink_is_last_sample_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_is_qos_enabled = Interop.downcallHandle(
            "gst_base_sink_is_qos_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_query_latency = Interop.downcallHandle(
            "gst_base_sink_query_latency",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_async_enabled = Interop.downcallHandle(
            "gst_base_sink_set_async_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_blocksize = Interop.downcallHandle(
            "gst_base_sink_set_blocksize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_drop_out_of_segment = Interop.downcallHandle(
            "gst_base_sink_set_drop_out_of_segment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_last_sample_enabled = Interop.downcallHandle(
            "gst_base_sink_set_last_sample_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_max_bitrate = Interop.downcallHandle(
            "gst_base_sink_set_max_bitrate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_max_lateness = Interop.downcallHandle(
            "gst_base_sink_set_max_lateness",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_processing_deadline = Interop.downcallHandle(
            "gst_base_sink_set_processing_deadline",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_qos_enabled = Interop.downcallHandle(
            "gst_base_sink_set_qos_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_render_delay = Interop.downcallHandle(
            "gst_base_sink_set_render_delay",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_sync = Interop.downcallHandle(
            "gst_base_sink_set_sync",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_throttle_time = Interop.downcallHandle(
            "gst_base_sink_set_throttle_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_base_sink_set_ts_offset = Interop.downcallHandle(
            "gst_base_sink_set_ts_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_base_sink_wait = Interop.downcallHandle(
            "gst_base_sink_wait",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_wait_clock = Interop.downcallHandle(
            "gst_base_sink_wait_clock",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_wait_preroll = Interop.downcallHandle(
            "gst_base_sink_wait_preroll",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_sink_get_type = Interop.downcallHandle(
            "gst_base_sink_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
