package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkGestureRotate` is a `GtkGesture` for 2-finger rotations.
 * 
 * Whenever the angle between both handled sequences changes, the
 * [signal@Gtk.GestureRotate::angle-changed] signal is emitted.
 */
public class GestureRotate extends Gesture {

    public GestureRotate(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to GestureRotate */
    public static GestureRotate castFrom(org.gtk.gobject.Object gobject) {
        return new GestureRotate(gobject.getProxy());
    }
    
    /**
     * Returns a newly created `GtkGesture` that recognizes 2-touch
     * rotation gestures.
     */
    public GestureRotate() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_rotate_new(), true));
    }
    
    /**
     * Gets the angle delta in radians.
     * 
     * If @gesture is active, this function returns the angle difference
     * in radians since the gesture was first recognized. If @gesture is
     * not active, 0 is returned.
     */
    public double getAngleDelta() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_rotate_get_angle_delta(HANDLE());
        return RESULT;
    }
    
    @FunctionalInterface
    public interface AngleChangedHandler {
        void signalReceived(GestureRotate source, double angle, double angleDelta);
    }
    
    /**
     * Emitted when the angle between both tracked points changes.
     */
    public void onAngleChanged(AngleChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureRotateAngleChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("angle-changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
