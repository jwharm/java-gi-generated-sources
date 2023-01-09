package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDevice extends org.gstreamer.gst.GstObject {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDevice";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("instance"),
            Interop.valueLayout.ADDRESS.withName("physical_device"),
            org.vulkan.Device.getMemoryLayout().withName("device"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanDevice proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanDevice(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanDevice> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanDevice(input);
    
    private static MemoryAddress constructNew(org.gstreamer.vulkan.VulkanPhysicalDevice physicalDevice) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_new.invokeExact(physicalDevice.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanDevice(org.gstreamer.vulkan.VulkanPhysicalDevice physicalDevice) {
        super(constructNew(physicalDevice));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithIndex(org.gstreamer.vulkan.VulkanInstance instance, int deviceIndex) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_new_with_index.invokeExact(
                    instance.handle(),
                    deviceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    public static VulkanDevice newWithIndex(org.gstreamer.vulkan.VulkanInstance instance, int deviceIndex) {
        var RESULT = constructNewWithIndex(instance, deviceIndex);
        var OBJECT = (org.gstreamer.vulkan.VulkanDevice) Interop.register(RESULT, org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public org.gstreamer.vulkan.VulkanFence createFence() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_create_fence.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = org.gstreamer.vulkan.VulkanFence.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Disable an Vulkan extension by {@code name}.  Disabling an extension will only have
     * an effect before the call to gst_vulkan_device_open().
     * @param name extension name to enable
     * @return whether the Vulkan extension could be disabled.
     */
    public boolean disableExtension(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_device_disable_extension.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Enable an Vulkan extension by {@code name}.  Enabling an extension will
     * only have an effect before the call to gst_vulkan_device_open().
     * @param name extension name to enable
     * @return whether the Vulkan extension could be enabled.
     */
    public boolean enableExtension(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_device_enable_extension.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Enable an Vulkan layer by {@code name}.  Enabling a layer will
     * only have an effect before the call to gst_vulkan_device_open().
     * @param name layer name to enable
     * @return whether the Vulkan layer could be enabled.
     */
    public boolean enableLayer(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_device_enable_layer.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Iterate over each queue family available on {@link VulkanDevice}
     * @param func a {@link VulkanDeviceForEachQueueFunc} to run for each {@link VulkanQueue}
     */
    public void foreachQueue(@Nullable org.gstreamer.vulkan.VulkanDeviceForEachQueueFunc func) {
        try {
            DowncallHandles.gst_vulkan_device_foreach_queue.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public org.gstreamer.vulkan.VulkanInstance getInstance() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_get_instance.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.vulkan.VulkanInstance) Interop.register(RESULT, org.gstreamer.vulkan.VulkanInstance.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public org.vulkan.PhysicalDevice getPhysicalDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_get_physical_device.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.vulkan.PhysicalDevice.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Performs {@code vkGetDeviceProcAddr()} with {@code device} and {@code name}
     * @param name name of the function to retrieve
     * @return the function pointer for {@code name} or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getProcAddress(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_get_proc_address.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    public org.gstreamer.vulkan.VulkanQueue getQueue(int queueFamily, int queueI) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_device_get_queue.invokeExact(
                    handle(),
                    queueFamily,
                    queueI);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.vulkan.VulkanQueue) Interop.register(RESULT, org.gstreamer.vulkan.VulkanQueue.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public boolean isExtensionEnabled(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_device_is_extension_enabled.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public boolean isLayerEnabled(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_device_is_layer_enabled.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Attempts to create the internal {@code VkDevice} object.
     * @return whether a vulkan device could be created
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean open() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_device_open.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    public static boolean handleContextQuery(org.gstreamer.gst.Element element, org.gstreamer.gst.Query query, org.gstreamer.vulkan.VulkanDevice device) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_device_handle_context_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Attempt to retrieve a {@link VulkanDevice} using {@code GST_QUERY_CONTEXT} from the
     * surrounding elements of {@code element}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param device a {@link VulkanDevice}
     * @return whether {@code device} contains a valid {@link VulkanDevice}
     */
    public static boolean runContextQuery(org.gstreamer.gst.Element element, Out<org.gstreamer.vulkan.VulkanDevice> device) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment devicePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_device_run_context_query.invokeExact(
                        element.handle(),
                        (Addressable) devicePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    device.set((org.gstreamer.vulkan.VulkanDevice) Interop.register(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(devicePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * A {@link VulkanDevice.Builder} object constructs a {@link VulkanDevice} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanDevice.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VulkanDevice} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanDevice}.
         * @return A new instance of {@code VulkanDevice} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanDevice build() {
            return (VulkanDevice) org.gtk.gobject.GObject.newWithProperties(
                VulkanDevice.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setInstance(org.gstreamer.vulkan.VulkanInstance instance) {
            names.add("instance");
            values.add(org.gtk.gobject.Value.create(instance));
            return this;
        }
        
        public Builder setPhysicalDevice(org.gstreamer.vulkan.VulkanPhysicalDevice physicalDevice) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_vulkan_device_get_type != null;
    }
}
