package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDescriptorPool extends org.gstreamer.gst.Object {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDescriptorPool";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("device"),
        org.vulkan.DescriptorPool.getMemoryLayout().withName("pool"),
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
     * Create a VulkanDescriptorPool proxy instance for the provided memory address.
     * <p>
     * Because VulkanDescriptorPool is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanDescriptorPool(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanDescriptorPool if its GType is a (or inherits from) "GstVulkanDescriptorPool".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanDescriptorPool} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanDescriptorPool", a ClassCastException will be thrown.
     */
    public static VulkanDescriptorPool castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanDescriptorPool.getType())) {
            return new VulkanDescriptorPool(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanDescriptorPool");
        }
    }
    
    private static Addressable constructNewWrapped(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.vulkan.DescriptorPool pool, long maxSets) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(pool, "Parameter 'pool' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_descriptor_pool_new_wrapped.invokeExact(
                    device.handle(),
                    pool.handle(),
                    maxSets);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        pool.yieldOwnership();
        return RESULT;
    }
    
    public static VulkanDescriptorPool newWrapped(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.vulkan.DescriptorPool pool, long maxSets) {
        return new VulkanDescriptorPool(constructNewWrapped(device, pool, maxSets), Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanDescriptorSet create(int nLayouts, @NotNull PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(layouts, "Parameter 'layouts' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_descriptor_pool_create.invokeExact(
                    handle(),
                    nLayouts,
                    layouts.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.vulkan.VulkanDescriptorSet(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanDevice getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_descriptor_pool_get_device.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanDevice(RESULT, Ownership.FULL);
    }
    
    public long getMaxSets() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_descriptor_pool_get_max_sets.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_descriptor_pool_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link VulkanDescriptorPool.Build} object constructs a {@link VulkanDescriptorPool} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanDescriptorPool} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanDescriptorPool} using {@link VulkanDescriptorPool#castFrom}.
         * @return A new instance of {@code VulkanDescriptorPool} with the properties 
         *         that were set in the Build object.
         */
        public VulkanDescriptorPool construct() {
            return VulkanDescriptorPool.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanDescriptorPool.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_descriptor_pool_new_wrapped = Interop.downcallHandle(
            "gst_vulkan_descriptor_pool_new_wrapped",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_vulkan_descriptor_pool_create = Interop.downcallHandle(
            "gst_vulkan_descriptor_pool_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_descriptor_pool_get_device = Interop.downcallHandle(
            "gst_vulkan_descriptor_pool_get_device",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_descriptor_pool_get_max_sets = Interop.downcallHandle(
            "gst_vulkan_descriptor_pool_get_max_sets",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_descriptor_pool_get_type = Interop.downcallHandle(
            "gst_vulkan_descriptor_pool_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
