package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDescriptorPool extends org.gstreamer.gst.GstObject {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDescriptorPool";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("device"),
            org.vulkan.DescriptorPool.getMemoryLayout().withName("pool"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanDescriptorPool proxy instance for the provided memory address.
     * <p>
     * Because VulkanDescriptorPool is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanDescriptorPool(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, VulkanDescriptorPool> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanDescriptorPool(input, ownership);
    
    private static MemoryAddress constructNewWrapped(org.gstreamer.vulkan.VulkanDevice device, org.vulkan.DescriptorPool pool, long maxSets) {
        MemoryAddress RESULT;
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
    
    public static VulkanDescriptorPool newWrapped(org.gstreamer.vulkan.VulkanDevice device, org.vulkan.DescriptorPool pool, long maxSets) {
        var RESULT = constructNewWrapped(device, pool, maxSets);
        return (org.gstreamer.vulkan.VulkanDescriptorPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.vulkan.VulkanDescriptorPool.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    public org.gstreamer.vulkan.VulkanDescriptorSet create(int nLayouts, PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts) throws io.github.jwharm.javagi.GErrorException {
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
        return org.gstreamer.vulkan.VulkanDescriptorSet.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public org.gstreamer.vulkan.VulkanDevice getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_descriptor_pool_get_device.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.vulkan.VulkanDevice) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(RESULT, Ownership.FULL);
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_descriptor_pool_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VulkanDescriptorPool.Builder} object constructs a {@link VulkanDescriptorPool} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanDescriptorPool.Builder#build()}. 
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
         * Finish building the {@link VulkanDescriptorPool} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanDescriptorPool}.
         * @return A new instance of {@code VulkanDescriptorPool} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanDescriptorPool build() {
            return (VulkanDescriptorPool) org.gtk.gobject.GObject.newWithProperties(
                VulkanDescriptorPool.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
