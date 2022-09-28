package org.pango;

/**
 * Errors that can be returned by {@link Pango#Layout}.
 */
public class LayoutDeserializeError {

    /**
     * Unspecified error
     */
    public static final LayoutDeserializeError INVALID = new LayoutDeserializeError(0);
    
    /**
     * A JSon value could not be
     *   interpreted
     */
    public static final LayoutDeserializeError INVALID_VALUE = new LayoutDeserializeError(1);
    
    /**
     * A required JSon member was
     *   not found
     */
    public static final LayoutDeserializeError MISSING_VALUE = new LayoutDeserializeError(2);
    
    private int value;
    
    public LayoutDeserializeError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(LayoutDeserializeError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
