package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Appsink is a sink plugin that supports many different methods for making
 * the application get a handle on the GStreamer data in a pipeline. Unlike
 * most GStreamer elements, Appsink provides external API functions.
 * <p>
 * appsink can be used by linking to the gstappsink.h header file to access the
 * methods or by using the appsink action signals and properties.
 * <p>
 * The normal way of retrieving samples from appsink is by using the
 * gst_app_sink_pull_sample() and gst_app_sink_pull_preroll() methods.
 * These methods block until a sample becomes available in the sink or when the
 * sink is shut down or reaches EOS. There are also timed variants of these
 * methods, gst_app_sink_try_pull_sample() and gst_app_sink_try_pull_preroll(),
 * which accept a timeout parameter to limit the amount of time to wait.
 * <p>
 * Appsink will internally use a queue to collect buffers from the streaming
 * thread. If the application is not pulling samples fast enough, this queue
 * will consume a lot of memory over time. The "max-buffers" property can be
 * used to limit the queue size. The "drop" property controls whether the
 * streaming thread blocks or if older buffers are dropped when the maximum
 * queue size is reached. Note that blocking the streaming thread can negatively
 * affect real-time performance and should be avoided.
 * <p>
 * If a blocking behaviour is not desirable, setting the "emit-signals" property
 * to {@code true} will make appsink emit the "new-sample" and "new-preroll" signals
 * when a sample can be pulled without blocking.
 * <p>
 * The "caps" property on appsink can be used to control the formats that
 * appsink can receive. This property can contain non-fixed caps, the format of
 * the pulled samples can be obtained by getting the sample caps.
 * <p>
 * If one of the pull-preroll or pull-sample methods return {@code null}, the appsink
 * is stopped or in the EOS state. You can check for the EOS state with the
 * "eos" property or with the gst_app_sink_is_eos() method.
 * <p>
 * The eos signal can also be used to be informed when the EOS state is reached
 * to avoid polling.
 */
public class AppSink extends org.gstreamer.base.BaseSink implements org.gstreamer.gst.URIHandler {
    
