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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.vulkan.VulkanHandlePoolClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("add_func"),
        Interop.valueLayout.ADDRESS.withName("gc_func"),
        Interop.valueLayout.ADDRESS.withName("wait_func"),
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
     * Allocate a new {@link VulkanTrashListClass}
     * @return A new, uninitialized @{link VulkanTrashListClass}
     */
    public static VulkanTrashListClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanTrashListClass newInstance = new VulkanTrashListClass(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code add_func}
     * @return The value of the field {@code add_func}
     */
    public org.gstreamer.vulkan.VulkanTrashListAdd addFunc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("add_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code gc_func}
     * @return The value of the field {@code gc_func}
     */
    public org.gstreamer.vulkan.VulkanTrashListGC gcFunc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gc_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code wait_func}
     * @return The value of the field {@code wait_func}
     */
    public org.gstreamer.vulkan.VulkanTrashListWait waitFunc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("wait_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a VulkanTrashListClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanTrashListClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanTrashListClass struct;
        
         /**
         * A {@link VulkanTrashListClass.Build} object constructs a {@link VulkanTrashListClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanTrashListClass.allocate();
        }
        
         /**
         * Finish building the {@link VulkanTrashListClass} struct.
         * @return A new instance of {@code VulkanTrashListClass} with the fields 
         *         that were set in the Build object.
         */
        public VulkanTrashListClass construct() {
            return struct;
        }
        
        /**
         * the {@link VulkanHandlePoolClass}
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.vulkan.VulkanHandlePoolClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        /**
         * the {@link VulkanTrashListAdd} functions
         * @param addFunc The value for the {@code addFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAddFunc(java.lang.foreign.MemoryAddress addFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addFunc == null ? MemoryAddress.NULL : addFunc));
            return this;
        }
        
        /**
         * the {@link VulkanTrashListGC} function
         * @param gcFunc The value for the {@code gcFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGcFunc(java.lang.foreign.MemoryAddress gcFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gc_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gcFunc == null ? MemoryAddress.NULL : gcFunc));
            return this;
        }
        
        /**
         * the {@link VulkanTrashListWait} function
         * @param waitFunc The value for the {@code waitFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWaitFunc(java.lang.foreign.MemoryAddress waitFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitFunc == null ? MemoryAddress.NULL : waitFunc));
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
