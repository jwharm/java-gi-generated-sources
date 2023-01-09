package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for math glyph parts.
 * @version 1.3.3
 */
public class OtMathGlyphPartFlagsT extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_math_glyph_part_flags_t";
    
    /**
     * This is an extender glyph part that
     * can be repeated to reach the desired length.
     */
    public static final OtMathGlyphPartFlagsT EXTENDER = new OtMathGlyphPartFlagsT(1);
    
    /**
     * Create a new OtMathGlyphPartFlagsT with the provided value
     */
    public OtMathGlyphPartFlagsT(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public OtMathGlyphPartFlagsT or(OtMathGlyphPartFlagsT... masks) {
        int value = this.getValue();
        for (OtMathGlyphPartFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new OtMathGlyphPartFlagsT(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static OtMathGlyphPartFlagsT combined(OtMathGlyphPartFlagsT mask, OtMathGlyphPartFlagsT... masks) {
        int value = mask.getValue();
        for (OtMathGlyphPartFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new OtMathGlyphPartFlagsT(value);
    }
}
