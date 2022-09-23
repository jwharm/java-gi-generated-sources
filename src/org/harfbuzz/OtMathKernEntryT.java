package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data type to hold math kerning (cut-in) information for a glyph.
 */
public class OtMathKernEntryT extends io.github.jwharm.javagi.ResourceBase {

    public OtMathKernEntryT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public OtMathKernEntryT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_ot_math_kern_entry_t.allocate(Interop.getAllocator()).address()));
    }
    
}
