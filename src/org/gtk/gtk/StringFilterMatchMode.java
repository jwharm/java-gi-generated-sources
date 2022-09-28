package org.gtk.gtk;

/**
 * Specifies how search strings are matched inside text.
 */
public class StringFilterMatchMode {

    /**
     * The search string and
     *   text must match exactly.
     */
    public static final StringFilterMatchMode EXACT = new StringFilterMatchMode(0);
    
    /**
     * The search string
     *   must be contained as a substring inside the text.
     */
    public static final StringFilterMatchMode SUBSTRING = new StringFilterMatchMode(1);
    
    /**
     * The text must begin
     *   with the search string.
     */
    public static final StringFilterMatchMode PREFIX = new StringFilterMatchMode(2);
    
    private int value;
    
    public StringFilterMatchMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(StringFilterMatchMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
