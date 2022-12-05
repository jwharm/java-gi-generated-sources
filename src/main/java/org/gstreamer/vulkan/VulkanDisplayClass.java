package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDisplayClass extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDisplayClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("object_class"),
        Interop.valueLayout.ADDRESS.withName("get_handle"),
        Interop.valueLayout.ADDRESS.withName("create_window"),
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
     * Allocate a new {@link VulkanDisplayClass}
     * @return A new, uninitialized @{link VulkanDisplayClass}
     */
    public static VulkanDisplayClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanDisplayClass newInstance = new VulkanDisplayClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code object_class}
     * @return The value of the field {@code object_class}
     */
    public org.gstreamer.gst.ObjectClass objectClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("object_class"));
        return new org.gstreamer.gst.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanDisplayClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanDisplayClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanDisplayClass struct;
        
         /**
         * A {@link VulkanDisplayClass.Build} object constructs a {@link VulkanDisplayClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanDisplayClass.allocate();
        }
        
         /**
         * Finish building the {@link VulkanDisplayClass} struct.
         * @return A new instance of {@code VulkanDisplayClass} with the fields 
         *         that were set in the Build object.
         */
        public VulkanDisplayClass construct() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.ObjectClass}
         * @param objectClass The value for the {@code objectClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setObjectClass(org.gstreamer.gst.ObjectClass objectClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
            return this;
        }
        
        public Build setGetHandle(java.lang.foreign.MemoryAddress getHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getHandle == null ? MemoryAddress.NULL : getHandle));
            return this;
        }
        
        public Build setCreateWindow(java.lang.foreign.MemoryAddress createWindow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_window"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createWindow == null ? MemoryAddress.NULL : createWindow));
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
