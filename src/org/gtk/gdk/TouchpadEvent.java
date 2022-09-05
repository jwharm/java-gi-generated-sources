package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a gesture on a touchpad device.
 * 
 * Unlike touchscreens, where the windowing system sends basic
 * sequences of begin, update, end events, and leaves gesture
 * recognition to the clients, touchpad gestures are typically
 * processed by the system, resulting in these events.
 */
public class TouchpadEvent extends Event {

    public TouchpadEvent(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to TouchpadEvent */
    public static TouchpadEvent castFrom(org.gtk.gobject.Object gobject) {
        return new TouchpadEvent(gobject.getProxy());
    }
    
    /**
     * Extracts the touchpad gesture phase from a touchpad event.
     */
    public TouchpadGesturePhase getGesturePhase() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_touchpad_event_get_gesture_phase(HANDLE());
        return TouchpadGesturePhase.fromValue(RESULT);
    }
    
    /**
     * Extracts the number of fingers from a touchpad event.
     */
    public int getNFingers() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_touchpad_event_get_n_fingers(HANDLE());
        return RESULT;
    }
    
    /**
     * Extracts the angle delta from a touchpad pinch event.
     */
    public double getPinchAngleDelta() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_touchpad_event_get_pinch_angle_delta(HANDLE());
        return RESULT;
    }
    
    /**
     * Extracts the scale from a touchpad pinch event.
     */
    public double getPinchScale() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_touchpad_event_get_pinch_scale(HANDLE());
        return RESULT;
    }
    
}
