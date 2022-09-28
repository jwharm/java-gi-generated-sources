package org.harfbuzz;

/**
 * Flags for math glyph parts.
 */
public class OtMathGlyphPartFlagsT {

    /**
     * This is an extender glyph part that
     * can be repeated to reach the desired length.
     */
    public static final OtMathGlyphPartFlagsT EXTENDER = new OtMathGlyphPartFlagsT(1);
    
    private int value;
    
    public OtMathGlyphPartFlagsT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OtMathGlyphPartFlagsT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public OtMathGlyphPartFlagsT combined(OtMathGlyphPartFlagsT mask) {
        return new OtMathGlyphPartFlagsT(this.getValue() | mask.getValue());
    }
    
    public static OtMathGlyphPartFlagsT combined(OtMathGlyphPartFlagsT mask, OtMathGlyphPartFlagsT... masks) {
        int value = mask.getValue();
        for (OtMathGlyphPartFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new OtMathGlyphPartFlagsT(value);
    }
    
}
