package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GtkShortcutType specifies the kind of shortcut that is being described.
 * <p>
 * More values may be added to this enumeration over time.
 */
public enum ShortcutType implements io.github.jwharm.javagi.Enumeration {
    /**
     * The shortcut is a keyboard accelerator. The GtkShortcutsShortcut:accelerator
     *   property will be used.
     */
    ACCELERATOR(0),
    /**
     * The shortcut is a pinch gesture. GTK provides an icon and subtitle.
     */
    GESTURE_PINCH(1),
    /**
     * The shortcut is a stretch gesture. GTK provides an icon and subtitle.
     */
    GESTURE_STRETCH(2),
    /**
     * The shortcut is a clockwise rotation gesture. GTK provides an icon and subtitle.
     */
    GESTURE_ROTATE_CLOCKWISE(3),
    /**
     * The shortcut is a counterclockwise rotation gesture. GTK provides an icon and subtitle.
     */
    GESTURE_ROTATE_COUNTERCLOCKWISE(4),
    /**
     * The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_TWO_FINGER_SWIPE_LEFT(5),
    /**
     * The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_TWO_FINGER_SWIPE_RIGHT(6),
    /**
     * The shortcut is a gesture. The GtkShortcutsShortcut:icon property will be
     *   used.
     */
    GESTURE(7),
    /**
     * The shortcut is a swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_SWIPE_LEFT(8),
    /**
     * The shortcut is a swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_SWIPE_RIGHT(9);
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutType";
    
    private final int value;
    ShortcutType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ShortcutType of(int value) {
        return switch (value) {
            case 0 -> ACCELERATOR;
            case 1 -> GESTURE_PINCH;
            case 2 -> GESTURE_STRETCH;
            case 3 -> GESTURE_ROTATE_CLOCKWISE;
            case 4 -> GESTURE_ROTATE_COUNTERCLOCKWISE;
            case 5 -> GESTURE_TWO_FINGER_SWIPE_LEFT;
            case 6 -> GESTURE_TWO_FINGER_SWIPE_RIGHT;
            case 7 -> GESTURE;
            case 8 -> GESTURE_SWIPE_LEFT;
            case 9 -> GESTURE_SWIPE_RIGHT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
