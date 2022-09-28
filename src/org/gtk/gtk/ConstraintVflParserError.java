package org.gtk.gtk;

/**
 * Domain for VFL parsing errors.
 */
public class ConstraintVflParserError {

    /**
     * Invalid or unknown symbol
     */
    public static final ConstraintVflParserError SYMBOL = new ConstraintVflParserError(0);
    
    /**
     * Invalid or unknown attribute
     */
    public static final ConstraintVflParserError ATTRIBUTE = new ConstraintVflParserError(1);
    
    /**
     * Invalid or unknown view
     */
    public static final ConstraintVflParserError VIEW = new ConstraintVflParserError(2);
    
    /**
     * Invalid or unknown metric
     */
    public static final ConstraintVflParserError METRIC = new ConstraintVflParserError(3);
    
    /**
     * Invalid or unknown priority
     */
    public static final ConstraintVflParserError PRIORITY = new ConstraintVflParserError(4);
    
    /**
     * Invalid or unknown relation
     */
    public static final ConstraintVflParserError RELATION = new ConstraintVflParserError(5);
    
    private int value;
    
    public ConstraintVflParserError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ConstraintVflParserError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
