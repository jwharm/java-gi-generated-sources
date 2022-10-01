package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Use {@link ot_var_axis_info_t} instead.
 */
public class OtVarAxisT extends io.github.jwharm.javagi.ResourceBase {

    public OtVarAxisT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public OtVarAxisT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_ot_var_axis_t.allocate(Interop.getAllocator()).address()));
    }
    
}
