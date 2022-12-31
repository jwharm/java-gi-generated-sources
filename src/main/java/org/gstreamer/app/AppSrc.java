package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The appsrc element can be used by applications to insert data into a
 * GStreamer pipeline. Unlike most GStreamer elements, appsrc provides
 * external API functions.
 * <p>
 * appsrc can be used by linking with the libgstapp library to access the
 * methods directly or by using the appsrc action signals.
 * <p>
 * Before operating appsrc, the caps property must be set to fixed caps
 * describing the format of the data that will be pushed with appsrc. An
 * exception to this is when pushing buffers with unknown caps, in which case no
 * caps should be set. This is typically true of file-like sources that push raw
 * byte buffers. If you don't want to explicitly set the caps, you can use
 * gst_app_src_push_sample. This method gets the caps associated with the
 * sample and sets them on the appsrc replacing any previously set caps (if
 * different from sample's caps).
 * <p>
 * The main way of handing data to the appsrc element is by calling the
 * gst_app_src_push_buffer() method or by emitting the push-buffer action signal.
 * This will put the buffer onto a queue from which appsrc will read from in its
 * streaming thread. It is important to note that data transport will not happen
 * from the thread that performed the push-buffer call.
 * <p>
 * The "max-bytes", "max-buffers" and "max-time" properties control how much
 * data can be queued in appsrc before appsrc considers the queue full. A
 * filled internal queue will always signal the "enough-data" signal, which
 * signals the application that it should stop pushing data into appsrc. The
 * "block" property will cause appsrc to block the push-buffer method until
 * free data becomes available again.
 * <p>
 * When the internal queue is running out of data, the "need-data" signal is
 * emitted, which signals the application that it should start pushing more data
 * into appsrc.
 * <p>
 * In addition to the "need-data" and "enough-data" signals, appsrc can emit the
 * "seek-data" signal when the "stream-mode" property is set to "seekable" or
 * "random-access". The signal argument will contain the new desired position in
 * the stream expressed in the unit set with the "format" property. After
 * receiving the seek-data signal, the application should push-buffers from the
 * new position.
 * <p>
 * These signals allow the application to operate the appsrc in two different
 * ways:
 * <p>
 * The push mode, in which the application repeatedly calls the push-buffer/push-sample
 * method with a new buffer/sample. Optionally, the queue size in the appsrc
 * can be controlled with the enough-data and need-data signals by respectively
 * stopping/starting the push-buffer/push-sample calls. This is a typical
 * mode of operation for the stream-type "stream" and "seekable". Use this
 * mode when implementing various network protocols or hardware devices.
 * <p>
 * The pull mode, in which the need-data signal triggers the next push-buffer call.
 * This mode is typically used in the "random-access" stream-type. Use this
 * mode for file access or other randomly accessible sources. In this mode, a
 * buffer of exactly the amount of bytes given by the need-data signal should be
 * pushed into appsrc.
 * <p>
 * In all modes, the size property on appsrc should contain the total stream
 * size in bytes. Setting this property is mandatory in the random-access mode.
 * For the stream and seekable modes, setting this property is optional but
 * recommended.
 * <p>
 * When the application has finished pushing data into appsrc, it should call
 * gst_app_src_end_of_stream() or emit the end-of-stream action signal. After
 * this call, no more buffers can be pushed into appsrc until a flushing seek
 * occurs or the state of the appsrc has gone through READY.
 */
public class AppSrc extends org.gstreamer.base.BaseSrc implements org.gstreamer.gst.URIHandler {
    
    static {
        GstApp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAppSrc";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseSrc.getMemoryLayout().withName("basesrc"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AppSrc proxy instance for the provided memory address.
     * <p>
     * Because AppSrc is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AppSrc(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, AppSrc> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AppSrc(input, ownership);
    
    /**
     * Indicates to the appsrc element that the last buffer queued in the
     * element is the last buffer of the stream.
     * @return {@code GST_FLOW_OK} when the EOS was successfully queued.
     * {@code GST_FLOW_FLUSHING} when {@code appsrc} is not PAUSED or PLAYING.
     */
    public org.gstreamer.gst.FlowReturn endOfStream() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_src_end_of_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Get the configured caps on {@code appsrc}.
     * @return the {@link org.gstreamer.gst.Caps} produced by the source. gst_caps_unref() after usage.
     */
    public org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_src_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the number of currently queued buffers inside {@code appsrc}.
     * @return The number of currently queued buffers.
     */
    public long getCurrentLevelBuffers() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_app_src_get_current_level_buffers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the number of currently queued bytes inside {@code appsrc}.
     * @return The number of currently queued bytes.
     */
    public long getCurrentLevelBytes() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_app_src_get_current_level_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the amount of currently queued time inside {@code appsrc}.
     * @return The amount of currently queued time.
     */
    public org.gstreamer.gst.ClockTime getCurrentLevelTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_app_src_get_current_level_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the duration of the stream in nanoseconds. A value of GST_CLOCK_TIME_NONE means that the duration is
     * not known.
     * @return the duration of the stream previously set with gst_app_src_set_duration();
     */
    public org.gstreamer.gst.ClockTime getDuration() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_app_src_get_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Check if appsrc will emit the "new-preroll" and "new-buffer" signals.
     * @return {@code true} if {@code appsrc} is emitting the "new-preroll" and "new-buffer"
     * signals.
     */
    public boolean getEmitSignals() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_src_get_emit_signals.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieve the min and max latencies in {@code min} and {@code max} respectively.
     * @param min the min latency
     * @param max the max latency
     */
    public void getLatency(Out<Long> min, Out<Long> max) {
        MemorySegment minPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment maxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_app_src_get_latency.invokeExact(
                    handle(),
                    (Addressable) minPOINTER.address(),
                    (Addressable) maxPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        min.set(minPOINTER.get(Interop.valueLayout.C_LONG, 0));
        max.set(maxPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Returns the currently set {@link AppLeakyType}. See gst_app_src_set_leaky_type()
     * for more details.
     * @return The currently set {@link AppLeakyType}.
     */
    public org.gstreamer.app.AppLeakyType getLeakyType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_src_get_leaky_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.app.AppLeakyType.of(RESULT);
    }
    
    /**
     * Get the maximum amount of buffers that can be queued in {@code appsrc}.
     * @return The maximum amount of buffers that can be queued.
     */
    public long getMaxBuffers() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_app_src_get_max_buffers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the maximum amount of bytes that can be queued in {@code appsrc}.
     * @return The maximum amount of bytes that can be queued.
     */
    public long getMaxBytes() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_app_src_get_max_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the maximum amount of time that can be queued in {@code appsrc}.
     * @return The maximum amount of time that can be queued.
     */
    public org.gstreamer.gst.ClockTime getMaxTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_app_src_get_max_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the size of the stream in bytes. A value of -1 means that the size is
     * not known.
     * @return the size of the stream previously set with gst_app_src_set_size();
     */
    public long getSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_app_src_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the stream type. Control the stream type of {@code appsrc}
     * with gst_app_src_set_stream_type().
     * @return the stream type.
     */
    public org.gstreamer.app.AppStreamType getStreamType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_src_get_stream_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.app.AppStreamType.of(RESULT);
    }
    
    /**
     * Adds a buffer to the queue of buffers that the appsrc element will
     * push to its source pad.  This function takes ownership of the buffer.
     * <p>
     * When the block property is TRUE, this function can block until free
     * space becomes available in the queue.
     * @param buffer a {@link org.gstreamer.gst.Buffer} to push
     * @return {@code GST_FLOW_OK} when the buffer was successfully queued.
     * {@code GST_FLOW_FLUSHING} when {@code appsrc} is not PAUSED or PLAYING.
     * {@code GST_FLOW_EOS} when EOS occurred.
     */
    public org.gstreamer.gst.FlowReturn pushBuffer(org.gstreamer.gst.Buffer buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_src_push_buffer.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Adds a buffer list to the queue of buffers and buffer lists that the
     * appsrc element will push to its source pad.  This function takes ownership
     * of {@code buffer_list}.
     * <p>
     * When the block property is TRUE, this function can block until free
     * space becomes available in the queue.
     * @param bufferList a {@link org.gstreamer.gst.BufferList} to push
     * @return {@code GST_FLOW_OK} when the buffer list was successfully queued.
     * {@code GST_FLOW_FLUSHING} when {@code appsrc} is not PAUSED or PLAYING.
     * {@code GST_FLOW_EOS} when EOS occurred.
     */
    public org.gstreamer.gst.FlowReturn pushBufferList(org.gstreamer.gst.BufferList bufferList) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_src_push_buffer_list.invokeExact(
                    handle(),
                    bufferList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bufferList.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Extract a buffer from the provided sample and adds it to the queue of
     * buffers that the appsrc element will push to its source pad. Any
     * previous caps that were set on appsrc will be replaced by the caps
     * associated with the sample if not equal.
     * <p>
     * This function does not take ownership of the
     * sample so the sample needs to be unreffed after calling this function.
     * <p>
     * When the block property is TRUE, this function can block until free
     * space becomes available in the queue.
     * @param sample a {@link org.gstreamer.gst.Sample} from which buffer and caps may be
     * extracted
     * @return {@code GST_FLOW_OK} when the buffer was successfully queued.
     * {@code GST_FLOW_FLUSHING} when {@code appsrc} is not PAUSED or PLAYING.
     * {@code GST_FLOW_EOS} when EOS occurred.
     */
    public org.gstreamer.gst.FlowReturn pushSample(org.gstreamer.gst.Sample sample) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_src_push_sample.invokeExact(
                    handle(),
                    sample.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Set callbacks which will be executed when data is needed, enough data has
     * been collected or when a seek should be performed.
     * This is an alternative to using the signals, it has lower overhead and is thus
     * less expensive, but also less flexible.
     * <p>
     * If callbacks are installed, no signals will be emitted for performance
     * reasons.
     * <p>
     * Before 1.16.3 it was not possible to change the callbacks in a thread-safe
     * way.
     * @param callbacks the callbacks
     * @param notify a destroy notify function
     */
    public void setCallbacks(org.gstreamer.app.AppSrcCallbacks callbacks, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_app_src_set_callbacks.invokeExact(
                    handle(),
                    callbacks.handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the capabilities on the appsrc element.  This function takes
     * a copy of the caps structure. After calling this method, the source will
     * only produce caps that match {@code caps}. {@code caps} must be fixed and the caps on the
     * buffers must match the caps or left NULL.
     * @param caps caps to set
     */
    public void setCapabilities(@Nullable org.gstreamer.gst.Caps caps) {
        try {
            DowncallHandles.gst_app_src_set_caps.invokeExact(
                    handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the duration of the stream in nanoseconds. A value of GST_CLOCK_TIME_NONE means that the duration is
     * not known.
     * @param duration the duration to set
     */
    public void setDuration(org.gstreamer.gst.ClockTime duration) {
        try {
            DowncallHandles.gst_app_src_set_duration.invokeExact(
                    handle(),
                    duration.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Make appsrc emit the "new-preroll" and "new-buffer" signals. This option is
     * by default disabled because signal emission is expensive and unneeded when
     * the application prefers to operate in pull mode.
     * @param emit the new state
     */
    public void setEmitSignals(boolean emit) {
        try {
            DowncallHandles.gst_app_src_set_emit_signals.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(emit, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configure the {@code min} and {@code max} latency in {@code src}. If {@code min} is set to -1, the
     * default latency calculations for pseudo-live sources will be used.
     * @param min the min latency
     * @param max the max latency
     */
    public void setLatency(long min, long max) {
        try {
            DowncallHandles.gst_app_src_set_latency.invokeExact(
                    handle(),
                    min,
                    max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * When set to any other value than GST_APP_LEAKY_TYPE_NONE then the appsrc
     * will drop any buffers that are pushed into it once its internal queue is
     * full. The selected type defines whether to drop the oldest or new
     * buffers.
     * @param leaky the {@link AppLeakyType}
     */
    public void setLeakyType(org.gstreamer.app.AppLeakyType leaky) {
        try {
            DowncallHandles.gst_app_src_set_leaky_type.invokeExact(
                    handle(),
                    leaky.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the maximum amount of buffers that can be queued in {@code appsrc}.
     * After the maximum amount of buffers are queued, {@code appsrc} will emit the
     * "enough-data" signal.
     * @param max the maximum number of buffers to queue
     */
    public void setMaxBuffers(long max) {
        try {
            DowncallHandles.gst_app_src_set_max_buffers.invokeExact(
                    handle(),
                    max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the maximum amount of bytes that can be queued in {@code appsrc}.
     * After the maximum amount of bytes are queued, {@code appsrc} will emit the
     * "enough-data" signal.
     * @param max the maximum number of bytes to queue
     */
    public void setMaxBytes(long max) {
        try {
            DowncallHandles.gst_app_src_set_max_bytes.invokeExact(
                    handle(),
                    max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the maximum amount of time that can be queued in {@code appsrc}.
     * After the maximum amount of time are queued, {@code appsrc} will emit the
     * "enough-data" signal.
     * @param max the maximum amonut of time to queue
     */
    public void setMaxTime(org.gstreamer.gst.ClockTime max) {
        try {
            DowncallHandles.gst_app_src_set_max_time.invokeExact(
                    handle(),
                    max.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the size of the stream in bytes. A value of -1 means that the size is
     * not known.
     * @param size the size to set
     */
    public void setSize(long size) {
        try {
            DowncallHandles.gst_app_src_set_size.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the stream type on {@code appsrc}. For seekable streams, the "seek" signal must
     * be connected to.
     * <p>
     * A stream_type stream
     * @param type the new state
     */
    public void setStreamType(org.gstreamer.app.AppStreamType type) {
        try {
            DowncallHandles.gst_app_src_set_stream_type.invokeExact(
                    handle(),
                    type.getValue());
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
            RESULT = (long) DowncallHandles.gst_app_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface EndOfStream {
        org.gstreamer.gst.FlowReturn run();

        @ApiStatus.Internal default int upcall(MemoryAddress sourceAppSrc) {
            var RESULT = run();
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EndOfStream.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Notify {@code appsrc} that no more buffer are available.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSrc.EndOfStream> onEndOfStream(AppSrc.EndOfStream handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("end-of-stream"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EnoughData {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppSrc) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EnoughData.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signal that the source has enough data. It is recommended that the
     * application stops calling push-buffer until the need-data signal is
     * emitted again to avoid excessive buffer queueing.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSrc.EnoughData> onEnoughData(AppSrc.EnoughData handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("enough-data"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NeedData {
        void run(int length);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppSrc, int length) {
            run(length);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NeedData.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signal that the source needs more data. In the callback or from another
     * thread you should call push-buffer or end-of-stream.
     * <p>
     * {@code length} is just a hint and when it is set to -1, any number of bytes can be
     * pushed into {@code appsrc}.
     * <p>
     * You can call push-buffer multiple times until the enough-data signal is
     * fired.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSrc.NeedData> onNeedData(AppSrc.NeedData handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("need-data"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PushBuffer {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceAppSrc, MemoryAddress buffer) {
            var RESULT = run(org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PushBuffer.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Adds a buffer to the queue of buffers that the appsrc element will
     * push to its source pad.
     * <p>
     * This function does not take ownership of the buffer, but it takes a
     * reference so the buffer can be unreffed at any time after calling this
     * function.
     * <p>
     * When the block property is TRUE, this function can block until free space
     * becomes available in the queue.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSrc.PushBuffer> onPushBuffer(AppSrc.PushBuffer handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("push-buffer"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PushBufferList {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.BufferList bufferList);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceAppSrc, MemoryAddress bufferList) {
            var RESULT = run(org.gstreamer.gst.BufferList.fromAddress.marshal(bufferList, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PushBufferList.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Adds a buffer list to the queue of buffers and buffer lists that the
     * appsrc element will push to its source pad.
     * <p>
     * This function does not take ownership of the buffer list, but it takes a
     * reference so the buffer list can be unreffed at any time after calling
     * this function.
     * <p>
     * When the block property is TRUE, this function can block until free space
     * becomes available in the queue.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSrc.PushBufferList> onPushBufferList(AppSrc.PushBufferList handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("push-buffer-list"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PushSample {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.Sample sample);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceAppSrc, MemoryAddress sample) {
            var RESULT = run(org.gstreamer.gst.Sample.fromAddress.marshal(sample, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PushSample.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Extract a buffer from the provided sample and adds the extracted buffer
     * to the queue of buffers that the appsrc element will
     * push to its source pad. This function set the appsrc caps based on the caps
     * in the sample and reset the caps if they change.
     * Only the caps and the buffer of the provided sample are used and not
     * for example the segment in the sample.
     * <p>
     * This function does not take ownership of the sample, but it takes a
     * reference so the sample can be unreffed at any time after calling this
     * function.
     * <p>
     * When the block property is TRUE, this function can block until free space
     * becomes available in the queue.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSrc.PushSample> onPushSample(AppSrc.PushSample handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("push-sample"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SeekData {
        boolean run(long offset);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceAppSrc, long offset) {
            var RESULT = run(offset);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SeekData.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Seek to the given offset. The next push-buffer should produce buffers from
     * the new {@code offset}.
     * This callback is only called for seekable stream types.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSrc.SeekData> onSeekData(AppSrc.SeekData handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("seek-data"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link AppSrc.Builder} object constructs a {@link AppSrc} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AppSrc.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.BaseSrc.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AppSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppSrc}.
         * @return A new instance of {@code AppSrc} with the properties 
         *         that were set in the Builder object.
         */
        public AppSrc build() {
            return (AppSrc) org.gtk.gobject.GObject.newWithProperties(
                AppSrc.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * When max-bytes are queued and after the enough-data signal has been emitted,
         * block any further push-buffer calls until the amount of queued bytes drops
         * below the max-bytes limit.
         * @param block The value for the {@code block} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBlock(boolean block) {
            names.add("block");
            values.add(org.gtk.gobject.Value.create(block));
            return this;
        }
        
        /**
         * The GstCaps that will negotiated downstream and will be put
         * on outgoing buffers.
         * @param caps The value for the {@code caps} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCaps(org.gstreamer.gst.Caps caps) {
            names.add("caps");
            values.add(org.gtk.gobject.Value.create(caps));
            return this;
        }
        
        /**
         * The number of currently queued buffers inside appsrc.
         * @param currentLevelBuffers The value for the {@code current-level-buffers} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCurrentLevelBuffers(long currentLevelBuffers) {
            names.add("current-level-buffers");
            values.add(org.gtk.gobject.Value.create(currentLevelBuffers));
            return this;
        }
        
        /**
         * The number of currently queued bytes inside appsrc.
         * @param currentLevelBytes The value for the {@code current-level-bytes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCurrentLevelBytes(long currentLevelBytes) {
            names.add("current-level-bytes");
            values.add(org.gtk.gobject.Value.create(currentLevelBytes));
            return this;
        }
        
        /**
         * The amount of currently queued time inside appsrc.
         * @param currentLevelTime The value for the {@code current-level-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCurrentLevelTime(long currentLevelTime) {
            names.add("current-level-time");
            values.add(org.gtk.gobject.Value.create(currentLevelTime));
            return this;
        }
        
        /**
         * The total duration in nanoseconds of the data stream. If the total duration is known, it
         * is recommended to configure it with this property.
         * @param duration The value for the {@code duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDuration(long duration) {
            names.add("duration");
            values.add(org.gtk.gobject.Value.create(duration));
            return this;
        }
        
        /**
         * Make appsrc emit the "need-data", "enough-data" and "seek-data" signals.
         * This option is by default enabled for backwards compatibility reasons but
         * can disabled when needed because signal emission is expensive.
         * @param emitSignals The value for the {@code emit-signals} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEmitSignals(boolean emitSignals) {
            names.add("emit-signals");
            values.add(org.gtk.gobject.Value.create(emitSignals));
            return this;
        }
        
        /**
         * The format to use for segment events. When the source is producing
         * timestamped buffers this property should be set to GST_FORMAT_TIME.
         * @param format The value for the {@code format} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormat(org.gstreamer.gst.Format format) {
            names.add("format");
            values.add(org.gtk.gobject.Value.create(format));
            return this;
        }
        
        /**
         * When enabled, appsrc will check GstSegment in GstSample which was
         * pushed via gst_app_src_push_sample() or "push-sample" signal action.
         * If a GstSegment is changed, corresponding segment event will be followed
         * by next data flow.
         * <p>
         * FIXME: currently only GST_FORMAT_TIME format is supported and therefore
         * GstAppSrc::format should be time. However, possibly {@link AppSrc} can support
         * other formats.
         * @param handleSegmentChange The value for the {@code handle-segment-change} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHandleSegmentChange(boolean handleSegmentChange) {
            names.add("handle-segment-change");
            values.add(org.gtk.gobject.Value.create(handleSegmentChange));
            return this;
        }
        
        /**
         * Instruct the source to behave like a live source. This includes that it
         * will only push out buffers in the PLAYING state.
         * @param isLive The value for the {@code is-live} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsLive(boolean isLive) {
            names.add("is-live");
            values.add(org.gtk.gobject.Value.create(isLive));
            return this;
        }
        
        /**
         * When set to any other value than GST_APP_LEAKY_TYPE_NONE then the appsrc
         * will drop any buffers that are pushed into it once its internal queue is
         * full. The selected type defines whether to drop the oldest or new
         * buffers.
         * @param leakyType The value for the {@code leaky-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLeakyType(org.gstreamer.app.AppLeakyType leakyType) {
            names.add("leaky-type");
            values.add(org.gtk.gobject.Value.create(leakyType));
            return this;
        }
        
        /**
         * The maximum amount of buffers that can be queued internally.
         * After the maximum amount of buffers are queued, appsrc will emit the
         * "enough-data" signal.
         * @param maxBuffers The value for the {@code max-buffers} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxBuffers(long maxBuffers) {
            names.add("max-buffers");
            values.add(org.gtk.gobject.Value.create(maxBuffers));
            return this;
        }
        
        /**
         * The maximum amount of bytes that can be queued internally.
         * After the maximum amount of bytes are queued, appsrc will emit the
         * "enough-data" signal.
         * @param maxBytes The value for the {@code max-bytes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxBytes(long maxBytes) {
            names.add("max-bytes");
            values.add(org.gtk.gobject.Value.create(maxBytes));
            return this;
        }
        
        public Builder setMaxLatency(long maxLatency) {
            names.add("max-latency");
            values.add(org.gtk.gobject.Value.create(maxLatency));
            return this;
        }
        
        /**
         * The maximum amount of time that can be queued internally.
         * After the maximum amount of time are queued, appsrc will emit the
         * "enough-data" signal.
         * @param maxTime The value for the {@code max-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxTime(long maxTime) {
            names.add("max-time");
            values.add(org.gtk.gobject.Value.create(maxTime));
            return this;
        }
        
        /**
         * The minimum latency of the source. A value of -1 will use the default
         * latency calculations of {@link org.gstreamer.base.BaseSrc}.
         * @param minLatency The value for the {@code min-latency} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinLatency(long minLatency) {
            names.add("min-latency");
            values.add(org.gtk.gobject.Value.create(minLatency));
            return this;
        }
        
        /**
         * Make appsrc emit the "need-data" signal when the amount of bytes in the
         * queue drops below this percentage of max-bytes.
         * @param minPercent The value for the {@code min-percent} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinPercent(int minPercent) {
            names.add("min-percent");
            values.add(org.gtk.gobject.Value.create(minPercent));
            return this;
        }
        
        /**
         * The total size in bytes of the data stream. If the total size is known, it
         * is recommended to configure it with this property.
         * @param size The value for the {@code size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(long size) {
            names.add("size");
            values.add(org.gtk.gobject.Value.create(size));
            return this;
        }
        
        /**
         * The type of stream that this source is producing.  For seekable streams the
         * application should connect to the seek-data signal.
         * @param streamType The value for the {@code stream-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStreamType(org.gstreamer.app.AppStreamType streamType) {
            names.add("stream-type");
            values.add(org.gtk.gobject.Value.create(streamType));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_app_src_end_of_stream = Interop.downcallHandle(
            "gst_app_src_end_of_stream",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_caps = Interop.downcallHandle(
            "gst_app_src_get_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_current_level_buffers = Interop.downcallHandle(
            "gst_app_src_get_current_level_buffers",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_current_level_bytes = Interop.downcallHandle(
            "gst_app_src_get_current_level_bytes",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_current_level_time = Interop.downcallHandle(
            "gst_app_src_get_current_level_time",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_duration = Interop.downcallHandle(
            "gst_app_src_get_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_emit_signals = Interop.downcallHandle(
            "gst_app_src_get_emit_signals",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_latency = Interop.downcallHandle(
            "gst_app_src_get_latency",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_leaky_type = Interop.downcallHandle(
            "gst_app_src_get_leaky_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_max_buffers = Interop.downcallHandle(
            "gst_app_src_get_max_buffers",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_max_bytes = Interop.downcallHandle(
            "gst_app_src_get_max_bytes",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_max_time = Interop.downcallHandle(
            "gst_app_src_get_max_time",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_size = Interop.downcallHandle(
            "gst_app_src_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_get_stream_type = Interop.downcallHandle(
            "gst_app_src_get_stream_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_push_buffer = Interop.downcallHandle(
            "gst_app_src_push_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_push_buffer_list = Interop.downcallHandle(
            "gst_app_src_push_buffer_list",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_push_sample = Interop.downcallHandle(
            "gst_app_src_push_sample",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_set_callbacks = Interop.downcallHandle(
            "gst_app_src_set_callbacks",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_set_caps = Interop.downcallHandle(
            "gst_app_src_set_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_app_src_set_duration = Interop.downcallHandle(
            "gst_app_src_set_duration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_app_src_set_emit_signals = Interop.downcallHandle(
            "gst_app_src_set_emit_signals",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_app_src_set_latency = Interop.downcallHandle(
            "gst_app_src_set_latency",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_app_src_set_leaky_type = Interop.downcallHandle(
            "gst_app_src_set_leaky_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_app_src_set_max_buffers = Interop.downcallHandle(
            "gst_app_src_set_max_buffers",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_app_src_set_max_bytes = Interop.downcallHandle(
            "gst_app_src_set_max_bytes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_app_src_set_max_time = Interop.downcallHandle(
            "gst_app_src_set_max_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_app_src_set_size = Interop.downcallHandle(
            "gst_app_src_set_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_app_src_set_stream_type = Interop.downcallHandle(
            "gst_app_src_set_stream_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_app_src_get_type = Interop.downcallHandle(
            "gst_app_src_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
