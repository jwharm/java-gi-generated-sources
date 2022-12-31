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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("device"),
            Interop.valueLayout.ADDRESS.withName("image"),
            org.vulkan.ImageView.getMemoryLayout().withName("view"),
            org.vulkan.ImageViewCreateInfo.getMemoryLayout().withName("create_info"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
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
    public org.gstreamer.gst.MiniObject getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gst.MiniObject.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gst.MiniObject parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    /**
     * Get the value of the field {@code device}
     * @return The value of the field {@code device}
     */
    public org.gstreamer.vulkan.VulkanDevice getDevice() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("device"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return (org.gstreamer.vulkan.VulkanDevice) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code device}
     * @param device The new value of the field {@code device}
     */
    public void setDevice(org.gstreamer.vulkan.VulkanDevice device) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("device"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (device == null ? MemoryAddress.NULL : device.handle()));
    }
    
    /**
     * Get the value of the field {@code image}
     * @return The value of the field {@code image}
     */
    public org.gstreamer.vulkan.VulkanImageMemory getImage() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("image"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.vulkan.VulkanImageMemory.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code image}
     * @param image The new value of the field {@code image}
     */
    public void setImage(org.gstreamer.vulkan.VulkanImageMemory image) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("image"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (image == null ? MemoryAddress.NULL : image.handle()));
    }
    
    /**
     * Get the value of the field {@code view}
     * @return The value of the field {@code view}
     */
    public org.vulkan.ImageView getView() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("view"));
        return org.vulkan.ImageView.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code view}
     * @param view The new value of the field {@code view}
     */
    public void setView(org.vulkan.ImageView view) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("view"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (view == null ? MemoryAddress.NULL : view.handle()));
    }
    
    /**
     * Get the value of the field {@code create_info}
     * @return The value of the field {@code create_info}
     */
    public org.vulkan.ImageViewCreateInfo getCreateInfo() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("create_info"));
        return org.vulkan.ImageViewCreateInfo.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code create_info}
     * @param createInfo The new value of the field {@code create_info}
     */
    public void setCreateInfo(org.vulkan.ImageViewCreateInfo createInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createInfo == null ? MemoryAddress.NULL : createInfo.handle()));
    }
    
    /**
     * Create a VulkanImageView proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanImageView(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanImageView> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanImageView(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.vulkan.VulkanImageMemory image, org.vulkan.ImageViewCreateInfo createInfo) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_image_view_new.invokeExact(
                    image.handle(),
                    createInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanImageView(org.gstreamer.vulkan.VulkanImageMemory image, org.vulkan.ImageViewCreateInfo createInfo) {
        super(constructNew(image, createInfo), Ownership.FULL);
    }
    
    /**
     * Increases the refcount of the given trash object by one.
     * @return {@code trash}
     */
    public org.gstreamer.vulkan.VulkanImageView ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_image_view_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.vulkan.VulkanImageView.fromAddress.marshal(RESULT, Ownership.FULL);
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
     * A {@link VulkanImageView.Builder} object constructs a {@link VulkanImageView} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanImageView.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanImageView struct;
        
        private Builder() {
            struct = VulkanImageView.allocate();
        }
        
         /**
         * Finish building the {@link VulkanImageView} struct.
         * @return A new instance of {@code VulkanImageView} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanImageView build() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.MiniObject}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.gst.MiniObject parent) {
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
        public Builder setDevice(org.gstreamer.vulkan.VulkanDevice device) {
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
        public Builder setImage(org.gstreamer.vulkan.VulkanImageMemory image) {
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
        public Builder setView(org.vulkan.ImageView view) {
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
        public Builder setCreateInfo(org.vulkan.ImageViewCreateInfo createInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createInfo == null ? MemoryAddress.NULL : createInfo.handle()));
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
