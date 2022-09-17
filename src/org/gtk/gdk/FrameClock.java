package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GdkFrameClock</code> tells the application when to update and repaint
 * a surface.
 * <p>
 * This may be synced to the vertical refresh rate of the monitor, for example.
 * Even when the frame clock uses a simple timer rather than a hardware-based
 * vertical sync, the frame clock helps because it ensures everything paints at
 * the same time (reducing the total number of frames).
 * <p>
 * The frame clock can also automatically stop painting when it knows the frames
 * will not be visible, or scale back animation framerates.
 * <p><code>GdkFrameClock</code> is designed to be compatible with an OpenGL-based implementation
 * or with mozRequestAnimationFrame in Firefox, for example.
 * <p>
 * A frame clock is idle until someone requests a frame with
 * {@link org.gtk.gdk.FrameClock#requestPhase}. At some later point that makes sense
 * for the synchronization being implemented, the clock will process a frame and
 * emit signals for each phase that has been requested. (See the signals of the<code>GdkFrameClock</code> class for documentation of the phases.
 * {@link org.gtk.gdk.FrameClockPhase#UPDATE} and the {@link [signal@GdkFrameClock::update] (ref=signal)} signal
 * are most interesting for application writers, and are used to update the
 * animations, using the frame time given by {@link org.gtk.gdk.FrameClock#getFrameTime}.
 * 
 * The frame time is reported in microseconds and generally in the same
 * timescale as g_get_monotonic_time(), however, it is not the same
 * as g_get_monotonic_time(). The frame time does not advance during
 * the time a frame is being painted, and outside of a frame, an attempt
 * is made so that all calls to {@link org.gtk.gdk.FrameClock#getFrameTime} that
 * are called at a &#8220;similar&#8221; time get the same value. This means that
 * if different animations are timed by looking at the difference in
 * time between an initial value from {@link org.gtk.gdk.FrameClock#getFrameTime}
 * and the value inside the {@link [signal@GdkFrameClock::update] (ref=signal)} signal of the clock,
 * they will stay exactly synchronized.
 */
public class FrameClock extends org.gtk.gobject.Object {

    public FrameClock(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FrameClock */
    public static FrameClock castFrom(org.gtk.gobject.Object gobject) {
        return new FrameClock(gobject.getReference());
    }
    
    /**
     * Starts updates for an animation.
     * 
     * Until a matching call to {@link org.gtk.gdk.FrameClock#endUpdating} is made,
     * the frame clock will continually request a new frame with the
     * {@link org.gtk.gdk.FrameClockPhase#UPDATE} phase. This function may be called multiple
     * times and frames will be requested until gdk_frame_clock_end_updating()
     * is called the same number of times.
     */
    public void beginUpdating() {
        gtk_h.gdk_frame_clock_begin_updating(handle());
    }
    
    /**
     * Stops updates for an animation.
     * 
     * See the documentation for {@link org.gtk.gdk.FrameClock#beginUpdating}.
     */
    public void endUpdating() {
        gtk_h.gdk_frame_clock_end_updating(handle());
    }
    
    /**
     * Gets the frame timings for the current frame.
     */
    public FrameTimings getCurrentTimings() {
        var RESULT = gtk_h.gdk_frame_clock_get_current_timings(handle());
        return new FrameTimings(References.get(RESULT, false));
    }
    
    /**
     * Calculates the current frames-per-second, based on the
     * frame timings of @frame_clock.
     */
    public double getFps() {
        var RESULT = gtk_h.gdk_frame_clock_get_fps(handle());
        return RESULT;
    }
    
    /**
     * <code>GdkFrameClock</code> maintains a 64-bit counter that increments for
     * each frame drawn.
     */
    public long getFrameCounter() {
        var RESULT = gtk_h.gdk_frame_clock_get_frame_counter(handle());
        return RESULT;
    }
    
    /**
     * Gets the time that should currently be used for animations.
     * 
     * Inside the processing of a frame, it&#8217;s the time used to compute the
     * animation position of everything in a frame. Outside of a frame, it&#39;s
     * the time of the conceptual &#8220;previous frame,&#8221; which may be either
     * the actual previous frame time, or if that&#8217;s too old, an updated
     * time.
     */
    public long getFrameTime() {
        var RESULT = gtk_h.gdk_frame_clock_get_frame_time(handle());
        return RESULT;
    }
    
    /**
     * Returns the frame counter for the oldest frame available in history.
     * <p><code>GdkFrameClock</code> internally keeps a history of <code>GdkFrameTimings</code>
     * objects for recent frames that can be retrieved with
     * {@link org.gtk.gdk.FrameClock#getTimings}. The set of stored frames
     * is the set from the counter values given by
     * {@link org.gtk.gdk.FrameClock#getHistoryStart} and
     * {@link org.gtk.gdk.FrameClock#getFrameCounter}, inclusive.
     */
    public long getHistoryStart() {
        var RESULT = gtk_h.gdk_frame_clock_get_history_start(handle());
        return RESULT;
    }
    
    /**
     * Retrieves a <code>GdkFrameTimings</code> object holding timing information
     * for the current frame or a recent frame.
     * <p>
     * The <code>GdkFrameTimings</code> object may not yet be complete: see
     * {@link org.gtk.gdk.FrameTimings#getComplete} and
     * {@link org.gtk.gdk.FrameClock#getHistoryStart}.
     */
    public FrameTimings getTimings(long frameCounter) {
        var RESULT = gtk_h.gdk_frame_clock_get_timings(handle(), frameCounter);
        return new FrameTimings(References.get(RESULT, false));
    }
    
    /**
     * Asks the frame clock to run a particular phase.
     * 
     * The signal corresponding the requested phase will be emitted the next
     * time the frame clock processes. Multiple calls to
     * gdk_frame_clock_request_phase() will be combined together
     * and only one frame processed. If you are displaying animated
     * content and want to continually request the
     * {@link org.gtk.gdk.FrameClockPhase#UPDATE} phase for a period of time,
     * you should use {@link org.gtk.gdk.FrameClock#beginUpdating} instead,
     * since this allows GTK to adjust system parameters to get maximally
     * smooth animations.
     */
    public void requestPhase(int phase) {
        gtk_h.gdk_frame_clock_request_phase(handle(), phase);
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
    public SignalHandle onAfterPaint(AfterPaintHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockAfterPaint", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("after-paint").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onBeforePaint(BeforePaintHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockBeforePaint", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("before-paint").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onFlushEvents(FlushEventsHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockFlushEvents", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("flush-events").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onLayout(LayoutHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockLayout", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("layout").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * emits {@link [signal@Gdk.Surface::render] (ref=signal)} signals which are turned into
     * {@link [signal@Gtk.Widget::snapshot] (ref=signal)} signals by GTK.
     */
    public SignalHandle onPaint(PaintHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockPaint", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("paint").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onResumeEvents(ResumeEventsHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockResumeEvents", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("resume-events").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * Animations should be updated using {@link org.gtk.gdk.FrameClock#getFrameTime}.
     * Applications can connect directly to this signal, or use
     * {@link org.gtk.gtk.Widget#addTickCallback} as a more convenient interface.
     */
    public SignalHandle onUpdate(UpdateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFrameClockUpdate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("update").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
