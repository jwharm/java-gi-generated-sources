package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Use {@link OtVarAxisInfoT} instead.
 * @version 1.4.2
 */
public class OtVarAxisT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("tag"),
        ValueLayout.JAVA_INT.withName("name_id"),
        ValueLayout.JAVA_FLOAT.withName("min_value"),
        ValueLayout.JAVA_FLOAT.withName("default_value"),
        ValueLayout.JAVA_FLOAT.withName("max_value")
    ).withName("hb_ot_var_axis_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public OtVarAxisT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
