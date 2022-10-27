package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure holding information for a specific type.
 * <p>
 * See also: g_type_query()
 */
public class TypeQuery extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("type"),
        Interop.valueLayout.ADDRESS.withName("type_name"),
        ValueLayout.JAVA_INT.withName("class_size"),
        ValueLayout.JAVA_INT.withName("instance_size")
    ).withName("GTypeQuery");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TypeQuery(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
