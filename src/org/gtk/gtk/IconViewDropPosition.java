package org.gtk.gtk;

/**
 * An enum for determining where a dropped item goes.
 */
public class IconViewDropPosition {

    /**
     * no drop possible
     */
    public static final IconViewDropPosition NO_DROP = new IconViewDropPosition(0);
    
    /**
     * dropped item replaces the item
     */
    public static final IconViewDropPosition DROP_INTO = new IconViewDropPosition(1);
    
    /**
     * dropped item is inserted to the left
     */
    public static final IconViewDropPosition DROP_LEFT = new IconViewDropPosition(2);
    
    /**
     * dropped item is inserted to the right
     */
    public static final IconViewDropPosition DROP_RIGHT = new IconViewDropPosition(3);
    
    /**
     * dropped item is inserted above
     */
    public static final IconViewDropPosition DROP_ABOVE = new IconViewDropPosition(4);
    
    /**
     * dropped item is inserted below
     */
    public static final IconViewDropPosition DROP_BELOW = new IconViewDropPosition(5);
    
    private int value;
    
    public IconViewDropPosition(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(IconViewDropPosition[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
