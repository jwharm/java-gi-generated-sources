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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    public org.gstreamer.gst.Memory parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gstreamer.gst.Memory(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
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
    public org.vulkan.Image image$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("image"));
        return new org.vulkan.Image(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code vk_mem}
     * @return The value of the field {@code vk_mem}
     */
    public org.gstreamer.vulkan.VulkanMemory vkMem$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanMemory(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code vk_mem}
     * @param vkMem The new value of the field {@code vk_mem}
     */
    public void vkMem$set(org.gstreamer.vulkan.VulkanMemory vkMem) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), vkMem.handle());
    }
    
    /**
     * Get the value of the field {@code create_info}
     * @return The value of the field {@code create_info}
     */
    public org.vulkan.ImageCreateInfo createInfo$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("create_info"));
        return new org.vulkan.ImageCreateInfo(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code requirements}
     * @return The value of the field {@code requirements}
     */
    public org.vulkan.MemoryRequirements requirements$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("requirements"));
        return new org.vulkan.MemoryRequirements(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code format_properties}
     * @return The value of the field {@code format_properties}
     */
    public org.vulkan.ImageFormatProperties formatProperties$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("format_properties"));
        return new org.vulkan.ImageFormatProperties(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code usage}
     * @return The value of the field {@code usage}
     */
    public org.vulkan.ImageUsageFlags usage$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("usage"));
        return new org.vulkan.ImageUsageFlags(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code barrier}
     * @return The value of the field {@code barrier}
     */
    public org.gstreamer.vulkan.VulkanBarrierImageInfo barrier$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("barrier"));
        return new org.gstreamer.vulkan.VulkanBarrierImageInfo(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanImageMemory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanImageMemory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public void addView(@NotNull org.gstreamer.vulkan.VulkanImageView view) {
        java.util.Objects.requireNonNull(view, "Parameter 'view' must not be null");
        try {
            DowncallHandles.gst_vulkan_image_memory_add_view.invokeExact(
                    handle(),
                    view.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanImageView findView(@NotNull org.gstreamer.vulkan.VulkanImageMemoryFindViewFunc findFunc) {
        java.util.Objects.requireNonNull(findFunc, "Parameter 'findFunc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_image_memory_find_view.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstVulkan.Callbacks.class, "cbVulkanImageMemoryFindViewFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(findFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanImageView(RESULT, Ownership.FULL);
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
    
    public boolean init(@NotNull org.gstreamer.gst.Allocator allocator, @NotNull org.gstreamer.gst.Memory parent, @NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.vulkan.ImageUsageFlags usage, @NotNull org.gstreamer.gst.AllocationParams params, long size, @Nullable java.lang.foreign.MemoryAddress userData, @NotNull org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(allocator, "Parameter 'allocator' must not be null");
        java.util.Objects.requireNonNull(parent, "Parameter 'parent' must not be null");
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(usage, "Parameter 'usage' must not be null");
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
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
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public static @NotNull org.gstreamer.gst.Memory alloc(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.vulkan.Format format, long width, long height, @NotNull org.vulkan.ImageTiling tiling, @NotNull org.vulkan.ImageUsageFlags usage, @NotNull org.vulkan.MemoryPropertyFlags memPropFlags) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(tiling, "Parameter 'tiling' must not be null");
        java.util.Objects.requireNonNull(usage, "Parameter 'usage' must not be null");
        java.util.Objects.requireNonNull(memPropFlags, "Parameter 'memPropFlags' must not be null");
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
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
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
    
    public static @NotNull org.gstreamer.gst.Memory wrapped(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.vulkan.Image image, @NotNull org.vulkan.Format format, long width, long height, @NotNull org.vulkan.ImageTiling tiling, @NotNull org.vulkan.ImageUsageFlags usage, @Nullable java.lang.foreign.MemoryAddress userData, @NotNull org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(image, "Parameter 'image' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(tiling, "Parameter 'tiling' must not be null");
        java.util.Objects.requireNonNull(usage, "Parameter 'usage' must not be null");
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
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanImageMemory struct;
        
         /**
         * A {@link VulkanImageMemory.Build} object constructs a {@link VulkanImageMemory} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanImageMemory.allocate();
        }
        
         /**
         * Finish building the {@link VulkanImageMemory} struct.
         * @return A new instance of {@code VulkanImageMemory} with the fields 
         *         that were set in the Build object.
         */
        public VulkanImageMemory construct() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Memory}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gstreamer.gst.Memory parent) {
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
        public Build setDevice(org.gstreamer.vulkan.VulkanDevice device) {
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
        public Build setImage(org.vulkan.Image image) {
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
        public Build setVkMem(org.gstreamer.vulkan.VulkanMemory vkMem) {
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
        public Build setCreateInfo(org.vulkan.ImageCreateInfo createInfo) {
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
        public Build setRequirements(org.vulkan.MemoryRequirements requirements) {
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
        public Build setFormatProperties(org.vulkan.ImageFormatProperties formatProperties) {
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
        public Build setUsage(org.vulkan.ImageUsageFlags usage) {
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
        public Build setBarrier(org.gstreamer.vulkan.VulkanBarrierImageInfo barrier) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("barrier"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (barrier == null ? MemoryAddress.NULL : barrier.handle()));
            return this;
        }
        
        public Build setLock(org.gtk.glib.Mutex lock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
            return this;
        }
        
        public Build setWrapped(boolean wrapped) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wrapped"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), wrapped ? 1 : 0);
            return this;
        }
        
        public Build setNotify(java.lang.foreign.MemoryAddress notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : notify));
            return this;
        }
        
        public Build setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Build setViews(java.lang.foreign.MemoryAddress[] views) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("views"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (views == null ? MemoryAddress.NULL : Interop.allocateNativeArray(views, false)));
            return this;
        }
        
        public Build setOutstandingViews(java.lang.foreign.MemoryAddress[] outstandingViews) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("outstanding_views"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outstandingViews == null ? MemoryAddress.NULL : Interop.allocateNativeArray(outstandingViews, false)));
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
