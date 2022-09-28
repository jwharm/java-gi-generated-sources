package org.gtk.gtk;

/**
 * List of flags that can be passed to action activation.
 * <p>
 * More flags may be added in the future.
 */
public class ShortcutActionFlags {

    /**
     * The action is the only
     *   action that can be activated. If this flag is not set,
     *   a future activation may select a different action.
     */
    public static final ShortcutActionFlags EXCLUSIVE = new ShortcutActionFlags(1);
    
    private int value;
    
    public ShortcutActionFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ShortcutActionFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public ShortcutActionFlags combined(ShortcutActionFlags mask) {
        return new ShortcutActionFlags(this.getValue() | mask.getValue());
    }
    
    public static ShortcutActionFlags combined(ShortcutActionFlags mask, ShortcutActionFlags... masks) {
        int value = mask.getValue();
        for (ShortcutActionFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ShortcutActionFlags(value);
    }
    
}
