package org.harfbuzz;

/**
 * Data type for holding Unicode codepoints. Also
 * used to hold glyph IDs.
 */
public class CodepointT {
    private int value;
    
    public CodepointT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(CodepointT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
