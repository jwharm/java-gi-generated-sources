package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureRotate} is a {@code GtkGesture} for 2-finger rotations.
 * <p>
 * Whenever the angle between both handled sequences changes, the
 * {@code Gtk.GestureRotate::angle-changed} signal is emitted.
 */
public class GestureRotate extends Gesture {

    public GestureRotate(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GestureRotate */
    public static GestureRotate castFrom(org.gtk.gobject.Object gobject) {
        return new GestureRotate(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_gesture_rotate_new = Interop.downcallHandle(
        "gtk_gesture_rotate_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_gesture_rotate_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes 2-touch
     * rotation gestures.
     */
    public GestureRotate() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_gesture_rotate_get_angle_delta = Interop.downcallHandle(
        "gtk_gesture_rotate_get_angle_delta",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the angle delta in radians.
     * <p>
     * If {@code gesture} is active, this function returns the angle difference
     * in radians since the gesture was first recognized. If {@code gesture} is
     * not active, 0 is returned.
     */
    public double getAngleDelta() {
        double RESULT;
        try {
            RESULT = (double) gtk_gesture_rotate_get_angle_delta.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @FunctionalInterface
    public interface AngleChangedHandler {
        void signalReceived(GestureRotate source, @NotNull double angle, @NotNull double angleDelta);
    }
    
    /**
     * Emitted when the angle between both tracked points changes.
     */
    public SignalHandle onAngleChanged(AngleChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("angle-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureRotate.Callbacks.class, "signalGestureRotateAngleChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGestureRotateAngleChanged(MemoryAddress source, double angle, double angleDelta, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureRotate.AngleChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureRotate(Refcounted.get(source)), angle, angleDelta);
        }
        
    }
}
