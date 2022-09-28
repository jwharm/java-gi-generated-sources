package org.pango;

/**
 * An enumeration that affects font sizes for superscript
 * and subscript positioning and for (emulated) Small Caps.
 */
public class FontScale {

    /**
     * Leave the font size unchanged
     */
    public static final FontScale NONE = new FontScale(0);
    
    /**
     * Change the font to a size suitable for superscripts
     */
    public static final FontScale SUPERSCRIPT = new FontScale(1);
    
    /**
     * Change the font to a size suitable for subscripts
     */
    public static final FontScale SUBSCRIPT = new FontScale(2);
    
    /**
     * Change the font to a size suitable for Small Caps
     */
    public static final FontScale SMALL_CAPS = new FontScale(3);
    
    private int value;
    
    public FontScale(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FontScale[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
