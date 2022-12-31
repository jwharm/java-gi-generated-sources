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
    protected TouchpadEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TouchpadEvent> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TouchpadEvent(input, ownership);
    
    /**
     * Extracts delta information from a touchpad event.
     * @param dx return location for x
     * @param dy return location for y
     */
    public void getDeltas(Out<Double> dx, Out<Double> dy) {
        MemorySegment dxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment dyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        try {
            DowncallHandles.gdk_touchpad_event_get_deltas.invokeExact(
                    handle(),
                    (Addressable) dxPOINTER.address(),
                    (Addressable) dyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dx.set(dxPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        dy.set(dyPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
    }
    
    /**
     * Extracts the touchpad gesture phase from a touchpad event.
     * @return the gesture phase of {@code event}
     */
    public org.gtk.gdk.TouchpadGesturePhase getGesturePhase() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_touchpad_event_get_gesture_phase.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.TouchpadGesturePhase.of(RESULT);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_touchpad_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_touchpad_event_get_deltas = Interop.downcallHandle(
            "gdk_touchpad_event_get_deltas",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_touchpad_event_get_gesture_phase = Interop.downcallHandle(
            "gdk_touchpad_event_get_gesture_phase",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_touchpad_event_get_n_fingers = Interop.downcallHandle(
            "gdk_touchpad_event_get_n_fingers",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_touchpad_event_get_pinch_angle_delta = Interop.downcallHandle(
            "gdk_touchpad_event_get_pinch_angle_delta",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_touchpad_event_get_pinch_scale = Interop.downcallHandle(
            "gdk_touchpad_event_get_pinch_scale",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_touchpad_event_get_type = Interop.downcallHandle(
            "gdk_touchpad_event_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
