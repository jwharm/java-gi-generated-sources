package org.gtk.gtk;

/**
 * GtkShortcutType specifies the kind of shortcut that is being described.
 * <p>
 * More values may be added to this enumeration over time.
 */
public class ShortcutType {

    /**
     * The shortcut is a keyboard accelerator. The GtkShortcutsShortcut:accelerator
     *   property will be used.
     */
    public static final ShortcutType ACCELERATOR = new ShortcutType(0);
    
    /**
     * The shortcut is a pinch gesture. GTK provides an icon and subtitle.
     */
    public static final ShortcutType GESTURE_PINCH = new ShortcutType(1);
    
    /**
     * The shortcut is a stretch gesture. GTK provides an icon and subtitle.
     */
    public static final ShortcutType GESTURE_STRETCH = new ShortcutType(2);
    
    /**
     * The shortcut is a clockwise rotation gesture. GTK provides an icon and subtitle.
     */
    public static final ShortcutType GESTURE_ROTATE_CLOCKWISE = new ShortcutType(3);
    
    /**
     * The shortcut is a counterclockwise rotation gesture. GTK provides an icon and subtitle.
     */
    public static final ShortcutType GESTURE_ROTATE_COUNTERCLOCKWISE = new ShortcutType(4);
    
    /**
     * The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle.
     */
    public static final ShortcutType GESTURE_TWO_FINGER_SWIPE_LEFT = new ShortcutType(5);
    
    /**
     * The shortcut is a two-finger swipe gesture. GTK provides an icon and subtitle.
     */
    public static final ShortcutType GESTURE_TWO_FINGER_SWIPE_RIGHT = new ShortcutType(6);
    
    /**
     * The shortcut is a gesture. The GtkShortcutsShortcut:icon property will be
     *   used.
     */
    public static final ShortcutType GESTURE = new ShortcutType(7);
    
    /**
     * The shortcut is a swipe gesture. GTK provides an icon and subtitle.
     */
    public static final ShortcutType GESTURE_SWIPE_LEFT = new ShortcutType(8);
    
    /**
     * The shortcut is a swipe gesture. GTK provides an icon and subtitle.
     */
    public static final ShortcutType GESTURE_SWIPE_RIGHT = new ShortcutType(9);
    
    private int value;
    
    public ShortcutType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ShortcutType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
