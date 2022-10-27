package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of functions used to perform memory allocation. The same {@link MemVTable} must
 * be used for all allocations in the same program; a call to g_mem_set_vtable(),
 * if it exists, should be prior to any use of GLib.
 * <p>
 * This functions related to this has been deprecated in 2.46, and no longer work.
 */
public class MemVTable extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("malloc"),
        Interop.valueLayout.ADDRESS.withName("realloc"),
        Interop.valueLayout.ADDRESS.withName("free"),
        Interop.valueLayout.ADDRESS.withName("calloc"),
        Interop.valueLayout.ADDRESS.withName("try_malloc"),
        Interop.valueLayout.ADDRESS.withName("try_realloc")
    ).withName("GMemVTable");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public MemVTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
