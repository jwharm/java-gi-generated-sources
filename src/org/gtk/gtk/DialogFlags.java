package org.gtk.gtk;

/**
 * Flags used to influence dialog construction.
 */
public class DialogFlags {

    /**
     * Make the constructed dialog modal
     */
    public static final DialogFlags MODAL = new DialogFlags(1);
    
    /**
     * Destroy the dialog when its parent is destroyed
     */
    public static final DialogFlags DESTROY_WITH_PARENT = new DialogFlags(2);
    
    /**
     * Create dialog with actions in header
     *   bar instead of action area
     */
    public static final DialogFlags USE_HEADER_BAR = new DialogFlags(4);
    
    private int value;
    
    public DialogFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DialogFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DialogFlags combined(DialogFlags mask) {
        return new DialogFlags(this.getValue() | mask.getValue());
    }
    
    public static DialogFlags combined(DialogFlags mask, DialogFlags... masks) {
        int value = mask.getValue();
        for (DialogFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DialogFlags(value);
    }
    
}
