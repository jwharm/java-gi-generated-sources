package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type to hold information for a "part" component of a math-variant glyph.
 * Large variants for stretchable math glyphs (such as parentheses) can be constructed
 * on the fly from parts.
 * @version 1.3.3
 */
public class OtMathGlyphPartT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("glyph"),
        ValueLayout.JAVA_INT.withName("start_connector_length"),
        ValueLayout.JAVA_INT.withName("end_connector_length"),
        ValueLayout.JAVA_INT.withName("full_advance"),
        org.harfbuzz.OtMathGlyphPartFlagsT.getMemoryLayout().withName("flags")
    ).withName("hb_ot_math_glyph_part_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public OtMathGlyphPartT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
