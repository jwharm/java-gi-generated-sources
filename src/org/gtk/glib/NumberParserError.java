package org.gtk.glib;

/**
 * Error codes returned by functions converting a string to a number.
 */
public class NumberParserError {

    /**
     * String was not a valid number.
     */
    public static final NumberParserError INVALID = new NumberParserError(0);
    
    /**
     * String was a number, but out of bounds.
     */
    public static final NumberParserError OUT_OF_BOUNDS = new NumberParserError(1);
    
    private int value;
    
    public NumberParserError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(NumberParserError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
