package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data type to hold math-variant information for a glyph.
 */
public class OtMathGlyphVariantT extends io.github.jwharm.javagi.ResourceBase {

    public OtMathGlyphVariantT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public OtMathGlyphVariantT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_ot_math_glyph_variant_t.allocate(Interop.getAllocator()).address()));
    }
    
}
