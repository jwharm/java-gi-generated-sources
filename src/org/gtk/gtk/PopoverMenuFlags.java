package org.gtk.gtk;

/**
 * Flags that affect how popover menus are created from
 * a menu model.
 */
public class PopoverMenuFlags {

    /**
     * Create submenus as nested
     *    popovers. Without this flag, submenus are created as
     *    sliding pages that replace the main menu.
     */
    public static final PopoverMenuFlags NESTED = new PopoverMenuFlags(1);
    
    private int value;
    
    public PopoverMenuFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PopoverMenuFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public PopoverMenuFlags combined(PopoverMenuFlags mask) {
        return new PopoverMenuFlags(this.getValue() | mask.getValue());
    }
    
    public static PopoverMenuFlags combined(PopoverMenuFlags mask, PopoverMenuFlags... masks) {
        int value = mask.getValue();
        for (PopoverMenuFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PopoverMenuFlags(value);
    }
    
}
