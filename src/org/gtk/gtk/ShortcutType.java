package org.gtk.gtk;

/**
 * GtkShortcutType specifies the kind of shortcut that is being described.
 * 
 * More values may be added to this enumeration over time.
 */
public enum ShortcutType {

    /**
     * The shortcut is a keyboard accelerator. The GtkShortcutsShortcut:accelerator
     *   property will be used.
     */
    ACCELERATOR,
    
    /**
     * The shortcut is a pinch gesture. GTK provides an icon and subtitle.
     */
    GESTURE_PINCH,
    
    /**
     * The shortcut is a stretch gesture. GTK provides an icon and subtitle.
     */
    GESTURE_STRETCH,
    
    /**
     * The shortcut is a clockwise rotation gesture. GTK provides an icon and subtitle.
     */
    GESTURE_ROTATE_CLOCKWISE,
    
    /**
     * The shortcut is a counterclockwise rotation gesture. GTK provides an icon and subtitle.
     */
    GESTURE_ROTATE_COUNTERCLOCKWISE,
    
    /**
     * The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_TWO_FINGER_SWIPE_LEFT,
    
    /**
     * The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_TWO_FINGER_SWIPE_RIGHT,
    
    /**
     * The shortcut is a gesture. The GtkShortcutsShortcut:icon property will be
     *   used.
     */
    GESTURE,
    
    /**
     * The shortcut is a swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_SWIPE_LEFT,
    
    /**
     * The shortcut is a swipe gesture. GTK provides an icon and subtitle.
     */
    GESTURE_SWIPE_RIGHT;
    
    public static ShortcutType fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ACCELERATOR -> 0;
            case GESTURE_PINCH -> 1;
            case GESTURE_STRETCH -> 2;
            case GESTURE_ROTATE_CLOCKWISE -> 3;
            case GESTURE_ROTATE_COUNTERCLOCKWISE -> 4;
            case GESTURE_TWO_FINGER_SWIPE_LEFT -> 5;
            case GESTURE_TWO_FINGER_SWIPE_RIGHT -> 6;
            case GESTURE -> 7;
            case GESTURE_SWIPE_LEFT -> 8;
            case GESTURE_SWIPE_RIGHT -> 9;
        };
    }

}
