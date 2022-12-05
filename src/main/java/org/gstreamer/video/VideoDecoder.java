package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This base class is for video decoders turning encoded data into raw video
 * frames.
 * <p>
 * The GstVideoDecoder base class and derived subclasses should cooperate as
 * follows:
 * <p>
 * <strong>Configuration</strong><br/>
 *   * Initially, GstVideoDecoder calls {@code start} when the decoder element
 *     is activated, which allows the subclass to perform any global setup.
 * <p>
 *   * GstVideoDecoder calls {@code set_format} to inform the subclass of caps
 *     describing input video data that it is about to receive, including
 *     possibly configuration data.
 *     While unlikely, it might be called more than once, if changing input
 *     parameters require reconfiguration.
 * <p>
 *   * Incoming data buffers are processed as needed, described in Data
 *     Processing below.
 * <p>
 *   * GstVideoDecoder calls {@code stop} at end of all processing.
 * <p>
 * <strong>Data processing</strong><br/>
 *   * The base class gathers input data, and optionally allows subclass
 *     to parse this into subsequently manageable chunks, typically
 *     corresponding to and referred to as 'frames'.
 * <p>
 *   * Each input frame is provided in turn to the subclass' {@code handle_frame}
 *     callback.
 *   * When the subclass enables the subframe mode with {@code gst_video_decoder_set_subframe_mode},
 *     the base class will provide to the subclass the same input frame with
 *     different input buffers to the subclass {@code handle_frame}
 *     callback. During this call, the subclass needs to take
 *     ownership of the input_buffer as {@code GstVideoCodecFrame}.input_buffer
 *     will have been changed before the next subframe buffer is received.
 *     The subclass will call {@code gst_video_decoder_have_last_subframe}
 *     when a new input frame can be created by the base class.
 *     Every subframe will share the same {@code GstVideoCodecFrame}.output_buffer
 *     to write the decoding result. The subclass is responsible to protect
 *     its access.
 * <p>
 *   * If codec processing results in decoded data, the subclass should call
 *     {@code gst_video_decoder_finish_frame} to have decoded data pushed
 *     downstream. In subframe mode
 *     the subclass should call {@code gst_video_decoder_finish_subframe} until the
 *     last subframe where it should call {@code gst_video_decoder_finish_frame}.
 *     The subclass can detect the last subframe using GST_VIDEO_BUFFER_FLAG_MARKER
 *     on buffers or using its own logic to collect the subframes.
 *     In case of decoding failure, the subclass must call
 *     {@code gst_video_decoder_drop_frame} or {@code gst_video_decoder_drop_subframe},
 *     to allow the base class to do timestamp and offset tracking, and possibly
 *     to requeue the frame for a later attempt in the case of reverse playback.
 * <p>
 * <strong>Shutdown phase</strong><br/>
 *   * The GstVideoDecoder class calls {@code stop} to inform the subclass that data
 *     parsing will be stopped.
 * <p>
 * <strong>Additional Notes</strong><br/>
 *   * Seeking/Flushing
 * <p>
 *     * When the pipeline is seeked or otherwise flushed, the subclass is
 *       informed via a call to its {@code reset} callback, with the hard parameter
 *       set to true. This indicates the subclass should drop any internal data
 *       queues and timestamps and prepare for a fresh set of buffers to arrive
 *       for parsing and decoding.
 * <p>
 *   * End Of Stream
 * <p>
 *     * At end-of-stream, the subclass {@code parse} function may be called some final
 *       times with the at_eos parameter set to true, indicating that the element
 *       should not expect any more data to be arriving, and it should parse and
 *       remaining frames and call gst_video_decoder_have_frame() if possible.
 * <p>
 * The subclass is responsible for providing pad template caps for
 * source and sink pads. The pads need to be named "sink" and "src". It also
 * needs to provide information about the output caps, when they are known.
 * This may be when the base class calls the subclass' {@code set_format} function,
 * though it might be during decoding, before calling
 * {@code gst_video_decoder_finish_frame}. This is done via
 * {@code gst_video_decoder_set_output_state}
 * <p>
 * The subclass is also responsible for providing (presentation) timestamps
 * (likely based on corresponding input ones).  If that is not applicable
 * or possible, the base class provides limited framerate based interpolation.
 * <p>
 * Similarly, the base class provides some limited (legacy) seeking support
 * if specifically requested by the subclass, as full-fledged support
 * should rather be left to upstream demuxer, parser or alike.  This simple
 * approach caters for seeking and duration reporting using estimated input
 * bitrates. To enable it, a subclass should call
 * {@code gst_video_decoder_set_estimate_rate} to enable handling of incoming
 * byte-streams.
 * <p>
 * The base class provides some support for reverse playback, in particular
 * in case incoming data is not packetized or upstream does not provide
 * fragments on keyframe boundaries.  However, the subclass should then be
 * prepared for the parsing and frame processing stage to occur separately
 * (in normal forward processing, the latter immediately follows the former),
 * The subclass also needs to ensure the parsing stage properly marks
 * keyframes, unless it knows the upstream elements will do so properly for
 * incoming data.
 * <p>
 * The bare minimum that a functional subclass needs to implement is:
 * <p>
 *   * Provide pad templates
 *   * Inform the base class of output caps via
 *      {@code gst_video_decoder_set_output_state}
 * <p>
 *   * Parse input data, if it is not considered packetized from upstream
 *      Data will be provided to {@code parse} which should invoke
 *      {@code gst_video_decoder_add_to_frame} and {@code gst_video_decoder_have_frame} to
 *      separate the data belonging to each video frame.
 * <p>
 *   * Accept data in {@code handle_frame} and provide decoded results to
 *      {@code gst_video_decoder_finish_frame}, or call {@code gst_video_decoder_drop_frame}.
 */
