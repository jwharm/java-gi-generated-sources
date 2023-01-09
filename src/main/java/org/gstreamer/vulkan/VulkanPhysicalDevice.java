package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanPhysicalDevice extends org.gstreamer.gst.GstObject {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanPhysicalDevice";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("instance"),
            Interop.valueLayout.C_INT.withName("device_index"),
            MemoryLayout.paddingLayout(32),
            org.vulkan.PhysicalDevice.getMemoryLayout().withName("device"),
            org.vulkan.PhysicalDeviceProperties.getMemoryLayout().withName("properties"),
            org.vulkan.PhysicalDeviceFeatures.getMemoryLayout().withName("features"),
            org.vulkan.PhysicalDeviceMemoryProperties.getMemoryLayout().withName("memory_properties"),
            Interop.valueLayout.ADDRESS.withName("queue_family_props"),
            Interop.valueLayout.C_INT.withName("n_queue_families"),
            MemoryLayout.paddingLayout(224),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanPhysicalDevice proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanPhysicalDevice(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanPhysicalDevice> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanPhysicalDevice(input);
    
    private static MemoryAddress constructNew(org.gstreamer.vulkan.VulkanInstance instance, int deviceIndex) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_new.invokeExact(
                    instance.handle(),
                    deviceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanPhysicalDevice(org.gstreamer.vulkan.VulkanInstance instance, int deviceIndex) {
        super(constructNew(instance, deviceIndex));
        this.takeOwnership();
    }
    
    /**
     * Retrieves information about a device extension.
     * <p>
     * Will not find any extensions before gst_vulkan_instance_fill_info() has been
     * called.
     * @param name the extension name to look for
     * @param specVersion return value for the exteion specification version
     * @return whether extension {@code name} is available
     */
    public boolean getExtensionInfo(java.lang.String name, Out<Integer> specVersion) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment specVersionPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_physical_device_get_extension_info.invokeExact(
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
    
    public org.vulkan.PhysicalDevice getHandle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_get_handle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.vulkan.PhysicalDevice.fromAddress.marshal(RESULT, null);
    }
    
    public org.gstreamer.vulkan.VulkanInstance getInstance() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_get_instance.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.vulkan.VulkanInstance) Interop.register(RESULT, org.gstreamer.vulkan.VulkanInstance.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
                RESULT = (int) DowncallHandles.gst_vulkan_physical_device_get_layer_info.invokeExact(
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
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_physical_device_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static java.lang.String typeToString(org.vulkan.PhysicalDeviceType type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_type_to_string.invokeExact(type.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * A {@link VulkanPhysicalDevice.Builder} object constructs a {@link VulkanPhysicalDevice} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanPhysicalDevice.Builder#build()}. 
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
         * Finish building the {@link VulkanPhysicalDevice} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanPhysicalDevice}.
         * @return A new instance of {@code VulkanPhysicalDevice} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanPhysicalDevice build() {
            return (VulkanPhysicalDevice) org.gtk.gobject.GObject.newWithProperties(
                VulkanPhysicalDevice.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setDeviceIndex(int deviceIndex) {
            names.add("device-index");
            values.add(org.gtk.gobject.Value.create(deviceIndex));
            return this;
        }
        
        public Builder setInstance(org.gstreamer.vulkan.VulkanInstance instance) {
            names.add("instance");
            values.add(org.gtk.gobject.Value.create(instance));
            return this;
        }
        
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_physical_device_new = Interop.downcallHandle(
                "gst_vulkan_physical_device_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_vulkan_physical_device_get_extension_info = Interop.downcallHandle(
                "gst_vulkan_physical_device_get_extension_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_physical_device_get_handle = Interop.downcallHandle(
                "gst_vulkan_physical_device_get_handle",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_physical_device_get_instance = Interop.downcallHandle(
                "gst_vulkan_physical_device_get_instance",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_physical_device_get_layer_info = Interop.downcallHandle(
                "gst_vulkan_physical_device_get_layer_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_physical_device_get_type = Interop.downcallHandle(
                "gst_vulkan_physical_device_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_vulkan_physical_device_type_to_string = Interop.downcallHandle(
                "gst_vulkan_physical_device_type_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_vulkan_physical_device_get_type != null;
    }
}
