package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanBarrierBufferInfo extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanBarrierBufferInfo";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.vulkan.VulkanBarrierMemoryInfo.getMemoryLayout().withName("parent"),
        org.vulkan.DeviceSize.getMemoryLayout().withName("offset"),
        org.vulkan.DeviceSize.getMemoryLayout().withName("size")
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
     * Allocate a new {@link VulkanBarrierBufferInfo}
     * @return A new, uninitialized @{link VulkanBarrierBufferInfo}
     */
    public static VulkanBarrierBufferInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanBarrierBufferInfo newInstance = new VulkanBarrierBufferInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.vulkan.VulkanBarrierMemoryInfo parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gstreamer.vulkan.VulkanBarrierMemoryInfo(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public org.vulkan.DeviceSize offset$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("offset"));
        return new org.vulkan.DeviceSize(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public org.vulkan.DeviceSize size$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("size"));
        return new org.vulkan.DeviceSize(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanBarrierBufferInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanBarrierBufferInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanBarrierBufferInfo struct;
        
         /**
         * A {@link VulkanBarrierBufferInfo.Build} object constructs a {@link VulkanBarrierBufferInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanBarrierBufferInfo.allocate();
        }
        
         /**
         * Finish building the {@link VulkanBarrierBufferInfo} struct.
         * @return A new instance of {@code VulkanBarrierBufferInfo} with the fields 
         *         that were set in the Build object.
         */
        public VulkanBarrierBufferInfo construct() {
            return struct;
        }
        
        /**
         * parent {@link VulkanBarrierMemoryInfo}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gstreamer.vulkan.VulkanBarrierMemoryInfo parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * offset into the vulkan buffer to execute the barrier with
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOffset(org.vulkan.DeviceSize offset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (offset == null ? MemoryAddress.NULL : offset.handle()));
            return this;
        }
        
        /**
         * size of memory to execute barrier over
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSize(org.vulkan.DeviceSize size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (size == null ? MemoryAddress.NULL : size.handle()));
            return this;
        }
    }
}
