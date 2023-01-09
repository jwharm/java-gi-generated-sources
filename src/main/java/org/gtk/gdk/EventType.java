package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the event.
 */
public enum EventType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the window manager has requested that the toplevel surface be
     *   hidden or destroyed, usually when the user clicks on a special icon in the
     *   title bar.
     */
    DELETE(0),
    
    /**
     * the pointer (usually a mouse) has moved.
     */
    MOTION_NOTIFY(1),
    
    /**
     * a mouse button has been pressed.
     */
    BUTTON_PRESS(2),
    
    /**
     * a mouse button has been released.
     */
    BUTTON_RELEASE(3),
    
    /**
     * a key has been pressed.
     */
    KEY_PRESS(4),
    
    /**
     * a key has been released.
     */
    KEY_RELEASE(5),
    
    /**
     * the pointer has entered the surface.
     */
    ENTER_NOTIFY(6),
    
    /**
     * the pointer has left the surface.
     */
    LEAVE_NOTIFY(7),
    
    /**
     * the keyboard focus has entered or left the surface.
     */
    FOCUS_CHANGE(8),
    
    /**
     * an input device has moved into contact with a sensing
     *   surface (e.g. a touchscreen or graphics tablet).
     */
    PROXIMITY_IN(9),
    
    /**
     * an input device has moved out of contact with a sensing
     *   surface.
     */
    PROXIMITY_OUT(10),
    
    /**
     * the mouse has entered the surface while a drag is in progress.
     */
    DRAG_ENTER(11),
    
    /**
     * the mouse has left the surface while a drag is in progress.
     */
    DRAG_LEAVE(12),
    
    /**
     * the mouse has moved in the surface while a drag is in
     *   progress.
     */
    DRAG_MOTION(13),
    
    /**
     * a drop operation onto the surface has started.
     */
    DROP_START(14),
    
    /**
     * the scroll wheel was turned
     */
    SCROLL(15),
    
    /**
     * a pointer or keyboard grab was broken.
     */
    GRAB_BROKEN(16),
    
    /**
     * A new touch event sequence has just started.
     */
    TOUCH_BEGIN(17),
    
    /**
     * A touch event sequence has been updated.
     */
    TOUCH_UPDATE(18),
    
    /**
     * A touch event sequence has finished.
     */
    TOUCH_END(19),
    
    /**
     * A touch event sequence has been canceled.
     */
    TOUCH_CANCEL(20),
    
    /**
     * A touchpad swipe gesture event, the current state
     *   is determined by its phase field.
     */
    TOUCHPAD_SWIPE(21),
    
    /**
     * A touchpad pinch gesture event, the current state
     *   is determined by its phase field.
     */
    TOUCHPAD_PINCH(22),
    
    /**
     * A tablet pad button press event.
     */
    PAD_BUTTON_PRESS(23),
    
    /**
     * A tablet pad button release event.
     */
    PAD_BUTTON_RELEASE(24),
    
    /**
     * A tablet pad axis event from a "ring".
     */
    PAD_RING(25),
    
    /**
     * A tablet pad axis event from a "strip".
     */
    PAD_STRIP(26),
    
    /**
     * A tablet pad group mode change.
     */
    PAD_GROUP_MODE(27),
    
    /**
     * A touchpad hold gesture event, the current state
     *   is determined by its phase field. Since: 4.6
     */
    TOUCHPAD_HOLD(28),
    
    /**
     * marks the end of the GdkEventType enumeration.
     */
    EVENT_LAST(29);
    
    private static final java.lang.String C_TYPE_NAME = "GdkEventType";
    
    private final int value;
    
    /**
     * Create a new EventType for the provided value
     * @param numeric value the enum value
     */
    EventType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new EventType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static EventType of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
