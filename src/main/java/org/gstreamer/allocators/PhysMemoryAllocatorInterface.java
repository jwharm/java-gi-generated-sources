package org.gstreamer.allocators;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Marker interface for allocators with physical address backed memory
 * @version 1.14
 */
public class PhysMemoryAllocatorInterface extends Struct {
    
    static {
        GstAllocators.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPhysMemoryAllocatorInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
        Interop.valueLayout.ADDRESS.withName("get_phys_addr")
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
     * Allocate a new {@link PhysMemoryAllocatorInterface}
     * @return A new, uninitialized @{link PhysMemoryAllocatorInterface}
     */
    public static PhysMemoryAllocatorInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PhysMemoryAllocatorInterface newInstance = new PhysMemoryAllocatorInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysMemoryAllocatorInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PhysMemoryAllocatorInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PhysMemoryAllocatorInterface struct;
        
         /**
         * A {@link PhysMemoryAllocatorInterface.Build} object constructs a {@link PhysMemoryAllocatorInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PhysMemoryAllocatorInterface.allocate();
        }
        
         /**
         * Finish building the {@link PhysMemoryAllocatorInterface} struct.
         * @return A new instance of {@code PhysMemoryAllocatorInterface} with the fields 
         *         that were set in the Build object.
         */
        public PhysMemoryAllocatorInterface construct() {
            return struct;
        }
        
        public Build setParentIface(org.gtk.gobject.TypeInterface parentIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
            return this;
        }
        
        public Build setGetPhysAddr(java.lang.foreign.MemoryAddress getPhysAddr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_phys_addr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPhysAddr == null ? MemoryAddress.NULL : getPhysAddr));
            return this;
        }
    }
}
