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
public class GestureRotate extends org.gtk.gtk.Gesture {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureRotate";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public GestureRotate(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to GestureRotate if its GType is a (or inherits from) "GtkGestureRotate".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "GestureRotate" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGestureRotate", a ClassCastException will be thrown.
     */
    public static GestureRotate castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkGestureRotate"))) {
            return new GestureRotate(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGestureRotate");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_gesture_rotate_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes 2-touch
     * rotation gestures.
     */
    public GestureRotate() {
        super(constructNew());
    }
    
    /**
     * Gets the angle delta in radians.
     * <p>
     * If {@code gesture} is active, this function returns the angle difference
     * in radians since the gesture was first recognized. If {@code gesture} is
     * not active, 0 is returned.
     * @return the angle delta in radians
     */
    public double getAngleDelta() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_gesture_rotate_get_angle_delta.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @FunctionalInterface
    public interface AngleChanged {
        void signalReceived(GestureRotate source, double angle, double angleDelta);
    }
    
    /**
     * Emitted when the angle between both tracked points changes.
     */
    public Signal<GestureRotate.AngleChanged> onAngleChanged(GestureRotate.AngleChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("angle-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureRotate.Callbacks.class, "signalGestureRotateAngleChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureRotate.AngleChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_rotate_new = Interop.downcallHandle(
            "gtk_gesture_rotate_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_gesture_rotate_get_angle_delta = Interop.downcallHandle(
            "gtk_gesture_rotate_get_angle_delta",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalGestureRotateAngleChanged(MemoryAddress source, double angle, double angleDelta, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (GestureRotate.AngleChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureRotate(Refcounted.get(source)), angle, angleDelta);
        }
    }
}
