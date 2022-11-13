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
public class MemVTable extends io.github.jwharm.javagi.ProxyBase {
    
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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static MemVTable allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MemVTable newInstance = new MemVTable(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MemVTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MemVTable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
