package org.harfbuzz;

/**
 * Flags for math glyph parts.
 */
public class OtMathGlyphPartFlagsT extends io.github.jwharm.javagi.Bitfield {

    /**
     * This is an extender glyph part that
     * can be repeated to reach the desired length.
     */
    public static final OtMathGlyphPartFlagsT EXTENDER = new OtMathGlyphPartFlagsT(1);
    
    public OtMathGlyphPartFlagsT(int value) {
        super(value);
    }
    
}
