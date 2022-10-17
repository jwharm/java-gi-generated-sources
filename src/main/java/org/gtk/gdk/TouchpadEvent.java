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
public class TouchpadEvent extends Event {

    public TouchpadEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TouchpadEvent */
    public static TouchpadEvent castFrom(org.gtk.gobject.Object gobject) {
        return new TouchpadEvent(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_touchpad_event_get_deltas = Interop.downcallHandle(
        "gdk_touchpad_event_get_deltas",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts delta information from a touchpad event.
     */
    public @NotNull void getDeltas(@NotNull Out<Double> dx, @NotNull Out<Double> dy) {
        MemorySegment dxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment dyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            gdk_touchpad_event_get_deltas.invokeExact(handle(), (Addressable) dxPOINTER.address(), (Addressable) dyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dx.set(dxPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        dy.set(dyPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    private static final MethodHandle gdk_touchpad_event_get_gesture_phase = Interop.downcallHandle(
        "gdk_touchpad_event_get_gesture_phase",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the touchpad gesture phase from a touchpad event.
     */
    public @NotNull TouchpadGesturePhase getGesturePhase() {
        int RESULT;
        try {
            RESULT = (int) gdk_touchpad_event_get_gesture_phase.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TouchpadGesturePhase(RESULT);
    }
    
    private static final MethodHandle gdk_touchpad_event_get_n_fingers = Interop.downcallHandle(
        "gdk_touchpad_event_get_n_fingers",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the number of fingers from a touchpad event.
     */
    public int getNFingers() {
        int RESULT;
        try {
            RESULT = (int) gdk_touchpad_event_get_n_fingers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_touchpad_event_get_pinch_angle_delta = Interop.downcallHandle(
        "gdk_touchpad_event_get_pinch_angle_delta",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the angle delta from a touchpad pinch event.
     */
    public double getPinchAngleDelta() {
        double RESULT;
        try {
            RESULT = (double) gdk_touchpad_event_get_pinch_angle_delta.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_touchpad_event_get_pinch_scale = Interop.downcallHandle(
        "gdk_touchpad_event_get_pinch_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the scale from a touchpad pinch event.
     */
    public double getPinchScale() {
        double RESULT;
        try {
            RESULT = (double) gdk_touchpad_event_get_pinch_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
