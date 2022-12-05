package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanHandlePoolClass extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanHandlePoolClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("alloc"),
        Interop.valueLayout.ADDRESS.withName("acquire"),
        Interop.valueLayout.ADDRESS.withName("release"),
        Interop.valueLayout.ADDRESS.withName("free"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
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
     * Allocate a new {@link VulkanHandlePoolClass}
     * @return A new, uninitialized @{link VulkanHandlePoolClass}
     */
    public static VulkanHandlePoolClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanHandlePoolClass newInstance = new VulkanHandlePoolClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.ObjectClass parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gstreamer.gst.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanHandlePoolClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanHandlePoolClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanHandlePoolClass struct;
        
         /**
         * A {@link VulkanHandlePoolClass.Build} object constructs a {@link VulkanHandlePoolClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanHandlePoolClass.allocate();
        }
        
         /**
         * Finish building the {@link VulkanHandlePoolClass} struct.
         * @return A new instance of {@code VulkanHandlePoolClass} with the fields 
         *         that were set in the Build object.
         */
        public VulkanHandlePoolClass construct() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.ObjectClass}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gstreamer.gst.ObjectClass parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Build setAlloc(java.lang.foreign.MemoryAddress alloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc));
            return this;
        }
        
        public Build setAcquire(java.lang.foreign.MemoryAddress acquire) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquire == null ? MemoryAddress.NULL : acquire));
            return this;
        }
        
        public Build setRelease(java.lang.foreign.MemoryAddress release) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (release == null ? MemoryAddress.NULL : release));
            return this;
        }
        
        public Build setFree(java.lang.foreign.MemoryAddress free) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : free));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
