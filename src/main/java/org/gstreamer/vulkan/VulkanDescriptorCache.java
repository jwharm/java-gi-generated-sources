package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDescriptorCache extends org.gstreamer.vulkan.VulkanHandlePool {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDescriptorCache";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.vulkan.VulkanHandlePool.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("pool"),
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
     * Create a VulkanDescriptorCache proxy instance for the provided memory address.
     * <p>
     * Because VulkanDescriptorCache is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanDescriptorCache(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanDescriptorCache if its GType is a (or inherits from) "GstVulkanDescriptorCache".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanDescriptorCache} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanDescriptorCache", a ClassCastException will be thrown.
     */
    public static VulkanDescriptorCache castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanDescriptorCache.getType())) {
            return new VulkanDescriptorCache(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanDescriptorCache");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.vulkan.VulkanDescriptorPool pool, int nLayouts, @NotNull PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts) {
        java.util.Objects.requireNonNull(pool, "Parameter 'pool' must not be null");
        java.util.Objects.requireNonNull(layouts, "Parameter 'layouts' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_descriptor_cache_new.invokeExact(
                    pool.handle(),
                    nLayouts,
                    layouts.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanDescriptorCache(@NotNull org.gstreamer.vulkan.VulkanDescriptorPool pool, int nLayouts, @NotNull PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts) {
        super(constructNew(pool, nLayouts, layouts), Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanDescriptorSet acquireDescriptorSet() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_descriptor_cache_acquire.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.vulkan.VulkanDescriptorSet(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_descriptor_cache_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.vulkan.VulkanHandlePool.Build {
        
         /**
         * A {@link VulkanDescriptorCache.Build} object constructs a {@link VulkanDescriptorCache} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanDescriptorCache} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanDescriptorCache} using {@link VulkanDescriptorCache#castFrom}.
         * @return A new instance of {@code VulkanDescriptorCache} with the properties 
         *         that were set in the Build object.
         */
        public VulkanDescriptorCache construct() {
            return VulkanDescriptorCache.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanDescriptorCache.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_descriptor_cache_new = Interop.downcallHandle(
            "gst_vulkan_descriptor_cache_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_descriptor_cache_acquire = Interop.downcallHandle(
            "gst_vulkan_descriptor_cache_acquire",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_descriptor_cache_get_type = Interop.downcallHandle(
            "gst_vulkan_descriptor_cache_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
