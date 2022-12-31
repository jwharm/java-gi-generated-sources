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
     * <p>
     * Because VulkanPhysicalDevice is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanPhysicalDevice(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanPhysicalDevice> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanPhysicalDevice(input, ownership);
    
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
        super(constructNew(instance, deviceIndex), Ownership.FULL);
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
        MemorySegment specVersionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_physical_device_get_extension_info.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
                    (Addressable) (specVersion == null ? MemoryAddress.NULL : (Addressable) specVersionPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (specVersion != null) specVersion.set(specVersionPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public org.vulkan.PhysicalDevice getHandle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_get_handle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.vulkan.PhysicalDevice.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    public org.gstreamer.vulkan.VulkanInstance getInstance() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_get_instance.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.vulkan.VulkanInstance) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.vulkan.VulkanInstance.fromAddress).marshal(RESULT, Ownership.FULL);
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
        MemorySegment descriptionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment specVersionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment implementationVersionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_physical_device_get_layer_info.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
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
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_type_to_string.invokeExact(
                    type.handle());
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
}
