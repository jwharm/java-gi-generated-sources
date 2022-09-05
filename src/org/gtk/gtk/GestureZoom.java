package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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

    public GestureZoom(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to GestureZoom */
    public static GestureZoom castFrom(org.gtk.gobject.Object gobject) {
        return new GestureZoom(gobject.getProxy());
    }
    
    /**
     * Returns a newly created `GtkGesture` that recognizes
     * pinch/zoom gestures.
     */
    public GestureZoom() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_zoom_new(), true));
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_zoom_get_scale_delta(HANDLE());
        return RESULT;
    }
    
    @FunctionalInterface
    public interface ScaleChangedHandler {
        void signalReceived(GestureZoom source, double scale);
    }
    
    /**
     * Emitted whenever the distance between both tracked sequences changes.
     */
    public void onScaleChanged(ScaleChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureZoomScaleChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("scale-changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}