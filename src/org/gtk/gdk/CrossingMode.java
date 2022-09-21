package org.gtk.gdk;

/**
 * Specifies the crossing mode for enter and leave events.
 */
public enum CrossingMode {

    /**
     * crossing because of pointer motion.
     */
    NORMAL,
    
    /**
     * crossing because a grab is activated.
     */
    GRAB,
    
    /**
     * crossing because a grab is deactivated.
     */
    UNGRAB,
    
    /**
     * crossing because a GTK grab is activated.
     */
    GTK_GRAB,
    
    /**
     * crossing because a GTK grab is deactivated.
     */
    GTK_UNGRAB,
    
    /**
     * crossing because a GTK widget changed
     *   state (e.g. sensitivity).
     */
    STATE_CHANGED,
    
    /**
     * crossing because a touch sequence has begun,
     *   this event is synthetic as the pointer might have not left the surface.
     */
    TOUCH_BEGIN,
    
    /**
     * crossing because a touch sequence has ended,
     *   this event is synthetic as the pointer might have not left the surface.
     */
    TOUCH_END,
    
    /**
     * crossing because of a device switch (i.e.
     *   a mouse taking control of the pointer after a touch device), this event
     *   is synthetic as the pointer didn’t leave the surface.
     */
    DEVICE_SWITCH;
    
    public static CrossingMode fromValue(int value) {
        return switch(value) {
            case 0 -> NORMAL;
            case 1 -> GRAB;
            case 2 -> UNGRAB;
            case 3 -> GTK_GRAB;
            case 4 -> GTK_UNGRAB;
            case 5 -> STATE_CHANGED;
            case 6 -> TOUCH_BEGIN;
            case 7 -> TOUCH_END;
            case 8 -> DEVICE_SWITCH;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NORMAL -> 0;
            case GRAB -> 1;
            case UNGRAB -> 2;
            case GTK_GRAB -> 3;
            case GTK_UNGRAB -> 4;
            case STATE_CHANGED -> 5;
            case TOUCH_BEGIN -> 6;
            case TOUCH_END -> 7;
            case DEVICE_SWITCH -> 8;
        };
    }

}
