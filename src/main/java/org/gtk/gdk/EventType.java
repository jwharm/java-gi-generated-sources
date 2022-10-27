package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the event.
 */
public class EventType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * the window manager has requested that the toplevel surface be
     *   hidden or destroyed, usually when the user clicks on a special icon in the
     *   title bar.
     */
    public static final EventType DELETE = new EventType(0);
    
    /**
     * the pointer (usually a mouse) has moved.
     */
    public static final EventType MOTION_NOTIFY = new EventType(1);
    
    /**
     * a mouse button has been pressed.
     */
    public static final EventType BUTTON_PRESS = new EventType(2);
    
    /**
     * a mouse button has been released.
     */
    public static final EventType BUTTON_RELEASE = new EventType(3);
    
    /**
     * a key has been pressed.
     */
    public static final EventType KEY_PRESS = new EventType(4);
    
    /**
     * a key has been released.
     */
    public static final EventType KEY_RELEASE = new EventType(5);
    
    /**
     * the pointer has entered the surface.
     */
    public static final EventType ENTER_NOTIFY = new EventType(6);
    
    /**
     * the pointer has left the surface.
     */
    public static final EventType LEAVE_NOTIFY = new EventType(7);
    
    /**
     * the keyboard focus has entered or left the surface.
     */
    public static final EventType FOCUS_CHANGE = new EventType(8);
    
    /**
     * an input device has moved into contact with a sensing
     *   surface (e.g. a touchscreen or graphics tablet).
     */
    public static final EventType PROXIMITY_IN = new EventType(9);
    
    /**
     * an input device has moved out of contact with a sensing
     *   surface.
     */
    public static final EventType PROXIMITY_OUT = new EventType(10);
    
    /**
     * the mouse has entered the surface while a drag is in progress.
     */
    public static final EventType DRAG_ENTER = new EventType(11);
    
    /**
     * the mouse has left the surface while a drag is in progress.
     */
    public static final EventType DRAG_LEAVE = new EventType(12);
    
    /**
     * the mouse has moved in the surface while a drag is in
     *   progress.
     */
    public static final EventType DRAG_MOTION = new EventType(13);
    
    /**
     * a drop operation onto the surface has started.
     */
    public static final EventType DROP_START = new EventType(14);
    
    /**
     * the scroll wheel was turned
     */
    public static final EventType SCROLL = new EventType(15);
    
    /**
     * a pointer or keyboard grab was broken.
     */
    public static final EventType GRAB_BROKEN = new EventType(16);
    
    /**
     * A new touch event sequence has just started.
     */
    public static final EventType TOUCH_BEGIN = new EventType(17);
    
    /**
     * A touch event sequence has been updated.
     */
    public static final EventType TOUCH_UPDATE = new EventType(18);
    
    /**
     * A touch event sequence has finished.
     */
    public static final EventType TOUCH_END = new EventType(19);
    
    /**
     * A touch event sequence has been canceled.
     */
    public static final EventType TOUCH_CANCEL = new EventType(20);
    
    /**
     * A touchpad swipe gesture event, the current state
     *   is determined by its phase field.
     */
    public static final EventType TOUCHPAD_SWIPE = new EventType(21);
    
    /**
     * A touchpad pinch gesture event, the current state
     *   is determined by its phase field.
     */
    public static final EventType TOUCHPAD_PINCH = new EventType(22);
    
    /**
     * A tablet pad button press event.
     */
    public static final EventType PAD_BUTTON_PRESS = new EventType(23);
    
    /**
     * A tablet pad button release event.
     */
    public static final EventType PAD_BUTTON_RELEASE = new EventType(24);
    
    /**
     * A tablet pad axis event from a "ring".
     */
    public static final EventType PAD_RING = new EventType(25);
    
    /**
     * A tablet pad axis event from a "strip".
     */
    public static final EventType PAD_STRIP = new EventType(26);
    
    /**
     * A tablet pad group mode change.
     */
    public static final EventType PAD_GROUP_MODE = new EventType(27);
    
    /**
     * A touchpad hold gesture event, the current state
     *   is determined by its phase field. Since: 4.6
     */
    public static final EventType TOUCHPAD_HOLD = new EventType(28);
    
    /**
     * marks the end of the GdkEventType enumeration.
     */
    public static final EventType EVENT_LAST = new EventType(29);
    
    public EventType(int value) {
        super(value);
    }
}
