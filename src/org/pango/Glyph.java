package org.pango;

/**
 * A {@code PangoGlyph} represents a single glyph in the output form of a string.
 */
public class Glyph {
    private int value;
    
    public Glyph(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Glyph[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
