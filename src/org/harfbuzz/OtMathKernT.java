package org.harfbuzz;

/**
 * The math kerning-table types defined for the four corners
 * of a glyph.
 */
public class OtMathKernT {

    /**
     * The top right corner of the glyph.
     */
    public static final OtMathKernT TOP_RIGHT = new OtMathKernT(0);
    
    /**
     * The top left corner of the glyph.
     */
    public static final OtMathKernT TOP_LEFT = new OtMathKernT(1);
    
    /**
     * The bottom right corner of the glyph.
     */
    public static final OtMathKernT BOTTOM_RIGHT = new OtMathKernT(2);
    
    /**
     * The bottom left corner of the glyph.
     */
    public static final OtMathKernT BOTTOM_LEFT = new OtMathKernT(3);
    
    private int value;
    
    public OtMathKernT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OtMathKernT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
