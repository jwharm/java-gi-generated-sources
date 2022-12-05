package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanWindowClass extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanWindowClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("open"),
        Interop.valueLayout.ADDRESS.withName("close"),
        Interop.valueLayout.ADDRESS.withName("get_surface"),
        Interop.valueLayout.ADDRESS.withName("get_presentation_support"),
        Interop.valueLayout.ADDRESS.withName("set_window_handle"),
        Interop.valueLayout.ADDRESS.withName("get_surface_dimensions"),
        Interop.valueLayout.ADDRESS.withName("handle_events"),
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
     * Allocate a new {@link VulkanWindowClass}
     * @return A new, uninitialized @{link VulkanWindowClass}
     */
    public static VulkanWindowClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanWindowClass newInstance = new VulkanWindowClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanWindowClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanWindowClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanWindowClass struct;
        
         /**
         * A {@link VulkanWindowClass.Build} object constructs a {@link VulkanWindowClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanWindowClass.allocate();
        }
        
         /**
         * Finish building the {@link VulkanWindowClass} struct.
         * @return A new instance of {@code VulkanWindowClass} with the fields 
         *         that were set in the Build object.
         */
        public VulkanWindowClass construct() {
            return struct;
        }
        
        /**
         * Parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setOpen(java.lang.foreign.MemoryAddress open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open));
            return this;
        }
        
        public Build setClose(java.lang.foreign.MemoryAddress close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close));
            return this;
        }
        
        public Build setGetSurface(java.lang.foreign.MemoryAddress getSurface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSurface == null ? MemoryAddress.NULL : getSurface));
            return this;
        }
        
        public Build setGetPresentationSupport(java.lang.foreign.MemoryAddress getPresentationSupport) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_presentation_support"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPresentationSupport == null ? MemoryAddress.NULL : getPresentationSupport));
            return this;
        }
        
        public Build setSetWindowHandle(java.lang.foreign.MemoryAddress setWindowHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle));
            return this;
        }
        
        public Build setGetSurfaceDimensions(java.lang.foreign.MemoryAddress getSurfaceDimensions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surface_dimensions"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSurfaceDimensions == null ? MemoryAddress.NULL : getSurfaceDimensions));
            return this;
        }
        
        public Build setHandleEvents(java.lang.foreign.MemoryAddress handleEvents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents));
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
