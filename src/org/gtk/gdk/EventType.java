package org.gtk.gdk;

/**
 * Specifies the type of the event.
 */
public enum EventType {

    /**
     * the window manager has requested that the toplevel surface be
     *   hidden or destroyed, usually when the user clicks on a special icon in the
     *   title bar.
     */
    DELETE,
    
    /**
     * the pointer (usually a mouse) has moved.
     */
    MOTION_NOTIFY,
    
    /**
     * a mouse button has been pressed.
     */
    BUTTON_PRESS,
    
    /**
     * a mouse button has been released.
     */
    BUTTON_RELEASE,
    
    /**
     * a key has been pressed.
     */
    KEY_PRESS,
    
    /**
     * a key has been released.
     */
    KEY_RELEASE,
    
    /**
     * the pointer has entered the surface.
     */
    ENTER_NOTIFY,
    
    /**
     * the pointer has left the surface.
     */
    LEAVE_NOTIFY,
    
    /**
     * the keyboard focus has entered or left the surface.
     */
    FOCUS_CHANGE,
    
    /**
     * an input device has moved into contact with a sensing
     *   surface (e.g. a touchscreen or graphics tablet).
     */
    PROXIMITY_IN,
    
    /**
     * an input device has moved out of contact with a sensing
     *   surface.
     */
    PROXIMITY_OUT,
    
    /**
     * the mouse has entered the surface while a drag is in progress.
     */
    DRAG_ENTER,
    
    /**
     * the mouse has left the surface while a drag is in progress.
     */
    DRAG_LEAVE,
    
    /**
     * the mouse has moved in the surface while a drag is in
     *   progress.
     */
    DRAG_MOTION,
    
    /**
     * a drop operation onto the surface has started.
     */
    DROP_START,
    
    /**
     * the scroll wheel was turned
     */
    SCROLL,
    
    /**
     * a pointer or keyboard grab was broken.
     */
    GRAB_BROKEN,
    
    /**
     * A new touch event sequence has just started.
     */
    TOUCH_BEGIN,
    
    /**
     * A touch event sequence has been updated.
     */
    TOUCH_UPDATE,
    
    /**
     * A touch event sequence has finished.
     */
    TOUCH_END,
    
    /**
     * A touch event sequence has been canceled.
     */
    TOUCH_CANCEL,
    
    /**
     * A touchpad swipe gesture event, the current state
     *   is determined by its phase field.
     */
    TOUCHPAD_SWIPE,
    
    /**
     * A touchpad pinch gesture event, the current state
     *   is determined by its phase field.
     */
    TOUCHPAD_PINCH,
    
    /**
     * A tablet pad button press event.
     */
    PAD_BUTTON_PRESS,
    
    /**
     * A tablet pad button release event.
     */
    PAD_BUTTON_RELEASE,
    
    /**
     * A tablet pad axis event from a "ring".
     */
    PAD_RING,
    
    /**
     * A tablet pad axis event from a "strip".
     */
    PAD_STRIP,
    
    /**
     * A tablet pad group mode change.
     */
    PAD_GROUP_MODE,
    
    /**
     * A touchpad hold gesture event, the current state
     *   is determined by its phase field. Since: 4.6
     */
    TOUCHPAD_HOLD,
    
    /**
     * marks the end of the GdkEventType enumeration.
     */
    EVENT_LAST;
    
    public static EventType fromValue(int value) {
        return switch(value) {
            case 0 -> DELETE;
            case 1 -> MOTION_NOTIFY;
            case 2 -> BUTTON_PRESS;
            case 3 -> BUTTON_RELEASE;
            case 4 -> KEY_PRESS;
            case 5 -> KEY_RELEASE;
            case 6 -> ENTER_NOTIFY;
            case 7 -> LEAVE_NOTIFY;
            case 8 -> FOCUS_CHANGE;
            case 9 -> PROXIMITY_IN;
            case 10 -> PROXIMITY_OUT;
            case 11 -> DRAG_ENTER;
            case 12 -> DRAG_LEAVE;
            case 13 -> DRAG_MOTION;
            case 14 -> DROP_START;
            case 15 -> SCROLL;
            case 16 -> GRAB_BROKEN;
            case 17 -> TOUCH_BEGIN;
            case 18 -> TOUCH_UPDATE;
            case 19 -> TOUCH_END;
            case 20 -> TOUCH_CANCEL;
            case 21 -> TOUCHPAD_SWIPE;
            case 22 -> TOUCHPAD_PINCH;
            case 23 -> PAD_BUTTON_PRESS;
            case 24 -> PAD_BUTTON_RELEASE;
            case 25 -> PAD_RING;
            case 26 -> PAD_STRIP;
            case 27 -> PAD_GROUP_MODE;
            case 28 -> TOUCHPAD_HOLD;
            case 29 -> EVENT_LAST;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DELETE -> 0;
            case MOTION_NOTIFY -> 1;
            case BUTTON_PRESS -> 2;
            case BUTTON_RELEASE -> 3;
            case KEY_PRESS -> 4;
            case KEY_RELEASE -> 5;
            case ENTER_NOTIFY -> 6;
            case LEAVE_NOTIFY -> 7;
            case FOCUS_CHANGE -> 8;
            case PROXIMITY_IN -> 9;
            case PROXIMITY_OUT -> 10;
            case DRAG_ENTER -> 11;
            case DRAG_LEAVE -> 12;
            case DRAG_MOTION -> 13;
            case DROP_START -> 14;
            case SCROLL -> 15;
            case GRAB_BROKEN -> 16;
            case TOUCH_BEGIN -> 17;
            case TOUCH_UPDATE -> 18;
            case TOUCH_END -> 19;
            case TOUCH_CANCEL -> 20;
            case TOUCHPAD_SWIPE -> 21;
            case TOUCHPAD_PINCH -> 22;
            case PAD_BUTTON_PRESS -> 23;
            case PAD_BUTTON_RELEASE -> 24;
            case PAD_RING -> 25;
            case PAD_STRIP -> 26;
            case PAD_GROUP_MODE -> 27;
            case TOUCHPAD_HOLD -> 28;
            case EVENT_LAST -> 29;
        };
    }

}
