package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure that provides information to the type system which is
 * used specifically for managing interface types.
 */
public class InterfaceInfo extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("interface_init"),
        Interop.valueLayout.ADDRESS.withName("interface_finalize"),
        Interop.valueLayout.ADDRESS.withName("interface_data")
    ).withName("GInterfaceInfo");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public InterfaceInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
