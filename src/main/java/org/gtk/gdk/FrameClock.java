package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkFrameClock} tells the application when to update and repaint
 * a surface.
 * <p>
 * This may be synced to the vertical refresh rate of the monitor, for example.
 * Even when the frame clock uses a simple timer rather than a hardware-based
 * vertical sync, the frame clock helps because it ensures everything paints at
 * the same time (reducing the total number of frames).
 * <p>
 * The frame clock can also automatically stop painting when it knows the frames
 * will not be visible, or scale back animation framerates.
 * <p>
 * {@code GdkFrameClock} is designed to be compatible with an OpenGL-based implementation
 * or with mozRequestAnimationFrame in Firefox, for example.
 * <p>
 * A frame clock is idle until someone requests a frame with
 * {@link FrameClock#requestPhase}. At some later point that makes sense
 * for the synchronization being implemented, the clock will process a frame and
 * emit signals for each phase that has been requested. (See the signals of the
 * {@code GdkFrameClock} class for documentation of the phases.
 * {@link FrameClockPhase#UPDATE} and the {@code GdkFrameClock::update} signal
 * are most interesting for application writers, and are used to update the
 * animations, using the frame time given by {@link FrameClock#getFrameTime}.
 * <p>
 * The frame time is reported in microseconds and generally in the same
 * timescale as g_get_monotonic_time(), however, it is not the same
 * as g_get_monotonic_time(). The frame time does not advance during
 * the time a frame is being painted, and outside of a frame, an attempt
 * is made so that all calls to {@link FrameClock#getFrameTime} that
 * are called at a “similar” time get the same value. This means that
 * if different animations are timed by looking at the difference in
 * time between an initial value from {@link FrameClock#getFrameTime}
 * and the value inside the {@code GdkFrameClock::update} signal of the clock,
 * they will stay exactly synchronized.
 */
public class FrameClock extends org.gtk.gobject.GObject {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkFrameClock";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FrameClock proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FrameClock(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FrameClock> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FrameClock(input);
    
    /**
     * Starts updates for an animation.
     * <p>
     * Until a matching call to {@link FrameClock#endUpdating} is made,
     * the frame clock will continually request a new frame with the
     * {@link FrameClockPhase#UPDATE} phase. This function may be called multiple
     * times and frames will be requested until gdk_frame_clock_end_updating()
     * is called the same number of times.
     */
    public void beginUpdating() {
        try {
            DowncallHandles.gdk_frame_clock_begin_updating.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stops updates for an animation.
     * <p>
     * See the documentation for {@link FrameClock#beginUpdating}.
     */
    public void endUpdating() {
        try {
            DowncallHandles.gdk_frame_clock_end_updating.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the frame timings for the current frame.
     * @return the {@code GdkFrameTimings} for the
     *   frame currently being processed, or even no frame is being
     *   processed, for the previous frame. Before any frames have been
     *   processed, returns {@code null}.
     */
    public @Nullable org.gtk.gdk.FrameTimings getCurrentTimings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_frame_clock_get_current_timings.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.FrameTimings.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Calculates the current frames-per-second, based on the
     * frame timings of {@code frame_clock}.
     * @return the current fps, as a {@code double}
     */
    public double getFps() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gdk_frame_clock_get_fps.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * {@code GdkFrameClock} maintains a 64-bit counter that increments for
     * each frame drawn.
     * @return inside frame processing, the value of the frame counter
     *   for the current frame. Outside of frame processing, the frame
     *   counter for the last frame.
     */
    public long getFrameCounter() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_frame_clock_get_frame_counter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the time that should currently be used for animations.
     * <p>
     * Inside the processing of a frame, it’s the time used to compute the
     * animation position of everything in a frame. Outside of a frame, it's
     * the time of the conceptual “previous frame,” which may be either
     * the actual previous frame time, or if that’s too old, an updated
     * time.
     * @return a timestamp in microseconds, in the timescale of
     *  of g_get_monotonic_time().
     */
    public long getFrameTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_frame_clock_get_frame_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the frame counter for the oldest frame available in history.
     * <p>
     * {@code GdkFrameClock} internally keeps a history of {@code GdkFrameTimings}
     * objects for recent frames that can be retrieved with
     * {@link FrameClock#getTimings}. The set of stored frames
     * is the set from the counter values given by
     * {@link FrameClock#getHistoryStart} and
     * {@link FrameClock#getFrameCounter}, inclusive.
     * @return the frame counter value for the oldest frame
     *  that is available in the internal frame history of the
     *  {@code GdkFrameClock}
     */
    public long getHistoryStart() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_frame_clock_get_history_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Predicts a presentation time, based on history.
     * <p>
     * Using the frame history stored in the frame clock, finds the last
     * known presentation time and refresh interval, and assuming that
     * presentation times are separated by the refresh interval,
     * predicts a presentation time that is a multiple of the refresh
     * interval after the last presentation time, and later than {@code base_time}.
     * @param baseTime base time for determining a presentaton time
     * @param refreshIntervalReturn a location to store the
     *   determined refresh interval, or {@code null}. A default refresh interval of
     *   1/60th of a second will be stored if no history is present.
     * @param presentationTimeReturn a location to store the next
     *   candidate presentation time after the given base time.
     *   0 will be will be stored if no history is present.
     */
    public void getRefreshInfo(long baseTime, Out<Long> refreshIntervalReturn, Out<Long> presentationTimeReturn) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment refreshIntervalReturnPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment presentationTimeReturnPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gdk_frame_clock_get_refresh_info.invokeExact(
                        handle(),
                        baseTime,
                        (Addressable) (refreshIntervalReturn == null ? MemoryAddress.NULL : (Addressable) refreshIntervalReturnPOINTER.address()),
                        (Addressable) presentationTimeReturnPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (refreshIntervalReturn != null) refreshIntervalReturn.set(refreshIntervalReturnPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    presentationTimeReturn.set(presentationTimeReturnPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Retrieves a {@code GdkFrameTimings} object holding timing information
     * for the current frame or a recent frame.
     * <p>
     * The {@code GdkFrameTimings} object may not yet be complete: see
     * {@link FrameTimings#getComplete} and
     * {@link FrameClock#getHistoryStart}.
     * @param frameCounter the frame counter value identifying the frame to
     *  be received
     * @return the {@code GdkFrameTimings} object
     *   for the specified frame, or {@code null} if it is not available
     */
    public @Nullable org.gtk.gdk.FrameTimings getTimings(long frameCounter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_frame_clock_get_timings.invokeExact(
                    handle(),
                    frameCounter);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.FrameTimings.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Asks the frame clock to run a particular phase.
     * <p>
     * The signal corresponding the requested phase will be emitted the next
     * time the frame clock processes. Multiple calls to
     * gdk_frame_clock_request_phase() will be combined together
     * and only one frame processed. If you are displaying animated
     * content and want to continually request the
     * {@link FrameClockPhase#UPDATE} phase for a period of time,
     * you should use {@link FrameClock#beginUpdating} instead,
     * since this allows GTK to adjust system parameters to get maximally
     * smooth animations.
     * @param phase the phase that is requested
     */
    public void requestPhase(org.gtk.gdk.FrameClockPhase phase) {
        try {
            DowncallHandles.gdk_frame_clock_request_phase.invokeExact(
                    handle(),
                    phase.getValue());
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
            RESULT = (long) DowncallHandles.gdk_frame_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code AfterPaint} callback.
     */
    @FunctionalInterface
    public interface AfterPaint {
    
        /**
         * This signal ends processing of the frame.
         * <p>
         * Applications should generally not handle this signal.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFrameClock) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AfterPaint.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal ends processing of the frame.
     * <p>
     * Applications should generally not handle this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FrameClock.AfterPaint> onAfterPaint(FrameClock.AfterPaint handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("after-paint", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code BeforePaint} callback.
     */
    @FunctionalInterface
    public interface BeforePaint {
    
        /**
         * Begins processing of the frame.
         * <p>
         * Applications should generally not handle this signal.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFrameClock) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BeforePaint.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Begins processing of the frame.
     * <p>
     * Applications should generally not handle this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FrameClock.BeforePaint> onBeforePaint(FrameClock.BeforePaint handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("before-paint", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code FlushEvents} callback.
     */
    @FunctionalInterface
    public interface FlushEvents {
    
        /**
         * Used to flush pending motion events that are being batched up and
         * compressed together.
         * <p>
         * Applications should not handle this signal.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFrameClock) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FlushEvents.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Used to flush pending motion events that are being batched up and
     * compressed together.
     * <p>
     * Applications should not handle this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FrameClock.FlushEvents> onFlushEvents(FrameClock.FlushEvents handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("flush-events", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Layout} callback.
     */
    @FunctionalInterface
    public interface Layout {
    
        /**
         * Emitted as the second step of toolkit and application processing
         * of the frame.
         * <p>
         * Any work to update sizes and positions of application elements
         * should be performed. GTK normally handles this internally.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFrameClock) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Layout.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted as the second step of toolkit and application processing
     * of the frame.
     * <p>
     * Any work to update sizes and positions of application elements
     * should be performed. GTK normally handles this internally.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FrameClock.Layout> onLayout(FrameClock.Layout handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("layout", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Paint} callback.
     */
    @FunctionalInterface
    public interface Paint {
    
        /**
         * Emitted as the third step of toolkit and application processing
         * of the frame.
         * <p>
         * The frame is repainted. GDK normally handles this internally and
         * emits {@code Gdk.Surface::render} signals which are turned into
         * {@code Gtk.Widget::snapshot} signals by GTK.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFrameClock) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Paint.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted as the third step of toolkit and application processing
     * of the frame.
     * <p>
     * The frame is repainted. GDK normally handles this internally and
     * emits {@code Gdk.Surface::render} signals which are turned into
     * {@code Gtk.Widget::snapshot} signals by GTK.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FrameClock.Paint> onPaint(FrameClock.Paint handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("paint", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ResumeEvents} callback.
     */
    @FunctionalInterface
    public interface ResumeEvents {
    
        /**
         * Emitted after processing of the frame is finished.
         * <p>
         * This signal is handled internally by GTK to resume normal
         * event processing. Applications should not handle this signal.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFrameClock) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ResumeEvents.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted after processing of the frame is finished.
     * <p>
     * This signal is handled internally by GTK to resume normal
     * event processing. Applications should not handle this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FrameClock.ResumeEvents> onResumeEvents(FrameClock.ResumeEvents handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("resume-events", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Update} callback.
     */
    @FunctionalInterface
    public interface Update {
    
        /**
         * Emitted as the first step of toolkit and application processing
         * of the frame.
         * <p>
         * Animations should be updated using {@link FrameClock#getFrameTime}.
         * Applications can connect directly to this signal, or use
         * {@link org.gtk.gtk.Widget#addTickCallback} as a more convenient interface.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFrameClock) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Update.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted as the first step of toolkit and application processing
     * of the frame.
     * <p>
     * Animations should be updated using {@link FrameClock#getFrameTime}.
     * Applications can connect directly to this signal, or use
     * {@link org.gtk.gtk.Widget#addTickCallback} as a more convenient interface.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FrameClock.Update> onUpdate(FrameClock.Update handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("update", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link FrameClock.Builder} object constructs a {@link FrameClock} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FrameClock.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FrameClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FrameClock}.
         * @return A new instance of {@code FrameClock} with the properties 
         *         that were set in the Builder object.
         */
        public FrameClock build() {
            return (FrameClock) org.gtk.gobject.GObject.newWithProperties(
                FrameClock.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_frame_clock_begin_updating = Interop.downcallHandle(
                "gdk_frame_clock_begin_updating",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_frame_clock_end_updating = Interop.downcallHandle(
                "gdk_frame_clock_end_updating",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_frame_clock_get_current_timings = Interop.downcallHandle(
                "gdk_frame_clock_get_current_timings",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_frame_clock_get_fps = Interop.downcallHandle(
                "gdk_frame_clock_get_fps",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_frame_clock_get_frame_counter = Interop.downcallHandle(
                "gdk_frame_clock_get_frame_counter",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_frame_clock_get_frame_time = Interop.downcallHandle(
                "gdk_frame_clock_get_frame_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_frame_clock_get_history_start = Interop.downcallHandle(
                "gdk_frame_clock_get_history_start",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_frame_clock_get_refresh_info = Interop.downcallHandle(
                "gdk_frame_clock_get_refresh_info",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_frame_clock_get_timings = Interop.downcallHandle(
                "gdk_frame_clock_get_timings",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gdk_frame_clock_request_phase = Interop.downcallHandle(
                "gdk_frame_clock_request_phase",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gdk_frame_clock_get_type = Interop.downcallHandle(
                "gdk_frame_clock_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_frame_clock_get_type != null;
    }
}
