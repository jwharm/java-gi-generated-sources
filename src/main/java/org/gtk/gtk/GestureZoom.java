package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureZoom} is a {@code GtkGesture} for 2-finger pinch/zoom gestures.
 * <p>
 * Whenever the distance between both tracked sequences changes, the
 * {@code Gtk.GestureZoom::scale-changed} signal is emitted to report
 * the scale factor.
 */
public class GestureZoom extends Gesture {

    public GestureZoom(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GestureZoom */
    public static GestureZoom castFrom(org.gtk.gobject.Object gobject) {
        return new GestureZoom(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_gesture_zoom_new = Interop.downcallHandle(
        "gtk_gesture_zoom_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_gesture_zoom_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes
     * pinch/zoom gestures.
     */
    public GestureZoom() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_gesture_zoom_get_scale_delta = Interop.downcallHandle(
        "gtk_gesture_zoom_get_scale_delta",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the scale delta.
     * <p>
     * If {@code gesture} is active, this function returns the zooming
     * difference since the gesture was recognized (hence the
     * starting point is considered 1:1). If {@code gesture} is not
     * active, 1 is returned.
     */
    public double getScaleDelta() {
        double RESULT;
        try {
            RESULT = (double) gtk_gesture_zoom_get_scale_delta.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @FunctionalInterface
    public interface ScaleChangedHandler {
        void signalReceived(GestureZoom source, @NotNull double scale);
    }
    
    /**
     * Emitted whenever the distance between both tracked sequences changes.
     */
    public SignalHandle onScaleChanged(ScaleChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("scale-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureZoom.Callbacks.class, "signalGestureZoomScaleChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGestureZoomScaleChanged(MemoryAddress source, double scale, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureZoom.ScaleChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureZoom(Refcounted.get(source)), scale);
        }
        
    }
}
