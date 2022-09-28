package org.pango;

/**
 * An enumeration specifying the width of the font relative to other designs
 * within a family.
 */
public class Stretch {

    /**
     * ultra condensed width
     */
    public static final Stretch ULTRA_CONDENSED = new Stretch(0);
    
    /**
     * extra condensed width
     */
    public static final Stretch EXTRA_CONDENSED = new Stretch(1);
    
    /**
     * condensed width
     */
    public static final Stretch CONDENSED = new Stretch(2);
    
    /**
     * semi condensed width
     */
    public static final Stretch SEMI_CONDENSED = new Stretch(3);
    
    /**
     * the normal width
     */
    public static final Stretch NORMAL = new Stretch(4);
    
    /**
     * semi expanded width
     */
    public static final Stretch SEMI_EXPANDED = new Stretch(5);
    
    /**
     * expanded width
     */
    public static final Stretch EXPANDED = new Stretch(6);
    
    /**
     * extra expanded width
     */
    public static final Stretch EXTRA_EXPANDED = new Stretch(7);
    
    /**
     * ultra expanded width
     */
    public static final Stretch ULTRA_EXPANDED = new Stretch(8);
    
    private int value;
    
    public Stretch(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Stretch[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
