package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkFrameClock` tells the application when to update and repaint
 * a surface.
 * 
 * This may be synced to the vertical refresh rate of the monitor, for example.
 * Even when the frame clock uses a simple timer rather than a hardware-based
 * vertical sync, the frame clock helps because it ensures everything paints at
 * the same time (reducing the total number of frames).
 * 
 * The frame clock can also automatically stop painting when it knows the frames
 * will not be visible, or scale back animation framerates.
 * 
 * `GdkFrameClock` is designed to be compatible with an OpenGL-based implementation
 * or with mozRequestAnimationFrame in Firefox, for example.
 * 
 * A frame clock is idle until someone requests a frame with
 * [method@Gdk.FrameClock.request_phase]. At some later point that makes sense
 * for the synchronization being implemented, the clock will process a frame and
 * emit signals for each phase that has been requested. (See the signals of the
 * `GdkFrameClock` class for documentation of the phases.
 * %GDK_FRAME_CLOCK_PHASE_UPDATE and the [signal@GdkFrameClock::update] signal
 * are most interesting for application writers, and are used to update the
 * animations, using the frame time given by [method@Gdk.FrameClock.get_frame_time].
 * 
 * The frame time is reported in microseconds and generally in the same
 * timescale as g_get_monotonic_time(), however, it is not the same
 * as g_get_monotonic_time(). The frame time does not advance during
 * the time a frame is being painted, and outside of a frame, an attempt
 * is made so that all calls to [method@Gdk.FrameClock.get_frame_time] that
 * are called at a “similar” time get the same value. This means that
 * if different animations are timed by looking at the difference in
 * time between an initial value from [method@Gdk.FrameClock.get_frame_time]
 * and the value inside the [signal@GdkFrameClock::update] signal of the clock,
 * they will stay exactly synchronized.
 */
public class FrameClock extends org.gtk.gobject.Object {

    public FrameClock(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FrameClock */
    public static FrameClock castFrom(org.gtk.gobject.Object gobject) {
        return new FrameClock(gobject.getProxy());
    }
    
    /**
     * Starts updates for an animation.
     * 
     * Until a matching call to [method@Gdk.FrameClock.end_updating] is made,
     * the frame clock will continually request a new frame with the
     * %GDK_FRAME_CLOCK_PHASE_UPDATE phase. This function may be called multiple
     * times and frames will be requested until gdk_frame_clock_end_updating()
     * is called the same number of times.
     */
    public void beginUpdating() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_clock_begin_updating(HANDLE());
    }
    
    /**
     * Stops updates for an animation.
     * 
     * See the documentation for [method@Gdk.FrameClock.begin_updating].
     */
    public void endUpdating() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_clock_end_updating(HANDLE());
    }
    
    /**
     * Gets the frame timings for the current frame.
     */
    public FrameTimings getCurrentTimings() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_clock_get_current_timings(HANDLE());
        return new FrameTimings(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Calculates the current frames-per-second, based on the
     * frame timings of @frame_clock.
     */
    public double getFps() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_clock_get_fps(HANDLE());
        return RESULT;
    }
    
    /**
     * `GdkFrameClock` maintains a 64-bit counter that increments for
     * each frame drawn.
     */
    public long getFrameCounter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_clock_get_frame_counter(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the time that should currently be used for animations.
     * 
     * Inside the processing of a frame, it’s the time used to compute the
     * animation position of everything in a frame. Outside of a frame, it's
     * the time of the conceptual “previous frame,” which may be either
     * the actual previous frame time, or if that’s too old, an updated
     * time.
     */
    public long getFrameTime() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_clock_get_frame_time(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the frame counter for the oldest frame available in history.
     * 
     * `GdkFrameClock` internally keeps a history of `GdkFrameTimings`
     * objects for recent frames that can be retrieved with
     * [method@Gdk.FrameClock.get_timings]. The set of stored frames
     * is the set from the counter values given by
     * [method@Gdk.FrameClock.get_history_start] and
     * [method@Gdk.FrameClock.get_frame_counter], inclusive.
     */
    public long getHistoryStart() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_clock_get_history_start(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves a `GdkFrameTimings` object holding timing information
     * for the current frame or a recent frame.
     * 
     * The `GdkFrameTimings` object may not yet be complete: see
     * [method@Gdk.FrameTimings.get_complete] and
     * [method@Gdk.FrameClock.get_history_start].
     */
    public FrameTimings getTimings(long frameCounter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_clock_get_timings(HANDLE(), frameCounter);
        return new FrameTimings(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Asks the frame clock to run a particular phase.
     * 
     * The signal corresponding the requested phase will be emitted the next
     * time the frame clock processes. Multiple calls to
     * gdk_frame_clock_request_phase() will be combined together
     * and only one frame processed. If you are displaying animated
     * content and want to continually request the
     * %GDK_FRAME_CLOCK_PHASE_UPDATE phase for a period of time,
     * you should use [method@Gdk.FrameClock.begin_updating] instead,
     * since this allows GTK to adjust system parameters to get maximally
     * smooth animations.
     */
    public void requestPhase(int phase) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_frame_clock_request_phase(HANDLE(), phase);
    }
    
    @FunctionalInterface
    public interface AfterPaintHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * This signal ends processing of the frame.
     * 
     * Applications should generally not handle this signal.
     */
    public void onAfterPaint(AfterPaintHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockAfterPaint", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("after-paint").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface BeforePaintHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Begins processing of the frame.
     * 
     * Applications should generally not handle this signal.
     */
    public void onBeforePaint(BeforePaintHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockBeforePaint", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("before-paint").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface FlushEventsHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Used to flush pending motion events that are being batched up and
     * compressed together.
     * 
     * Applications should not handle this signal.
     */
    public void onFlushEvents(FlushEventsHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockFlushEvents", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("flush-events").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LayoutHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Emitted as the second step of toolkit and application processing
     * of the frame.
     * 
     * Any work to update sizes and positions of application elements
     * should be performed. GTK normally handles this internally.
     */
    public void onLayout(LayoutHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockLayout", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("layout").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PaintHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Emitted as the third step of toolkit and application processing
     * of the frame.
     * 
     * The frame is repainted. GDK normally handles this internally and
     * emits [signal@Gdk.Surface::render] signals which are turned into
     * [signal@Gtk.Widget::snapshot] signals by GTK.
     */
    public void onPaint(PaintHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockPaint", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("paint").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ResumeEventsHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Emitted after processing of the frame is finished.
     * 
     * This signal is handled internally by GTK to resume normal
     * event processing. Applications should not handle this signal.
     */
    public void onResumeEvents(ResumeEventsHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockResumeEvents", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("resume-events").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UpdateHandler {
        void signalReceived(FrameClock source);
    }
    
    /**
     * Emitted as the first step of toolkit and application processing
     * of the frame.
     * 
     * Animations should be updated using [method@Gdk.FrameClock.get_frame_time].
     * Applications can connect directly to this signal, or use
     * [method@Gtk.Widget.add_tick_callback] as a more convenient interface.
     */
    public void onUpdate(UpdateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockUpdate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("update").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
