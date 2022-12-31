package org.gstreamer.vulkan.wayland;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDisplayWaylandClass extends Struct {
    
    static {
        GstVulkanWayland.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDisplayWaylandClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.vulkan.VulkanDisplayClass.getMemoryLayout().withName("object_class")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanDisplayWaylandClass}
     * @return A new, uninitialized @{link VulkanDisplayWaylandClass}
     */
    public static VulkanDisplayWaylandClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanDisplayWaylandClass newInstance = new VulkanDisplayWaylandClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code object_class}
     * @return The value of the field {@code object_class}
     */
    public org.gstreamer.vulkan.VulkanDisplayClass getObjectClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("object_class"));
        return org.gstreamer.vulkan.VulkanDisplayClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code object_class}
     * @param objectClass The new value of the field {@code object_class}
     */
    public void setObjectClass(org.gstreamer.vulkan.VulkanDisplayClass objectClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
    }
    
    /**
     * Create a VulkanDisplayWaylandClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanDisplayWaylandClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanDisplayWaylandClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanDisplayWaylandClass(input, ownership);
    
    /**
     * A {@link VulkanDisplayWaylandClass.Builder} object constructs a {@link VulkanDisplayWaylandClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanDisplayWaylandClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanDisplayWaylandClass struct;
        
        private Builder() {
            struct = VulkanDisplayWaylandClass.allocate();
        }
        
         /**
         * Finish building the {@link VulkanDisplayWaylandClass} struct.
         * @return A new instance of {@code VulkanDisplayWaylandClass} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanDisplayWaylandClass build() {
            return struct;
        }
        
        public Builder setObjectClass(org.gstreamer.vulkan.VulkanDisplayClass objectClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
            return this;
        }
    }
}
