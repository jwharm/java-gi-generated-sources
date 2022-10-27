package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type to hold math-variant information for a glyph.
 * @version 1.3.3
 */
public class OtMathGlyphVariantT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("glyph"),
        ValueLayout.JAVA_INT.withName("advance")
    ).withName("hb_ot_math_glyph_variant_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public OtMathGlyphVariantT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
