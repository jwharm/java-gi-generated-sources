package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanImageMemory extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanImageMemory";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Memory.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("device"),
            org.vulkan.Image.getMemoryLayout().withName("image"),
            Interop.valueLayout.ADDRESS.withName("vk_mem"),
            org.vulkan.ImageCreateInfo.getMemoryLayout().withName("create_info"),
            org.vulkan.MemoryRequirements.getMemoryLayout().withName("requirements"),
            org.vulkan.ImageFormatProperties.getMemoryLayout().withName("format_properties"),
            org.vulkan.ImageUsageFlags.getMemoryLayout().withName("usage"),
            org.gstreamer.vulkan.VulkanBarrierImageInfo.getMemoryLayout().withName("barrier"),
            org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
            Interop.valueLayout.C_INT.withName("wrapped"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("notify"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.ADDRESS.withName("views"),
            Interop.valueLayout.ADDRESS.withName("outstanding_views"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanImageMemory}
     * @return A new, uninitialized @{link VulkanImageMemory}
     */
    public static VulkanImageMemory allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanImageMemory newInstance = new VulkanImageMemory(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.Memory getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gst.Memory.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gst.Memory parent) {
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
    public org.vulkan.Image getImage() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("image"));
        return org.vulkan.Image.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code image}
     * @param image The new value of the field {@code image}
     */
    public void setImage(org.vulkan.Image image) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("image"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (image == null ? MemoryAddress.NULL : image.handle()));
    }
    
    /**
     * Get the value of the field {@code vk_mem}
     * @return The value of the field {@code vk_mem}
     */
    public org.gstreamer.vulkan.VulkanMemory getVkMem() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.vulkan.VulkanMemory.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code vk_mem}
     * @param vkMem The new value of the field {@code vk_mem}
     */
    public void setVkMem(org.gstreamer.vulkan.VulkanMemory vkMem) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (vkMem == null ? MemoryAddress.NULL : vkMem.handle()));
    }
    
    /**
     * Get the value of the field {@code create_info}
     * @return The value of the field {@code create_info}
     */
    public org.vulkan.ImageCreateInfo getCreateInfo() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("create_info"));
        return org.vulkan.ImageCreateInfo.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code create_info}
     * @param createInfo The new value of the field {@code create_info}
     */
    public void setCreateInfo(org.vulkan.ImageCreateInfo createInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createInfo == null ? MemoryAddress.NULL : createInfo.handle()));
    }
    
    /**
     * Get the value of the field {@code requirements}
     * @return The value of the field {@code requirements}
     */
    public org.vulkan.MemoryRequirements getRequirements() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("requirements"));
        return org.vulkan.MemoryRequirements.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code requirements}
     * @param requirements The new value of the field {@code requirements}
     */
    public void setRequirements(org.vulkan.MemoryRequirements requirements) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("requirements"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requirements == null ? MemoryAddress.NULL : requirements.handle()));
    }
    
    /**
     * Get the value of the field {@code format_properties}
     * @return The value of the field {@code format_properties}
     */
    public org.vulkan.ImageFormatProperties getFormatProperties() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("format_properties"));
        return org.vulkan.ImageFormatProperties.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code format_properties}
     * @param formatProperties The new value of the field {@code format_properties}
     */
    public void setFormatProperties(org.vulkan.ImageFormatProperties formatProperties) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("format_properties"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (formatProperties == null ? MemoryAddress.NULL : formatProperties.handle()));
    }
    
    /**
     * Get the value of the field {@code usage}
     * @return The value of the field {@code usage}
     */
    public org.vulkan.ImageUsageFlags getUsage() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("usage"));
        return org.vulkan.ImageUsageFlags.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code usage}
     * @param usage The new value of the field {@code usage}
     */
    public void setUsage(org.vulkan.ImageUsageFlags usage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("usage"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (usage == null ? MemoryAddress.NULL : usage.handle()));
    }
    
    /**
     * Get the value of the field {@code barrier}
     * @return The value of the field {@code barrier}
     */
    public org.gstreamer.vulkan.VulkanBarrierImageInfo getBarrier() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("barrier"));
        return org.gstreamer.vulkan.VulkanBarrierImageInfo.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code barrier}
     * @param barrier The new value of the field {@code barrier}
     */
    public void setBarrier(org.gstreamer.vulkan.VulkanBarrierImageInfo barrier) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("barrier"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (barrier == null ? MemoryAddress.NULL : barrier.handle()));
    }
    
    /**
     * Create a VulkanImageMemory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanImageMemory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanImageMemory> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanImageMemory(input, ownership);
    
    public void addView(org.gstreamer.vulkan.VulkanImageView view) {
        try {
            DowncallHandles.gst_vulkan_image_memory_add_view.invokeExact(
                    handle(),
                    view.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public org.gstreamer.vulkan.VulkanImageView findView(org.gstreamer.vulkan.VulkanImageMemoryFindViewFunc findFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_image_memory_find_view.invokeExact(
                    handle(),
                    (Addressable) findFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.vulkan.VulkanImageView.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_image_memory_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_image_memory_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public boolean init(org.gstreamer.gst.Allocator allocator, org.gstreamer.gst.Memory parent, org.gstreamer.vulkan.VulkanDevice device, org.vulkan.ImageUsageFlags usage, org.gstreamer.gst.AllocationParams params, long size, org.gtk.glib.DestroyNotify notify) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_image_memory_init.invokeExact(
                    handle(),
                    allocator.handle(),
                    parent.handle(),
                    device.handle(),
                    usage.handle(),
                    params.handle(),
                    size,
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Allocated a new {@link VulkanImageMemory}.
     * @param device a {@link VulkanDevice}
     * @param format the VkFormat for the new image
     * @param width width for the new image
     * @param height height for the new image
     * @param tiling tiling for the new image
     * @param usage usage flags for the new image
     * @param memPropFlags VkDeviceMemory property flags for the new image
     * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan device memory
     */
    public static org.gstreamer.gst.Memory alloc(org.gstreamer.vulkan.VulkanDevice device, org.vulkan.Format format, long width, long height, org.vulkan.ImageTiling tiling, org.vulkan.ImageUsageFlags usage, org.vulkan.MemoryPropertyFlags memPropFlags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_image_memory_alloc.invokeExact(
                    device.handle(),
                    format.handle(),
                    width,
                    height,
                    tiling.handle(),
                    usage.handle(),
                    memPropFlags.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Initializes the Vulkan image memory allocator. It is safe to call this function
     * multiple times.  This must be called before any other {@link VulkanImageMemory} operation.
     */
    public static void initOnce() {
        try {
            DowncallHandles.gst_vulkan_image_memory_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static org.gstreamer.gst.Memory wrapped(org.gstreamer.vulkan.VulkanDevice device, org.vulkan.Image image, org.vulkan.Format format, long width, long height, org.vulkan.ImageTiling tiling, org.vulkan.ImageUsageFlags usage, org.gtk.glib.DestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_image_memory_wrapped.invokeExact(
                    device.handle(),
                    image.handle(),
                    format.handle(),
                    width,
                    height,
                    tiling.handle(),
                    usage.handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_image_memory_add_view = Interop.downcallHandle(
            "gst_vulkan_image_memory_add_view",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_image_memory_find_view = Interop.downcallHandle(
            "gst_vulkan_image_memory_find_view",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_image_memory_get_height = Interop.downcallHandle(
            "gst_vulkan_image_memory_get_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_image_memory_get_width = Interop.downcallHandle(
            "gst_vulkan_image_memory_get_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_image_memory_init = Interop.downcallHandle(
            "gst_vulkan_image_memory_init",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_image_memory_alloc = Interop.downcallHandle(
            "gst_vulkan_image_memory_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_image_memory_init_once = Interop.downcallHandle(
            "gst_vulkan_image_memory_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_vulkan_image_memory_wrapped = Interop.downcallHandle(
            "gst_vulkan_image_memory_wrapped",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link VulkanImageMemory.Builder} object constructs a {@link VulkanImageMemory} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanImageMemory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanImageMemory struct;
        
        private Builder() {
            struct = VulkanImageMemory.allocate();
        }
        
         /**
         * Finish building the {@link VulkanImageMemory} struct.
         * @return A new instance of {@code VulkanImageMemory} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanImageMemory build() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Memory}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.gst.Memory parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * the {@link VulkanDevice} to allocate images from
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
         * the Vulkan image handle
         * @param image The value for the {@code image} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setImage(org.vulkan.Image image) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("image"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (image == null ? MemoryAddress.NULL : image.handle()));
            return this;
        }
        
        /**
         * the backing {@link VulkanMemory} for {@code image}
         * @param vkMem The value for the {@code vkMem} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVkMem(org.gstreamer.vulkan.VulkanMemory vkMem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (vkMem == null ? MemoryAddress.NULL : vkMem.handle()));
            return this;
        }
        
        /**
         * creation information for {@code image}
         * @param createInfo The value for the {@code createInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCreateInfo(org.vulkan.ImageCreateInfo createInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createInfo == null ? MemoryAddress.NULL : createInfo.handle()));
            return this;
        }
        
        /**
         * memory requirements for {@code image}
         * @param requirements The value for the {@code requirements} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRequirements(org.vulkan.MemoryRequirements requirements) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("requirements"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requirements == null ? MemoryAddress.NULL : requirements.handle()));
            return this;
        }
        
        /**
         * format properties
         * @param formatProperties The value for the {@code formatProperties} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormatProperties(org.vulkan.ImageFormatProperties formatProperties) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format_properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (formatProperties == null ? MemoryAddress.NULL : formatProperties.handle()));
            return this;
        }
        
        /**
         * intended usage for {@code image}
         * @param usage The value for the {@code usage} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUsage(org.vulkan.ImageUsageFlags usage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("usage"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (usage == null ? MemoryAddress.NULL : usage.handle()));
            return this;
        }
        
        /**
         * last set barrier for {@code image}
         * @param barrier The value for the {@code barrier} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBarrier(org.gstreamer.vulkan.VulkanBarrierImageInfo barrier) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("barrier"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (barrier == null ? MemoryAddress.NULL : barrier.handle()));
            return this;
        }
        
        public Builder setLock(org.gtk.glib.Mutex lock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
            return this;
        }
        
        public Builder setWrapped(boolean wrapped) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wrapped"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(wrapped, null).intValue());
            return this;
        }
        
        public Builder setNotify(org.gtk.glib.DestroyNotify notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
            return this;
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Builder setViews(java.lang.foreign.MemoryAddress[] views) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("views"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (views == null ? MemoryAddress.NULL : Interop.allocateNativeArray(views, false)));
            return this;
        }
        
        public Builder setOutstandingViews(java.lang.foreign.MemoryAddress[] outstandingViews) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("outstanding_views"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outstandingViews == null ? MemoryAddress.NULL : Interop.allocateNativeArray(outstandingViews, false)));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
