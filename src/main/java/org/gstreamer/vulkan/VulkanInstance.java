package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanInstance extends org.gstreamer.gst.GstObject {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanInstance";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            org.vulkan.Instance.getMemoryLayout().withName("instance"),
            Interop.valueLayout.ADDRESS.withName("physical_devices"),
            Interop.valueLayout.C_INT.withName("n_physical_devices"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanInstance proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanInstance(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanInstance> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanInstance(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_instance_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanInstance() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Check if the configured vulkan instance supports the specified version.
     * Will not work prior to opening the instance with gst_vulkan_instance_open().
     * If a specific version is requested, the {@code patch} level is ignored.
     * @param major major version
     * @param minor minor version
     * @param patch patch version
     * @return whether {@code instance} is at least the requested version.
     */
    public boolean checkVersion(int major, int minor, int patch) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_instance_check_version.invokeExact(
                    handle(),
                    major,
                    minor,
                    patch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public org.gstreamer.vulkan.VulkanDevice createDevice() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_instance_create_device.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gstreamer.vulkan.VulkanDevice) Interop.register(RESULT, org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Disable an Vulkan extension by {@code name}.  Disabling an extension will only have
     * an effect before the call to gst_vulkan_instance_open().
     * @param name extension name to enable
     * @return whether the Vulkan extension could be disabled.
     */
    public boolean disableExtension(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_instance_disable_extension.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Enable an Vulkan extension by {@code name}.  Extensions cannot be enabled until
     * gst_vulkan_instance_fill_info() has been called.  Enabling an extension will
     * only have an effect before the call to gst_vulkan_instance_open().
     * @param name extension name to enable
     * @return whether the Vulkan extension could be enabled.
     */
    public boolean enableExtension(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_instance_enable_extension.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Enable an Vulkan layer by {@code name}.  Layer cannot be enabled until
     * gst_vulkan_instance_fill_info() has been called.  Enabling a layer will
     * only have an effect before the call to gst_vulkan_instance_open().
     * @param name layer name to enable
     * @return whether the Vulkan layer could be enabled.
     */
    public boolean enableLayer(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_instance_enable_layer.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Retrieve as much information about the available Vulkan instance without
     * actually creating an Vulkan instance.  Will not do anything while {@code instance}
     * is open.
     * @return whether the instance information could be retrieved
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean fillInfo() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_instance_fill_info.invokeExact(handle(),(Addressable) GERROR);
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
     * Retrieves information about an extension.
     * <p>
     * Will not find any extensions before gst_vulkan_instance_fill_info() has been
     * called.
     * @param name the layer name to look for
     * @param specVersion return value for the layer specification version
     * @return whether extension {@code name} is available
     */
    public boolean getExtensionInfo(java.lang.String name, Out<Integer> specVersion) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment specVersionPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_instance_get_extension_info.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        (Addressable) (specVersion == null ? MemoryAddress.NULL : (Addressable) specVersionPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (specVersion != null) specVersion.set(specVersionPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Retrieves information about a layer.
     * <p>
     * Will not find any layers before gst_vulkan_instance_fill_info() has been
     * called.
     * @param name the layer name to look for
     * @param description return value for the layer description or {@code null}
     * @param specVersion return value for the layer specification version
     * @param implementationVersion return value for the layer implementation version
     * @return whether layer {@code name} is available
     */
    public boolean getLayerInfo(java.lang.String name, @Nullable Out<java.lang.String> description, Out<Integer> specVersion, Out<Integer> implementationVersion) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment descriptionPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment specVersionPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment implementationVersionPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_instance_get_layer_info.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        (Addressable) (description == null ? MemoryAddress.NULL : (Addressable) descriptionPOINTER.address()),
                        (Addressable) (specVersion == null ? MemoryAddress.NULL : (Addressable) specVersionPOINTER.address()),
                        (Addressable) (implementationVersion == null ? MemoryAddress.NULL : (Addressable) implementationVersionPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (description != null) description.set(Marshal.addressToString.marshal(descriptionPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (specVersion != null) specVersion.set(specVersionPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (implementationVersion != null) implementationVersion.set(implementationVersionPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Performs {@code vkGetInstanceProcAddr()} with {@code instance} and {@code name}
     * @param name name of the function to retrieve
     * @return the function pointer for {@code name} or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getProcAddress(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_instance_get_proc_address.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Retrieve the vulkan instance configured version.  Only returns the supported
     * API version by the instance without taking into account the requested API
     * version.  This means gst_vulkan_instance_check_version() will return
     * different values if a specific version has been requested (which is the
     * default) than a version check that is performed manually by retrieving the
     * version with this function.
     * @param major major version
     * @param minor minor version
     * @param patch patch version
     */
    public void getVersion(PointerInteger major, PointerInteger minor, PointerInteger patch) {
        try {
            DowncallHandles.gst_vulkan_instance_get_version.invokeExact(
                    handle(),
                    major.handle(),
                    minor.handle(),
                    patch.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean isExtensionEnabled(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_instance_is_extension_enabled.invokeExact(
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
                RESULT = (int) DowncallHandles.gst_vulkan_instance_is_layer_enabled.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public boolean open() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_instance_open.invokeExact(handle(),(Addressable) GERROR);
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
            RESULT = (long) DowncallHandles.gst_vulkan_instance_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * If a {@link VulkanInstance} is requested in {@code query}, sets {@code instance} as the reply.
     * <p>
     * Intended for use with element query handlers to respond to {@code GST_QUERY_CONTEXT}
     * for a {@link VulkanInstance}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param query a {@link org.gstreamer.gst.Query} of type {@code GST_QUERY_CONTEXT}
     * @param instance the {@link VulkanInstance}
     * @return whether {@code query} was responded to with {@code instance}
     */
    public static boolean handleContextQuery(org.gstreamer.gst.Element element, org.gstreamer.gst.Query query, @Nullable org.gstreamer.vulkan.VulkanInstance instance) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_instance_handle_context_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    (Addressable) (instance == null ? MemoryAddress.NULL : instance.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Attempt to retrieve a {@link VulkanInstance} using {@code GST_QUERY_CONTEXT} from the
     * surrounding elements of {@code element}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param instance a {@link VulkanInstance}
     * @return whether {@code instance} contains a valid {@link VulkanInstance}
     */
    public static boolean runContextQuery(org.gstreamer.gst.Element element, Out<org.gstreamer.vulkan.VulkanInstance> instance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment instancePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_instance_run_context_query.invokeExact(
                        element.handle(),
                        (Addressable) instancePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    instance.set((org.gstreamer.vulkan.VulkanInstance) Interop.register(instancePOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.vulkan.VulkanInstance.fromAddress).marshal(instancePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateDevice} callback.
     */
    @FunctionalInterface
    public interface CreateDevice {
    
        /**
         * Overrides the {@link VulkanDevice} creation mechanism.
         * It can be called from any thread.
         */
        org.gstreamer.vulkan.VulkanDevice run();
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceVulkanInstance) {
            var RESULT = run();
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateDevice.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Overrides the {@link VulkanDevice} creation mechanism.
     * It can be called from any thread.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VulkanInstance.CreateDevice> onCreateDevice(VulkanInstance.CreateDevice handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("create-device", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link VulkanInstance.Builder} object constructs a {@link VulkanInstance} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanInstance.Builder#build()}. 
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
         * Finish building the {@link VulkanInstance} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanInstance}.
         * @return A new instance of {@code VulkanInstance} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanInstance build() {
            return (VulkanInstance) org.gtk.gobject.GObject.newWithProperties(
                VulkanInstance.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setRequestedApiMajor(int requestedApiMajor) {
            names.add("requested-api-major");
            values.add(org.gtk.gobject.Value.create(requestedApiMajor));
            return this;
        }
        
        public Builder setRequestedApiMinor(int requestedApiMinor) {
            names.add("requested-api-minor");
            values.add(org.gtk.gobject.Value.create(requestedApiMinor));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_instance_new = Interop.downcallHandle(
                "gst_vulkan_instance_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_check_version = Interop.downcallHandle(
                "gst_vulkan_instance_check_version",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_create_device = Interop.downcallHandle(
                "gst_vulkan_instance_create_device",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_disable_extension = Interop.downcallHandle(
                "gst_vulkan_instance_disable_extension",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_enable_extension = Interop.downcallHandle(
                "gst_vulkan_instance_enable_extension",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_enable_layer = Interop.downcallHandle(
                "gst_vulkan_instance_enable_layer",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_fill_info = Interop.downcallHandle(
                "gst_vulkan_instance_fill_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_get_extension_info = Interop.downcallHandle(
                "gst_vulkan_instance_get_extension_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_get_layer_info = Interop.downcallHandle(
                "gst_vulkan_instance_get_layer_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_get_proc_address = Interop.downcallHandle(
                "gst_vulkan_instance_get_proc_address",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_get_version = Interop.downcallHandle(
                "gst_vulkan_instance_get_version",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_is_extension_enabled = Interop.downcallHandle(
                "gst_vulkan_instance_is_extension_enabled",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_is_layer_enabled = Interop.downcallHandle(
                "gst_vulkan_instance_is_layer_enabled",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_open = Interop.downcallHandle(
                "gst_vulkan_instance_open",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_get_type = Interop.downcallHandle(
                "gst_vulkan_instance_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_handle_context_query = Interop.downcallHandle(
                "gst_vulkan_instance_handle_context_query",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_instance_run_context_query = Interop.downcallHandle(
                "gst_vulkan_instance_run_context_query",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_vulkan_instance_get_type != null;
    }
}
