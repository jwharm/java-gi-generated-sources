package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ValueDataUnion extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("v_int"),
        ValueLayout.JAVA_INT.withName("v_uint"),
        ValueLayout.JAVA_LONG.withName("v_long"),
        ValueLayout.JAVA_LONG.withName("v_ulong"),
        ValueLayout.JAVA_LONG.withName("v_int64"),
        ValueLayout.JAVA_LONG.withName("v_uint64"),
        ValueLayout.JAVA_FLOAT.withName("v_float"),
        ValueLayout.JAVA_DOUBLE.withName("v_double"),
        Interop.valueLayout.ADDRESS.withName("v_pointer")
    ).withName("null");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ValueDataUnion(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}

