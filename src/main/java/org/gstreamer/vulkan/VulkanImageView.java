package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanImageView extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanImageView";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("device"),
        Interop.valueLayout.ADDRESS.withName("image"),
        org.vulkan.ImageView.getMemoryLayout().withName("view"),
        org.vulkan.ImageViewCreateInfo.getMemoryLayout().withName("create_info"),
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
     * Allocate a new {@link VulkanImageView}
     * @return A new, uninitialized @{link VulkanImageView}
     */
    public static VulkanImageView allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanImageView newInstance = new VulkanImageView(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.MiniObject parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gstreamer.gst.MiniObject(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code device}
     * @return The value of the field {@code device}
     */
    public org.gstreamer.vulkan.VulkanDevice device$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("device"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanDevice(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code device}
     * @param device The new value of the field {@code device}
     */
    public void device$set(org.gstreamer.vulkan.VulkanDevice device) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("device"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), device.handle());
    }
    
    /**
     * Get the value of the field {@code image}
     * @return The value of the field {@code image}
     */
    public org.gstreamer.vulkan.VulkanImageMemory image$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("image"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanImageMemory(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code image}
     * @param image The new value of the field {@code image}
     */
    public void image$set(org.gstreamer.vulkan.VulkanImageMemory image) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("image"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), image.handle());
    }
    
    /**
     * Get the value of the field {@code view}
     * @return The value of the field {@code view}
     */
    public org.vulkan.ImageView view$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("view"));
        return new org.vulkan.ImageView(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code create_info}
     * @return The value of the field {@code create_info}
     */
    public org.vulkan.ImageViewCreateInfo createInfo$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("create_info"));
        return new org.vulkan.ImageViewCreateInfo(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanImageView proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanImageView(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.vulkan.VulkanImageMemory image, @NotNull org.vulkan.ImageViewCreateInfo createInfo) {
        java.util.Objects.requireNonNull(image, "Parameter 'image' must not be null");
        java.util.Objects.requireNonNull(createInfo, "Parameter 'createInfo' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_image_view_new.invokeExact(
                    image.handle(),
                    createInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanImageView(@NotNull org.gstreamer.vulkan.VulkanImageMemory image, @NotNull org.vulkan.ImageViewCreateInfo createInfo) {
        super(constructNew(image, createInfo), Ownership.FULL);
    }
    
    /**
     * Increases the refcount of the given trash object by one.
     * @return {@code trash}
     */
    public @NotNull org.gstreamer.vulkan.VulkanImageView ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_image_view_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanImageView(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the refcount of the trash object. If the refcount reaches 0, the
     * trash will be freed.
     */
    public void unref() {
        try {
            DowncallHandles.gst_vulkan_image_view_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_image_view_new = Interop.downcallHandle(
            "gst_vulkan_image_view_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_image_view_ref = Interop.downcallHandle(
            "gst_vulkan_image_view_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_image_view_unref = Interop.downcallHandle(
            "gst_vulkan_image_view_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanImageView struct;
        
         /**
         * A {@link VulkanImageView.Build} object constructs a {@link VulkanImageView} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanImageView.allocate();
        }
        
         /**
         * Finish building the {@link VulkanImageView} struct.
         * @return A new instance of {@code VulkanImageView} with the fields 
         *         that were set in the Build object.
         */
        public VulkanImageView construct() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.MiniObject}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gstreamer.gst.MiniObject parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * the {@link VulkanDevice}
         * @param device The value for the {@code device} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDevice(org.gstreamer.vulkan.VulkanDevice device) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("device"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (device == null ? MemoryAddress.NULL : device.handle()));
            return this;
        }
        
        /**
         * the associated {@link VulkanImageMemory} for this view
         * @param image The value for the {@code image} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setImage(org.gstreamer.vulkan.VulkanImageMemory image) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("image"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (image == null ? MemoryAddress.NULL : image.handle()));
            return this;
        }
        
        /**
         * the vulkan image view handle
         * @param view The value for the {@code view} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setView(org.vulkan.ImageView view) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("view"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (view == null ? MemoryAddress.NULL : view.handle()));
            return this;
        }
        
        /**
         * the creation information for this view
         * @param createInfo The value for the {@code createInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCreateInfo(org.vulkan.ImageViewCreateInfo createInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createInfo == null ? MemoryAddress.NULL : createInfo.handle()));
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
