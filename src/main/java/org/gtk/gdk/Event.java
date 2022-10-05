package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GdkEvent}s are immutable data structures, created by GDK to
 * represent windowing system events.
 * <p>
 * In GTK applications the events are handled automatically by toplevel
 * widgets and passed on to the event controllers of appropriate widgets,
 * so using {@code GdkEvent} and its related API is rarely needed.
 */
public class Event extends org.gtk.gobject.Object {

    public Event(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Event */
    public static Event castFrom(org.gtk.gobject.Object gobject) {
        return new Event(gobject.refcounted());
    }
    
    static final MethodHandle gdk_events_get_angle = Interop.downcallHandle(
        "gdk_events_get_angle",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the relative angle from {@code event1} to {@code event2}.
     * <p>
     * The relative angle is the angle between the X axis and the line
     * through both events' positions. The rotation direction for positive
     * angles is from the positive X axis towards the positive Y axis.
     * <p>
     * This assumes that both events have X/Y information.
     * If not, this function returns {@code false}.
     */
    public boolean GetAngle(Event event2, PointerDouble angle) {
        try {
            var RESULT = (int) gdk_events_get_angle.invokeExact(handle(), event2.handle(), angle.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_events_get_center = Interop.downcallHandle(
        "gdk_events_get_center",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the point halfway between the events' positions.
     * <p>
     * This assumes that both events have X/Y information.
     * If not, this function returns {@code false}.
     */
    public boolean GetCenter(Event event2, PointerDouble x, PointerDouble y) {
        try {
            var RESULT = (int) gdk_events_get_center.invokeExact(handle(), event2.handle(), x.handle(), y.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_events_get_distance = Interop.downcallHandle(
        "gdk_events_get_distance",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the distance between the event locations.
     * <p>
     * This assumes that both events have X/Y information.
     * If not, this function returns {@code false}.
     */
    public boolean GetDistance(Event event2, PointerDouble distance) {
        try {
            var RESULT = (int) gdk_events_get_distance.invokeExact(handle(), event2.handle(), distance.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_axes = Interop.downcallHandle(
        "gdk_event_get_axes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts all axis values from an event.
     * <p>
     * To find out which axes are used, use {@link DeviceTool#getAxes}
     * on the device tool returned by {@link Event#getDeviceTool}.
     */
    public boolean getAxes(double[] axes, PointerInteger nAxes) {
        try {
            var RESULT = (int) gdk_event_get_axes.invokeExact(handle(), Interop.allocateNativeArray(axes).handle(), nAxes.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_axis = Interop.downcallHandle(
        "gdk_event_get_axis",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extract the axis value for a particular axis use from
     * an event structure.
     * <p>
     * To find out which axes are used, use {@link DeviceTool#getAxes}
     * on the device tool returned by {@link Event#getDeviceTool}.
     */
    public boolean getAxis(AxisUse axisUse, PointerDouble value) {
        try {
            var RESULT = (int) gdk_event_get_axis.invokeExact(handle(), axisUse.getValue(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_device = Interop.downcallHandle(
        "gdk_event_get_device",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the device of an event.
     */
    public Device getDevice() {
        try {
            var RESULT = (MemoryAddress) gdk_event_get_device.invokeExact(handle());
            return new Device(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_device_tool = Interop.downcallHandle(
        "gdk_event_get_device_tool",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public DeviceTool getDeviceTool() {
        try {
            var RESULT = (MemoryAddress) gdk_event_get_device_tool.invokeExact(handle());
            return new DeviceTool(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_display = Interop.downcallHandle(
        "gdk_event_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the display associated to the {@code event}.
     */
    public Display getDisplay() {
        try {
            var RESULT = (MemoryAddress) gdk_event_get_display.invokeExact(handle());
            return new Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_event_sequence = Interop.downcallHandle(
        "gdk_event_get_event_sequence",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retuns the event sequence to which the event belongs.
     * <p>
     * Related touch events are connected in a sequence. Other
     * events typically don't have event sequence information.
     */
    public EventSequence getEventSequence() {
        try {
            var RESULT = (MemoryAddress) gdk_event_get_event_sequence.invokeExact(handle());
            return new EventSequence(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_event_type = Interop.downcallHandle(
        "gdk_event_get_event_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the type of the event.
     */
    public EventType getEventType() {
        try {
            var RESULT = (int) gdk_event_get_event_type.invokeExact(handle());
            return new EventType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_history = Interop.downcallHandle(
        "gdk_event_get_history",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public PointerIterator<TimeCoord> getHistory(PointerInteger outNCoords) {
        try {
            var RESULT = (MemoryAddress) gdk_event_get_history.invokeExact(handle(), outNCoords.handle());
            return new PointerProxy<TimeCoord>(RESULT, TimeCoord.class).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_modifier_state = Interop.downcallHandle(
        "gdk_event_get_modifier_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the modifier state field of an event.
     */
    public ModifierType getModifierState() {
        try {
            var RESULT = (int) gdk_event_get_modifier_state.invokeExact(handle());
            return new ModifierType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_pointer_emulated = Interop.downcallHandle(
        "gdk_event_get_pointer_emulated",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether this event is an 'emulated' pointer event.
     * <p>
     * Emulated pointer events typically originate from a touch events.
     */
    public boolean getPointerEmulated() {
        try {
            var RESULT = (int) gdk_event_get_pointer_emulated.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_position = Interop.downcallHandle(
        "gdk_event_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extract the event surface relative x/y coordinates from an event.
     */
    public boolean getPosition(PointerDouble x, PointerDouble y) {
        try {
            var RESULT = (int) gdk_event_get_position.invokeExact(handle(), x.handle(), y.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_seat = Interop.downcallHandle(
        "gdk_event_get_seat",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the seat that originated the event.
     */
    public Seat getSeat() {
        try {
            var RESULT = (MemoryAddress) gdk_event_get_seat.invokeExact(handle());
            return new Seat(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_surface = Interop.downcallHandle(
        "gdk_event_get_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the surface associated with an event.
     */
    public Surface getSurface() {
        try {
            var RESULT = (MemoryAddress) gdk_event_get_surface.invokeExact(handle());
            return new Surface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_get_time = Interop.downcallHandle(
        "gdk_event_get_time",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the timestamp of {@code event}.
     * <p>
     * Not all events have timestamps. In that case, this function
     * returns {@code GDK_CURRENT_TIME}.
     */
    public int getTime() {
        try {
            var RESULT = (int) gdk_event_get_time.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_ref = Interop.downcallHandle(
        "gdk_event_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increase the ref count of {@code event}.
     */
    public Event ref() {
        try {
            var RESULT = (MemoryAddress) gdk_event_ref.invokeExact(handle());
            return new Event(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_triggers_context_menu = Interop.downcallHandle(
        "gdk_event_triggers_context_menu",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether a {@code GdkEvent} should trigger a context menu,
     * according to platform conventions.
     * <p>
     * The right mouse button typically triggers context menus.
     * <p>
     * This function should always be used instead of simply checking for
     * event->button == {@code GDK_BUTTON_SECONDARY}.
     */
    public boolean triggersContextMenu() {
        try {
            var RESULT = (int) gdk_event_triggers_context_menu.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_event_unref = Interop.downcallHandle(
        "gdk_event_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrease the ref count of {@code event}.
     * <p>
     * If the last reference is dropped, the structure is freed.
     */
    public void unref() {
        try {
            gdk_event_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
