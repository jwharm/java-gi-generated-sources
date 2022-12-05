package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstVulkan namespace.
 */
public final class GstVulkan {
    
    static {
        System.loadLibrary("gstvulkan-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    public static final java.lang.String CAPS_FEATURE_MEMORY_VULKAN_BUFFER = "memory:VulkanBuffer";
    
    public static final java.lang.String CAPS_FEATURE_MEMORY_VULKAN_IMAGE = "memory:VulkanImage";
    
    public static final java.lang.String VULKAN_BUFFER_MEMORY_ALLOCATOR_NAME = "VulkanBuffer";
    
    public static final java.lang.String VULKAN_DEVICE_CONTEXT_TYPE_STR = "gst.vulkan.device";
    
    public static final java.lang.String VULKAN_DISPLAY_CONTEXT_TYPE_STR = "gst.vulkan.display";
    
    public static final java.lang.String VULKAN_IMAGE_MEMORY_ALLOCATOR_NAME = "VulkanImage";
    
    public static final java.lang.String VULKAN_INSTANCE_CONTEXT_TYPE_STR = "gst.vulkan.instance";
    
    public static final int VULKAN_MAX_COMPONENTS = 4;
    
    public static final java.lang.String VULKAN_MEMORY_ALLOCATOR_NAME = "Vulkan";
    
    public static final java.lang.String VULKAN_QUEUE_CONTEXT_TYPE_STR = "gst.vulkan.queue";
    
    public static final java.lang.String VULKAN_SWAPPER_VIDEO_FORMATS = " { RGBA, BGRA, RGB, BGR } ";
    
    public static boolean contextGetVulkanDevice(@NotNull org.gstreamer.gst.Context context, @NotNull PointerProxy<org.gstreamer.vulkan.VulkanDevice> device) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_context_get_vulkan_device.invokeExact(
                    context.handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static boolean contextGetVulkanDisplay(@NotNull org.gstreamer.gst.Context context, @NotNull PointerProxy<org.gstreamer.vulkan.VulkanDisplay> display) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_context_get_vulkan_display.invokeExact(
                    context.handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static boolean contextGetVulkanInstance(@NotNull org.gstreamer.gst.Context context, @NotNull PointerProxy<org.gstreamer.vulkan.VulkanInstance> instance) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_context_get_vulkan_instance.invokeExact(
                    context.handle(),
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static boolean contextGetVulkanQueue(@NotNull org.gstreamer.gst.Context context, @NotNull PointerProxy<org.gstreamer.vulkan.VulkanQueue> queue) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(queue, "Parameter 'queue' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_context_get_vulkan_queue.invokeExact(
                    context.handle(),
                    queue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code device} on {@code context}
     * @param context a {@link org.gstreamer.gst.Context}
     * @param device a {@link VulkanDevice}
     */
    public static void contextSetVulkanDevice(@NotNull org.gstreamer.gst.Context context, @NotNull org.gstreamer.vulkan.VulkanDevice device) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        try {
            DowncallHandles.gst_context_set_vulkan_device.invokeExact(
                    context.handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code display} on {@code context}
     * @param context a {@link org.gstreamer.gst.Context}
     * @param display a {@link VulkanDisplay}
     */
    public static void contextSetVulkanDisplay(@NotNull org.gstreamer.gst.Context context, @NotNull org.gstreamer.vulkan.VulkanDisplay display) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        try {
            DowncallHandles.gst_context_set_vulkan_display.invokeExact(
                    context.handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code instance} on {@code context}
     * @param context a {@link org.gstreamer.gst.Context}
     * @param instance a {@link VulkanInstance}
     */
    public static void contextSetVulkanInstance(@NotNull org.gstreamer.gst.Context context, @NotNull org.gstreamer.vulkan.VulkanInstance instance) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        try {
            DowncallHandles.gst_context_set_vulkan_instance.invokeExact(
                    context.handle(),
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code queue} on {@code context}
     * @param context a {@link org.gstreamer.gst.Context}
     * @param queue a {@link VulkanQueue}
     */
    public static void contextSetVulkanQueue(@NotNull org.gstreamer.gst.Context context, @NotNull org.gstreamer.vulkan.VulkanQueue queue) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(queue, "Parameter 'queue' must not be null");
        try {
            DowncallHandles.gst_context_set_vulkan_queue.invokeExact(
                    context.handle(),
                    queue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static boolean isVulkanBufferMemory(@NotNull org.gstreamer.gst.Memory mem) {
        java.util.Objects.requireNonNull(mem, "Parameter 'mem' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_vulkan_buffer_memory.invokeExact(
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static boolean isVulkanImageMemory(@NotNull org.gstreamer.gst.Memory mem) {
        java.util.Objects.requireNonNull(mem, "Parameter 'mem' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_vulkan_image_memory.invokeExact(
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static boolean isVulkanMemory(@NotNull org.gstreamer.gst.Memory mem) {
        java.util.Objects.requireNonNull(mem, "Parameter 'mem' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_vulkan_memory.invokeExact(
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Allocate a new {@link VulkanBufferMemory}.
     * @param device a {@link VulkanDevice}
     * @param size size of the new buffer
     * @param usage buffer usage flags
     * @param memPropFlags memory properties flags for the backing memory
     * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan buffer
     *          backed by vulkan device memory
     */
    public static @NotNull org.gstreamer.gst.Memory vulkanBufferMemoryAlloc(@NotNull org.gstreamer.vulkan.VulkanDevice device, long size, @NotNull org.vulkan.BufferUsageFlags usage, @NotNull org.vulkan.MemoryPropertyFlags memPropFlags) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(usage, "Parameter 'usage' must not be null");
        java.util.Objects.requireNonNull(memPropFlags, "Parameter 'memPropFlags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_buffer_memory_alloc.invokeExact(
                    device.handle(),
                    size,
                    usage.handle(),
                    memPropFlags.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
    }
    
    /**
     * Initializes the Vulkan buffer memory allocator. It is safe to call this function
     * multiple times.  This must be called before any other {@link VulkanBufferMemory} operation.
     */
    public static void vulkanBufferMemoryInitOnce() {
        try {
            DowncallHandles.gst_vulkan_buffer_memory_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocated a new wrapped {@link VulkanBufferMemory} with {@code buffer}.
     * @param device a {@link VulkanDevice}
     * @param buffer a {@code VkBuffer}
     * @param usage usage flags of {@code buffer}
     * @param userData user data to call {@code notify} with
     * @param notify a {@link org.gtk.glib.DestroyNotify} called when {@code buffer} is no longer in use
     * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan device memory
     */
    public static @NotNull org.gstreamer.gst.Memory vulkanBufferMemoryWrapped(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.vulkan.Buffer buffer, @NotNull org.vulkan.BufferUsageFlags usage, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(usage, "Parameter 'usage' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_buffer_memory_wrapped.invokeExact(
                    device.handle(),
                    buffer.handle(),
                    usage.handle(),
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.vulkan.VulkanHandle vulkanCreateShader(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull java.lang.String code, long size) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(code, "Parameter 'code' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_create_shader.invokeExact(
                    device.handle(),
                    Interop.allocateNativeString(code),
                    size,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.vulkan.VulkanHandle(RESULT, Ownership.FULL);
    }
    
    public static @NotNull java.lang.String vulkanDisplayTypeToExtensionString(@NotNull org.gstreamer.vulkan.VulkanDisplayType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_type_to_extension_string.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Perform the steps necessary for retrieving a {@link VulkanInstance} and
     * (optionally) an {@link VulkanDisplay} from the surrounding elements or from
     * the application using the {@link org.gstreamer.gst.Context} mechanism.
     * <p>
     * If the contents of {@code display_ptr} or {@code instance_ptr} are not {@code null}, then no
     * {@link org.gstreamer.gst.Context} query is necessary and no {@link VulkanInstance} or {@link VulkanDisplay}
     * retrieval is performed.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param displayPtr the resulting {@link VulkanDisplay}
     * @param instancePtr the resulting {@link VulkanInstance}
     * @return whether a {@link VulkanInstance} exists in {@code instance_ptr} and if
     *          {@code display_ptr} is not {@code null}, whether a {@link VulkanDisplay} exists in
     *          {@code display_ptr}
     */
    public static boolean vulkanEnsureElementData(@NotNull org.gstreamer.gst.Element element, @NotNull Out<org.gstreamer.vulkan.VulkanDisplay> displayPtr, @NotNull Out<org.gstreamer.vulkan.VulkanInstance> instancePtr) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(displayPtr, "Parameter 'displayPtr' must not be null");
        MemorySegment displayPtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(instancePtr, "Parameter 'instancePtr' must not be null");
        MemorySegment instancePtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_ensure_element_data.invokeExact(
                    element.handle(),
                    (Addressable) displayPtrPOINTER.address(),
                    (Addressable) instancePtrPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        displayPtr.set(new org.gstreamer.vulkan.VulkanDisplay(displayPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        instancePtr.set(new org.gstreamer.vulkan.VulkanInstance(instancePtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    public static @NotNull org.gtk.glib.Quark vulkanErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * if {@code result} indicates an error condition, fills out {@link org.gtk.glib.Error} with details of
     * the error
     * @param result a VkResult
     * @param error a {@link org.gtk.glib.Error} to fill
     * @param format the printf-like format to write into the {@link org.gtk.glib.Error}
     * @param varargs arguments for {@code format}
     * @return {@code result} for easy chaining
     */
    public static @NotNull org.vulkan.Result vulkanErrorToGError(@NotNull org.vulkan.Result result, @NotNull Out<org.gtk.glib.Error> error, @NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment errorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_error_to_g_error.invokeExact(
                    result.handle(),
                    (Addressable) errorPOINTER.address(),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        error.set(new org.gtk.glib.Error(errorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return new org.vulkan.Result(RESULT, Ownership.UNKNOWN);
    }
    
    public static @NotNull org.vulkan.Format vulkanFormatFromVideoInfo(@NotNull org.gstreamer.video.VideoInfo vInfo, int plane) {
        java.util.Objects.requireNonNull(vInfo, "Parameter 'vInfo' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_format_from_video_info.invokeExact(
                    vInfo.handle(),
                    plane);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.vulkan.Format(RESULT, Ownership.UNKNOWN);
    }
    
    public static @NotNull org.gstreamer.vulkan.VulkanFormatInfo vulkanFormatGetInfo(@NotNull org.vulkan.Format format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_format_get_info.invokeExact(
                    format.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanFormatInfo(RESULT, Ownership.NONE);
    }
    
    public static @NotNull org.gstreamer.vulkan.VulkanImageView vulkanGetOrCreateImageView(@NotNull org.gstreamer.vulkan.VulkanImageMemory image) {
        java.util.Objects.requireNonNull(image, "Parameter 'image' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_get_or_create_image_view.invokeExact(
                    image.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanImageView(RESULT, Ownership.FULL);
    }
    
    /**
     * Performs the steps necessary for executing a context query including
     * posting a message for the application to respond.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param contextType the context type to query for
     */
    public static void vulkanGlobalContextQuery(@NotNull org.gstreamer.gst.Element element, @NotNull java.lang.String contextType) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        try {
            DowncallHandles.gst_vulkan_global_context_query.invokeExact(
                    element.handle(),
                    Interop.allocateNativeString(contextType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static boolean vulkanHandleContextQuery(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Query query, @Nullable org.gstreamer.vulkan.VulkanDisplay display, @Nullable org.gstreamer.vulkan.VulkanInstance instance, @Nullable org.gstreamer.vulkan.VulkanDevice device) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_handle_context_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    (Addressable) (display == null ? MemoryAddress.NULL : display.handle()),
                    (Addressable) (instance == null ? MemoryAddress.NULL : instance.handle()),
                    (Addressable) (device == null ? MemoryAddress.NULL : device.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Helper function for implementing {@link org.gstreamer.gst.ElementClass}.set_context() in
     * Vulkan capable elements.
     * <p>
     * Retrieve's the {@link VulkanDisplay} or {@link VulkanInstance} in {@code context} and places
     * the result in {@code display} or {@code instance} respectively.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param context a {@link org.gstreamer.gst.Context}
     * @param display location of a {@link VulkanDisplay}
     * @param instance location of a {@link VulkanInstance}
     * @return whether the {@code display} or {@code instance} could be set successfully
     */
    public static boolean vulkanHandleSetContext(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Context context, @NotNull Out<org.gstreamer.vulkan.VulkanDisplay> display, @NotNull Out<org.gstreamer.vulkan.VulkanInstance> instance) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        MemorySegment displayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        MemorySegment instancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_handle_set_context.invokeExact(
                    element.handle(),
                    context.handle(),
                    (Addressable) displayPOINTER.address(),
                    (Addressable) instancePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        display.set(new org.gstreamer.vulkan.VulkanDisplay(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        instance.set(new org.gstreamer.vulkan.VulkanInstance(instancePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
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
    public static @NotNull org.gstreamer.gst.Memory vulkanImageMemoryAlloc(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.vulkan.Format format, long width, long height, @NotNull org.vulkan.ImageTiling tiling, @NotNull org.vulkan.ImageUsageFlags usage, @NotNull org.vulkan.MemoryPropertyFlags memPropFlags) {
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
    public static void vulkanImageMemoryInitOnce() {
        try {
            DowncallHandles.gst_vulkan_image_memory_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static @NotNull org.gstreamer.gst.Memory vulkanImageMemoryWrapped(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.vulkan.Image image, @NotNull org.vulkan.Format format, long width, long height, @NotNull org.vulkan.ImageTiling tiling, @NotNull org.vulkan.ImageUsageFlags usage, @Nullable java.lang.foreign.MemoryAddress userData, @NotNull org.gtk.glib.DestroyNotify notify) {
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
    
    /**
     * Performs the steps necessary for executing a context query between only
     * other elements in the pipeline
     * @param element a {@link org.gstreamer.gst.Element}
     * @param contextType the context type to query for
     */
    public static @NotNull org.gstreamer.gst.Query vulkanLocalContextQuery(@NotNull org.gstreamer.gst.Element element, @NotNull java.lang.String contextType) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_local_context_query.invokeExact(
                    element.handle(),
                    Interop.allocateNativeString(contextType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Query(RESULT, Ownership.FULL);
    }
    
    /**
     * Allocated a new {@link VulkanMemory}.
     * @param device a {@link VulkanDevice}
     * @param memoryTypeIndex the Vulkan memory type index
     * @param params a {@link org.gstreamer.gst.AllocationParams}
     * @param size the size to allocate
     * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan device memory
     */
    public static @NotNull org.gstreamer.gst.Memory vulkanMemoryAlloc(@NotNull org.gstreamer.vulkan.VulkanDevice device, int memoryTypeIndex, @NotNull org.gstreamer.gst.AllocationParams params, long size, @NotNull org.vulkan.MemoryPropertyFlags memPropFlags) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        java.util.Objects.requireNonNull(memPropFlags, "Parameter 'memPropFlags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_memory_alloc.invokeExact(
                    device.handle(),
                    memoryTypeIndex,
                    params.handle(),
                    size,
                    memPropFlags.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
    }
    
    public static boolean vulkanMemoryFindMemoryTypeIndexWithTypeProperties(@NotNull org.gstreamer.vulkan.VulkanDevice device, int typeBits, @NotNull org.vulkan.MemoryPropertyFlags properties, PointerInteger typeIndex) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(properties, "Parameter 'properties' must not be null");
        java.util.Objects.requireNonNull(typeIndex, "Parameter 'typeIndex' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_memory_find_memory_type_index_with_type_properties.invokeExact(
                    device.handle(),
                    typeBits,
                    properties.handle(),
                    typeIndex.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static @NotNull java.lang.String vulkanMemoryHeapFlagsToString(@NotNull org.vulkan.MemoryHeapFlags propBits) {
        java.util.Objects.requireNonNull(propBits, "Parameter 'propBits' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_memory_heap_flags_to_string.invokeExact(
                    propBits.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Initializes the Vulkan memory allocator. It is safe to call this function
     * multiple times.  This must be called before any other {@link VulkanMemory} operation.
     */
    public static void vulkanMemoryInitOnce() {
        try {
            DowncallHandles.gst_vulkan_memory_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static @NotNull java.lang.String vulkanMemoryPropertyFlagsToString(@NotNull org.vulkan.MemoryPropertyFlags propBits) {
        java.util.Objects.requireNonNull(propBits, "Parameter 'propBits' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_memory_property_flags_to_string.invokeExact(
                    propBits.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public static @NotNull java.lang.String vulkanPresentModeToString(@NotNull org.vulkan.PresentModeKHR presentMode) {
        java.util.Objects.requireNonNull(presentMode, "Parameter 'presentMode' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_present_mode_to_string.invokeExact(
                    presentMode.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public static boolean vulkanRunQuery(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Query query, @NotNull org.gstreamer.gst.PadDirection direction) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_run_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static @NotNull java.lang.String vulkanSampleCountFlagsToString(@NotNull org.vulkan.SampleCountFlags sampleCountBits) {
        java.util.Objects.requireNonNull(sampleCountBits, "Parameter 'sampleCountBits' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_sample_count_flags_to_string.invokeExact(
                    sampleCountBits.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * A {@link VulkanTrashNotify} implementation for unreffing a {@link org.gstreamer.gst.MiniObject} when the
     * associated {@link VulkanFence} is signalled
     * @param device the {@link VulkanDevice}
     * @param userData the {@link org.gstreamer.gst.MiniObject}
     */
    public static void vulkanTrashMiniObjectUnref(@NotNull org.gstreamer.vulkan.VulkanDevice device, @Nullable java.lang.foreign.MemoryAddress userData) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        try {
            DowncallHandles.gst_vulkan_trash_mini_object_unref.invokeExact(
                    device.handle(),
                    (Addressable) userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link VulkanTrashNotify} implementation for unreffing a {@link org.gstreamer.gst.Object} when the
     * associated {@link VulkanFence} is signalled
     * @param device the {@link VulkanDevice}
     * @param userData the {@link org.gstreamer.gst.MiniObject}
     */
    public static void vulkanTrashObjectUnref(@NotNull org.gstreamer.vulkan.VulkanDevice device, @Nullable java.lang.foreign.MemoryAddress userData) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        try {
            DowncallHandles.gst_vulkan_trash_object_unref.invokeExact(
                    device.handle(),
                    (Addressable) userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static @NotNull org.gtk.glib.Quark vulkanWindowErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_window_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_context_get_vulkan_device = Interop.downcallHandle(
            "gst_context_get_vulkan_device",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_get_vulkan_display = Interop.downcallHandle(
            "gst_context_get_vulkan_display",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_get_vulkan_instance = Interop.downcallHandle(
            "gst_context_get_vulkan_instance",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_get_vulkan_queue = Interop.downcallHandle(
            "gst_context_get_vulkan_queue",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_set_vulkan_device = Interop.downcallHandle(
            "gst_context_set_vulkan_device",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_set_vulkan_display = Interop.downcallHandle(
            "gst_context_set_vulkan_display",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_set_vulkan_instance = Interop.downcallHandle(
            "gst_context_set_vulkan_instance",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_set_vulkan_queue = Interop.downcallHandle(
            "gst_context_set_vulkan_queue",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_is_vulkan_buffer_memory = Interop.downcallHandle(
            "gst_is_vulkan_buffer_memory",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_is_vulkan_image_memory = Interop.downcallHandle(
            "gst_is_vulkan_image_memory",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_is_vulkan_memory = Interop.downcallHandle(
            "gst_is_vulkan_memory",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_buffer_memory_alloc = Interop.downcallHandle(
            "gst_vulkan_buffer_memory_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_buffer_memory_init_once = Interop.downcallHandle(
            "gst_vulkan_buffer_memory_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_vulkan_buffer_memory_wrapped = Interop.downcallHandle(
            "gst_vulkan_buffer_memory_wrapped",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_create_shader = Interop.downcallHandle(
            "gst_vulkan_create_shader",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_type_to_extension_string = Interop.downcallHandle(
            "gst_vulkan_display_type_to_extension_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_ensure_element_data = Interop.downcallHandle(
            "gst_vulkan_ensure_element_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_error_quark = Interop.downcallHandle(
            "gst_vulkan_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_error_to_g_error = Interop.downcallHandle(
            "gst_vulkan_error_to_g_error",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_vulkan_format_from_video_info = Interop.downcallHandle(
            "gst_vulkan_format_from_video_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_format_get_info = Interop.downcallHandle(
            "gst_vulkan_format_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_get_or_create_image_view = Interop.downcallHandle(
            "gst_vulkan_get_or_create_image_view",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_global_context_query = Interop.downcallHandle(
            "gst_vulkan_global_context_query",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_context_query = Interop.downcallHandle(
            "gst_vulkan_handle_context_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_set_context = Interop.downcallHandle(
            "gst_vulkan_handle_set_context",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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
        
        private static final MethodHandle gst_vulkan_local_context_query = Interop.downcallHandle(
            "gst_vulkan_local_context_query",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_memory_alloc = Interop.downcallHandle(
            "gst_vulkan_memory_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_memory_find_memory_type_index_with_type_properties = Interop.downcallHandle(
            "gst_vulkan_memory_find_memory_type_index_with_type_properties",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_memory_heap_flags_to_string = Interop.downcallHandle(
            "gst_vulkan_memory_heap_flags_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_memory_init_once = Interop.downcallHandle(
            "gst_vulkan_memory_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_vulkan_memory_property_flags_to_string = Interop.downcallHandle(
            "gst_vulkan_memory_property_flags_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_present_mode_to_string = Interop.downcallHandle(
            "gst_vulkan_present_mode_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_run_query = Interop.downcallHandle(
            "gst_vulkan_run_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_sample_count_flags_to_string = Interop.downcallHandle(
            "gst_vulkan_sample_count_flags_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_mini_object_unref = Interop.downcallHandle(
            "gst_vulkan_trash_mini_object_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_object_unref = Interop.downcallHandle(
            "gst_vulkan_trash_object_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_error_quark = Interop.downcallHandle(
            "gst_vulkan_window_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
        
        public static int cbVulkanDeviceForEachQueueFunc(MemoryAddress device, MemoryAddress queue, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (VulkanDeviceForEachQueueFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onVulkanDeviceForEachQueueFunc(new org.gstreamer.vulkan.VulkanDevice(device, Ownership.NONE), new org.gstreamer.vulkan.VulkanQueue(queue, Ownership.NONE));
            return RESULT ? 1 : 0;
        }
        
        public static void cbVulkanTrashNotify(MemoryAddress device, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (VulkanTrashNotify) Interop.signalRegistry.get(HASH);
            HANDLER.onVulkanTrashNotify(new org.gstreamer.vulkan.VulkanDevice(device, Ownership.NONE));
        }
        
        public static int cbVulkanImageMemoryFindViewFunc(MemoryAddress view, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (VulkanImageMemoryFindViewFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onVulkanImageMemoryFindViewFunc(new org.gstreamer.vulkan.VulkanImageView(view, Ownership.NONE));
            return RESULT ? 1 : 0;
        }
        
        public static void cbVulkanHandleDestroyNotify(MemoryAddress handle, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (VulkanHandleDestroyNotify) Interop.signalRegistry.get(HASH);
            HANDLER.onVulkanHandleDestroyNotify(new org.gstreamer.vulkan.VulkanHandle(handle, Ownership.NONE));
        }
    }
}
