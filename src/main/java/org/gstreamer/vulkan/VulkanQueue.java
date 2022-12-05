package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanQueue extends org.gstreamer.gst.Object {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanQueue";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("device"),
        org.vulkan.Queue.getMemoryLayout().withName("queue"),
        Interop.valueLayout.C_INT.withName("family"),
        Interop.valueLayout.C_INT.withName("index"),
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
     * Create a VulkanQueue proxy instance for the provided memory address.
     * <p>
     * Because VulkanQueue is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanQueue(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanQueue if its GType is a (or inherits from) "GstVulkanQueue".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanQueue} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanQueue", a ClassCastException will be thrown.
     */
    public static VulkanQueue castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanQueue.getType())) {
            return new VulkanQueue(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanQueue");
        }
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanCommandPool createCommandPool() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_queue_create_command_pool.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.vulkan.VulkanCommandPool(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanDevice getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_queue_get_device.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanDevice(RESULT, Ownership.FULL);
    }
    
    /**
     * Locks the queue for command submission using {@code vkQueueSubmit()} to meet the
     * Vulkan requirements for externally synchronised resources.
     */
    public void submitLock() {
        try {
            DowncallHandles.gst_vulkan_queue_submit_lock.invokeExact(
                    handle());
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
            DowncallHandles.gst_vulkan_queue_submit_unlock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_queue_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static @NotNull java.lang.String flagsToString(@NotNull org.vulkan.QueueFlags queueBits) {
        java.util.Objects.requireNonNull(queueBits, "Parameter 'queueBits' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_queue_flags_to_string.invokeExact(
                    queueBits.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    public static boolean handleContextQuery(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Query query, @Nullable org.gstreamer.vulkan.VulkanQueue queue) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_queue_handle_context_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    (Addressable) (queue == null ? MemoryAddress.NULL : queue.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Attempt to retrieve a {@link VulkanQueue} using {@code GST_QUERY_CONTEXT} from the
     * surrounding elements of {@code element}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param queue a {@link VulkanQueue}
     * @return whether {@code queue} contains a valid {@link VulkanQueue}
     */
    public static boolean runContextQuery(@NotNull org.gstreamer.gst.Element element, @NotNull Out<org.gstreamer.vulkan.VulkanQueue> queue) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(queue, "Parameter 'queue' must not be null");
        MemorySegment queuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_queue_run_context_query.invokeExact(
                    element.handle(),
                    (Addressable) queuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        queue.set(new org.gstreamer.vulkan.VulkanQueue(queuePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link VulkanQueue.Build} object constructs a {@link VulkanQueue} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanQueue} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanQueue} using {@link VulkanQueue#castFrom}.
         * @return A new instance of {@code VulkanQueue} with the properties 
         *         that were set in the Build object.
         */
        public VulkanQueue construct() {
            return VulkanQueue.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanQueue.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
