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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.vulkan.VulkanHandlePool.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("pool"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanDescriptorCache proxy instance for the provided memory address.
     * <p>
     * Because VulkanDescriptorCache is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanDescriptorCache(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, VulkanDescriptorCache> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanDescriptorCache(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.vulkan.VulkanDescriptorPool pool, int nLayouts, PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts) {
        MemoryAddress RESULT;
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
    
    public VulkanDescriptorCache(org.gstreamer.vulkan.VulkanDescriptorPool pool, int nLayouts, PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts) {
        super(constructNew(pool, nLayouts, layouts), Ownership.FULL);
    }
    
    public org.gstreamer.vulkan.VulkanDescriptorSet acquireDescriptorSet() throws io.github.jwharm.javagi.GErrorException {
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
        return org.gstreamer.vulkan.VulkanDescriptorSet.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_descriptor_cache_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VulkanDescriptorCache.Builder} object constructs a {@link VulkanDescriptorCache} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanDescriptorCache.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.vulkan.VulkanHandlePool.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VulkanDescriptorCache} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanDescriptorCache}.
         * @return A new instance of {@code VulkanDescriptorCache} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanDescriptorCache build() {
            return (VulkanDescriptorCache) org.gtk.gobject.GObject.newWithProperties(
                VulkanDescriptorCache.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
