package org.gtk.gtk;

/**
 * Describes where {@link Shortcut}s added to a
 * {@link ShortcutController} get handled.
 */
public class ShortcutScope {

    /**
     * Shortcuts are handled inside
     *   the widget the controller belongs to.
     */
    public static final ShortcutScope LOCAL = new ShortcutScope(0);
    
    /**
     * Shortcuts are handled by
     *   the first ancestor that is a {@code ShortcutManager}
     */
    public static final ShortcutScope MANAGED = new ShortcutScope(1);
    
    /**
     * Shortcuts are handled by
     *   the root widget.
     */
    public static final ShortcutScope GLOBAL = new ShortcutScope(2);
    
    private int value;
    
    public ShortcutScope(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ShortcutScope[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
