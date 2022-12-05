package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDescriptorCacheClass extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDescriptorCacheClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.vulkan.VulkanHandlePoolClass.getMemoryLayout().withName("parent_class"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
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
     * Allocate a new {@link VulkanDescriptorCacheClass}
     * @return A new, uninitialized @{link VulkanDescriptorCacheClass}
     */
    public static VulkanDescriptorCacheClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanDescriptorCacheClass newInstance = new VulkanDescriptorCacheClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.vulkan.VulkanHandlePoolClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.vulkan.VulkanHandlePoolClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanDescriptorCacheClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanDescriptorCacheClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanDescriptorCacheClass struct;
        
         /**
         * A {@link VulkanDescriptorCacheClass.Build} object constructs a {@link VulkanDescriptorCacheClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanDescriptorCacheClass.allocate();
        }
        
         /**
         * Finish building the {@link VulkanDescriptorCacheClass} struct.
         * @return A new instance of {@code VulkanDescriptorCacheClass} with the fields 
         *         that were set in the Build object.
         */
        public VulkanDescriptorCacheClass construct() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.ObjectClass}
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.vulkan.VulkanHandlePoolClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
