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
    
    public OtMathGlyphPartFlagsT(int value) {
        super(value);
    }
}
