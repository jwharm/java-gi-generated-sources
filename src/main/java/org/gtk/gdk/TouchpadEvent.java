package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    /**
     * Extracts delta information from a touchpad event.
     */
    public void getDeltas(PointerDouble dx, PointerDouble dy) {
        gtk_h.gdk_touchpad_event_get_deltas(handle(), dx.handle(), dy.handle());
    }
    
    /**
     * Extracts the touchpad gesture phase from a touchpad event.
     */
    public TouchpadGesturePhase getGesturePhase() {
        var RESULT = gtk_h.gdk_touchpad_event_get_gesture_phase(handle());
        return new TouchpadGesturePhase(RESULT);
    }
    
    /**
     * Extracts the number of fingers from a touchpad event.
     */
    public int getNFingers() {
        var RESULT = gtk_h.gdk_touchpad_event_get_n_fingers(handle());
        return RESULT;
    }
    
    /**
     * Extracts the angle delta from a touchpad pinch event.
     */
    public double getPinchAngleDelta() {
        var RESULT = gtk_h.gdk_touchpad_event_get_pinch_angle_delta(handle());
        return RESULT;
    }
    
    /**
     * Extracts the scale from a touchpad pinch event.
     */
    public double getPinchScale() {
        var RESULT = gtk_h.gdk_touchpad_event_get_pinch_scale(handle());
        return RESULT;
    }
    
}
