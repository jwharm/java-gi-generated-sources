package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanQueue extends org.gstreamer.gst.GstObject {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanQueue";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("device"),
            org.vulkan.Queue.getMemoryLayout().withName("queue"),
            Interop.valueLayout.C_INT.withName("family"),
            Interop.valueLayout.C_INT.withName("index"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanQueue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanQueue(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanQueue> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanQueue(input);
    
    public org.gstreamer.vulkan.VulkanCommandPool createCommandPool() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_queue_create_command_pool.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gstreamer.vulkan.VulkanCommandPool) Interop.register(RESULT, org.gstreamer.vulkan.VulkanCommandPool.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    public org.gstreamer.vulkan.VulkanDevice getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_queue_get_device.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.vulkan.VulkanDevice) Interop.register(RESULT, org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Locks the queue for command submission using {@code vkQueueSubmit()} to meet the
     * Vulkan requirements for externally synchronised resources.
     */
    public void submitLock() {
        try {
            DowncallHandles.gst_vulkan_queue_submit_lock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unlocks the queue for command submission using {@code vkQueueSubmit()}.
     * <p>
     * See gst_vulkan_queue_submit_lock() for details on when this call is needed.
     */
    public void submitUnlock() {
        try {
            DowncallHandles.gst_vulkan_queue_submit_unlock.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gst_vulkan_queue_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static java.lang.String flagsToString(org.vulkan.QueueFlags queueBits) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_queue_flags_to_string.invokeExact(queueBits.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * If a {@link VulkanQueue} is requested in {@code query}, sets {@code queue} as the reply.
     * <p>
     * Intended for use with element query handlers to respond to {@code GST_QUERY_CONTEXT}
     * for a {@link VulkanQueue}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param query a {@link org.gstreamer.gst.Query} of type {@code GST_QUERY_CONTEXT}
     * @param queue the {@link VulkanQueue}
     * @return whether {@code query} was responded to with {@code queue}
     */
    public static boolean handleContextQuery(org.gstreamer.gst.Element element, org.gstreamer.gst.Query query, @Nullable org.gstreamer.vulkan.VulkanQueue queue) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_queue_handle_context_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    (Addressable) (queue == null ? MemoryAddress.NULL : queue.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Attempt to retrieve a {@link VulkanQueue} using {@code GST_QUERY_CONTEXT} from the
     * surrounding elements of {@code element}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param queue a {@link VulkanQueue}
     * @return whether {@code queue} contains a valid {@link VulkanQueue}
     */
    public static boolean runContextQuery(org.gstreamer.gst.Element element, Out<org.gstreamer.vulkan.VulkanQueue> queue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment queuePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_queue_run_context_query.invokeExact(
                        element.handle(),
                        (Addressable) queuePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    queue.set((org.gstreamer.vulkan.VulkanQueue) Interop.register(queuePOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.vulkan.VulkanQueue.fromAddress).marshal(queuePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * A {@link VulkanQueue.Builder} object constructs a {@link VulkanQueue} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanQueue.Builder#build()}. 
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
         * Finish building the {@link VulkanQueue} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanQueue}.
         * @return A new instance of {@code VulkanQueue} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanQueue build() {
            return (VulkanQueue) org.gtk.gobject.GObject.newWithProperties(
                VulkanQueue.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_queue_create_command_pool = Interop.downcallHandle(
                "gst_vulkan_queue_create_command_pool",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_queue_get_device = Interop.downcallHandle(
                "gst_vulkan_queue_get_device",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_queue_submit_lock = Interop.downcallHandle(
                "gst_vulkan_queue_submit_lock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_queue_submit_unlock = Interop.downcallHandle(
                "gst_vulkan_queue_submit_unlock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_queue_get_type = Interop.downcallHandle(
                "gst_vulkan_queue_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_vulkan_queue_flags_to_string = Interop.downcallHandle(
                "gst_vulkan_queue_flags_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_queue_handle_context_query = Interop.downcallHandle(
                "gst_vulkan_queue_handle_context_query",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_queue_run_context_query = Interop.downcallHandle(
                "gst_vulkan_queue_run_context_query",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_vulkan_queue_get_type != null;
    }
}
