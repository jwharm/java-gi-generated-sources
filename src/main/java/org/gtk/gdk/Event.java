package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkEvent}s are immutable data structures, created by GDK to
 * represent windowing system events.
 * <p>
 * In GTK applications the events are handled automatically by toplevel
 * widgets and passed on to the event controllers of appropriate widgets,
 * so using {@code GdkEvent} and its related API is rarely needed.
 */
public class Event extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Event proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Event(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Event if its GType is a (or inherits from) "GdkEvent".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Event} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkEvent", a ClassCastException will be thrown.
     */
    public static Event castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Event.getType())) {
            return new Event(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkEvent");
        }
    }
    
    /**
     * Returns the relative angle from {@code event1} to {@code event2}.
     * <p>
     * The relative angle is the angle between the X axis and the line
     * through both events' positions. The rotation direction for positive
     * angles is from the positive X axis towards the positive Y axis.
     * <p>
     * This assumes that both events have X/Y information.
     * If not, this function returns {@code false}.
     * @param event2 second {@code GdkEvent}
     * @param angle return location for the relative angle between both events
     * @return {@code true} if the angle could be calculated.
     */
    public boolean GetAngle(@NotNull org.gtk.gdk.Event event2, Out<Double> angle) {
        java.util.Objects.requireNonNull(event2, "Parameter 'event2' must not be null");
        java.util.Objects.requireNonNull(angle, "Parameter 'angle' must not be null");
        MemorySegment anglePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_events_get_angle.invokeExact(
                    handle(),
                    event2.handle(),
                    (Addressable) anglePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        angle.set(anglePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Returns the point halfway between the events' positions.
     * <p>
     * This assumes that both events have X/Y information.
     * If not, this function returns {@code false}.
     * @param event2 second {@code GdkEvent}
     * @param x return location for the X coordinate of the center
     * @param y return location for the Y coordinate of the center
     * @return {@code true} if the center could be calculated.
     */
    public boolean GetCenter(@NotNull org.gtk.gdk.Event event2, Out<Double> x, Out<Double> y) {
        java.util.Objects.requireNonNull(event2, "Parameter 'event2' must not be null");
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_events_get_center.invokeExact(
                    handle(),
                    event2.handle(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Returns the distance between the event locations.
     * <p>
     * This assumes that both events have X/Y information.
     * If not, this function returns {@code false}.
     * @param event2 second {@code GdkEvent}
     * @param distance return location for the distance
     * @return {@code true} if the distance could be calculated.
     */
    public boolean GetDistance(@NotNull org.gtk.gdk.Event event2, Out<Double> distance) {
        java.util.Objects.requireNonNull(event2, "Parameter 'event2' must not be null");
        java.util.Objects.requireNonNull(distance, "Parameter 'distance' must not be null");
        MemorySegment distancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_events_get_distance.invokeExact(
                    handle(),
                    event2.handle(),
                    (Addressable) distancePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        distance.set(distancePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Extracts all axis values from an event.
     * <p>
     * To find out which axes are used, use {@link DeviceTool#getAxes}
     * on the device tool returned by {@link Event#getDeviceTool}.
     * @param axes the array of values for all axes
     * @param nAxes the length of array
     * @return {@code true} on success, otherwise {@code false}
     */
    public boolean getAxes(@NotNull Out<double[]> axes, Out<Integer> nAxes) {
        java.util.Objects.requireNonNull(axes, "Parameter 'axes' must not be null");
        MemorySegment axesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(nAxes, "Parameter 'nAxes' must not be null");
        MemorySegment nAxesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_event_get_axes.invokeExact(
                    handle(),
                    (Addressable) axesPOINTER.address(),
                    (Addressable) nAxesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nAxes.set(nAxesPOINTER.get(Interop.valueLayout.C_INT, 0));
        axes.set(MemorySegment.ofAddress(axesPOINTER.get(Interop.valueLayout.ADDRESS, 0), nAxes.get().intValue() * Interop.valueLayout.C_DOUBLE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_DOUBLE));
        return RESULT != 0;
    }
    
    /**
     * Extract the axis value for a particular axis use from
     * an event structure.
     * <p>
     * To find out which axes are used, use {@link DeviceTool#getAxes}
     * on the device tool returned by {@link Event#getDeviceTool}.
     * @param axisUse the axis use to look for
     * @param value location to store the value found
     * @return {@code true} if the specified axis was found, otherwise {@code false}
     */
    public boolean getAxis(@NotNull org.gtk.gdk.AxisUse axisUse, Out<Double> value) {
        java.util.Objects.requireNonNull(axisUse, "Parameter 'axisUse' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_event_get_axis.invokeExact(
                    handle(),
                    axisUse.getValue(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Returns the device of an event.
     * @return a {@code GdkDevice}
     */
    public @Nullable org.gtk.gdk.Device getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_device.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Device(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a {@code GdkDeviceTool} representing the tool that
     * caused the event.
     * <p>
     * If the was not generated by a device that supports
     * different tools (such as a tablet), this function will
     * return {@code null}.
     * <p>
     * Note: the {@code GdkDeviceTool} will be constant during
     * the application lifetime, if settings must be stored
     * persistently across runs, see {@link DeviceTool#getSerial}.
     * @return The current device tool
     */
    public @Nullable org.gtk.gdk.DeviceTool getDeviceTool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_device_tool.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DeviceTool(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the display associated to the {@code event}.
     * @return a {@code GdkDisplay}
     */
    public @Nullable org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(RESULT, Ownership.NONE);
    }
    
    /**
     * Retuns the event sequence to which the event belongs.
     * <p>
     * Related touch events are connected in a sequence. Other
     * events typically don't have event sequence information.
     * @return the event sequence that the event belongs to
     */
    public @NotNull org.gtk.gdk.EventSequence getEventSequence() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_event_sequence.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.EventSequence(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the type of the event.
     * @return a {@code GdkEvent}Type
     */
    public @NotNull org.gtk.gdk.EventType getEventType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_event_get_event_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.EventType.of(RESULT);
    }
    
    /**
     * Retrieves the history of the device that {@code event} is for, as a list of
     * time and coordinates.
     * <p>
     * The history includes positions that are not delivered as separate events
     * to the application because they occurred in the same frame as {@code event}.
     * <p>
     * Note that only motion and scroll events record history, and motion
     * events do it only if one of the mouse buttons is down, or the device
     * has a tool.
     * @param outNCoords Return location for the length of the returned array
     * @return an
     *   array of time and coordinates
     */
    public @Nullable org.gtk.gdk.TimeCoord[] getHistory(Out<Integer> outNCoords) {
        java.util.Objects.requireNonNull(outNCoords, "Parameter 'outNCoords' must not be null");
        MemorySegment outNCoordsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_history.invokeExact(
                    handle(),
                    (Addressable) outNCoordsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outNCoords.set(outNCoordsPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        org.gtk.gdk.TimeCoord[] resultARRAY = new org.gtk.gdk.TimeCoord[outNCoords.get().intValue()];
        for (int I = 0; I < outNCoords.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = new org.gtk.gdk.TimeCoord(OBJ, Ownership.CONTAINER);
        }
        return resultARRAY;
    }
    
    /**
     * Returns the modifier state field of an event.
     * @return the modifier state of {@code event}
     */
    public @NotNull org.gtk.gdk.ModifierType getModifierState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_event_get_modifier_state.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    /**
     * Returns whether this event is an 'emulated' pointer event.
     * <p>
     * Emulated pointer events typically originate from a touch events.
     * @return {@code true} if this event is emulated
     */
    public boolean getPointerEmulated() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_event_get_pointer_emulated.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Extract the event surface relative x/y coordinates from an event.
     * @param x location to put event surface x coordinate
     * @param y location to put event surface y coordinate
     */
    public boolean getPosition(Out<Double> x, Out<Double> y) {
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_event_get_position.invokeExact(
                    handle(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Returns the seat that originated the event.
     * @return a {@code GdkSeat}.
     */
    public @Nullable org.gtk.gdk.Seat getSeat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_seat.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Seat(RESULT, Ownership.NONE);
    }
    
    /**
     * Extracts the surface associated with an event.
     * @return The {@code GdkSurface} associated with the event
     */
    public @Nullable org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Surface(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the timestamp of {@code event}.
     * <p>
     * Not all events have timestamps. In that case, this function
     * returns {@code GDK_CURRENT_TIME}.
     * @return timestamp field from {@code event}
     */
    public int getTime() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_event_get_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Increase the ref count of {@code event}.
     * @return {@code event}
     */
    public @NotNull org.gtk.gdk.Event ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Event(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns whether a {@code GdkEvent} should trigger a context menu,
     * according to platform conventions.
     * <p>
     * The right mouse button typically triggers context menus.
     * <p>
     * This function should always be used instead of simply checking for
     * event-&gt;button == {@code GDK_BUTTON_SECONDARY}.
     * @return {@code true} if the event should trigger a context menu.
     */
    public boolean triggersContextMenu() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_event_triggers_context_menu.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Decrease the ref count of {@code event}.
     * <p>
     * If the last reference is dropped, the structure is freed.
     */
    public void unref() {
        try {
            DowncallHandles.gdk_event_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends io.github.jwharm.javagi.Build {
        
         /**
         * A {@link Event.Build} object constructs a {@link Event} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Event} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Event} using {@link Event#castFrom}.
         * @return A new instance of {@code Event} with the properties 
         *         that were set in the Build object.
         */
        public Event construct() {
            return Event.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Event.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_events_get_angle = Interop.downcallHandle(
            "gdk_events_get_angle",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_events_get_center = Interop.downcallHandle(
            "gdk_events_get_center",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_events_get_distance = Interop.downcallHandle(
            "gdk_events_get_distance",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_axes = Interop.downcallHandle(
            "gdk_event_get_axes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_axis = Interop.downcallHandle(
            "gdk_event_get_axis",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_device = Interop.downcallHandle(
            "gdk_event_get_device",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_device_tool = Interop.downcallHandle(
            "gdk_event_get_device_tool",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_display = Interop.downcallHandle(
            "gdk_event_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_event_sequence = Interop.downcallHandle(
            "gdk_event_get_event_sequence",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_event_type = Interop.downcallHandle(
            "gdk_event_get_event_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_history = Interop.downcallHandle(
            "gdk_event_get_history",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_modifier_state = Interop.downcallHandle(
            "gdk_event_get_modifier_state",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_pointer_emulated = Interop.downcallHandle(
            "gdk_event_get_pointer_emulated",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_position = Interop.downcallHandle(
            "gdk_event_get_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_seat = Interop.downcallHandle(
            "gdk_event_get_seat",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_surface = Interop.downcallHandle(
            "gdk_event_get_surface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_time = Interop.downcallHandle(
            "gdk_event_get_time",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_ref = Interop.downcallHandle(
            "gdk_event_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_triggers_context_menu = Interop.downcallHandle(
            "gdk_event_triggers_context_menu",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_unref = Interop.downcallHandle(
            "gdk_event_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_event_get_type = Interop.downcallHandle(
            "gdk_event_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
