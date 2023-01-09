package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This base class is for video encoders turning raw video into
 * encoded video data.
 * <p>
 * GstVideoEncoder and subclass should cooperate as follows.
 * <p>
 * <strong>Configuration</strong><br/>
 *   * Initially, GstVideoEncoder calls {@code start} when the encoder element
 *     is activated, which allows subclass to perform any global setup.
 *   * GstVideoEncoder calls {@code set_format} to inform subclass of the format
 *     of input video data that it is about to receive.  Subclass should
 *     setup for encoding and configure base class as appropriate
 *     (e.g. latency). While unlikely, it might be called more than once,
 *     if changing input parameters require reconfiguration.  Baseclass
 *     will ensure that processing of current configuration is finished.
 *   * GstVideoEncoder calls {@code stop} at end of all processing.
 * <p>
 * <strong>Data processing</strong><br/>
 *     * Base class collects input data and metadata into a frame and hands
 *       this to subclass' {@code handle_frame}.
 * <p>
 *     * If codec processing results in encoded data, subclass should call
 *       {@code gst_video_encoder_finish_frame} to have encoded data pushed
 *       downstream.
 * <p>
 *     * If implemented, baseclass calls subclass {@code pre_push} just prior to
 *       pushing to allow subclasses to modify some metadata on the buffer.
 *       If it returns GST_FLOW_OK, the buffer is pushed downstream.
 * <p>
 *     * GstVideoEncoderClass will handle both srcpad and sinkpad events.
 *       Sink events will be passed to subclass if {@code event} callback has been
 *       provided.
 * <p>
 * <strong>Shutdown phase</strong><br/>
 *   * GstVideoEncoder class calls {@code stop} to inform the subclass that data
 *     parsing will be stopped.
 * <p>
 * Subclass is responsible for providing pad template caps for
 * source and sink pads. The pads need to be named "sink" and "src". It should
 * also be able to provide fixed src pad caps in {@code getcaps} by the time it calls
 * {@code gst_video_encoder_finish_frame}.
 * <p>
 * Things that subclass need to take care of:
 * <p>
 *   * Provide pad templates
 *   * Provide source pad caps before pushing the first buffer
 *   * Accept data in {@code handle_frame} and provide encoded results to
 *      {@code gst_video_encoder_finish_frame}.
 * <p>
 * The {@link VideoEncoder}:qos property will enable the Quality-of-Service
 * features of the encoder which gather statistics about the real-time
 * performance of the downstream elements. If enabled, subclasses can
 * use gst_video_encoder_get_max_encode_time() to check if input frames
 * are already late and drop them right away to give a chance to the
 * pipeline to catch up.
 */
