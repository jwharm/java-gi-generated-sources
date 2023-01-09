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
        LibLoad.loadLibrary("gstvulkan-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
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

public static boolean contextGetVulkanDevice(org.gstreamer.gst.Context context, PointerProxy<org.gstreamer.vulkan.VulkanDevice> device) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_context_get_vulkan_device.invokeExact(
                context.handle(),
                device.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static boolean contextGetVulkanDisplay(org.gstreamer.gst.Context context, PointerProxy<org.gstreamer.vulkan.VulkanDisplay> display) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_context_get_vulkan_display.invokeExact(
                context.handle(),
                display.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static boolean contextGetVulkanInstance(org.gstreamer.gst.Context context, PointerProxy<org.gstreamer.vulkan.VulkanInstance> instance) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_context_get_vulkan_instance.invokeExact(
                context.handle(),
                instance.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static boolean contextGetVulkanQueue(org.gstreamer.gst.Context context, PointerProxy<org.gstreamer.vulkan.VulkanQueue> queue) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_context_get_vulkan_queue.invokeExact(
                context.handle(),
                queue.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Sets {@code device} on {@code context}
 * @param context a {@link org.gstreamer.gst.Context}
 * @param device a {@link VulkanDevice}
 */
public static void contextSetVulkanDevice(org.gstreamer.gst.Context context, org.gstreamer.vulkan.VulkanDevice device) {
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
public static void contextSetVulkanDisplay(org.gstreamer.gst.Context context, org.gstreamer.vulkan.VulkanDisplay display) {
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
public static void contextSetVulkanInstance(org.gstreamer.gst.Context context, org.gstreamer.vulkan.VulkanInstance instance) {
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
public static void contextSetVulkanQueue(org.gstreamer.gst.Context context, org.gstreamer.vulkan.VulkanQueue queue) {
    try {
        DowncallHandles.gst_context_set_vulkan_queue.invokeExact(
                context.handle(),
                queue.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static boolean isVulkanBufferMemory(org.gstreamer.gst.Memory mem) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_is_vulkan_buffer_memory.invokeExact(mem.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static boolean isVulkanImageMemory(org.gstreamer.gst.Memory mem) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_is_vulkan_image_memory.invokeExact(mem.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static boolean isVulkanMemory(org.gstreamer.gst.Memory mem) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_is_vulkan_memory.invokeExact(mem.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
public static org.gstreamer.gst.Memory vulkanBufferMemoryAlloc(org.gstreamer.vulkan.VulkanDevice device, long size, org.vulkan.BufferUsageFlags usage, org.vulkan.MemoryPropertyFlags memPropFlags) {
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
    var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
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
 * @param notify a {@link org.gtk.glib.DestroyNotify} called when {@code buffer} is no longer in use
 * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan device memory
 */
public static org.gstreamer.gst.Memory vulkanBufferMemoryWrapped(org.gstreamer.vulkan.VulkanDevice device, org.vulkan.Buffer buffer, org.vulkan.BufferUsageFlags usage, @Nullable org.gtk.glib.DestroyNotify notify) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_buffer_memory_wrapped.invokeExact(
                device.handle(),
                buffer.handle(),
                usage.handle(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

public static org.gstreamer.vulkan.VulkanHandle vulkanCreateShader(org.gstreamer.vulkan.VulkanDevice device, java.lang.String code, long size) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_create_shader.invokeExact(
                    device.handle(),
                    Marshal.stringToAddress.marshal(code, SCOPE),
                    size,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        var OBJECT = org.gstreamer.vulkan.VulkanHandle.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

public static java.lang.String vulkanDisplayTypeToExtensionString(org.gstreamer.vulkan.VulkanDisplayType type) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_type_to_extension_string.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
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
public static boolean vulkanEnsureElementData(org.gstreamer.gst.Element element, @Nullable Out<org.gstreamer.vulkan.VulkanDisplay> displayPtr, Out<org.gstreamer.vulkan.VulkanInstance> instancePtr) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment displayPtrPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment instancePtrPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_ensure_element_data.invokeExact(
                    element.handle(),
                    (Addressable) (displayPtr == null ? MemoryAddress.NULL : (Addressable) displayPtrPOINTER.address()),
                    (Addressable) instancePtrPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (displayPtr != null) displayPtr.set((org.gstreamer.vulkan.VulkanDisplay) Interop.register(displayPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.vulkan.VulkanDisplay.fromAddress).marshal(displayPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                instancePtr.set((org.gstreamer.vulkan.VulkanInstance) Interop.register(instancePtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.vulkan.VulkanInstance.fromAddress).marshal(instancePtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Quark vulkanErrorQuark() {
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
public static org.vulkan.Result vulkanErrorToGError(org.vulkan.Result result, @Nullable Out<org.gtk.glib.Error> error, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment errorPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_error_to_g_error.invokeExact(
                    result.handle(),
                    (Addressable) errorPOINTER.address(),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                error.set(org.gtk.glib.Error.fromAddress.marshal(errorPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.vulkan.Result.fromAddress.marshal(RESULT, null);
    }
}

public static org.vulkan.Format vulkanFormatFromVideoInfo(org.gstreamer.video.VideoInfo vInfo, int plane) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_format_from_video_info.invokeExact(
                vInfo.handle(),
                plane);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.vulkan.Format.fromAddress.marshal(RESULT, null);
}

public static org.gstreamer.vulkan.VulkanFormatInfo vulkanFormatGetInfo(org.vulkan.Format format) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_format_get_info.invokeExact(format.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.vulkan.VulkanFormatInfo.fromAddress.marshal(RESULT, null);
}

public static org.gstreamer.vulkan.VulkanImageView vulkanGetOrCreateImageView(org.gstreamer.vulkan.VulkanImageMemory image) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_get_or_create_image_view.invokeExact(image.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.vulkan.VulkanImageView.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Performs the steps necessary for executing a context query including
 * posting a message for the application to respond.
 * @param element a {@link org.gstreamer.gst.Element}
 * @param contextType the context type to query for
 */
public static void vulkanGlobalContextQuery(org.gstreamer.gst.Element element, java.lang.String contextType) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_vulkan_global_context_query.invokeExact(
                    element.handle(),
                    Marshal.stringToAddress.marshal(contextType, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static boolean vulkanHandleContextQuery(org.gstreamer.gst.Element element, org.gstreamer.gst.Query query, @Nullable org.gstreamer.vulkan.VulkanDisplay display, @Nullable org.gstreamer.vulkan.VulkanInstance instance, @Nullable org.gstreamer.vulkan.VulkanDevice device) {
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
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
public static boolean vulkanHandleSetContext(org.gstreamer.gst.Element element, org.gstreamer.gst.Context context, @Nullable Out<org.gstreamer.vulkan.VulkanDisplay> display, Out<org.gstreamer.vulkan.VulkanInstance> instance) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment displayPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment instancePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_handle_set_context.invokeExact(
                    element.handle(),
                    context.handle(),
                    (Addressable) (display == null ? MemoryAddress.NULL : (Addressable) displayPOINTER.address()),
                    (Addressable) instancePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (display != null) display.set((org.gstreamer.vulkan.VulkanDisplay) Interop.register(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.vulkan.VulkanDisplay.fromAddress).marshal(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                instance.set((org.gstreamer.vulkan.VulkanInstance) Interop.register(instancePOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.vulkan.VulkanInstance.fromAddress).marshal(instancePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
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
public static org.gstreamer.gst.Memory vulkanImageMemoryAlloc(org.gstreamer.vulkan.VulkanDevice device, org.vulkan.Format format, long width, long height, org.vulkan.ImageTiling tiling, org.vulkan.ImageUsageFlags usage, org.vulkan.MemoryPropertyFlags memPropFlags) {
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
    var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
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

public static org.gstreamer.gst.Memory vulkanImageMemoryWrapped(org.gstreamer.vulkan.VulkanDevice device, org.vulkan.Image image, org.vulkan.Format format, long width, long height, org.vulkan.ImageTiling tiling, org.vulkan.ImageUsageFlags usage, org.gtk.glib.DestroyNotify notify) {
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
    var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Performs the steps necessary for executing a context query between only
 * other elements in the pipeline
 * @param element a {@link org.gstreamer.gst.Element}
 * @param contextType the context type to query for
 */
public static org.gstreamer.gst.Query vulkanLocalContextQuery(org.gstreamer.gst.Element element, java.lang.String contextType) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_local_context_query.invokeExact(
                    element.handle(),
                    Marshal.stringToAddress.marshal(contextType, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Allocated a new {@link VulkanMemory}.
 * @param device a {@link VulkanDevice}
 * @param memoryTypeIndex the Vulkan memory type index
 * @param params a {@link org.gstreamer.gst.AllocationParams}
 * @param size the size to allocate
 * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan device memory
 */
public static org.gstreamer.gst.Memory vulkanMemoryAlloc(org.gstreamer.vulkan.VulkanDevice device, int memoryTypeIndex, org.gstreamer.gst.AllocationParams params, long size, org.vulkan.MemoryPropertyFlags memPropFlags) {
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
    var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

public static boolean vulkanMemoryFindMemoryTypeIndexWithTypeProperties(org.gstreamer.vulkan.VulkanDevice device, int typeBits, org.vulkan.MemoryPropertyFlags properties, PointerInteger typeIndex) {
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
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static java.lang.String vulkanMemoryHeapFlagsToString(org.vulkan.MemoryHeapFlags propBits) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_memory_heap_flags_to_string.invokeExact(propBits.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
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

public static java.lang.String vulkanMemoryPropertyFlagsToString(org.vulkan.MemoryPropertyFlags propBits) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_memory_property_flags_to_string.invokeExact(propBits.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

public static java.lang.String vulkanPresentModeToString(org.vulkan.PresentModeKHR presentMode) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_present_mode_to_string.invokeExact(presentMode.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

public static boolean vulkanRunQuery(org.gstreamer.gst.Element element, org.gstreamer.gst.Query query, org.gstreamer.gst.PadDirection direction) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_vulkan_run_query.invokeExact(
                element.handle(),
                query.handle(),
                direction.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static java.lang.String vulkanSampleCountFlagsToString(org.vulkan.SampleCountFlags sampleCountBits) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_sample_count_flags_to_string.invokeExact(sampleCountBits.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * A {@link VulkanTrashNotify} implementation for unreffing a {@link org.gstreamer.gst.MiniObject} when the
 * associated {@link VulkanFence} is signalled
 * @param device the {@link VulkanDevice}
 */
public static void vulkanTrashMiniObjectUnref(org.gstreamer.vulkan.VulkanDevice device) {
    try {
        DowncallHandles.gst_vulkan_trash_mini_object_unref.invokeExact(
                device.handle(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * A {@link VulkanTrashNotify} implementation for unreffing a {@link org.gstreamer.gst.GstObject} when the
 * associated {@link VulkanFence} is signalled
 * @param device the {@link VulkanDevice}
 */
public static void vulkanTrashObjectUnref(org.gstreamer.vulkan.VulkanDevice device) {
    try {
        DowncallHandles.gst_vulkan_trash_object_unref.invokeExact(
                device.handle(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static org.gtk.glib.Quark vulkanWindowErrorQuark() {
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
    }
    
    private static void registerTypes() {
        if (VulkanBufferMemoryAllocator.isAvailable()) Interop.register(VulkanBufferMemoryAllocator.getType(), VulkanBufferMemoryAllocator.fromAddress);
        if (VulkanBufferPool.isAvailable()) Interop.register(VulkanBufferPool.getType(), VulkanBufferPool.fromAddress);
        if (VulkanCommandPool.isAvailable()) Interop.register(VulkanCommandPool.getType(), VulkanCommandPool.fromAddress);
        if (VulkanDescriptorCache.isAvailable()) Interop.register(VulkanDescriptorCache.getType(), VulkanDescriptorCache.fromAddress);
        if (VulkanDescriptorPool.isAvailable()) Interop.register(VulkanDescriptorPool.getType(), VulkanDescriptorPool.fromAddress);
        if (VulkanDevice.isAvailable()) Interop.register(VulkanDevice.getType(), VulkanDevice.fromAddress);
        if (VulkanDisplay.isAvailable()) Interop.register(VulkanDisplay.getType(), VulkanDisplay.fromAddress);
        if (VulkanFenceCache.isAvailable()) Interop.register(VulkanFenceCache.getType(), VulkanFenceCache.fromAddress);
        if (VulkanFullScreenQuad.isAvailable()) Interop.register(VulkanFullScreenQuad.getType(), VulkanFullScreenQuad.fromAddress);
        if (VulkanHandlePool.isAvailable()) Interop.register(VulkanHandlePool.getType(), VulkanHandlePool.fromAddress);
        if (VulkanImageBufferPool.isAvailable()) Interop.register(VulkanImageBufferPool.getType(), VulkanImageBufferPool.fromAddress);
        if (VulkanImageMemoryAllocator.isAvailable()) Interop.register(VulkanImageMemoryAllocator.getType(), VulkanImageMemoryAllocator.fromAddress);
        if (VulkanInstance.isAvailable()) Interop.register(VulkanInstance.getType(), VulkanInstance.fromAddress);
        if (VulkanMemoryAllocator.isAvailable()) Interop.register(VulkanMemoryAllocator.getType(), VulkanMemoryAllocator.fromAddress);
        if (VulkanPhysicalDevice.isAvailable()) Interop.register(VulkanPhysicalDevice.getType(), VulkanPhysicalDevice.fromAddress);
        if (VulkanQueue.isAvailable()) Interop.register(VulkanQueue.getType(), VulkanQueue.fromAddress);
        if (VulkanSwapper.isAvailable()) Interop.register(VulkanSwapper.getType(), VulkanSwapper.fromAddress);
        if (VulkanTrashFenceList.isAvailable()) Interop.register(VulkanTrashFenceList.getType(), VulkanTrashFenceList.fromAddress);
        if (VulkanTrashList.isAvailable()) Interop.register(VulkanTrashList.getType(), VulkanTrashList.fromAddress);
        if (VulkanVideoFilter.isAvailable()) Interop.register(VulkanVideoFilter.getType(), VulkanVideoFilter.fromAddress);
        if (VulkanWindow.isAvailable()) Interop.register(VulkanWindow.getType(), VulkanWindow.fromAddress);
    }
}
