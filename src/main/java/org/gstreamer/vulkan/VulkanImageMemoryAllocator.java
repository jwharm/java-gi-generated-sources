package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque {@link VulkanImageMemoryAllocator} struct
 * @version 1.18
 */
public class VulkanImageMemoryAllocator extends org.gstreamer.gst.Allocator {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanImageMemoryAllocator";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Allocator.getMemoryLayout().withName("parent"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanImageMemoryAllocator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanImageMemoryAllocator(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanImageMemoryAllocator> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanImageMemoryAllocator(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_image_memory_allocator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VulkanImageMemoryAllocator.Builder} object constructs a {@link VulkanImageMemoryAllocator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanImageMemoryAllocator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Allocator.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VulkanImageMemoryAllocator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanImageMemoryAllocator}.
         * @return A new instance of {@code VulkanImageMemoryAllocator} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanImageMemoryAllocator build() {
            return (VulkanImageMemoryAllocator) org.gtk.gobject.GObject.newWithProperties(
                VulkanImageMemoryAllocator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_image_memory_allocator_get_type = Interop.downcallHandle(
                "gst_vulkan_image_memory_allocator_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_vulkan_image_memory_allocator_get_type != null;
    }
}