    static {
        GstApp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAppSink";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseSink.getMemoryLayout().withName("basesink"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AppSink proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AppSink(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppSink> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AppSink(input);
    
    /**
     * Check if {@code appsink} supports buffer lists.
     * @return {@code true} if {@code appsink} supports buffer lists.
     */
    public boolean getBufferListSupport() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_sink_get_buffer_list_support.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the configured caps on {@code appsink}.
     * @return the {@link org.gstreamer.gst.Caps} accepted by the sink. gst_caps_unref() after usage.
     */
    public org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_get_caps.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Check if {@code appsink} will drop old buffers when the maximum amount of queued
     * buffers is reached.
     * @return {@code true} if {@code appsink} is dropping old buffers when the queue is
     * filled.
     */
    public boolean getDrop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_sink_get_drop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if appsink will emit the "new-preroll" and "new-sample" signals.
     * @return {@code true} if {@code appsink} is emitting the "new-preroll" and "new-sample"
     * signals.
     */
    public boolean getEmitSignals() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_sink_get_emit_signals.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the maximum amount of buffers that can be queued in {@code appsink}.
     * @return The maximum amount of buffers that can be queued.
     */
    public int getMaxBuffers() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_sink_get_max_buffers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Check if {@code appsink} will wait for all buffers to be consumed when an EOS is
     * received.
     * @return {@code true} if {@code appsink} will wait for all buffers to be consumed when an
     * EOS is received.
     */
    public boolean getWaitOnEos() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_sink_get_wait_on_eos.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code appsink} is EOS, which is when no more samples can be pulled because
     * an EOS event was received.
     * <p>
     * This function also returns {@code true} when the appsink is not in the PAUSED or
     * PLAYING state.
     * @return {@code true} if no more samples can be pulled and the appsink is EOS.
     */
    public boolean isEos() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_sink_is_eos.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This function blocks until a sample or an event becomes available or the appsink
     * element is set to the READY/NULL state.
     * <p>
     * This function will only return samples when the appsink is in the PLAYING
     * state. All rendered buffers and events will be put in a queue so that the application
     * can pull them at its own rate. Note that when the application does not
     * pull samples fast enough, the queued buffers could consume a lot of memory,
     * especially when dealing with raw video frames.
     * Events can be pulled when the appsink is in the READY, PAUSED or PLAYING state.
     * <p>
     * This function will only pull serialized events, excluding
     * the EOS event for which this functions returns
     * {@code null}. Use gst_app_sink_is_eos() to check for the EOS condition.
     * <p>
     * This method is a variant of gst_app_sink_pull_sample() that can be used
     * to handle incoming events events as well as samples.
     * <p>
     * Note that future releases may extend this API to return other object types
     * so make sure that your code is checking for the actual type it is handling.
     * @return a {@link org.gstreamer.gst.Sample}, or a {@link org.gstreamer.gst.Event} or NULL when the appsink is stopped or EOS.
     *          Call gst_mini_object_unref() after usage.
     */
    public org.gstreamer.gst.MiniObject pullObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_pull_object.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.MiniObject.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the last preroll sample in {@code appsink}. This was the sample that caused the
     * appsink to preroll in the PAUSED state.
     * <p>
     * This function is typically used when dealing with a pipeline in the PAUSED
     * state. Calling this function after doing a seek will give the sample right
     * after the seek position.
     * <p>
     * Calling this function will clear the internal reference to the preroll
     * buffer.
     * <p>
     * Note that the preroll sample will also be returned as the first sample
     * when calling gst_app_sink_pull_sample().
     * <p>
     * If an EOS event was received before any buffers, this function returns
     * {@code null}. Use gst_app_sink_is_eos () to check for the EOS condition.
     * <p>
     * This function blocks until a preroll sample or EOS is received or the appsink
     * element is set to the READY/NULL state.
     * @return a {@link org.gstreamer.gst.Sample} or NULL when the appsink is stopped or EOS.
     *          Call gst_sample_unref() after usage.
     */
    public @Nullable org.gstreamer.gst.Sample pullPreroll() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_pull_preroll.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Sample.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * This function blocks until a sample or EOS becomes available or the appsink
     * element is set to the READY/NULL state.
     * <p>
     * This function will only return samples when the appsink is in the PLAYING
     * state. All rendered buffers will be put in a queue so that the application
     * can pull samples at its own rate. Note that when the application does not
     * pull samples fast enough, the queued buffers could consume a lot of memory,
     * especially when dealing with raw video frames.
     * <p>
     * If an EOS event was received before any buffers, this function returns
     * {@code null}. Use gst_app_sink_is_eos () to check for the EOS condition.
     * @return a {@link org.gstreamer.gst.Sample} or NULL when the appsink is stopped or EOS.
     *          Call gst_sample_unref() after usage.
     */
    public @Nullable org.gstreamer.gst.Sample pullSample() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_pull_sample.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Sample.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Instruct {@code appsink} to enable or disable buffer list support.
     * <p>
     * For backwards-compatibility reasons applications need to opt in
     * to indicate that they will be able to handle buffer lists.
     * @param enableLists enable or disable buffer list support
     */
    public void setBufferListSupport(boolean enableLists) {
        try {
            DowncallHandles.gst_app_sink_set_buffer_list_support.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enableLists, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set callbacks which will be executed for each new preroll, new sample and eos.
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
    public void setCallbacks(org.gstreamer.app.AppSinkCallbacks callbacks, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_app_sink_set_callbacks.invokeExact(
                    handle(),
                    callbacks.handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the capabilities on the appsink element.  This function takes
     * a copy of the caps structure. After calling this method, the sink will only
     * accept caps that match {@code caps}. If {@code caps} is non-fixed, or incomplete,
     * you must check the caps on the samples to get the actual used caps.
     * @param caps caps to set
     */
    public void setCaps(@Nullable org.gstreamer.gst.Caps caps) {
        try {
            DowncallHandles.gst_app_sink_set_caps.invokeExact(
                    handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Instruct {@code appsink} to drop old buffers when the maximum amount of queued
     * buffers is reached.
     * @param drop the new state
     */
    public void setDrop(boolean drop) {
        try {
            DowncallHandles.gst_app_sink_set_drop.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(drop, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Make appsink emit the "new-preroll" and "new-sample" signals. This option is
     * by default disabled because signal emission is expensive and unneeded when
     * the application prefers to operate in pull mode.
     * @param emit the new state
     */
    public void setEmitSignals(boolean emit) {
        try {
            DowncallHandles.gst_app_sink_set_emit_signals.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(emit, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the maximum amount of buffers that can be queued in {@code appsink}. After this
     * amount of buffers are queued in appsink, any more buffers will block upstream
     * elements until a sample is pulled from {@code appsink}.
     * @param max the maximum number of buffers to queue
     */
    public void setMaxBuffers(int max) {
        try {
            DowncallHandles.gst_app_sink_set_max_buffers.invokeExact(
                    handle(),
                    max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Instruct {@code appsink} to wait for all buffers to be consumed when an EOS is received.
     * @param wait_ the new state
     */
    public void setWaitOnEos(boolean wait_) {
        try {
            DowncallHandles.gst_app_sink_set_wait_on_eos.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(wait_, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function blocks until a sample or an event or EOS becomes available or the appsink
     * element is set to the READY/NULL state or the timeout expires.
     * <p>
     * This function will only return samples when the appsink is in the PLAYING
     * state. All rendered buffers and events will be put in a queue so that the application
     * can pull them at its own rate. Note that when the application does not
     * pull samples fast enough, the queued buffers could consume a lot of memory,
     * especially when dealing with raw video frames.
     * Events can be pulled when the appsink is in the READY, PAUSED or PLAYING state.
     * <p>
     * This function will only pull serialized events, excluding
     * the EOS event for which this functions returns
     * {@code null}. Use gst_app_sink_is_eos() to check for the EOS condition.
     * <p>
     * This method is a variant of gst_app_sink_try_pull_sample() that can be used
     * to handle incoming events events as well as samples.
     * <p>
     * Note that future releases may extend this API to return other object types
     * so make sure that your code is checking for the actual type it is handling.
     * @param timeout the maximum amount of time to wait for a sample
     * @return a {@link org.gstreamer.gst.Sample}, or {@link org.gstreamer.gst.Event} or NULL when the appsink is stopped or EOS or the timeout expires.
     * Call gst_mini_object_unref() after usage.
     */
    public org.gstreamer.gst.MiniObject tryPullObject(org.gstreamer.gst.ClockTime timeout) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_try_pull_object.invokeExact(
                    handle(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.MiniObject.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the last preroll sample in {@code appsink}. This was the sample that caused the
     * appsink to preroll in the PAUSED state.
     * <p>
     * This function is typically used when dealing with a pipeline in the PAUSED
     * state. Calling this function after doing a seek will give the sample right
     * after the seek position.
     * <p>
     * Calling this function will clear the internal reference to the preroll
     * buffer.
     * <p>
     * Note that the preroll sample will also be returned as the first sample
     * when calling gst_app_sink_pull_sample().
     * <p>
     * If an EOS event was received before any buffers or the timeout expires,
     * this function returns {@code null}. Use gst_app_sink_is_eos () to check for the EOS
     * condition.
     * <p>
     * This function blocks until a preroll sample or EOS is received, the appsink
     * element is set to the READY/NULL state, or the timeout expires.
     * @param timeout the maximum amount of time to wait for the preroll sample
     * @return a {@link org.gstreamer.gst.Sample} or NULL when the appsink is stopped or EOS or the timeout expires.
     *          Call gst_sample_unref() after usage.
     */
    public @Nullable org.gstreamer.gst.Sample tryPullPreroll(org.gstreamer.gst.ClockTime timeout) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_try_pull_preroll.invokeExact(
                    handle(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Sample.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * This function blocks until a sample or EOS becomes available or the appsink
     * element is set to the READY/NULL state or the timeout expires.
     * <p>
     * This function will only return samples when the appsink is in the PLAYING
     * state. All rendered buffers will be put in a queue so that the application
     * can pull samples at its own rate. Note that when the application does not
     * pull samples fast enough, the queued buffers could consume a lot of memory,
     * especially when dealing with raw video frames.
     * <p>
     * If an EOS event was received before any buffers or the timeout expires,
     * this function returns {@code null}. Use gst_app_sink_is_eos () to check for the EOS
     * condition.
     * @param timeout the maximum amount of time to wait for a sample
     * @return a {@link org.gstreamer.gst.Sample} or NULL when the appsink is stopped or EOS or the timeout expires.
     *          Call gst_sample_unref() after usage.
     */
    public @Nullable org.gstreamer.gst.Sample tryPullSample(org.gstreamer.gst.ClockTime timeout) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_try_pull_sample.invokeExact(
                    handle(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Sample.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_app_sink_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Eos} callback.
     */
    @FunctionalInterface
    public interface Eos {
    
        /**
         * Signal that the end-of-stream has been reached. This signal is emitted from
         * the streaming thread.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppSink) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Eos.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Signal that the end-of-stream has been reached. This signal is emitted from
     * the streaming thread.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSink.Eos> onEos(AppSink.Eos handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("eos", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code NewPreroll} callback.
     */
    @FunctionalInterface
    public interface NewPreroll {
    
        /**
         * Signal that a new preroll sample is available.
         * <p>
         * This signal is emitted from the streaming thread and only when the
         * "emit-signals" property is {@code true}.
         * <p>
         * The new preroll sample can be retrieved with the "pull-preroll" action
         * signal or gst_app_sink_pull_preroll() either from this signal callback
         * or from any other thread.
         * <p>
         * Note that this signal is only emitted when the "emit-signals" property is
         * set to {@code true}, which it is not by default for performance reasons.
         */
        org.gstreamer.gst.FlowReturn run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceAppSink) {
            var RESULT = run();
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewPreroll.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Signal that a new preroll sample is available.
     * <p>
     * This signal is emitted from the streaming thread and only when the
     * "emit-signals" property is {@code true}.
     * <p>
     * The new preroll sample can be retrieved with the "pull-preroll" action
     * signal or gst_app_sink_pull_preroll() either from this signal callback
     * or from any other thread.
     * <p>
     * Note that this signal is only emitted when the "emit-signals" property is
     * set to {@code true}, which it is not by default for performance reasons.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSink.NewPreroll> onNewPreroll(AppSink.NewPreroll handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("new-preroll", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code NewSample} callback.
     */
    @FunctionalInterface
    public interface NewSample {
    
        /**
         * Signal that a new sample is available.
         * <p>
         * This signal is emitted from the streaming thread and only when the
         * "emit-signals" property is {@code true}.
         * <p>
         * The new sample can be retrieved with the "pull-sample" action
         * signal or gst_app_sink_pull_sample() either from this signal callback
         * or from any other thread.
         * <p>
         * Note that this signal is only emitted when the "emit-signals" property is
         * set to {@code true}, which it is not by default for performance reasons.
         */
        org.gstreamer.gst.FlowReturn run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceAppSink) {
            var RESULT = run();
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewSample.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Signal that a new sample is available.
     * <p>
     * This signal is emitted from the streaming thread and only when the
     * "emit-signals" property is {@code true}.
     * <p>
     * The new sample can be retrieved with the "pull-sample" action
     * signal or gst_app_sink_pull_sample() either from this signal callback
     * or from any other thread.
     * <p>
     * Note that this signal is only emitted when the "emit-signals" property is
     * set to {@code true}, which it is not by default for performance reasons.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSink.NewSample> onNewSample(AppSink.NewSample handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("new-sample", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code NewSerializedEvent} callback.
     */
    @FunctionalInterface
    public interface NewSerializedEvent {
    
        /**
         * Signal that a new downstream serialized event is available.
         * <p>
         * This signal is emitted from the streaming thread and only when the
         * "emit-signals" property is {@code true}.
         * <p>
         * The new event can be retrieved with the "try-pull-object" action
         * signal or gst_app_sink_pull_object() either from this signal callback
         * or from any other thread.
         * <p>
         * EOS will not be notified using this signal, use {@link AppSink}::eos instead.
         * EOS cannot be pulled either, use gst_app_sink_is_eos() to check for it.
         * <p>
         * Note that this signal is only emitted when the "emit-signals" property is
         * set to {@code true}, which it is not by default for performance reasons.
         * <p>
         * The callback should return {@code true} if the event has been handled, which will
         * skip basesink handling of the event, {@code false} otherwise.
         */
        boolean run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceAppSink) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewSerializedEvent.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Signal that a new downstream serialized event is available.
     * <p>
     * This signal is emitted from the streaming thread and only when the
     * "emit-signals" property is {@code true}.
     * <p>
     * The new event can be retrieved with the "try-pull-object" action
     * signal or gst_app_sink_pull_object() either from this signal callback
     * or from any other thread.
     * <p>
     * EOS will not be notified using this signal, use {@link AppSink}::eos instead.
     * EOS cannot be pulled either, use gst_app_sink_is_eos() to check for it.
     * <p>
     * Note that this signal is only emitted when the "emit-signals" property is
     * set to {@code true}, which it is not by default for performance reasons.
     * <p>
     * The callback should return {@code true} if the event has been handled, which will
     * skip basesink handling of the event, {@code false} otherwise.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSink.NewSerializedEvent> onNewSerializedEvent(AppSink.NewSerializedEvent handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("new-serialized-event", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PullPreroll} callback.
     */
    @FunctionalInterface
    public interface PullPreroll {
    
        /**
         * Get the last preroll sample in {@code appsink}. This was the sample that caused the
         * appsink to preroll in the PAUSED state.
         * <p>
         * This function is typically used when dealing with a pipeline in the PAUSED
         * state. Calling this function after doing a seek will give the sample right
         * after the seek position.
         * <p>
         * Calling this function will clear the internal reference to the preroll
         * buffer.
         * <p>
         * Note that the preroll sample will also be returned as the first sample
         * when calling gst_app_sink_pull_sample() or the "pull-sample" action signal.
         * <p>
         * If an EOS event was received before any buffers, this function returns
         * {@code null}. Use gst_app_sink_is_eos () to check for the EOS condition.
         * <p>
         * This function blocks until a preroll sample or EOS is received or the appsink
         * element is set to the READY/NULL state.
         */
        org.gstreamer.gst.Sample run();
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceAppSink) {
            var RESULT = run();
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PullPreroll.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Get the last preroll sample in {@code appsink}. This was the sample that caused the
     * appsink to preroll in the PAUSED state.
     * <p>
     * This function is typically used when dealing with a pipeline in the PAUSED
     * state. Calling this function after doing a seek will give the sample right
     * after the seek position.
     * <p>
     * Calling this function will clear the internal reference to the preroll
     * buffer.
     * <p>
     * Note that the preroll sample will also be returned as the first sample
     * when calling gst_app_sink_pull_sample() or the "pull-sample" action signal.
     * <p>
     * If an EOS event was received before any buffers, this function returns
     * {@code null}. Use gst_app_sink_is_eos () to check for the EOS condition.
     * <p>
     * This function blocks until a preroll sample or EOS is received or the appsink
     * element is set to the READY/NULL state.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSink.PullPreroll> onPullPreroll(AppSink.PullPreroll handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("pull-preroll", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PullSample} callback.
     */
    @FunctionalInterface
    public interface PullSample {
    
        /**
         * This function blocks until a sample or EOS becomes available or the appsink
         * element is set to the READY/NULL state.
         * <p>
         * This function will only return samples when the appsink is in the PLAYING
         * state. All rendered samples will be put in a queue so that the application
         * can pull samples at its own rate.
         * <p>
         * Note that when the application does not pull samples fast enough, the
         * queued samples could consume a lot of memory, especially when dealing with
         * raw video frames. It's possible to control the behaviour of the queue with
         * the "drop" and "max-buffers" properties.
         * <p>
         * If an EOS event was received before any buffers, this function returns
         * {@code null}. Use gst_app_sink_is_eos () to check for the EOS condition.
         */
        org.gstreamer.gst.Sample run();
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceAppSink) {
            var RESULT = run();
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PullSample.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This function blocks until a sample or EOS becomes available or the appsink
     * element is set to the READY/NULL state.
     * <p>
     * This function will only return samples when the appsink is in the PLAYING
     * state. All rendered samples will be put in a queue so that the application
     * can pull samples at its own rate.
     * <p>
     * Note that when the application does not pull samples fast enough, the
     * queued samples could consume a lot of memory, especially when dealing with
     * raw video frames. It's possible to control the behaviour of the queue with
     * the "drop" and "max-buffers" properties.
     * <p>
     * If an EOS event was received before any buffers, this function returns
     * {@code null}. Use gst_app_sink_is_eos () to check for the EOS condition.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSink.PullSample> onPullSample(AppSink.PullSample handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("pull-sample", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code TryPullObject} callback.
     */
    @FunctionalInterface
    public interface TryPullObject {
    
        /**
         * This function blocks until a sample or an event becomes available or the appsink
         * element is set to the READY/NULL state or the timeout expires.
         * <p>
         * This function will only return samples when the appsink is in the PLAYING
         * state. All rendered samples and events will be put in a queue so that the application
         * can pull them at its own rate.
         * Events can be pulled when the appsink is in the READY, PAUSED or PLAYING state.
         * <p>
         * Note that when the application does not pull samples fast enough, the
         * queued samples could consume a lot of memory, especially when dealing with
         * raw video frames. It's possible to control the behaviour of the queue with
         * the "drop" and "max-buffers" properties.
         * <p>
         * This function will only pull serialized events, excluding
         * the EOS event for which this functions returns
         * {@code null}. Use gst_app_sink_is_eos() to check for the EOS condition.
         * <p>
         * This signal is a variant of {@link AppSink}::try-pull-sample: that can be used
         * to handle incoming events as well as samples.
         * <p>
         * Note that future releases may extend this API to return other object types
         * so make sure that your code is checking for the actual type it is handling.
         */
        org.gstreamer.gst.MiniObject run(long timeout);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceAppSink, long timeout) {
            var RESULT = run(timeout);
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TryPullObject.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This function blocks until a sample or an event becomes available or the appsink
     * element is set to the READY/NULL state or the timeout expires.
     * <p>
     * This function will only return samples when the appsink is in the PLAYING
     * state. All rendered samples and events will be put in a queue so that the application
     * can pull them at its own rate.
     * Events can be pulled when the appsink is in the READY, PAUSED or PLAYING state.
     * <p>
     * Note that when the application does not pull samples fast enough, the
     * queued samples could consume a lot of memory, especially when dealing with
     * raw video frames. It's possible to control the behaviour of the queue with
     * the "drop" and "max-buffers" properties.
     * <p>
     * This function will only pull serialized events, excluding
     * the EOS event for which this functions returns
     * {@code null}. Use gst_app_sink_is_eos() to check for the EOS condition.
     * <p>
     * This signal is a variant of {@link AppSink}::try-pull-sample: that can be used
     * to handle incoming events as well as samples.
     * <p>
     * Note that future releases may extend this API to return other object types
     * so make sure that your code is checking for the actual type it is handling.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSink.TryPullObject> onTryPullObject(AppSink.TryPullObject handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("try-pull-object", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code TryPullPreroll} callback.
     */
    @FunctionalInterface
    public interface TryPullPreroll {
    
        /**
         * Get the last preroll sample in {@code appsink}. This was the sample that caused the
         * appsink to preroll in the PAUSED state.
         * <p>
         * This function is typically used when dealing with a pipeline in the PAUSED
         * state. Calling this function after doing a seek will give the sample right
         * after the seek position.
         * <p>
         * Calling this function will clear the internal reference to the preroll
         * buffer.
         * <p>
         * Note that the preroll sample will also be returned as the first sample
         * when calling gst_app_sink_pull_sample() or the "pull-sample" action signal.
         * <p>
         * If an EOS event was received before any buffers or the timeout expires,
         * this function returns {@code null}. Use gst_app_sink_is_eos () to check for the EOS
         * condition.
         * <p>
         * This function blocks until a preroll sample or EOS is received, the appsink
         * element is set to the READY/NULL state, or the timeout expires.
         */
        org.gstreamer.gst.Sample run(long timeout);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceAppSink, long timeout) {
            var RESULT = run(timeout);
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TryPullPreroll.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Get the last preroll sample in {@code appsink}. This was the sample that caused the
     * appsink to preroll in the PAUSED state.
     * <p>
     * This function is typically used when dealing with a pipeline in the PAUSED
     * state. Calling this function after doing a seek will give the sample right
     * after the seek position.
     * <p>
     * Calling this function will clear the internal reference to the preroll
     * buffer.
     * <p>
     * Note that the preroll sample will also be returned as the first sample
     * when calling gst_app_sink_pull_sample() or the "pull-sample" action signal.
     * <p>
     * If an EOS event was received before any buffers or the timeout expires,
     * this function returns {@code null}. Use gst_app_sink_is_eos () to check for the EOS
     * condition.
     * <p>
     * This function blocks until a preroll sample or EOS is received, the appsink
     * element is set to the READY/NULL state, or the timeout expires.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSink.TryPullPreroll> onTryPullPreroll(AppSink.TryPullPreroll handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("try-pull-preroll", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code TryPullSample} callback.
     */
    @FunctionalInterface
    public interface TryPullSample {
    
        /**
         * This function blocks until a sample or EOS becomes available or the appsink
         * element is set to the READY/NULL state or the timeout expires.
         * <p>
         * This function will only return samples when the appsink is in the PLAYING
         * state. All rendered samples will be put in a queue so that the application
         * can pull samples at its own rate.
         * <p>
         * Note that when the application does not pull samples fast enough, the
         * queued samples could consume a lot of memory, especially when dealing with
         * raw video frames. It's possible to control the behaviour of the queue with
         * the "drop" and "max-buffers" properties.
         * <p>
         * If an EOS event was received before any buffers or the timeout expires,
         * this function returns {@code null}. Use gst_app_sink_is_eos () to check
         * for the EOS condition.
         */
        org.gstreamer.gst.Sample run(long timeout);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceAppSink, long timeout) {
            var RESULT = run(timeout);
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TryPullSample.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This function blocks until a sample or EOS becomes available or the appsink
     * element is set to the READY/NULL state or the timeout expires.
     * <p>
     * This function will only return samples when the appsink is in the PLAYING
     * state. All rendered samples will be put in a queue so that the application
     * can pull samples at its own rate.
     * <p>
     * Note that when the application does not pull samples fast enough, the
     * queued samples could consume a lot of memory, especially when dealing with
     * raw video frames. It's possible to control the behaviour of the queue with
     * the "drop" and "max-buffers" properties.
     * <p>
     * If an EOS event was received before any buffers or the timeout expires,
     * this function returns {@code null}. Use gst_app_sink_is_eos () to check
     * for the EOS condition.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSink.TryPullSample> onTryPullSample(AppSink.TryPullSample handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("try-pull-sample", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link AppSink.Builder} object constructs a {@link AppSink} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AppSink.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.BaseSink.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AppSink} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppSink}.
         * @return A new instance of {@code AppSink} with the properties 
         *         that were set in the Builder object.
         */
        public AppSink build() {
            return (AppSink) org.gtk.gobject.GObject.newWithProperties(
                AppSink.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setBufferList(boolean bufferList) {
            names.add("buffer-list");
            values.add(org.gtk.gobject.Value.create(bufferList));
            return this;
        }
        
        public Builder setCaps(org.gstreamer.gst.Caps caps) {
            names.add("caps");
            values.add(org.gtk.gobject.Value.create(caps));
            return this;
        }
        
        public Builder setDrop(boolean drop) {
            names.add("drop");
            values.add(org.gtk.gobject.Value.create(drop));
            return this;
        }
        
        public Builder setEmitSignals(boolean emitSignals) {
            names.add("emit-signals");
            values.add(org.gtk.gobject.Value.create(emitSignals));
            return this;
        }
        
        public Builder setEos(boolean eos) {
            names.add("eos");
            values.add(org.gtk.gobject.Value.create(eos));
            return this;
        }
        
        public Builder setMaxBuffers(int maxBuffers) {
            names.add("max-buffers");
            values.add(org.gtk.gobject.Value.create(maxBuffers));
            return this;
        }
        
        public Builder setWaitOnEos(boolean waitOnEos) {
            names.add("wait-on-eos");
            values.add(org.gtk.gobject.Value.create(waitOnEos));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_app_sink_get_buffer_list_support = Interop.downcallHandle(
                "gst_app_sink_get_buffer_list_support",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_get_caps = Interop.downcallHandle(
                "gst_app_sink_get_caps",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_get_drop = Interop.downcallHandle(
                "gst_app_sink_get_drop",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_get_emit_signals = Interop.downcallHandle(
                "gst_app_sink_get_emit_signals",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_get_max_buffers = Interop.downcallHandle(
                "gst_app_sink_get_max_buffers",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_get_wait_on_eos = Interop.downcallHandle(
                "gst_app_sink_get_wait_on_eos",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_is_eos = Interop.downcallHandle(
                "gst_app_sink_is_eos",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_pull_object = Interop.downcallHandle(
                "gst_app_sink_pull_object",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_pull_preroll = Interop.downcallHandle(
                "gst_app_sink_pull_preroll",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_pull_sample = Interop.downcallHandle(
                "gst_app_sink_pull_sample",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_set_buffer_list_support = Interop.downcallHandle(
                "gst_app_sink_set_buffer_list_support",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_app_sink_set_callbacks = Interop.downcallHandle(
                "gst_app_sink_set_callbacks",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_set_caps = Interop.downcallHandle(
                "gst_app_sink_set_caps",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_app_sink_set_drop = Interop.downcallHandle(
                "gst_app_sink_set_drop",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_app_sink_set_emit_signals = Interop.downcallHandle(
                "gst_app_sink_set_emit_signals",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_app_sink_set_max_buffers = Interop.downcallHandle(
                "gst_app_sink_set_max_buffers",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_app_sink_set_wait_on_eos = Interop.downcallHandle(
                "gst_app_sink_set_wait_on_eos",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_app_sink_try_pull_object = Interop.downcallHandle(
                "gst_app_sink_try_pull_object",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_app_sink_try_pull_preroll = Interop.downcallHandle(
                "gst_app_sink_try_pull_preroll",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_app_sink_try_pull_sample = Interop.downcallHandle(
                "gst_app_sink_try_pull_sample",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_app_sink_get_type = Interop.downcallHandle(
                "gst_app_sink_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_app_sink_get_type != null;
    }
}
