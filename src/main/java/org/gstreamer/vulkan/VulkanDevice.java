package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDevice extends org.gstreamer.gst.Object {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDevice";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("instance"),
        Interop.valueLayout.ADDRESS.withName("physical_device"),
        org.vulkan.Device.getMemoryLayout().withName("device"),
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
    
    /**
     * Create a VulkanDevice proxy instance for the provided memory address.
     * <p>
     * Because VulkanDevice is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanDevice(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanDevice if its GType is a (or inherits from) "GstVulkanDevice".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanDevice} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanDevice", a ClassCastException will be thrown.
     */
    public static VulkanDevice castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanDevice.getType())) {
            return new VulkanDevice(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanDevice");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.vulkan.VulkanPhysicalDevice physicalDevice) {
        java.util.Objects.requireNonNull(physicalDevice, "Parameter 'physicalDevice' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_new.invokeExact(
                    physicalDevice.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanDevice(@NotNull org.gstreamer.vulkan.VulkanPhysicalDevice physicalDevice) {
        super(constructNew(physicalDevice), Ownership.FULL);
    }
    
    private static Addressable constructNewWithIndex(@NotNull org.gstreamer.vulkan.VulkanInstance instance, int deviceIndex) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_new_with_index.invokeExact(
                    instance.handle(),
                    deviceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static VulkanDevice newWithIndex(@NotNull org.gstreamer.vulkan.VulkanInstance instance, int deviceIndex) {
        return new VulkanDevice(constructNewWithIndex(instance, deviceIndex), Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanFence createFence() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_create_fence.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.vulkan.VulkanFence(RESULT, Ownership.FULL);
    }
    
    /**
     * Disable an Vulkan extension by {@code name}.  Disabling an extension will only have
     * an effect before the call to gst_vulkan_device_open().
     * @param name extension name to enable
     * @return whether the Vulkan extension could be disabled.
     */
    public boolean disableExtension(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_device_disable_extension.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Enable an Vulkan extension by {@code name}.  Enabling an extension will
     * only have an effect before the call to gst_vulkan_device_open().
     * @param name extension name to enable
     * @return whether the Vulkan extension could be enabled.
     */
    public boolean enableExtension(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_device_enable_extension.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Enable an Vulkan layer by {@code name}.  Enabling a layer will
     * only have an effect before the call to gst_vulkan_device_open().
     * @param name layer name to enable
     * @return whether the Vulkan layer could be enabled.
     */
    public boolean enableLayer(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_device_enable_layer.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Iterate over each queue family available on {@link VulkanDevice}
     * @param func a {@link VulkanDeviceForEachQueueFunc} to run for each {@link VulkanQueue}
     */
    public void foreachQueue(@Nullable org.gstreamer.vulkan.VulkanDeviceForEachQueueFunc func) {
        try {
            DowncallHandles.gst_vulkan_device_foreach_queue.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstVulkan.Callbacks.class, "cbVulkanDeviceForEachQueueFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (func == null ? MemoryAddress.NULL : Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanInstance getInstance() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_get_instance.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanInstance(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.vulkan.PhysicalDevice getPhysicalDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_get_physical_device.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.vulkan.PhysicalDevice(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Performs {@code vkGetDeviceProcAddr()} with {@code device} and {@code name}
     * @param name name of the function to retrieve
     * @return the function pointer for {@code name} or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getProcAddress(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_get_proc_address.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanQueue getQueue(int queueFamily, int queueI) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_get_queue.invokeExact(
                    handle(),
                    queueFamily,
                    queueI);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanQueue(RESULT, Ownership.FULL);
    }
    
    public boolean isExtensionEnabled(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_device_is_extension_enabled.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public boolean isLayerEnabled(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_device_is_layer_enabled.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Attempts to create the internal {@code VkDevice} object.
     * @return whether a vulkan device could be created
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean open() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_device_open.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_device_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * If a {@link VulkanDevice} is requested in {@code query}, sets {@code device} as the reply.
     * <p>
     * Intended for use with element query handlers to respond to {@code GST_QUERY_CONTEXT}
     * for a {@link VulkanDevice}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param query a {@link org.gstreamer.gst.Query} of type {@code GST_QUERY_CONTEXT}
     * @param device the {@link VulkanDevice}
     * @return whether {@code query} was responded to with {@code device}
     */
    public static boolean handleContextQuery(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Query query, @NotNull org.gstreamer.vulkan.VulkanDevice device) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_device_handle_context_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Attempt to retrieve a {@link VulkanDevice} using {@code GST_QUERY_CONTEXT} from the
     * surrounding elements of {@code element}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param device a {@link VulkanDevice}
     * @return whether {@code device} contains a valid {@link VulkanDevice}
     */
    public static boolean runContextQuery(@NotNull org.gstreamer.gst.Element element, @NotNull Out<org.gstreamer.vulkan.VulkanDevice> device) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        MemorySegment devicePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_device_run_context_query.invokeExact(
                    element.handle(),
                    (Addressable) devicePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        device.set(new org.gstreamer.vulkan.VulkanDevice(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link VulkanDevice.Build} object constructs a {@link VulkanDevice} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanDevice} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanDevice} using {@link VulkanDevice#castFrom}.
         * @return A new instance of {@code VulkanDevice} with the properties 
         *         that were set in the Build object.
         */
        public VulkanDevice construct() {
            return VulkanDevice.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanDevice.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setInstance(org.gstreamer.vulkan.VulkanInstance instance) {
            names.add("instance");
            values.add(org.gtk.gobject.Value.create(instance));
            return this;
        }
        
        public Build setPhysicalDevice(org.gstreamer.vulkan.VulkanPhysicalDevice physicalDevice) {
            names.add("physical-device");
            values.add(org.gtk.gobject.Value.create(physicalDevice));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_device_new = Interop.downcallHandle(
            "gst_vulkan_device_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_new_with_index = Interop.downcallHandle(
            "gst_vulkan_device_new_with_index",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_create_fence = Interop.downcallHandle(
            "gst_vulkan_device_create_fence",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_disable_extension = Interop.downcallHandle(
            "gst_vulkan_device_disable_extension",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_enable_extension = Interop.downcallHandle(
            "gst_vulkan_device_enable_extension",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_enable_layer = Interop.downcallHandle(
            "gst_vulkan_device_enable_layer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_foreach_queue = Interop.downcallHandle(
            "gst_vulkan_device_foreach_queue",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_get_instance = Interop.downcallHandle(
            "gst_vulkan_device_get_instance",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_get_physical_device = Interop.downcallHandle(
            "gst_vulkan_device_get_physical_device",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_get_proc_address = Interop.downcallHandle(
            "gst_vulkan_device_get_proc_address",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_get_queue = Interop.downcallHandle(
            "gst_vulkan_device_get_queue",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_is_extension_enabled = Interop.downcallHandle(
            "gst_vulkan_device_is_extension_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_is_layer_enabled = Interop.downcallHandle(
            "gst_vulkan_device_is_layer_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_open = Interop.downcallHandle(
            "gst_vulkan_device_open",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_get_type = Interop.downcallHandle(
            "gst_vulkan_device_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_handle_context_query = Interop.downcallHandle(
            "gst_vulkan_device_handle_context_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_device_run_context_query = Interop.downcallHandle(
            "gst_vulkan_device_run_context_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
