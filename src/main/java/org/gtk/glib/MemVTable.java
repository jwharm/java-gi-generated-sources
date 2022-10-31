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
    
    private static final java.lang.String C_TYPE_NAME = "GMemVTable";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("malloc"),
        Interop.valueLayout.ADDRESS.withName("realloc"),
        Interop.valueLayout.ADDRESS.withName("free"),
        Interop.valueLayout.ADDRESS.withName("calloc"),
        Interop.valueLayout.ADDRESS.withName("try_malloc"),
        Interop.valueLayout.ADDRESS.withName("try_realloc")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static MemVTable allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MemVTable newInstance = new MemVTable(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public MemVTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
