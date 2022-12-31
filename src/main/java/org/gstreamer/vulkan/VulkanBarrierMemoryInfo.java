package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanBarrierMemoryInfo extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanBarrierMemoryInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("type"),
            Interop.valueLayout.C_INT.withName("flags"),
            Interop.valueLayout.ADDRESS.withName("queue"),
            org.vulkan.PipelineStageFlags.getMemoryLayout().withName("pipeline_stages"),
            org.vulkan.AccessFlags.getMemoryLayout().withName("access_flags"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanBarrierMemoryInfo}
     * @return A new, uninitialized @{link VulkanBarrierMemoryInfo}
     */
    public static VulkanBarrierMemoryInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanBarrierMemoryInfo newInstance = new VulkanBarrierMemoryInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.vulkan.VulkanBarrierType getType() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.vulkan.VulkanBarrierType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gstreamer.vulkan.VulkanBarrierType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.vulkan.VulkanBarrierFlags getFlags() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.vulkan.VulkanBarrierFlags.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gstreamer.vulkan.VulkanBarrierFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
    }
    
    /**
     * Get the value of the field {@code queue}
     * @return The value of the field {@code queue}
     */
    public org.gstreamer.vulkan.VulkanQueue getQueue() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("queue"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return (org.gstreamer.vulkan.VulkanQueue) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.vulkan.VulkanQueue.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code queue}
     * @param queue The new value of the field {@code queue}
     */
    public void setQueue(org.gstreamer.vulkan.VulkanQueue queue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("queue"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queue == null ? MemoryAddress.NULL : queue.handle()));
    }
    
    /**
     * Get the value of the field {@code pipeline_stages}
     * @return The value of the field {@code pipeline_stages}
     */
    public org.vulkan.PipelineStageFlags getPipelineStages() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("pipeline_stages"));
        return org.vulkan.PipelineStageFlags.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pipeline_stages}
     * @param pipelineStages The new value of the field {@code pipeline_stages}
     */
    public void setPipelineStages(org.vulkan.PipelineStageFlags pipelineStages) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pipeline_stages"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pipelineStages == null ? MemoryAddress.NULL : pipelineStages.handle()));
    }
    
    /**
     * Get the value of the field {@code access_flags}
     * @return The value of the field {@code access_flags}
     */
    public org.vulkan.AccessFlags getAccessFlags() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("access_flags"));
        return org.vulkan.AccessFlags.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code access_flags}
     * @param accessFlags The new value of the field {@code access_flags}
     */
    public void setAccessFlags(org.vulkan.AccessFlags accessFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("access_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (accessFlags == null ? MemoryAddress.NULL : accessFlags.handle()));
    }
    
    /**
     * Create a VulkanBarrierMemoryInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanBarrierMemoryInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanBarrierMemoryInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanBarrierMemoryInfo(input, ownership);
    
    /**
     * A {@link VulkanBarrierMemoryInfo.Builder} object constructs a {@link VulkanBarrierMemoryInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanBarrierMemoryInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanBarrierMemoryInfo struct;
        
        private Builder() {
            struct = VulkanBarrierMemoryInfo.allocate();
        }
        
         /**
         * Finish building the {@link VulkanBarrierMemoryInfo} struct.
         * @return A new instance of {@code VulkanBarrierMemoryInfo} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanBarrierMemoryInfo build() {
            return struct;
        }
        
        /**
         * the {@link VulkanBarrierType} of the barrier
         * {@code flags} the {@link VulkanBarrierFlags} of the barrier
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gstreamer.vulkan.VulkanBarrierType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        public Builder setFlags(org.gstreamer.vulkan.VulkanBarrierFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * the {@link VulkanQueue} this barrier is to execute with
         * @param queue The value for the {@code queue} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setQueue(org.gstreamer.vulkan.VulkanQueue queue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("queue"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queue == null ? MemoryAddress.NULL : queue.handle()));
            return this;
        }
        
        /**
         * the stages in the graphics pipeline to execute the barrier
         * @param pipelineStages The value for the {@code pipelineStages} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPipelineStages(org.vulkan.PipelineStageFlags pipelineStages) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pipeline_stages"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pipelineStages == null ? MemoryAddress.NULL : pipelineStages.handle()));
            return this;
        }
        
        /**
         * access flags
         * @param accessFlags The value for the {@code accessFlags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAccessFlags(org.vulkan.AccessFlags accessFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("access_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (accessFlags == null ? MemoryAddress.NULL : accessFlags.handle()));
            return this;
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
