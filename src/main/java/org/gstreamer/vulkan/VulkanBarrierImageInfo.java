package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanBarrierImageInfo extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanBarrierImageInfo";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.vulkan.VulkanBarrierMemoryInfo.getMemoryLayout().withName("parent"),
        org.vulkan.ImageLayout.getMemoryLayout().withName("image_layout"),
        org.vulkan.ImageSubresourceRange.getMemoryLayout().withName("subresource_range")
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
     * Allocate a new {@link VulkanBarrierImageInfo}
     * @return A new, uninitialized @{link VulkanBarrierImageInfo}
     */
    public static VulkanBarrierImageInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanBarrierImageInfo newInstance = new VulkanBarrierImageInfo(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code image_layout}
     * @return The value of the field {@code image_layout}
     */
    public org.vulkan.ImageLayout imageLayout$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("image_layout"));
        return new org.vulkan.ImageLayout(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code subresource_range}
     * @return The value of the field {@code subresource_range}
     */
    public org.vulkan.ImageSubresourceRange subresourceRange$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("subresource_range"));
        return new org.vulkan.ImageSubresourceRange(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanBarrierImageInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanBarrierImageInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanBarrierImageInfo struct;
        
         /**
         * A {@link VulkanBarrierImageInfo.Build} object constructs a {@link VulkanBarrierImageInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanBarrierImageInfo.allocate();
        }
        
         /**
         * Finish building the {@link VulkanBarrierImageInfo} struct.
         * @return A new instance of {@code VulkanBarrierImageInfo} with the fields 
         *         that were set in the Build object.
         */
        public VulkanBarrierImageInfo construct() {
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
         * the image layout of this barrier
         * @param imageLayout The value for the {@code imageLayout} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setImageLayout(org.vulkan.ImageLayout imageLayout) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("image_layout"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (imageLayout == null ? MemoryAddress.NULL : imageLayout.handle()));
            return this;
        }
        
        /**
         * what subresource the barrier applies to
         * @param subresourceRange The value for the {@code subresourceRange} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSubresourceRange(org.vulkan.ImageSubresourceRange subresourceRange) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subresource_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (subresourceRange == null ? MemoryAddress.NULL : subresourceRange.handle()));
            return this;
        }
    }
}
