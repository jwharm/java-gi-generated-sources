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
     */
    protected Event(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Event> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Event(input);
    
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
    public boolean GetAngle(org.gtk.gdk.Event event2, Out<Double> angle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment anglePOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean GetCenter(org.gtk.gdk.Event event2, Out<Double> x, Out<Double> y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean GetDistance(org.gtk.gdk.Event event2, Out<Double> distance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment distancePOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean getAxes(Out<double[]> axes, Out<Integer> nAxes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment axesPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment nAxesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
            axes.set(MemorySegment.ofAddress(axesPOINTER.get(Interop.valueLayout.ADDRESS, 0), nAxes.get().intValue() * Interop.valueLayout.C_DOUBLE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_DOUBLE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean getAxis(org.gtk.gdk.AxisUse axisUse, Out<Double> value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Returns the device of an event.
     * @return a {@code GdkDevice}
     */
    public @Nullable org.gtk.gdk.Device getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_device.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Device) Interop.register(RESULT, org.gtk.gdk.Device.fromAddress).marshal(RESULT, null);
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_device_tool.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.DeviceTool) Interop.register(RESULT, org.gtk.gdk.DeviceTool.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the display associated to the {@code event}.
     * @return a {@code GdkDisplay}
     */
    public @Nullable org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retuns the event sequence to which the event belongs.
     * <p>
     * Related touch events are connected in a sequence. Other
     * events typically don't have event sequence information.
     * @return the event sequence that the event belongs to
     */
    public org.gtk.gdk.EventSequence getEventSequence() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_event_sequence.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.EventSequence.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the type of the event.
     * @return a {@code GdkEvent}Type
     */
    public org.gtk.gdk.EventType getEventType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_event_get_event_type.invokeExact(handle());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outNCoordsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
                resultARRAY[I] = org.gtk.gdk.TimeCoord.fromAddress.marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Returns the modifier state field of an event.
     * @return the modifier state of {@code event}
     */
    public org.gtk.gdk.ModifierType getModifierState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_event_get_modifier_state.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gdk_event_get_pointer_emulated.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Extract the event surface relative x/y coordinates from an event.
     * @param x location to put event surface x coordinate
     * @param y location to put event surface y coordinate
     */
    public boolean getPosition(Out<Double> x, Out<Double> y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Returns the seat that originated the event.
     * @return a {@code GdkSeat}.
     */
    public @Nullable org.gtk.gdk.Seat getSeat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_seat.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Seat) Interop.register(RESULT, org.gtk.gdk.Seat.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Extracts the surface associated with an event.
     * @return The {@code GdkSurface} associated with the event
     */
    public @Nullable org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_get_surface.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Surface) Interop.register(RESULT, org.gtk.gdk.Surface.fromAddress).marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.gdk_event_get_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Increase the ref count of {@code event}.
     * @return {@code event}
     */
    public org.gtk.gdk.Event ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_event_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gdk.Event) Interop.register(RESULT, org.gtk.gdk.Event.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
            RESULT = (int) DowncallHandles.gdk_event_triggers_context_menu.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Decrease the ref count of {@code event}.
     * <p>
     * If the last reference is dropped, the structure is freed.
     */
    public void unref() {
        try {
            DowncallHandles.gdk_event_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_event_get_type != null;
    }
}