public class VideoDecoder extends org.gstreamer.gst.Element {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoDecoder";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
        Interop.valueLayout.ADDRESS.withName("sinkpad"),
        Interop.valueLayout.ADDRESS.withName("srcpad"),
        org.gtk.glib.RecMutex.getMemoryLayout().withName("stream_lock"),
        org.gstreamer.gst.Segment.getMemoryLayout().withName("input_segment"),
        org.gstreamer.gst.Segment.getMemoryLayout().withName("output_segment"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Create a VideoDecoder proxy instance for the provided memory address.
     * <p>
     * Because VideoDecoder is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoDecoder(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VideoDecoder if its GType is a (or inherits from) "GstVideoDecoder".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VideoDecoder} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVideoDecoder", a ClassCastException will be thrown.
     */
    public static VideoDecoder castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VideoDecoder.getType())) {
            return new VideoDecoder(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVideoDecoder");
        }
    }
    
    /**
     * Removes next {@code n_bytes} of input data and adds it to currently parsed frame.
     * @param nBytes the number of bytes to add
     */
    public void addToFrame(int nBytes) {
        try {
            DowncallHandles.gst_video_decoder_add_to_frame.invokeExact(
                    handle(),
                    nBytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Helper function that allocates a buffer to hold a video frame for {@code decoder}'s
     * current {@link VideoCodecState}.
     * <p>
     * You should use gst_video_decoder_allocate_output_frame() instead of this
     * function, if possible at all.
     * @return allocated buffer, or NULL if no buffer could be
     *     allocated (e.g. when downstream is flushing or shutting down)
     */
    public @NotNull org.gstreamer.gst.Buffer allocateOutputBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_decoder_allocate_output_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Helper function that allocates a buffer to hold a video frame for {@code decoder}'s
     * current {@link VideoCodecState}.  Subclass should already have configured video
     * state and set src pad caps.
     * <p>
     * The buffer allocated here is owned by the frame and you should only
     * keep references to the frame, not the buffer.
     * @param frame a {@link VideoCodecFrame}
     * @return {@link org.gstreamer.gst.FlowReturn#OK} if an output buffer could be allocated
     */
    public @NotNull org.gstreamer.gst.FlowReturn allocateOutputFrame(@NotNull org.gstreamer.video.VideoCodecFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_allocate_output_frame.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Same as {@code gst_video_decoder_allocate_output_frame} except it allows passing
     * {@link org.gstreamer.gst.BufferPoolAcquireParams} to the sub call gst_buffer_pool_acquire_buffer.
     * @param frame a {@link VideoCodecFrame}
     * @param params a {@link org.gstreamer.gst.BufferPoolAcquireParams}
     * @return {@link org.gstreamer.gst.FlowReturn#OK} if an output buffer could be allocated
     */
    public @NotNull org.gstreamer.gst.FlowReturn allocateOutputFrameWithParams(@NotNull org.gstreamer.video.VideoCodecFrame frame, @NotNull org.gstreamer.gst.BufferPoolAcquireParams params) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_allocate_output_frame_with_params.invokeExact(
                    handle(),
                    frame.handle(),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Similar to gst_video_decoder_finish_frame(), but drops {@code frame} in any
     * case and posts a QoS message with the frame's details on the bus.
     * In any case, the frame is considered finished and released.
     * @param frame the {@link VideoCodecFrame} to drop
     * @return a {@link org.gstreamer.gst.FlowReturn}, usually GST_FLOW_OK.
     */
    public @NotNull org.gstreamer.gst.FlowReturn dropFrame(@NotNull org.gstreamer.video.VideoCodecFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_drop_frame.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        frame.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Drops input data.
     * The frame is not considered finished until the whole frame
     * is finished or dropped by the subclass.
     * @param frame the {@link VideoCodecFrame}
     * @return a {@link org.gstreamer.gst.FlowReturn}, usually GST_FLOW_OK.
     */
    public @NotNull org.gstreamer.gst.FlowReturn dropSubframe(@NotNull org.gstreamer.video.VideoCodecFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_drop_subframe.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        frame.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * {@code frame} should have a valid decoded data buffer, whose metadata fields
     * are then appropriately set according to frame data and pushed downstream.
     * If no output data is provided, {@code frame} is considered skipped.
     * In any case, the frame is considered finished and released.
     * <p>
     * After calling this function the output buffer of the frame is to be
     * considered read-only. This function will also change the metadata
     * of the buffer.
     * @param frame a decoded {@link VideoCodecFrame}
     * @return a {@link org.gstreamer.gst.FlowReturn} resulting from sending data downstream
     */
    public @NotNull org.gstreamer.gst.FlowReturn finishFrame(@NotNull org.gstreamer.video.VideoCodecFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_finish_frame.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        frame.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Indicate that a subframe has been finished to be decoded
     * by the subclass. This method should be called for all subframes
     * except the last subframe where {@code gst_video_decoder_finish_frame}
     * should be called instead.
     * @param frame the {@link VideoCodecFrame}
     * @return a {@link org.gstreamer.gst.FlowReturn}, usually GST_FLOW_OK.
     */
    public @NotNull org.gstreamer.gst.FlowReturn finishSubframe(@NotNull org.gstreamer.video.VideoCodecFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_finish_subframe.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        frame.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Lets {@link VideoDecoder} sub-classes to know the memory {@code allocator}
     * used by the base class and its {@code params}.
     * <p>
     * Unref the {@code allocator} after use it.
     * @param allocator the {@link org.gstreamer.gst.Allocator}
     * used
     * @param params the
     * {@link org.gstreamer.gst.AllocationParams} of {@code allocator}
     */
    public void getAllocator(@NotNull Out<org.gstreamer.gst.Allocator> allocator, @NotNull org.gstreamer.gst.AllocationParams params) {
        java.util.Objects.requireNonNull(allocator, "Parameter 'allocator' must not be null");
        MemorySegment allocatorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        try {
            DowncallHandles.gst_video_decoder_get_allocator.invokeExact(
                    handle(),
                    (Addressable) allocatorPOINTER.address(),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        allocator.set(new org.gstreamer.gst.Allocator(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        params.yieldOwnership();
    }
    
    public @NotNull org.gstreamer.gst.BufferPool getBufferPool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_decoder_get_buffer_pool.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.BufferPool(RESULT, Ownership.FULL);
    }
    
    public int getEstimateRate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_get_estimate_rate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get a pending unfinished {@link VideoCodecFrame}
     * @param frameNumber system_frame_number of a frame
     * @return pending unfinished {@link VideoCodecFrame} identified by {@code frame_number}.
     */
    public @NotNull org.gstreamer.video.VideoCodecFrame getFrame(int frameNumber) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_decoder_get_frame.invokeExact(
                    handle(),
                    frameNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoCodecFrame(RESULT, Ownership.FULL);
    }
    
    /**
     * Get all pending unfinished {@link VideoCodecFrame}
     * @return pending unfinished {@link VideoCodecFrame}.
     */
    public @NotNull org.gtk.glib.List getFrames() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_decoder_get_frames.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Queries the number of the last subframe received by
     * the decoder baseclass in the {@code frame}.
     * @param frame the {@link VideoCodecFrame} to update
     * @return the current subframe index received in subframe mode, 1 otherwise.
     */
    public int getInputSubframeIndex(@NotNull org.gstreamer.video.VideoCodecFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_get_input_subframe_index.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Query the configured decoder latency. Results will be returned via
     * {@code min_latency} and {@code max_latency}.
     * @param minLatency address of variable in which to store the
     *     configured minimum latency, or {@code null}
     * @param maxLatency address of variable in which to store the
     *     configured mximum latency, or {@code null}
     */
    public void getLatency(@NotNull Out<org.gstreamer.gst.ClockTime> minLatency, @NotNull Out<org.gstreamer.gst.ClockTime> maxLatency) {
        java.util.Objects.requireNonNull(minLatency, "Parameter 'minLatency' must not be null");
        MemorySegment minLatencyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(maxLatency, "Parameter 'maxLatency' must not be null");
        MemorySegment maxLatencyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_video_decoder_get_latency.invokeExact(
                    handle(),
                    (Addressable) minLatencyPOINTER.address(),
                    (Addressable) maxLatencyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minLatency.set(new org.gstreamer.gst.ClockTime(minLatencyPOINTER.get(Interop.valueLayout.C_LONG, 0)));
        maxLatency.set(new org.gstreamer.gst.ClockTime(maxLatencyPOINTER.get(Interop.valueLayout.C_LONG, 0)));
    }
    
    /**
     * Determines maximum possible decoding time for {@code frame} that will
     * allow it to decode and arrive in time (as determined by QoS events).
     * In particular, a negative result means decoding in time is no longer possible
     * and should therefore occur as soon/skippy as possible.
     * @param frame a {@link VideoCodecFrame}
     * @return max decoding time.
     */
    public @NotNull org.gstreamer.gst.ClockTimeDiff getMaxDecodeTime(@NotNull org.gstreamer.video.VideoCodecFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_decoder_get_max_decode_time.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTimeDiff(RESULT);
    }
    
    public int getMaxErrors() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_get_max_errors.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries decoder required format handling.
     * @return {@code true} if required format handling is enabled.
     */
    public boolean getNeedsFormat() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_get_needs_format.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Queries if the decoder requires a sync point before it starts outputting
     * data in the beginning.
     * @return {@code true} if a sync point is required in the beginning.
     */
    public boolean getNeedsSyncPoint() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_get_needs_sync_point.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the oldest pending unfinished {@link VideoCodecFrame}
     * @return oldest pending unfinished {@link VideoCodecFrame}.
     */
    public @NotNull org.gstreamer.video.VideoCodecFrame getOldestFrame() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_decoder_get_oldest_frame.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoCodecFrame(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the {@link VideoCodecState} currently describing the output stream.
     * @return {@link VideoCodecState} describing format of video data.
     */
    public @NotNull org.gstreamer.video.VideoCodecState getOutputState() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_decoder_get_output_state.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoCodecState(RESULT, Ownership.FULL);
    }
    
    /**
     * Queries whether input data is considered packetized or not by the
     * base class.
     * @return TRUE if input data is considered packetized.
     */
    public boolean getPacketized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_get_packetized.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the number of bytes previously added to the current frame
     * by calling gst_video_decoder_add_to_frame().
     * @return The number of bytes pending for the current frame
     */
    public long getPendingFrameSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_decoder_get_pending_frame_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries the number of subframes in the frame processed by
     * the decoder baseclass.
     * @param frame the {@link VideoCodecFrame} to update
     * @return the current subframe processed received in subframe mode.
     */
    public int getProcessedSubframeIndex(@NotNull org.gstreamer.video.VideoCodecFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_get_processed_subframe_index.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public double getQosProportion() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_video_decoder_get_qos_proportion.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries whether input data is considered as subframes or not by the
     * base class. If FALSE, each input buffer will be considered as a full
     * frame.
     * @return TRUE if input data is considered as sub frames.
     */
    public boolean getSubframeMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_get_subframe_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gathers all data collected for currently parsed frame, gathers corresponding
     * metadata and passes it along for further processing, i.e. {@code handle_frame}.
     * @return a {@link org.gstreamer.gst.FlowReturn}
     */
    public @NotNull org.gstreamer.gst.FlowReturn haveFrame() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_have_frame.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Indicates that the last subframe has been processed by the decoder
     * in {@code frame}. This will release the current frame in video decoder
     * allowing to receive new frames from upstream elements. This method
     * must be called in the subclass {@code handle_frame} callback.
     * @param frame the {@link VideoCodecFrame} to update
     * @return a {@link org.gstreamer.gst.FlowReturn}, usually GST_FLOW_OK.
     */
    public @NotNull org.gstreamer.gst.FlowReturn haveLastSubframe(@NotNull org.gstreamer.video.VideoCodecFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_decoder_have_last_subframe.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Sets the audio decoder tags and how they should be merged with any
     * upstream stream tags. This will override any tags previously-set
     * with gst_audio_decoder_merge_tags().
     * <p>
     * Note that this is provided for convenience, and the subclass is
     * not required to use this and can still do tag handling on its own.
     * <p>
     * MT safe.
     * @param tags a {@link org.gstreamer.gst.TagList} to merge, or NULL to unset
     *     previously-set tags
     * @param mode the {@link org.gstreamer.gst.TagMergeMode} to use, usually {@code GST_TAG_MERGE_REPLACE}
     */
    public void mergeTags(@Nullable org.gstreamer.gst.TagList tags, @NotNull org.gstreamer.gst.TagMergeMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gst_video_decoder_merge_tags.invokeExact(
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
            RESULT = (int) DowncallHandles.gst_video_decoder_negotiate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns caps that express {@code caps} (or sink template caps if {@code caps} == NULL)
     * restricted to resolution/format/... combinations supported by downstream
     * elements.
     * @param caps initial caps
     * @param filter filter caps
     * @return a {@link org.gstreamer.gst.Caps} owned by caller
     */
    public @NotNull org.gstreamer.gst.Caps proxyGetcaps(@Nullable org.gstreamer.gst.Caps caps, @Nullable org.gstreamer.gst.Caps filter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_decoder_proxy_getcaps.invokeExact(
                    handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * Similar to gst_video_decoder_drop_frame(), but simply releases {@code frame}
     * without any processing other than removing it from list of pending frames,
     * after which it is considered finished and released.
     * @param frame the {@link VideoCodecFrame} to release
     */
    public void releaseFrame(@NotNull org.gstreamer.video.VideoCodecFrame frame) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        try {
            DowncallHandles.gst_video_decoder_release_frame.invokeExact(
                    handle(),
                    frame.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        frame.yieldOwnership();
    }
    
    /**
     * Allows the {@link VideoDecoder} subclass to request from the base class that
     * a new sync should be requested from upstream, and that {@code frame} was the frame
     * when the subclass noticed that a new sync point is required. A reason for
     * the subclass to do this could be missing reference frames, for example.
     * <p>
     * The base class will then request a new sync point from upstream as long as
     * the time that passed since the last one is exceeding
     * {@link VideoDecoder}:min-force-key-unit-interval.
     * <p>
     * The subclass can signal via {@code flags} how the frames until the next sync point
     * should be handled:
     * <p>
     *   * If {@link VideoDecoderRequestSyncPointFlags#DISCARD_INPUT} is selected then
     *     all following input frames until the next sync point are discarded.
     *     This can be useful if the lack of a sync point will prevent all further
     *     decoding and the decoder implementation is not very robust in handling
     *     missing references frames.
     *   * If {@link VideoDecoderRequestSyncPointFlags#CORRUPT_OUTPUT} is selected
     *     then all output frames following {@code frame} are marked as corrupted via
     *     {@link org.gstreamer.gst.BufferFlags#CORRUPTED}. Corrupted frames can be automatically
     *     dropped by the base class, see {@link VideoDecoder}:discard-corrupted-frames.
     *     Subclasses can manually mark frames as corrupted via {@link VideoCodecFrameFlags#CORRUPTED}
     *     before calling gst_video_decoder_finish_frame().
     * @param frame a {@link VideoCodecFrame}
     * @param flags {@link VideoDecoderRequestSyncPointFlags}
     */
    public void requestSyncPoint(@NotNull org.gstreamer.video.VideoCodecFrame frame, @NotNull org.gstreamer.video.VideoDecoderRequestSyncPointFlags flags) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.gst_video_decoder_request_sync_point.invokeExact(
                    handle(),
                    frame.handle(),
                    flags.getValue());
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
            DowncallHandles.gst_video_decoder_set_estimate_rate.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Same as {@code gst_video_decoder_set_output_state}() but also allows you to also set
     * the interlacing mode.
     * @param fmt a {@link VideoFormat}
     * @param interlaceMode A {@link VideoInterlaceMode}
     * @param width The width in pixels
     * @param height The height in pixels
     * @param reference An optional reference {@link VideoCodecState}
     * @return the newly configured output state.
     */
    public @NotNull org.gstreamer.video.VideoCodecState setInterlacedOutputState(@NotNull org.gstreamer.video.VideoFormat fmt, @NotNull org.gstreamer.video.VideoInterlaceMode interlaceMode, int width, int height, @Nullable org.gstreamer.video.VideoCodecState reference) {
        java.util.Objects.requireNonNull(fmt, "Parameter 'fmt' must not be null");
        java.util.Objects.requireNonNull(interlaceMode, "Parameter 'interlaceMode' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_decoder_set_interlaced_output_state.invokeExact(
                    handle(),
                    fmt.getValue(),
                    interlaceMode.getValue(),
                    width,
                    height,
                    (Addressable) (reference == null ? MemoryAddress.NULL : reference.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoCodecState(RESULT, Ownership.FULL);
    }
    
    /**
     * Lets {@link VideoDecoder} sub-classes tell the baseclass what the decoder
     * latency is. Will also post a LATENCY message on the bus so the pipeline
     * can reconfigure its global latency.
     * @param minLatency minimum latency
     * @param maxLatency maximum latency
     */
    public void setLatency(@NotNull org.gstreamer.gst.ClockTime minLatency, @NotNull org.gstreamer.gst.ClockTime maxLatency) {
        java.util.Objects.requireNonNull(minLatency, "Parameter 'minLatency' must not be null");
        java.util.Objects.requireNonNull(maxLatency, "Parameter 'maxLatency' must not be null");
        try {
            DowncallHandles.gst_video_decoder_set_latency.invokeExact(
                    handle(),
                    minLatency.getValue().longValue(),
                    maxLatency.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets numbers of tolerated decoder errors, where a tolerated one is then only
     * warned about, but more than tolerated will lead to fatal error.  You can set
     * -1 for never returning fatal errors. Default is set to
     * GST_VIDEO_DECODER_MAX_ERRORS.
     * <p>
     * The '-1' option was added in 1.4
     * @param num max tolerated errors
     */
    public void setMaxErrors(int num) {
        try {
            DowncallHandles.gst_video_decoder_set_max_errors.invokeExact(
                    handle(),
                    num);
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
     * @param enabled new state
     */
    public void setNeedsFormat(boolean enabled) {
        try {
            DowncallHandles.gst_video_decoder_set_needs_format.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures whether the decoder requires a sync point before it starts
     * outputting data in the beginning. If enabled, the base class will discard
     * all non-sync point frames in the beginning and after a flush and does not
     * pass it to the subclass.
     * <p>
     * If the first frame is not a sync point, the base class will request a sync
     * point via the force-key-unit event.
     * @param enabled new state
     */
    public void setNeedsSyncPoint(boolean enabled) {
        try {
            DowncallHandles.gst_video_decoder_set_needs_sync_point.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link VideoCodecState} with the specified {@code fmt}, {@code width} and {@code height}
     * as the output state for the decoder.
     * Any previously set output state on {@code decoder} will be replaced by the newly
     * created one.
     * <p>
     * If the subclass wishes to copy over existing fields (like pixel aspec ratio,
     * or framerate) from an existing {@link VideoCodecState}, it can be provided as a
     * {@code reference}.
     * <p>
     * If the subclass wishes to override some fields from the output state (like
     * pixel-aspect-ratio or framerate) it can do so on the returned {@link VideoCodecState}.
     * <p>
     * The new output state will only take effect (set on pads and buffers) starting
     * from the next call to {@code gst_video_decoder_finish_frame}().
     * @param fmt a {@link VideoFormat}
     * @param width The width in pixels
     * @param height The height in pixels
     * @param reference An optional reference {@link VideoCodecState}
     * @return the newly configured output state.
     */
    public @NotNull org.gstreamer.video.VideoCodecState setOutputState(@NotNull org.gstreamer.video.VideoFormat fmt, int width, int height, @Nullable org.gstreamer.video.VideoCodecState reference) {
        java.util.Objects.requireNonNull(fmt, "Parameter 'fmt' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_decoder_set_output_state.invokeExact(
                    handle(),
                    fmt.getValue(),
                    width,
                    height,
                    (Addressable) (reference == null ? MemoryAddress.NULL : reference.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoCodecState(RESULT, Ownership.FULL);
    }
    
    /**
     * Allows baseclass to consider input data as packetized or not. If the
     * input is packetized, then the {@code parse} method will not be called.
     * @param packetized whether the input data should be considered as packetized.
     */
    public void setPacketized(boolean packetized) {
        try {
            DowncallHandles.gst_video_decoder_set_packetized.invokeExact(
                    handle(),
                    packetized ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If this is set to TRUE, it informs the base class that the subclass
     * can receive the data at a granularity lower than one frame.
     * <p>
     * Note that in this mode, the subclass has two options. It can either
     * require the presence of a GST_VIDEO_BUFFER_FLAG_MARKER to mark the
     * end of a frame. Or it can operate in such a way that it will decode
     * a single frame at a time. In this second case, every buffer that
     * arrives to the element is considered part of the same frame until
     * gst_video_decoder_finish_frame() is called.
     * <p>
     * In either case, the same {@link VideoCodecFrame} will be passed to the
     * GstVideoDecoderClass:handle_frame vmethod repeatedly with a
     * different GstVideoCodecFrame:input_buffer every time until the end of the
     * frame has been signaled using either method.
     * This method must be called during the decoder subclass {@code set_format} call.
     * @param subframeMode whether the input data should be considered as subframes.
     */
    public void setSubframeMode(boolean subframeMode) {
        try {
            DowncallHandles.gst_video_decoder_set_subframe_mode.invokeExact(
                    handle(),
                    subframeMode ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Lets {@link VideoDecoder} sub-classes decide if they want the sink pad
     * to use the default pad query handler to reply to accept-caps queries.
     * <p>
     * By setting this to true it is possible to further customize the default
     * handler with {@code GST_PAD_SET_ACCEPT_INTERSECT} and
     * {@code GST_PAD_SET_ACCEPT_TEMPLATE}
     * @param use if the default pad accept-caps query handling should be used
     */
    public void setUseDefaultPadAcceptcaps(boolean use) {
        try {
            DowncallHandles.gst_video_decoder_set_use_default_pad_acceptcaps.invokeExact(
                    handle(),
                    use ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gst_video_decoder_get_type.invokeExact();
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
         * A {@link VideoDecoder.Build} object constructs a {@link VideoDecoder} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VideoDecoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoDecoder} using {@link VideoDecoder#castFrom}.
         * @return A new instance of {@code VideoDecoder} with the properties 
         *         that were set in the Build object.
         */
        public VideoDecoder construct() {
            return VideoDecoder.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VideoDecoder.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * GstVideoDecoderRequestSyncPointFlags to use for the automatically
         * requested sync points if {@code automatic-request-sync-points} is enabled.
         * @param automaticRequestSyncPointFlags The value for the {@code automatic-request-sync-point-flags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAutomaticRequestSyncPointFlags(org.gstreamer.video.VideoDecoderRequestSyncPointFlags automaticRequestSyncPointFlags) {
            names.add("automatic-request-sync-point-flags");
            values.add(org.gtk.gobject.Value.create(automaticRequestSyncPointFlags));
            return this;
        }
        
        /**
         * If set to {@code true} the decoder will automatically request sync points when
         * it seems like a good idea, e.g. if the first frames are not key frames or
         * if packet loss was reported by upstream.
         * @param automaticRequestSyncPoints The value for the {@code automatic-request-sync-points} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAutomaticRequestSyncPoints(boolean automaticRequestSyncPoints) {
            names.add("automatic-request-sync-points");
            values.add(org.gtk.gobject.Value.create(automaticRequestSyncPoints));
            return this;
        }
        
        /**
         * If set to {@code true} the decoder will discard frames that are marked as
         * corrupted instead of outputting them.
         * @param discardCorruptedFrames The value for the {@code discard-corrupted-frames} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDiscardCorruptedFrames(boolean discardCorruptedFrames) {
            names.add("discard-corrupted-frames");
            values.add(org.gtk.gobject.Value.create(discardCorruptedFrames));
            return this;
        }
        
        /**
         * Maximum number of tolerated consecutive decode errors. See
         * gst_video_decoder_set_max_errors() for more details.
         * @param maxErrors The value for the {@code max-errors} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxErrors(int maxErrors) {
            names.add("max-errors");
            values.add(org.gtk.gobject.Value.create(maxErrors));
            return this;
        }
        
        /**
         * Minimum interval between force-key-unit events sent upstream by the
         * decoder. Setting this to 0 will cause every event to be handled, setting
         * this to {@code GST_CLOCK_TIME_NONE} will cause every event to be ignored.
         * <p>
         * See gst_video_event_new_upstream_force_key_unit() for more details about
         * force-key-unit events.
         * @param minForceKeyUnitInterval The value for the {@code min-force-key-unit-interval} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinForceKeyUnitInterval(long minForceKeyUnitInterval) {
            names.add("min-force-key-unit-interval");
            values.add(org.gtk.gobject.Value.create(minForceKeyUnitInterval));
            return this;
        }
        
        /**
         * If set to {@code true} the decoder will handle QoS events received
         * from downstream elements.
         * This includes dropping output frames which are detected as late
         * using the metrics reported by those events.
         * @param qos The value for the {@code qos} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setQos(boolean qos) {
            names.add("qos");
            values.add(org.gtk.gobject.Value.create(qos));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_decoder_add_to_frame = Interop.downcallHandle(
            "gst_video_decoder_add_to_frame",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_allocate_output_buffer = Interop.downcallHandle(
            "gst_video_decoder_allocate_output_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_allocate_output_frame = Interop.downcallHandle(
            "gst_video_decoder_allocate_output_frame",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_allocate_output_frame_with_params = Interop.downcallHandle(
            "gst_video_decoder_allocate_output_frame_with_params",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_drop_frame = Interop.downcallHandle(
            "gst_video_decoder_drop_frame",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_drop_subframe = Interop.downcallHandle(
            "gst_video_decoder_drop_subframe",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_finish_frame = Interop.downcallHandle(
            "gst_video_decoder_finish_frame",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_finish_subframe = Interop.downcallHandle(
            "gst_video_decoder_finish_subframe",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_allocator = Interop.downcallHandle(
            "gst_video_decoder_get_allocator",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_buffer_pool = Interop.downcallHandle(
            "gst_video_decoder_get_buffer_pool",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_estimate_rate = Interop.downcallHandle(
            "gst_video_decoder_get_estimate_rate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_frame = Interop.downcallHandle(
            "gst_video_decoder_get_frame",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_frames = Interop.downcallHandle(
            "gst_video_decoder_get_frames",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_input_subframe_index = Interop.downcallHandle(
            "gst_video_decoder_get_input_subframe_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_latency = Interop.downcallHandle(
            "gst_video_decoder_get_latency",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_max_decode_time = Interop.downcallHandle(
            "gst_video_decoder_get_max_decode_time",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_max_errors = Interop.downcallHandle(
            "gst_video_decoder_get_max_errors",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_needs_format = Interop.downcallHandle(
            "gst_video_decoder_get_needs_format",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_needs_sync_point = Interop.downcallHandle(
            "gst_video_decoder_get_needs_sync_point",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_oldest_frame = Interop.downcallHandle(
            "gst_video_decoder_get_oldest_frame",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_output_state = Interop.downcallHandle(
            "gst_video_decoder_get_output_state",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_packetized = Interop.downcallHandle(
            "gst_video_decoder_get_packetized",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_pending_frame_size = Interop.downcallHandle(
            "gst_video_decoder_get_pending_frame_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_processed_subframe_index = Interop.downcallHandle(
            "gst_video_decoder_get_processed_subframe_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_qos_proportion = Interop.downcallHandle(
            "gst_video_decoder_get_qos_proportion",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_subframe_mode = Interop.downcallHandle(
            "gst_video_decoder_get_subframe_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_have_frame = Interop.downcallHandle(
            "gst_video_decoder_have_frame",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_have_last_subframe = Interop.downcallHandle(
            "gst_video_decoder_have_last_subframe",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_merge_tags = Interop.downcallHandle(
            "gst_video_decoder_merge_tags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_negotiate = Interop.downcallHandle(
            "gst_video_decoder_negotiate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_proxy_getcaps = Interop.downcallHandle(
            "gst_video_decoder_proxy_getcaps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_release_frame = Interop.downcallHandle(
            "gst_video_decoder_release_frame",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_request_sync_point = Interop.downcallHandle(
            "gst_video_decoder_request_sync_point",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_set_estimate_rate = Interop.downcallHandle(
            "gst_video_decoder_set_estimate_rate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_set_interlaced_output_state = Interop.downcallHandle(
            "gst_video_decoder_set_interlaced_output_state",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_set_latency = Interop.downcallHandle(
            "gst_video_decoder_set_latency",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_video_decoder_set_max_errors = Interop.downcallHandle(
            "gst_video_decoder_set_max_errors",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_set_needs_format = Interop.downcallHandle(
            "gst_video_decoder_set_needs_format",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_set_needs_sync_point = Interop.downcallHandle(
            "gst_video_decoder_set_needs_sync_point",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_set_output_state = Interop.downcallHandle(
            "gst_video_decoder_set_output_state",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_decoder_set_packetized = Interop.downcallHandle(
            "gst_video_decoder_set_packetized",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_set_subframe_mode = Interop.downcallHandle(
            "gst_video_decoder_set_subframe_mode",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_set_use_default_pad_acceptcaps = Interop.downcallHandle(
            "gst_video_decoder_set_use_default_pad_acceptcaps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_decoder_get_type = Interop.downcallHandle(
            "gst_video_decoder_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
