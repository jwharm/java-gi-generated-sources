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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.vulkan.VulkanBarrierMemoryInfo.getMemoryLayout().withName("parent"),
            org.vulkan.ImageLayout.getMemoryLayout().withName("image_layout"),
            org.vulkan.ImageSubresourceRange.getMemoryLayout().withName("subresource_range")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanBarrierImageInfo}
     * @return A new, uninitialized @{link VulkanBarrierImageInfo}
     */
    public static VulkanBarrierImageInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VulkanBarrierImageInfo newInstance = new VulkanBarrierImageInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.vulkan.VulkanBarrierMemoryInfo getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.vulkan.VulkanBarrierMemoryInfo.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.vulkan.VulkanBarrierMemoryInfo parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code image_layout}
     * @return The value of the field {@code image_layout}
     */
    public org.vulkan.ImageLayout getImageLayout() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("image_layout"));
        return org.vulkan.ImageLayout.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code image_layout}
     * @param imageLayout The new value of the field {@code image_layout}
     */
    public void setImageLayout(org.vulkan.ImageLayout imageLayout) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("image_layout"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (imageLayout == null ? MemoryAddress.NULL : imageLayout.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code subresource_range}
     * @return The value of the field {@code subresource_range}
     */
    public org.vulkan.ImageSubresourceRange getSubresourceRange() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("subresource_range"));
        return org.vulkan.ImageSubresourceRange.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code subresource_range}
     * @param subresourceRange The new value of the field {@code subresource_range}
     */
    public void setSubresourceRange(org.vulkan.ImageSubresourceRange subresourceRange) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subresource_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (subresourceRange == null ? MemoryAddress.NULL : subresourceRange.handle()));
        }
    }
    
    /**
     * Create a VulkanBarrierImageInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanBarrierImageInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanBarrierImageInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanBarrierImageInfo(input);
    
    /**
     * A {@link VulkanBarrierImageInfo.Builder} object constructs a {@link VulkanBarrierImageInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanBarrierImageInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanBarrierImageInfo struct;
        
        private Builder() {
            struct = VulkanBarrierImageInfo.allocate();
        }
        
        /**
         * Finish building the {@link VulkanBarrierImageInfo} struct.
         * @return A new instance of {@code VulkanBarrierImageInfo} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanBarrierImageInfo build() {
            return struct;
        }
        
        /**
         * parent {@link VulkanBarrierMemoryInfo}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.vulkan.VulkanBarrierMemoryInfo parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        /**
         * the image layout of this barrier
         * @param imageLayout The value for the {@code imageLayout} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setImageLayout(org.vulkan.ImageLayout imageLayout) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("image_layout"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (imageLayout == null ? MemoryAddress.NULL : imageLayout.handle()));
                return this;
            }
        }
        
        /**
         * what subresource the barrier applies to
         * @param subresourceRange The value for the {@code subresourceRange} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSubresourceRange(org.vulkan.ImageSubresourceRange subresourceRange) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("subresource_range"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (subresourceRange == null ? MemoryAddress.NULL : subresourceRange.handle()));
                return this;
            }
        }
    }
}
