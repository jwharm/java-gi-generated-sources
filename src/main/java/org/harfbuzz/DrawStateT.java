package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Current drawing state.
 * @version 4.0.0
 */
public class DrawStateT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("path_open"),
        ValueLayout.JAVA_FLOAT.withName("path_start_x"),
        ValueLayout.JAVA_FLOAT.withName("path_start_y"),
        ValueLayout.JAVA_FLOAT.withName("current_x"),
        ValueLayout.JAVA_FLOAT.withName("current_y"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved1"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved2"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved3"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved4"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved5"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved6"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved7")
    ).withName("hb_draw_state_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public DrawStateT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
