package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data type to hold information for a "part" component of a math-variant glyph.
 * Large variants for stretchable math glyphs (such as parentheses) can be constructed
 * on the fly from parts.
 */
public class OtMathGlyphPartT extends io.github.jwharm.javagi.ResourceBase {

    public OtMathGlyphPartT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public OtMathGlyphPartT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_ot_math_glyph_part_t.allocate(Interop.getAllocator()).address()));
    }
    
}
