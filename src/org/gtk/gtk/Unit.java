package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_paper_width().
 */
public class Unit {

    /**
     * No units.
     */
    public static final Unit NONE = new Unit(0);
    
    /**
     * Dimensions in points.
     */
    public static final Unit POINTS = new Unit(1);
    
    /**
     * Dimensions in inches.
     */
    public static final Unit INCH = new Unit(2);
    
    /**
     * Dimensions in millimeters
     */
    public static final Unit MM = new Unit(3);
    
    private int value;
    
    public Unit(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Unit[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
