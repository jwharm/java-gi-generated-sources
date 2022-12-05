package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanPhysicalDevice extends org.gstreamer.gst.Object {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanPhysicalDevice";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a VulkanPhysicalDevice proxy instance for the provided memory address.
     * <p>
     * Because VulkanPhysicalDevice is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanPhysicalDevice(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanPhysicalDevice if its GType is a (or inherits from) "GstVulkanPhysicalDevice".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanPhysicalDevice} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanPhysicalDevice", a ClassCastException will be thrown.
     */
    public static VulkanPhysicalDevice castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanPhysicalDevice.getType())) {
            return new VulkanPhysicalDevice(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanPhysicalDevice");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.vulkan.VulkanInstance instance, int deviceIndex) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_new.invokeExact(
                    instance.handle(),
                    deviceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanPhysicalDevice(@NotNull org.gstreamer.vulkan.VulkanInstance instance, int deviceIndex) {
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
    public boolean getExtensionInfo(@NotNull java.lang.String name, Out<Integer> specVersion) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemorySegment specVersionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_physical_device_get_extension_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    (Addressable) (specVersion == null ? MemoryAddress.NULL : (Addressable) specVersionPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (specVersion != null) specVersion.set(specVersionPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    public @NotNull org.vulkan.PhysicalDevice getHandle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_get_handle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.vulkan.PhysicalDevice(RESULT, Ownership.UNKNOWN);
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanInstance getInstance() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_get_instance.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanInstance(RESULT, Ownership.FULL);
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
    public boolean getLayerInfo(@NotNull java.lang.String name, @Nullable Out<java.lang.String> description, Out<Integer> specVersion, Out<Integer> implementationVersion) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemorySegment descriptionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment specVersionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment implementationVersionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_physical_device_get_layer_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    (Addressable) (description == null ? MemoryAddress.NULL : (Addressable) descriptionPOINTER.address()),
                    (Addressable) (specVersion == null ? MemoryAddress.NULL : (Addressable) specVersionPOINTER.address()),
                    (Addressable) (implementationVersion == null ? MemoryAddress.NULL : (Addressable) implementationVersionPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (description != null) description.set(Interop.getStringFrom(descriptionPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        if (specVersion != null) specVersion.set(specVersionPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (implementationVersion != null) implementationVersion.set(implementationVersionPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_physical_device_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static @NotNull java.lang.String typeToString(@NotNull org.vulkan.PhysicalDeviceType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_physical_device_type_to_string.invokeExact(
                    type.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link VulkanPhysicalDevice.Build} object constructs a {@link VulkanPhysicalDevice} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanPhysicalDevice} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanPhysicalDevice} using {@link VulkanPhysicalDevice#castFrom}.
         * @return A new instance of {@code VulkanPhysicalDevice} with the properties 
         *         that were set in the Build object.
         */
        public VulkanPhysicalDevice construct() {
            return VulkanPhysicalDevice.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanPhysicalDevice.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setDeviceIndex(int deviceIndex) {
            names.add("device-index");
            values.add(org.gtk.gobject.Value.create(deviceIndex));
            return this;
        }
        
        public Build setInstance(org.gstreamer.vulkan.VulkanInstance instance) {
            names.add("instance");
            values.add(org.gtk.gobject.Value.create(instance));
            return this;
        }
        
        public Build setName(java.lang.String name) {
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
