package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class FrameClock extends org.gtk.gobject.Object {

    public FrameClock(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FrameClock */
    public static FrameClock castFrom(org.gtk.gobject.Object gobject) {
        return new FrameClock(gobject.refcounted());
    }
    
    static final MethodHandle gdk_frame_clock_begin_updating = Interop.downcallHandle(
        "gdk_frame_clock_begin_updating",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
            gdk_frame_clock_begin_updating.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_frame_clock_end_updating = Interop.downcallHandle(
        "gdk_frame_clock_end_updating",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Stops updates for an animation.
     * <p>
     * See the documentation for {@link FrameClock#beginUpdating}.
     */
    public void endUpdating() {
        try {
            gdk_frame_clock_end_updating.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_frame_clock_get_current_timings = Interop.downcallHandle(
        "gdk_frame_clock_get_current_timings",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the frame timings for the current frame.
     */
    public FrameTimings getCurrentTimings() {
        try {
            var RESULT = (MemoryAddress) gdk_frame_clock_get_current_timings.invokeExact(handle());
            return new FrameTimings(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_frame_clock_get_fps = Interop.downcallHandle(
        "gdk_frame_clock_get_fps",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Calculates the current frames-per-second, based on the
     * frame timings of {@code frame_clock}.
     */
    public double getFps() {
        try {
            var RESULT = (double) gdk_frame_clock_get_fps.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_frame_clock_get_frame_counter = Interop.downcallHandle(
        "gdk_frame_clock_get_frame_counter",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * {@code GdkFrameClock} maintains a 64-bit counter that increments for
     * each frame drawn.
     */
    public long getFrameCounter() {
        try {
            var RESULT = (long) gdk_frame_clock_get_frame_counter.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_frame_clock_get_frame_time = Interop.downcallHandle(
        "gdk_frame_clock_get_frame_time",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time that should currently be used for animations.
     * <p>
     * Inside the processing of a frame, it’s the time used to compute the
     * animation position of everything in a frame. Outside of a frame, it's
     * the time of the conceptual “previous frame,” which may be either
     * the actual previous frame time, or if that’s too old, an updated
     * time.
     */
    public long getFrameTime() {
        try {
            var RESULT = (long) gdk_frame_clock_get_frame_time.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_frame_clock_get_history_start = Interop.downcallHandle(
        "gdk_frame_clock_get_history_start",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the frame counter for the oldest frame available in history.
     * <p>
     * {@code GdkFrameClock} internally keeps a history of {@code GdkFrameTimings}
     * objects for recent frames that can be retrieved with
     * {@link FrameClock#getTimings}. The set of stored frames
     * is the set from the counter values given by
     * {@link FrameClock#getHistoryStart} and
     * {@link FrameClock#getFrameCounter}, inclusive.
     */
    public long getHistoryStart() {
        try {
            var RESULT = (long) gdk_frame_clock_get_history_start.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_frame_clock_get_refresh_info = Interop.downcallHandle(
        "gdk_frame_clock_get_refresh_info",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Predicts a presentation time, based on history.
     * <p>
     * Using the frame history stored in the frame clock, finds the last
     * known presentation time and refresh interval, and assuming that
     * presentation times are separated by the refresh interval,
     * predicts a presentation time that is a multiple of the refresh
     * interval after the last presentation time, and later than {@code base_time}.
     */
    public void getRefreshInfo(long baseTime, PointerLong refreshIntervalReturn, PointerLong presentationTimeReturn) {
        try {
            gdk_frame_clock_get_refresh_info.invokeExact(handle(), baseTime, refreshIntervalReturn.handle(), presentationTimeReturn.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_frame_clock_get_timings = Interop.downcallHandle(
        "gdk_frame_clock_get_timings",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Retrieves a {@code GdkFrameTimings} object holding timing information
     * for the current frame or a recent frame.
     * <p>
     * The {@code GdkFrameTimings} object may not yet be complete: see
     * {@link FrameTimings#getComplete} and
     * {@link FrameClock#getHistoryStart}.
     */
    public FrameTimings getTimings(long frameCounter) {
        try {
            var RESULT = (MemoryAddress) gdk_frame_clock_get_timings.invokeExact(handle(), frameCounter);
            return new FrameTimings(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_frame_clock_request_phase = Interop.downcallHandle(
        "gdk_frame_clock_request_phase",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public void requestPhase(FrameClockPhase phase) {
        try {
            gdk_frame_clock_request_phase.invokeExact(handle(), phase.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AfterPaintHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * This signal ends processing of the frame.
     * <p>
     * Applications should generally not handle this signal.
     */
    public SignalHandle onAfterPaint(AfterPaintHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("after-paint").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FrameClock.Callbacks.class, "signalFrameClockAfterPaint",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface BeforePaintHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Begins processing of the frame.
     * <p>
     * Applications should generally not handle this signal.
     */
    public SignalHandle onBeforePaint(BeforePaintHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("before-paint").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FrameClock.Callbacks.class, "signalFrameClockBeforePaint",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface FlushEventsHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Used to flush pending motion events that are being batched up and
     * compressed together.
     * <p>
     * Applications should not handle this signal.
     */
    public SignalHandle onFlushEvents(FlushEventsHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("flush-events").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FrameClock.Callbacks.class, "signalFrameClockFlushEvents",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LayoutHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Emitted as the second step of toolkit and application processing
     * of the frame.
     * <p>
     * Any work to update sizes and positions of application elements
     * should be performed. GTK normally handles this internally.
     */
    public SignalHandle onLayout(LayoutHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("layout").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FrameClock.Callbacks.class, "signalFrameClockLayout",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PaintHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Emitted as the third step of toolkit and application processing
     * of the frame.
     * <p>
     * The frame is repainted. GDK normally handles this internally and
     * emits {@code Gdk.Surface::render} signals which are turned into
     * {@code Gtk.Widget::snapshot} signals by GTK.
     */
    public SignalHandle onPaint(PaintHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("paint").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FrameClock.Callbacks.class, "signalFrameClockPaint",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ResumeEventsHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Emitted after processing of the frame is finished.
     * <p>
     * This signal is handled internally by GTK to resume normal
     * event processing. Applications should not handle this signal.
     */
    public SignalHandle onResumeEvents(ResumeEventsHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("resume-events").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FrameClock.Callbacks.class, "signalFrameClockResumeEvents",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UpdateHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Emitted as the first step of toolkit and application processing
     * of the frame.
     * <p>
     * Animations should be updated using {@link FrameClock#getFrameTime}.
     * Applications can connect directly to this signal, or use
     * {@link org.gtk.gtk.Widget#addTickCallback} as a more convenient interface.
     */
    public SignalHandle onUpdate(UpdateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("update").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FrameClock.Callbacks.class, "signalFrameClockUpdate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalFrameClockAfterPaint(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FrameClock.AfterPaintHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FrameClock(Refcounted.get(source)));
        }
        
        public static void signalFrameClockBeforePaint(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FrameClock.BeforePaintHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FrameClock(Refcounted.get(source)));
        }
        
        public static void signalFrameClockFlushEvents(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FrameClock.FlushEventsHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FrameClock(Refcounted.get(source)));
        }
        
        public static void signalFrameClockLayout(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FrameClock.LayoutHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FrameClock(Refcounted.get(source)));
        }
        
        public static void signalFrameClockPaint(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FrameClock.PaintHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FrameClock(Refcounted.get(source)));
        }
        
        public static void signalFrameClockResumeEvents(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FrameClock.ResumeEventsHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FrameClock(Refcounted.get(source)));
        }
        
        public static void signalFrameClockUpdate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FrameClock.UpdateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FrameClock(Refcounted.get(source)));
        }
        
    }
}
