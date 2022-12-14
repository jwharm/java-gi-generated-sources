package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanCommandPool extends org.gstreamer.gst.GstObject {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanCommandPool";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("queue"),
            org.vulkan.CommandPool.getMemoryLayout().withName("pool"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanCommandPool proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanCommandPool(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanCommandPool> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanCommandPool(input);
    
    public org.gstreamer.vulkan.VulkanCommandBuffer create() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_command_pool_create.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = org.gstreamer.vulkan.VulkanCommandBuffer.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    public org.gstreamer.vulkan.VulkanQueue getQueue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_command_pool_get_queue.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.vulkan.VulkanQueue) Interop.register(RESULT, org.gstreamer.vulkan.VulkanQueue.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * This should be called to ensure no other thread will attempt to access
     * the pool's internal resources.  Any modification of any of the allocated
     * {@link VulkanCommandBuffer}'s need to be encapsulated in a
     * gst_vulkan_command_pool_lock()/gst_vulkan_command_pool_unlock() pair to meet
     * the Vulkan API requirements that host access to the command pool is
     * externally synchronised.
     */
    public void lock() {
        try {
            DowncallHandles.gst_vulkan_command_pool_lock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * See the documentation for gst_vulkan_command_pool_lock() for when you would
     * need to use this function.
     */
    public void unlock() {
        try {
            DowncallHandles.gst_vulkan_command_pool_unlock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_command_pool_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VulkanCommandPool.Builder} object constructs a {@link VulkanCommandPool} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanCommandPool.Builder#build()}. 
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
         * Finish building the {@link VulkanCommandPool} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanCommandPool}.
         * @return A new instance of {@code VulkanCommandPool} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanCommandPool build() {
            return (VulkanCommandPool) org.gtk.gobject.GObject.newWithProperties(
                VulkanCommandPool.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_command_pool_create = Interop.downcallHandle(
                "gst_vulkan_command_pool_create",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_command_pool_get_queue = Interop.downcallHandle(
                "gst_vulkan_command_pool_get_queue",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_command_pool_lock = Interop.downcallHandle(
                "gst_vulkan_command_pool_lock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_command_pool_unlock = Interop.downcallHandle(
                "gst_vulkan_command_pool_unlock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_command_pool_get_type = Interop.downcallHandle(
                "gst_vulkan_command_pool_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_vulkan_command_pool_get_type != null;
    }
}
