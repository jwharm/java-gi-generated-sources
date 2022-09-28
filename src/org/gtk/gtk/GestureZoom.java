package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkGestureZoom} is a {@code GtkGesture} for 2-finger pinch/zoom gestures.
 * <p>
 * Whenever the distance between both tracked sequences changes, the
 * {@code Gtk.GestureZoom::scale-changed} signal is emitted to report
 * the scale factor.
 */
public class GestureZoom extends Gesture {

    public GestureZoom(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GestureZoom */
    public static GestureZoom castFrom(org.gtk.gobject.Object gobject) {
        return new GestureZoom(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_gesture_zoom_new(), true);
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes
     * pinch/zoom gestures.
     */
    public GestureZoom() {
        super(constructNew());
    }
    
    /**
     * Gets the scale delta.
     * <p>
     * If {@code gesture} is active, this function returns the zooming
     * difference since the gesture was recognized (hence the
     * starting point is considered 1:1). If {@code gesture} is not
     * active, 1 is returned.
     */
    public double getScaleDelta() {
        var RESULT = gtk_h.gtk_gesture_zoom_get_scale_delta(handle());
        return RESULT;
    }
    
    @FunctionalInterface
    public interface ScaleChangedHandler {
        void signalReceived(GestureZoom source, double scale);
    }
    
    /**
     * Emitted whenever the distance between both tracked sequences changes.
     */
    public SignalHandle onScaleChanged(ScaleChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("scale-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureZoom.Callbacks.class, "signalGestureZoomScaleChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGestureZoomScaleChanged(MemoryAddress source, double scale, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureZoom.ScaleChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureZoom(References.get(source)), scale);
        }
        
    }
}