public class VideoEncoder extends org.gstreamer.gst.Element implements org.gstreamer.gst.Preset {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoEncoder";
    
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
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VideoEncoder proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoEncoder(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoEncoder> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoEncoder(input);
    
    /**
     * Helper function that allocates a buffer to hold an encoded video frame
     * for {@code encoder}'s current {@link VideoCodecState}.
     * @param size size of the buffer
     * @return allocated buffer
     */
    public org.gstreamer.gst.Buffer allocateOutputBuffer(long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_encoder_allocate_output_buffer.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Helper function that allocates a buffer to hold an encoded video frame for {@code encoder}'s
     * current {@link VideoCodecState}.  Subclass should already have configured video
     * state and set src pad caps.
     * <p>
     * The buffer allocated here is owned by the frame and you should only
     * keep references to the frame, not the buffer.
     * @param frame a {@link VideoCodecFrame}
     * @param size size of the buffer
     * @return {@link org.gstreamer.gst.FlowReturn#OK} if an output buffer could be allocated
     */
    public org.gstreamer.gst.FlowReturn allocateOutputFrame(org.gstreamer.video.VideoCodecFrame frame, long size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_encoder_allocate_output_frame.invokeExact(
                    handle(),
                    frame.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * {@code frame} must have a valid encoded data buffer, whose metadata fields
     * are then appropriately set according to frame data or no buffer at
     * all if the frame should be dropped.
     * It is subsequently pushed downstream or provided to {@code pre_push}.
     * In any case, the frame is considered finished and released.
     * <p>
     * After calling this function the output buffer of the frame is to be
     * considered read-only. This function will also change the metadata
     * of the buffer.
     * @param frame an encoded {@link VideoCodecFrame}
     * @return a {@link org.gstreamer.gst.FlowReturn} resulting from sending data downstream
     */
    public org.gstreamer.gst.FlowReturn finishFrame(org.gstreamer.video.VideoCodecFrame frame) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_encoder_finish_frame.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        frame.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * If multiple subframes are produced for one input frame then use this method
     * for each subframe, except for the last one. Before calling this function,
     * you need to fill frame-&gt;output_buffer with the encoded buffer to push.
     * <p>
     * You must call {@code gst_video_encoder_finish_frame}() for the last sub-frame
     * to tell the encoder that the frame has been fully encoded.
     * <p>
     * This function will change the metadata of {@code frame} and frame-&gt;output_buffer
     * will be pushed downstream.
     * @param frame a {@link VideoCodecFrame} being encoded
     * @return a {@link org.gstreamer.gst.FlowReturn} resulting from pushing the buffer downstream.
     */
    public org.gstreamer.gst.FlowReturn finishSubframe(org.gstreamer.video.VideoCodecFrame frame) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_encoder_finish_subframe.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Lets {@link VideoEncoder} sub-classes to know the memory {@code allocator}
     * used by the base class and its {@code params}.
     * <p>
     * Unref the {@code allocator} after use it.
     * @param allocator the {@link org.gstreamer.gst.Allocator}
     * used
     * @param params the
     * {@link org.gstreamer.gst.AllocationParams} of {@code allocator}
     */
    public void getAllocator(@Nullable Out<org.gstreamer.gst.Allocator> allocator, @Nullable org.gstreamer.gst.AllocationParams params) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment allocatorPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_video_encoder_get_allocator.invokeExact(
                        handle(),
                        (Addressable) (allocator == null ? MemoryAddress.NULL : (Addressable) allocatorPOINTER.address()),
                        (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (allocator != null) allocator.set((org.gstreamer.gst.Allocator) Interop.register(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Allocator.fromAddress).marshal(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            params.yieldOwnership();
        }
    }
    
    /**
     * Get a pending unfinished {@link VideoCodecFrame}
     * @param frameNumber system_frame_number of a frame
     * @return pending unfinished {@link VideoCodecFrame} identified by {@code frame_number}.
     */
    public org.gstreamer.video.VideoCodecFrame getFrame(int frameNumber) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_encoder_get_frame.invokeExact(
                    handle(),
                    frameNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get all pending unfinished {@link VideoCodecFrame}
     * @return pending unfinished {@link VideoCodecFrame}.
     */
    public org.gtk.glib.List getFrames() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_encoder_get_frames.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Query the configured encoding latency. Results will be returned via
     * {@code min_latency} and {@code max_latency}.
     * @param minLatency address of variable in which to store the
     *     configured minimum latency, or {@code null}
     * @param maxLatency address of variable in which to store the
     *     configured maximum latency, or {@code null}
     */
    public void getLatency(@Nullable org.gstreamer.gst.ClockTime minLatency, @Nullable org.gstreamer.gst.ClockTime maxLatency) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment minLatencyPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment maxLatencyPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_video_encoder_get_latency.invokeExact(
                        handle(),
                        (Addressable) (minLatency == null ? MemoryAddress.NULL : (Addressable) minLatencyPOINTER.address()),
                        (Addressable) (maxLatency == null ? MemoryAddress.NULL : (Addressable) maxLatencyPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (minLatency != null) minLatency.setValue(minLatencyPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (maxLatency != null) maxLatency.setValue(maxLatencyPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Determines maximum possible encoding time for {@code frame} that will
     * allow it to encode and arrive in time (as determined by QoS events).
     * In particular, a negative result means encoding in time is no longer possible
     * and should therefore occur as soon/skippy as possible.
     * <p>
     * If no QoS events have been received from downstream, or if
     * {@link VideoEncoder}:qos is disabled this function returns {@code G_MAXINT64}.
     * @param frame a {@link VideoCodecFrame}
     * @return max decoding time.
     */
    public org.gstreamer.gst.ClockTimeDiff getMaxEncodeTime(org.gstreamer.video.VideoCodecFrame frame) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_encoder_get_max_encode_time.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTimeDiff(RESULT);
    }
    
    /**
     * Returns the minimum force-keyunit interval, see gst_video_encoder_set_min_force_key_unit_interval()
     * for more details.
     * @return the minimum force-keyunit interval
     */
    public org.gstreamer.gst.ClockTime getMinForceKeyUnitInterval() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_encoder_get_min_force_key_unit_interval.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the oldest unfinished pending {@link VideoCodecFrame}
     * @return oldest unfinished pending {@link VideoCodecFrame}
     */
    public org.gstreamer.video.VideoCodecFrame getOldestFrame() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_encoder_get_oldest_frame.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the current {@link VideoCodecState}
     * @return {@link VideoCodecState} describing format of video data.
     */
    public org.gstreamer.video.VideoCodecState getOutputState() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_encoder_get_output_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.video.VideoCodecState.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Checks if {@code encoder} is currently configured to handle Quality-of-Service
     * events from downstream.
     * @return {@code true} if the encoder is configured to perform Quality-of-Service.
     */
    public boolean isQosEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_encoder_is_qos_enabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the video encoder tags and how they should be merged with any
     * upstream stream tags. This will override any tags previously-set
     * with gst_video_encoder_merge_tags().
     * <p>
     * Note that this is provided for convenience, and the subclass is
     * not required to use this and can still do tag handling on its own.
     * <p>
     * MT safe.
     * @param tags a {@link org.gstreamer.gst.TagList} to merge, or NULL to unset
     *     previously-set tags
     * @param mode the {@link org.gstreamer.gst.TagMergeMode} to use, usually {@code GST_TAG_MERGE_REPLACE}
     */
    public void mergeTags(@Nullable org.gstreamer.gst.TagList tags, org.gstreamer.gst.TagMergeMode mode) {
        try {
            DowncallHandles.gst_video_encoder_merge_tags.invokeExact(
                    handle(),
                    (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Negotiate with downstream elements to currently configured {@link VideoCodecState}.
     * Unmark GST_PAD_FLAG_NEED_RECONFIGURE in any case. But mark it again if
     * negotiate fails.
     * @return {@code true} if the negotiation succeeded, else {@code false}.
     */
    public boolean negotiate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_encoder_negotiate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns caps that express {@code caps} (or sink template caps if {@code caps} == NULL)
     * restricted to resolution/format/... combinations supported by downstream
     * elements (e.g. muxers).
     * @param caps initial caps
     * @param filter filter caps
     * @return a {@link org.gstreamer.gst.Caps} owned by caller
     */
    public org.gstreamer.gst.Caps proxyGetcaps(@Nullable org.gstreamer.gst.Caps caps, @Nullable org.gstreamer.gst.Caps filter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_encoder_proxy_getcaps.invokeExact(
                    handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Set the codec headers to be sent downstream whenever requested.
     * @param headers a list of {@link org.gstreamer.gst.Buffer} containing the codec header
     */
    public void setHeaders(org.gtk.glib.List headers) {
        try {
            DowncallHandles.gst_video_encoder_set_headers.invokeExact(
                    handle(),
                    headers.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        headers.yieldOwnership();
    }
    
    /**
     * Informs baseclass of encoding latency.
     * @param minLatency minimum latency
     * @param maxLatency maximum latency
     */
    public void setLatency(org.gstreamer.gst.ClockTime minLatency, org.gstreamer.gst.ClockTime maxLatency) {
        try {
            DowncallHandles.gst_video_encoder_set_latency.invokeExact(
                    handle(),
                    minLatency.getValue().longValue(),
                    maxLatency.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum interval for requesting keyframes based on force-keyunit
     * events. Setting this to 0 will allow to handle every event, setting this to
     * {@code GST_CLOCK_TIME_NONE} causes force-keyunit events to be ignored.
     * @param interval minimum interval
     */
    public void setMinForceKeyUnitInterval(org.gstreamer.gst.ClockTime interval) {
        try {
            DowncallHandles.gst_video_encoder_set_min_force_key_unit_interval.invokeExact(
                    handle(),
                    interval.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Request minimal value for PTS passed to handle_frame.
     * <p>
     * For streams with reordered frames this can be used to ensure that there
     * is enough time to accommodate first DTS, which may be less than first PTS
     * @param minPts minimal PTS that will be passed to handle_frame
     */
    public void setMinPts(org.gstreamer.gst.ClockTime minPts) {
        try {
            DowncallHandles.gst_video_encoder_set_min_pts.invokeExact(
                    handle(),
                    minPts.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link VideoCodecState} with the specified caps as the output state
     * for the encoder.
     * Any previously set output state on {@code encoder} will be replaced by the newly
     * created one.
     * <p>
     * The specified {@code caps} should not contain any resolution, pixel-aspect-ratio,
     * framerate, codec-data, .... Those should be specified instead in the returned
     * {@link VideoCodecState}.
     * <p>
     * If the subclass wishes to copy over existing fields (like pixel aspect ratio,
     * or framerate) from an existing {@link VideoCodecState}, it can be provided as a
     * {@code reference}.
     * <p>
     * If the subclass wishes to override some fields from the output state (like
     * pixel-aspect-ratio or framerate) it can do so on the returned {@link VideoCodecState}.
     * <p>
     * The new output state will only take effect (set on pads and buffers) starting
     * from the next call to {@code gst_video_encoder_finish_frame}().
     * @param caps the {@link org.gstreamer.gst.Caps} to use for the output
     * @param reference An optional reference {@code GstVideoCodecState}
     * @return the newly configured output state.
     */
    public org.gstreamer.video.VideoCodecState setOutputState(org.gstreamer.gst.Caps caps, @Nullable org.gstreamer.video.VideoCodecState reference) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_encoder_set_output_state.invokeExact(
                    handle(),
                    caps.handle(),
                    (Addressable) (reference == null ? MemoryAddress.NULL : reference.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        caps.yieldOwnership();
        var OBJECT = org.gstreamer.video.VideoCodecState.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Configures {@code encoder} to handle Quality-of-Service events from downstream.
     * @param enabled the new qos value.
     */
    public void setQosEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_video_encoder_set_qos_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
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
            RESULT = (long) DowncallHandles.gst_video_encoder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VideoEncoder.Builder} object constructs a {@link VideoEncoder} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VideoEncoder.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Element.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VideoEncoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoEncoder}.
         * @return A new instance of {@code VideoEncoder} with the properties 
         *         that were set in the Builder object.
         */
        public VideoEncoder build() {
            return (VideoEncoder) org.gtk.gobject.GObject.newWithProperties(
                VideoEncoder.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Minimum interval between force-keyunit requests in nanoseconds. See
         * gst_video_encoder_set_min_force_key_unit_interval() for more details.
         * @param minForceKeyUnitInterval The value for the {@code min-force-key-unit-interval} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinForceKeyUnitInterval(long minForceKeyUnitInterval) {
            names.add("min-force-key-unit-interval");
            values.add(org.gtk.gobject.Value.create(minForceKeyUnitInterval));
            return this;
        }
        
        public Builder setQos(boolean qos) {
            names.add("qos");
            values.add(org.gtk.gobject.Value.create(qos));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_encoder_allocate_output_buffer = Interop.downcallHandle(
                "gst_video_encoder_allocate_output_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_video_encoder_allocate_output_frame = Interop.downcallHandle(
                "gst_video_encoder_allocate_output_frame",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_video_encoder_finish_frame = Interop.downcallHandle(
                "gst_video_encoder_finish_frame",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_finish_subframe = Interop.downcallHandle(
                "gst_video_encoder_finish_subframe",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_get_allocator = Interop.downcallHandle(
                "gst_video_encoder_get_allocator",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_get_frame = Interop.downcallHandle(
                "gst_video_encoder_get_frame",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_video_encoder_get_frames = Interop.downcallHandle(
                "gst_video_encoder_get_frames",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_get_latency = Interop.downcallHandle(
                "gst_video_encoder_get_latency",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_get_max_encode_time = Interop.downcallHandle(
                "gst_video_encoder_get_max_encode_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_get_min_force_key_unit_interval = Interop.downcallHandle(
                "gst_video_encoder_get_min_force_key_unit_interval",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_get_oldest_frame = Interop.downcallHandle(
                "gst_video_encoder_get_oldest_frame",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_get_output_state = Interop.downcallHandle(
                "gst_video_encoder_get_output_state",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_is_qos_enabled = Interop.downcallHandle(
                "gst_video_encoder_is_qos_enabled",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_merge_tags = Interop.downcallHandle(
                "gst_video_encoder_merge_tags",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_video_encoder_negotiate = Interop.downcallHandle(
                "gst_video_encoder_negotiate",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_proxy_getcaps = Interop.downcallHandle(
                "gst_video_encoder_proxy_getcaps",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_set_headers = Interop.downcallHandle(
                "gst_video_encoder_set_headers",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_set_latency = Interop.downcallHandle(
                "gst_video_encoder_set_latency",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_video_encoder_set_min_force_key_unit_interval = Interop.downcallHandle(
                "gst_video_encoder_set_min_force_key_unit_interval",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_video_encoder_set_min_pts = Interop.downcallHandle(
                "gst_video_encoder_set_min_pts",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_video_encoder_set_output_state = Interop.downcallHandle(
                "gst_video_encoder_set_output_state",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_encoder_set_qos_enabled = Interop.downcallHandle(
                "gst_video_encoder_set_qos_enabled",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_video_encoder_get_type = Interop.downcallHandle(
                "gst_video_encoder_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_video_encoder_get_type != null;
    }
}
