package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GdkEvent</code>s are immutable data structures, created by GDK to
 * represent windowing system events.
 * <p>
 * In GTK applications the events are handled automatically by toplevel
 * widgets and passed on to the event controllers of appropriate widgets,
 * so using <code>GdkEvent</code> and its related API is rarely needed.
 */
public class Event extends org.gtk.gobject.Object {

    public Event(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Event */
    public static Event castFrom(org.gtk.gobject.Object gobject) {
        return new Event(gobject.getReference());
    }
    
    /**
     * Returns the device of an event.
     */
    public Device getDevice() {
        var RESULT = gtk_h.gdk_event_get_device(handle());
        return new Device(References.get(RESULT, false));
    }
    
    /**
     * Returns a <code>GdkDeviceTool</code> representing the tool that
     * caused the event.
     * <p>
     * If the was not generated by a device that supports
     * different tools (such as a tablet), this function will
     * return <code>null</code> 
     * <p>
     * Note: the <code>GdkDeviceTool</code> will be constant during
     * the application lifetime, if settings must be stored
     * persistently across runs, see {@link org.gtk.gdk.DeviceTool<code>#getSerial</code> .
     */
    public DeviceTool getDeviceTool() {
        var RESULT = gtk_h.gdk_event_get_device_tool(handle());
        return new DeviceTool(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the display associated to the @event.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_event_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Retuns the event sequence to which the event belongs.
     * 
     * Related touch events are connected in a sequence. Other
     * events typically don&<code>#39</code> t have event sequence information.
     */
    public EventSequence getEventSequence() {
        var RESULT = gtk_h.gdk_event_get_event_sequence(handle());
        return new EventSequence(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the type of the event.
     */
    public EventType getEventType() {
        var RESULT = gtk_h.gdk_event_get_event_type(handle());
        return EventType.fromValue(RESULT);
    }
    
    /**
     * Returns the modifier state field of an event.
     */
    public int getModifierState() {
        var RESULT = gtk_h.gdk_event_get_modifier_state(handle());
        return RESULT;
    }
    
    /**
     * Returns whether this event is an &<code>#39</code> emulated&<code>#39</code>  pointer event.
     * 
     * Emulated pointer events typically originate from a touch events.
     */
    public boolean getPointerEmulated() {
        var RESULT = gtk_h.gdk_event_get_pointer_emulated(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the seat that originated the event.
     */
    public Seat getSeat() {
        var RESULT = gtk_h.gdk_event_get_seat(handle());
        return new Seat(References.get(RESULT, false));
    }
    
    /**
     * Extracts the surface associated with an event.
     */
    public Surface getSurface() {
        var RESULT = gtk_h.gdk_event_get_surface(handle());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Returns the timestamp of @event.
     * 
     * Not all events have timestamps. In that case, this function
     * returns <code>GDK_CURRENT_TIME</code>
     */
    public int getTime() {
        var RESULT = gtk_h.gdk_event_get_time(handle());
        return RESULT;
    }
    
    /**
     * Increase the ref count of @event.
     */
    public Event ref() {
        var RESULT = gtk_h.gdk_event_ref(handle());
        return new Event(References.get(RESULT, true));
    }
    
    /**
     * Returns whether a <code>GdkEvent</code> should trigger a context menu,
     * according to platform conventions.
     * 
     * The right mouse button typically triggers context menus.
     * 
     * This function should always be used instead of simply checking for
     * event-&<code>#62</code> button == <code>GDK_BUTTON_SECONDARY</code>
     */
    public boolean triggersContextMenu() {
        var RESULT = gtk_h.gdk_event_triggers_context_menu(handle());
        return (RESULT != 0);
    }
    
    /**
     * Decrease the ref count of @event.
     * 
     * If the last reference is dropped, the structure is freed.
     */
    public void unref() {
        gtk_h.gdk_event_unref(handle());
    }
    
}
