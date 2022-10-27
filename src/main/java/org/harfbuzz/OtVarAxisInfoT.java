package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding variation-axis values.
 * <p>
 * The minimum, default, and maximum values are in un-normalized, user scales.
 * <p>
 * &lt;note&gt;Note: at present, the only flag defined for {@code flags} is
 * {@code HB_OT_VAR_AXIS_FLAG_HIDDEN}.&lt;/note&gt;
 * @version 2.2.0
 */
public class OtVarAxisInfoT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("axis_index"),
        ValueLayout.JAVA_INT.withName("tag"),
        ValueLayout.JAVA_INT.withName("name_id"),
        org.harfbuzz.OtVarAxisFlagsT.getMemoryLayout().withName("flags"),
        ValueLayout.JAVA_FLOAT.withName("min_value"),
        ValueLayout.JAVA_FLOAT.withName("default_value"),
        ValueLayout.JAVA_FLOAT.withName("max_value"),
        ValueLayout.JAVA_INT.withName("reserved")
    ).withName("hb_ot_var_axis_info_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public OtVarAxisInfoT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
