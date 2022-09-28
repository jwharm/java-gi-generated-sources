package org.pango;

/**
 * An enumeration that affects how Pango treats characters during shaping.
 */
public class TextTransform {

    /**
     * Leave text unchanged
     */
    public static final TextTransform NONE = new TextTransform(0);
    
    /**
     * Display letters and numbers as lowercase
     */
    public static final TextTransform LOWERCASE = new TextTransform(1);
    
    /**
     * Display letters and numbers as uppercase
     */
    public static final TextTransform UPPERCASE = new TextTransform(2);
    
    /**
     * Display the first character of a word
     *   in titlecase
     */
    public static final TextTransform CAPITALIZE = new TextTransform(3);
    
    private int value;
    
    public TextTransform(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TextTransform[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
