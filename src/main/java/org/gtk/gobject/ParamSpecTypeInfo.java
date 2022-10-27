package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a parameter's class and
 * instances thereof.
 * <p>
 * The initialized structure is passed to the g_param_type_register_static()
 * The type system will perform a deep copy of this structure, so its memory
 * does not need to be persistent across invocation of
 * g_param_type_register_static().
 */
public class ParamSpecTypeInfo extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("instance_size"),
        ValueLayout.JAVA_SHORT.withName("n_preallocs"),
        Interop.valueLayout.ADDRESS.withName("instance_init"),
        ValueLayout.JAVA_LONG.withName("value_type"),
        Interop.valueLayout.ADDRESS.withName("finalize"),
        Interop.valueLayout.ADDRESS.withName("value_set_default"),
        Interop.valueLayout.ADDRESS.withName("value_validate"),
        Interop.valueLayout.ADDRESS.withName("values_cmp")
    ).withName("GParamSpecTypeInfo");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ParamSpecTypeInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
