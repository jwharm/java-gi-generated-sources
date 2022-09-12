package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkGestureRotate` is a `GtkGesture` for 2-finger rotations.
 * 
 * Whenever the angle between both handled sequences changes, the
 * [signal@Gtk.GestureRotate::angle-changed] signal is emitted.
 */
public class GestureRotate extends Gesture {

    public GestureRotate(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GestureRotate */
    public static GestureRotate castFrom(org.gtk.gobject.Object gobject) {
        return new GestureRotate(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_gesture_rotate_new(), true);
        return RESULT;
    }
    
    /**
     * Returns a newly created `GtkGesture` that recognizes 2-touch
     * rotation gestures.
     */
    public GestureRotate() {
        super(constructNew());
    }
    
    /**
     * Gets the angle delta in radians.
     * 
     * If @gesture is active, this function returns the angle difference
     * in radians since the gesture was first recognized. If @gesture is
     * not active, 0 is returned.
     */
    public double getAngleDelta() {
        var RESULT = gtk_h.gtk_gesture_rotate_get_angle_delta(handle());
        return RESULT;
    }
    
    @FunctionalInterface
    public interface AngleChangedHandler {
        void signalReceived(GestureRotate source, double angle, double angleDelta);
    }
    
    /**
     * Emitted when the angle between both tracked points changes.
     */
    public SignalHandle onAngleChanged(AngleChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureRotateAngleChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("angle-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
