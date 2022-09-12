package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkGestureZoom` is a `GtkGesture` for 2-finger pinch/zoom gestures.
 * 
 * Whenever the distance between both tracked sequences changes, the
 * [signal@Gtk.GestureZoom::scale-changed] signal is emitted to report
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
     * Returns a newly created `GtkGesture` that recognizes
     * pinch/zoom gestures.
     */
    public GestureZoom() {
        super(constructNew());
    }
    
    /**
     * Gets the scale delta.
     * 
     * If @gesture is active, this function returns the zooming
     * difference since the gesture was recognized (hence the
     * starting point is considered 1:1). If @gesture is not
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureZoomScaleChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("scale-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
