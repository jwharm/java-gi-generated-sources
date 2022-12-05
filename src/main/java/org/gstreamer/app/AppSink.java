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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseSink.getMemoryLayout().withName("basesink"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Create a AppSink proxy instance for the provided memory address.
     * <p>
     * Because AppSink is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AppSink(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AppSink if its GType is a (or inherits from) "GstAppSink".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AppSink} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAppSink", a ClassCastException will be thrown.
     */
    public static AppSink castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AppSink.getType())) {
            return new AppSink(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAppSink");
        }
    }
    
    /**
     * Check if {@code appsink} supports buffer lists.
     * @return {@code true} if {@code appsink} supports buffer lists.
     */
    public boolean getBufferListSupport() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_sink_get_buffer_list_support.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the configured caps on {@code appsink}.
     * @return the {@link org.gstreamer.gst.Caps} accepted by the sink. gst_caps_unref() after usage.
     */
    public @NotNull org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
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
            RESULT = (int) DowncallHandles.gst_app_sink_get_drop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if appsink will emit the "new-preroll" and "new-sample" signals.
     * @return {@code true} if {@code appsink} is emitting the "new-preroll" and "new-sample"
     * signals.
     */
    public boolean getEmitSignals() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_sink_get_emit_signals.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the maximum amount of buffers that can be queued in {@code appsink}.
     * @return The maximum amount of buffers that can be queued.
     */
    public int getMaxBuffers() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_app_sink_get_max_buffers.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gst_app_sink_get_wait_on_eos.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (int) DowncallHandles.gst_app_sink_is_eos.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public @NotNull org.gstreamer.gst.MiniObject pullObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_pull_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MiniObject(RESULT, Ownership.FULL);
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
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_pull_preroll.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Sample(RESULT, Ownership.FULL);
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
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_pull_sample.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Sample(RESULT, Ownership.FULL);
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
                    enableLists ? 1 : 0);
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
     * @param userData a user_data argument for the callbacks
     * @param notify a destroy notify function
     */
    public void setCallbacks(@NotNull org.gstreamer.app.AppSinkCallbacks callbacks, @Nullable java.lang.foreign.MemoryAddress userData, @NotNull org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(callbacks, "Parameter 'callbacks' must not be null");
        try {
            DowncallHandles.gst_app_sink_set_callbacks.invokeExact(
                    handle(),
                    callbacks.handle(),
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
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
                    drop ? 1 : 0);
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
                    emit ? 1 : 0);
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
                    wait_ ? 1 : 0);
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
    public @NotNull org.gstreamer.gst.MiniObject tryPullObject(@NotNull org.gstreamer.gst.ClockTime timeout) {
        java.util.Objects.requireNonNull(timeout, "Parameter 'timeout' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_try_pull_object.invokeExact(
                    handle(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MiniObject(RESULT, Ownership.FULL);
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
    public @Nullable org.gstreamer.gst.Sample tryPullPreroll(@NotNull org.gstreamer.gst.ClockTime timeout) {
        java.util.Objects.requireNonNull(timeout, "Parameter 'timeout' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_try_pull_preroll.invokeExact(
                    handle(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Sample(RESULT, Ownership.FULL);
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
    public @Nullable org.gstreamer.gst.Sample tryPullSample(@NotNull org.gstreamer.gst.ClockTime timeout) {
        java.util.Objects.requireNonNull(timeout, "Parameter 'timeout' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_app_sink_try_pull_sample.invokeExact(
                    handle(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Sample(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_app_sink_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Eos {
        void signalReceived(AppSink sourceAppSink);
    }
    
    /**
     * Signal that the end-of-stream has been reached. This signal is emitted from
     * the streaming thread.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppSink.Eos> onEos(AppSink.Eos handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("eos"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppSink.Callbacks.class, "signalAppSinkEos",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppSink.Eos>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NewPreroll {
        void signalReceived(AppSink sourceAppSink);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("new-preroll"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppSink.Callbacks.class, "signalAppSinkNewPreroll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppSink.NewPreroll>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NewSample {
        void signalReceived(AppSink sourceAppSink);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("new-sample"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppSink.Callbacks.class, "signalAppSinkNewSample",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppSink.NewSample>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NewSerializedEvent {
        boolean signalReceived(AppSink sourceAppSink);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("new-serialized-event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppSink.Callbacks.class, "signalAppSinkNewSerializedEvent",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppSink.NewSerializedEvent>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PullPreroll {
        void signalReceived(AppSink sourceAppSink);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pull-preroll"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppSink.Callbacks.class, "signalAppSinkPullPreroll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppSink.PullPreroll>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PullSample {
        void signalReceived(AppSink sourceAppSink);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pull-sample"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppSink.Callbacks.class, "signalAppSinkPullSample",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppSink.PullSample>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TryPullObject {
        void signalReceived(AppSink sourceAppSink, long timeout);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("try-pull-object"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppSink.Callbacks.class, "signalAppSinkTryPullObject",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppSink.TryPullObject>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TryPullPreroll {
        void signalReceived(AppSink sourceAppSink, long timeout);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("try-pull-preroll"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppSink.Callbacks.class, "signalAppSinkTryPullPreroll",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppSink.TryPullPreroll>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TryPullSample {
        void signalReceived(AppSink sourceAppSink, long timeout);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("try-pull-sample"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppSink.Callbacks.class, "signalAppSinkTryPullSample",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppSink.TryPullSample>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.BaseSink.Build {
        
         /**
         * A {@link AppSink.Build} object constructs a {@link AppSink} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AppSink} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppSink} using {@link AppSink#castFrom}.
         * @return A new instance of {@code AppSink} with the properties 
         *         that were set in the Build object.
         */
        public AppSink construct() {
            return AppSink.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AppSink.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setBufferList(boolean bufferList) {
            names.add("buffer-list");
            values.add(org.gtk.gobject.Value.create(bufferList));
            return this;
        }
        
        public Build setCaps(org.gstreamer.gst.Caps caps) {
            names.add("caps");
            values.add(org.gtk.gobject.Value.create(caps));
            return this;
        }
        
        public Build setDrop(boolean drop) {
            names.add("drop");
            values.add(org.gtk.gobject.Value.create(drop));
            return this;
        }
        
        public Build setEmitSignals(boolean emitSignals) {
            names.add("emit-signals");
            values.add(org.gtk.gobject.Value.create(emitSignals));
            return this;
        }
        
        public Build setEos(boolean eos) {
            names.add("eos");
            values.add(org.gtk.gobject.Value.create(eos));
            return this;
        }
        
        public Build setMaxBuffers(int maxBuffers) {
            names.add("max-buffers");
            values.add(org.gtk.gobject.Value.create(maxBuffers));
            return this;
        }
        
        public Build setWaitOnEos(boolean waitOnEos) {
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
    
    private static class Callbacks {
        
        public static void signalAppSinkEos(MemoryAddress sourceAppSink, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppSink.Eos) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppSink(sourceAppSink, Ownership.NONE));
        }
        
        public static void signalAppSinkNewPreroll(MemoryAddress sourceAppSink, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppSink.NewPreroll) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppSink(sourceAppSink, Ownership.NONE));
        }
        
        public static void signalAppSinkNewSample(MemoryAddress sourceAppSink, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppSink.NewSample) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppSink(sourceAppSink, Ownership.NONE));
        }
        
        public static boolean signalAppSinkNewSerializedEvent(MemoryAddress sourceAppSink, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppSink.NewSerializedEvent) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new AppSink(sourceAppSink, Ownership.NONE));
        }
        
        public static void signalAppSinkPullPreroll(MemoryAddress sourceAppSink, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppSink.PullPreroll) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppSink(sourceAppSink, Ownership.NONE));
        }
        
        public static void signalAppSinkPullSample(MemoryAddress sourceAppSink, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppSink.PullSample) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppSink(sourceAppSink, Ownership.NONE));
        }
        
        public static void signalAppSinkTryPullObject(MemoryAddress sourceAppSink, long timeout, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppSink.TryPullObject) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppSink(sourceAppSink, Ownership.NONE), timeout);
        }
        
        public static void signalAppSinkTryPullPreroll(MemoryAddress sourceAppSink, long timeout, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppSink.TryPullPreroll) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppSink(sourceAppSink, Ownership.NONE), timeout);
        }
        
        public static void signalAppSinkTryPullSample(MemoryAddress sourceAppSink, long timeout, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppSink.TryPullSample) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppSink(sourceAppSink, Ownership.NONE), timeout);
        }
    }
}
