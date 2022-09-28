package org.gtk.gtk;

/**
 * Reading directions for text.
 */
public class TextDirection {

    /**
     * No direction.
     */
    public static final TextDirection NONE = new TextDirection(0);
    
    /**
     * Left to right text direction.
     */
    public static final TextDirection LTR = new TextDirection(1);
    
    /**
     * Right to left text direction.
     */
    public static final TextDirection RTL = new TextDirection(2);
    
    private int value;
    
    public TextDirection(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TextDirection[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
