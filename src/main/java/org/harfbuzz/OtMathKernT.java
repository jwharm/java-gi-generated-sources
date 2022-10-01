package org.harfbuzz;

/**
 * The math kerning-table types defined for the four corners
 * of a glyph.
 */
public class OtMathKernT extends io.github.jwharm.javagi.Enumeration {

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
    
    public OtMathKernT(int value) {
        super(value);
    }
    
}
