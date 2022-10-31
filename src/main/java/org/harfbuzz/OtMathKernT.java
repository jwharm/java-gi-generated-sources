package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The math kerning-table types defined for the four corners
 * of a glyph.
 * @version 1.3.3
 */
public class OtMathKernT extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_math_kern_t";
    
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
