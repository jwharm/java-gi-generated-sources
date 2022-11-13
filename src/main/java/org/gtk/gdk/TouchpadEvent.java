package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to a gesture on a touchpad device.
 * <p>
 * Unlike touchscreens, where the windowing system sends basic
 * sequences of begin, update, end events, and leaves gesture
 * recognition to the clients, touchpad gestures are typically
 * processed by the system, resulting in these events.
 */
public class TouchpadEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkTouchpadEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TouchpadEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TouchpadEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TouchpadEvent if its GType is a (or inherits from) "GdkTouchpadEvent".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TouchpadEvent} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkTouchpadEvent", a ClassCastException will be thrown.
     */
    public static TouchpadEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkTouchpadEvent"))) {
            return new TouchpadEvent(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkTouchpadEvent");
        }
    }
    
    /**
     * Extracts delta information from a touchpad event.
     * @param dx return location for x
     * @param dy return location for y
     */
    public void getDeltas(Out<Double> dx, Out<Double> dy) {
        java.util.Objects.requireNonNull(dx, "Parameter 'dx' must not be null");
        java.util.Objects.requireNonNull(dy, "Parameter 'dy' must not be null");
        MemorySegment dxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment dyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            DowncallHandles.gdk_touchpad_event_get_deltas.invokeExact(
                    handle(),
                    (Addressable) dxPOINTER.address(),
                    (Addressable) dyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dx.set(dxPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        dy.set(dyPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    /**
     * Extracts the touchpad gesture phase from a touchpad event.
     * @return the gesture phase of {@code event}
     */
    public @NotNull org.gtk.gdk.TouchpadGesturePhase getGesturePhase() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_touchpad_event_get_gesture_phase.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.TouchpadGesturePhase(RESULT);
    }
    
    /**
     * Extracts the number of fingers from a touchpad event.
     * @return the number of fingers for {@code event}
     */
    public int getNFingers() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_touchpad_event_get_n_fingers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Extracts the angle delta from a touchpad pinch event.
     * @return the angle delta of {@code event}
     */
    public double getPinchAngleDelta() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gdk_touchpad_event_get_pinch_angle_delta.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Extracts the scale from a touchpad pinch event.
     * @return the scale of {@code event}
     */
    public double getPinchScale() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gdk_touchpad_event_get_pinch_scale.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_touchpad_event_get_deltas = Interop.downcallHandle(
            "gdk_touchpad_event_get_deltas",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_touchpad_event_get_gesture_phase = Interop.downcallHandle(
            "gdk_touchpad_event_get_gesture_phase",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_touchpad_event_get_n_fingers = Interop.downcallHandle(
            "gdk_touchpad_event_get_n_fingers",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_touchpad_event_get_pinch_angle_delta = Interop.downcallHandle(
            "gdk_touchpad_event_get_pinch_angle_delta",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_touchpad_event_get_pinch_scale = Interop.downcallHandle(
            "gdk_touchpad_event_get_pinch_scale",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
    }
}
