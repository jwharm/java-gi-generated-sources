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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public TouchpadEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TouchpadEvent */
    public static TouchpadEvent castFrom(org.gtk.gobject.Object gobject) {
        return new TouchpadEvent(gobject.refcounted());
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
            DowncallHandles.gdk_touchpad_event_get_deltas.invokeExact(handle(), (Addressable) dxPOINTER.address(), (Addressable) dyPOINTER.address());
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
            RESULT = (int) DowncallHandles.gdk_touchpad_event_get_gesture_phase.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gdk_touchpad_event_get_n_fingers.invokeExact(handle());
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
            RESULT = (double) DowncallHandles.gdk_touchpad_event_get_pinch_angle_delta.invokeExact(handle());
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
            RESULT = (double) DowncallHandles.gdk_touchpad_event_get_pinch_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_touchpad_event_get_deltas = Interop.downcallHandle(
            "gdk_touchpad_event_get_deltas",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_touchpad_event_get_gesture_phase = Interop.downcallHandle(
            "gdk_touchpad_event_get_gesture_phase",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_touchpad_event_get_n_fingers = Interop.downcallHandle(
            "gdk_touchpad_event_get_n_fingers",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_touchpad_event_get_pinch_angle_delta = Interop.downcallHandle(
            "gdk_touchpad_event_get_pinch_angle_delta",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_touchpad_event_get_pinch_scale = Interop.downcallHandle(
            "gdk_touchpad_event_get_pinch_scale",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
    }
}
