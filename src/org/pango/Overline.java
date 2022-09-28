package org.pango;

/**
 * The {@code PangoOverline} enumeration is used to specify whether text
 * should be overlined, and if so, the type of line.
 */
public class Overline {

    /**
     * no overline should be drawn
     */
    public static final Overline NONE = new Overline(0);
    
    /**
     * Draw a single line above the ink
     *   extents of the text being underlined.
     */
    public static final Overline SINGLE = new Overline(1);
    
    private int value;
    
    public Overline(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Overline[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
