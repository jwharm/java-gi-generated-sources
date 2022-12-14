package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanTrashListClass extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanTrashListClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.vulkan.VulkanHandlePoolClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("add_func"),
            Interop.valueLayout.ADDRESS.withName("gc_func"),
            Interop.valueLayout.ADDRESS.withName("wait_func"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanTrashListClass}
     * @return A new, uninitialized @{link VulkanTrashListClass}
     */
    public static VulkanTrashListClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VulkanTrashListClass newInstance = new VulkanTrashListClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.vulkan.VulkanHandlePoolClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.vulkan.VulkanHandlePoolClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.vulkan.VulkanHandlePoolClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code add_func}
     * @return The value of the field {@code add_func}
     */
    public org.gstreamer.vulkan.VulkanTrashListAdd getAddFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code add_func}
     * @param addFunc The new value of the field {@code add_func}
     */
    public void setAddFunc(org.gstreamer.vulkan.VulkanTrashListAdd addFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addFunc == null ? MemoryAddress.NULL : (Addressable) addFunc.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code gc_func}
     * @return The value of the field {@code gc_func}
     */
    public org.gstreamer.vulkan.VulkanTrashListGC getGcFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gc_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code gc_func}
     * @param gcFunc The new value of the field {@code gc_func}
     */
    public void setGcFunc(org.gstreamer.vulkan.VulkanTrashListGC gcFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gc_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gcFunc == null ? MemoryAddress.NULL : (Addressable) gcFunc.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code wait_func}
     * @return The value of the field {@code wait_func}
     */
    public org.gstreamer.vulkan.VulkanTrashListWait getWaitFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code wait_func}
     * @param waitFunc The new value of the field {@code wait_func}
     */
    public void setWaitFunc(org.gstreamer.vulkan.VulkanTrashListWait waitFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitFunc == null ? MemoryAddress.NULL : (Addressable) waitFunc.toCallback()));
        }
    }
    
    /**
     * Create a VulkanTrashListClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanTrashListClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanTrashListClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanTrashListClass(input);
    
    /**
     * A {@link VulkanTrashListClass.Builder} object constructs a {@link VulkanTrashListClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanTrashListClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanTrashListClass struct;
        
        private Builder() {
            struct = VulkanTrashListClass.allocate();
        }
        
        /**
         * Finish building the {@link VulkanTrashListClass} struct.
         * @return A new instance of {@code VulkanTrashListClass} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanTrashListClass build() {
            return struct;
        }
        
        /**
         * the {@link VulkanHandlePoolClass}
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.vulkan.VulkanHandlePoolClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        /**
         * the {@link VulkanTrashListAdd} functions
         * @param addFunc The value for the {@code addFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddFunc(org.gstreamer.vulkan.VulkanTrashListAdd addFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("add_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addFunc == null ? MemoryAddress.NULL : (Addressable) addFunc.toCallback()));
                return this;
            }
        }
        
        /**
         * the {@link VulkanTrashListGC} function
         * @param gcFunc The value for the {@code gcFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGcFunc(org.gstreamer.vulkan.VulkanTrashListGC gcFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("gc_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gcFunc == null ? MemoryAddress.NULL : (Addressable) gcFunc.toCallback()));
                return this;
            }
        }
        
        /**
         * the {@link VulkanTrashListWait} function
         * @param waitFunc The value for the {@code waitFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWaitFunc(org.gstreamer.vulkan.VulkanTrashListWait waitFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("wait_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitFunc == null ? MemoryAddress.NULL : (Addressable) waitFunc.toCallback()));
                return this;
            }
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false, SCOPE)));
                return this;
            }
        }
    }
}
