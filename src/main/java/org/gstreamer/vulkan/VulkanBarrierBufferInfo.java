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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.vulkan.VulkanBarrierMemoryInfo.getMemoryLayout().withName("parent"),
            org.vulkan.DeviceSize.getMemoryLayout().withName("offset"),
            org.vulkan.DeviceSize.getMemoryLayout().withName("size")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanBarrierBufferInfo}
     * @return A new, uninitialized @{link VulkanBarrierBufferInfo}
     */
    public static VulkanBarrierBufferInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VulkanBarrierBufferInfo newInstance = new VulkanBarrierBufferInfo(segment.address());
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
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public org.vulkan.DeviceSize getOffset() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("offset"));
        return org.vulkan.DeviceSize.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void setOffset(org.vulkan.DeviceSize offset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (offset == null ? MemoryAddress.NULL : offset.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public org.vulkan.DeviceSize getSize() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("size"));
        return org.vulkan.DeviceSize.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(org.vulkan.DeviceSize size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (size == null ? MemoryAddress.NULL : size.handle()));
        }
    }
    
    /**
     * Create a VulkanBarrierBufferInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanBarrierBufferInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanBarrierBufferInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanBarrierBufferInfo(input);
    
    /**
     * A {@link VulkanBarrierBufferInfo.Builder} object constructs a {@link VulkanBarrierBufferInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanBarrierBufferInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanBarrierBufferInfo struct;
        
        private Builder() {
            struct = VulkanBarrierBufferInfo.allocate();
        }
        
        /**
         * Finish building the {@link VulkanBarrierBufferInfo} struct.
         * @return A new instance of {@code VulkanBarrierBufferInfo} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanBarrierBufferInfo build() {
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
         * offset into the vulkan buffer to execute the barrier with
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(org.vulkan.DeviceSize offset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (offset == null ? MemoryAddress.NULL : offset.handle()));
                return this;
            }
        }
        
        /**
         * size of memory to execute barrier over
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(org.vulkan.DeviceSize size) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (size == null ? MemoryAddress.NULL : size.handle()));
                return this;
            }
        }
    }
}
