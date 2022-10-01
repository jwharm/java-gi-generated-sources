package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data type to hold math kerning (cut-in) information for a glyph.
 */
public class OtMathKernEntryT extends io.github.jwharm.javagi.ResourceBase {

    public OtMathKernEntryT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public OtMathKernEntryT() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.hb_ot_math_kern_entry_t.allocate(Interop.getAllocator()).address()));
    }
    
}
