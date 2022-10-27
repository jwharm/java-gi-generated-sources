package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type to hold math kerning (cut-in) information for a glyph.
 * @version 3.4.0
 */
public class OtMathKernEntryT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("max_correction_height"),
        ValueLayout.JAVA_INT.withName("kern_value")
    ).withName("hb_ot_math_kern_entry_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public OtMathKernEntryT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
