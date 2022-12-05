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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TouchpadEvent.getType())) {
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
        MemorySegment dxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(dy, "Parameter 'dy' must not be null");
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
    public @NotNull org.gtk.gdk.TouchpadGesturePhase getGesturePhase() {
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_touchpad_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdk.Event.Build {
        
         /**
         * A {@link TouchpadEvent.Build} object constructs a {@link TouchpadEvent} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TouchpadEvent} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TouchpadEvent} using {@link TouchpadEvent#castFrom}.
         * @return A new instance of {@code TouchpadEvent} with the properties 
         *         that were set in the Build object.
         */
        public TouchpadEvent construct() {
            return TouchpadEvent.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TouchpadEvent.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
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
