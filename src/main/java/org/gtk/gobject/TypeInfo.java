package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a type's class and
 * its instances.
 * <p>
 * The initialized structure is passed to the g_type_register_static() function
 * (or is copied into the provided {@link TypeInfo} structure in the
 * g_type_plugin_complete_type_info()). The type system will perform a deep
 * copy of this structure, so its memory does not need to be persistent
 * across invocation of g_type_register_static().
 */
public class TypeInfo extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("class_size"),
        Interop.valueLayout.ADDRESS.withName("base_init"),
        Interop.valueLayout.ADDRESS.withName("base_finalize"),
        Interop.valueLayout.ADDRESS.withName("class_init"),
        Interop.valueLayout.ADDRESS.withName("class_finalize"),
        Interop.valueLayout.ADDRESS.withName("class_data"),
        ValueLayout.JAVA_SHORT.withName("instance_size"),
        ValueLayout.JAVA_SHORT.withName("n_preallocs"),
        Interop.valueLayout.ADDRESS.withName("instance_init"),
        org.gtk.gobject.TypeValueTable.getMemoryLayout().withName("value_table")
    ).withName("GTypeInfo");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TypeInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
