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
public class MemVTable extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMemVTable";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * Allocate a new {@link MemVTable}
     * @return A new, uninitialized @{link MemVTable}
     */
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

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MemVTable struct;
        
         /**
         * A {@link MemVTable.Build} object constructs a {@link MemVTable} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MemVTable.allocate();
        }
        
         /**
         * Finish building the {@link MemVTable} struct.
         * @return A new instance of {@code MemVTable} with the fields 
         *         that were set in the Build object.
         */
        public MemVTable construct() {
            return struct;
        }
        
        public Build setMalloc(java.lang.foreign.MemoryAddress malloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("malloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (malloc == null ? MemoryAddress.NULL : malloc));
            return this;
        }
        
        public Build setRealloc(java.lang.foreign.MemoryAddress realloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("realloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (realloc == null ? MemoryAddress.NULL : realloc));
            return this;
        }
        
        public Build setFree(java.lang.foreign.MemoryAddress free) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : free));
            return this;
        }
        
        public Build setCalloc(java.lang.foreign.MemoryAddress calloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("calloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (calloc == null ? MemoryAddress.NULL : calloc));
            return this;
        }
        
        public Build setTryMalloc(java.lang.foreign.MemoryAddress try_malloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("try_malloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (try_malloc == null ? MemoryAddress.NULL : try_malloc));
            return this;
        }
        
        public Build setTryRealloc(java.lang.foreign.MemoryAddress try_realloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("try_realloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (try_realloc == null ? MemoryAddress.NULL : try_realloc));
            return this;
        }
    }
}
