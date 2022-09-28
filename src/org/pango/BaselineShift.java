package org.pango;

/**
 * An enumeration that affects baseline shifts between runs.
 */
public class BaselineShift {

    /**
     * Leave the baseline unchanged
     */
    public static final BaselineShift NONE = new BaselineShift(0);
    
    /**
     * Shift the baseline to the superscript position,
     *   relative to the previous run
     */
    public static final BaselineShift SUPERSCRIPT = new BaselineShift(1);
    
    /**
     * Shift the baseline to the subscript position,
     *   relative to the previous run
     */
    public static final BaselineShift SUBSCRIPT = new BaselineShift(2);
    
    private int value;
    
    public BaselineShift(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BaselineShift[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
