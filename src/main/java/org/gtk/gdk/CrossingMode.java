package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the crossing mode for enter and leave events.
 */
public enum CrossingMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * crossing because of pointer motion.
     */
    NORMAL(0),
    /**
     * crossing because a grab is activated.
     */
    GRAB(1),
    /**
     * crossing because a grab is deactivated.
     */
    UNGRAB(2),
    /**
     * crossing because a GTK grab is activated.
     */
    GTK_GRAB(3),
    /**
     * crossing because a GTK grab is deactivated.
     */
    GTK_UNGRAB(4),
    /**
     * crossing because a GTK widget changed
     *   state (e.g. sensitivity).
     */
    STATE_CHANGED(5),
    /**
     * crossing because a touch sequence has begun,
     *   this event is synthetic as the pointer might have not left the surface.
     */
    TOUCH_BEGIN(6),
    /**
     * crossing because a touch sequence has ended,
     *   this event is synthetic as the pointer might have not left the surface.
     */
    TOUCH_END(7),
    /**
     * crossing because of a device switch (i.e.
     *   a mouse taking control of the pointer after a touch device), this event
     *   is synthetic as the pointer didn’t leave the surface.
     */
    DEVICE_SWITCH(8);
    
    private static final java.lang.String C_TYPE_NAME = "GdkCrossingMode";
    
    private final int value;
    CrossingMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static CrossingMode of(int value) {
        return switch (value) {
            case 0 -> NORMAL;
            case 1 -> GRAB;
            case 2 -> UNGRAB;
            case 3 -> GTK_GRAB;
            case 4 -> GTK_UNGRAB;
            case 5 -> STATE_CHANGED;
            case 6 -> TOUCH_BEGIN;
            case 7 -> TOUCH_END;
            case 8 -> DEVICE_SWITCH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
