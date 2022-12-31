package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanTrashList extends org.gstreamer.vulkan.VulkanHandlePool {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanTrashList";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.vulkan.VulkanHandlePool.getMemoryLayout().withName("parent"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanTrashList proxy instance for the provided memory address.
     * <p>
     * Because VulkanTrashList is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanTrashList(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, VulkanTrashList> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanTrashList(input, ownership);
    
    public org.gstreamer.vulkan.VulkanTrash acquire(org.gstreamer.vulkan.VulkanFence fence, org.gstreamer.vulkan.VulkanTrashNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_trash_list_acquire.invokeExact(
                    handle(),
                    fence.handle(),
                    (Addressable) notify.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.vulkan.VulkanTrash.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public boolean add(org.gstreamer.vulkan.VulkanTrash trash) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_trash_list_add.invokeExact(
                    handle(),
                    trash.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Remove any stored {@link VulkanTrash} objects that have had their associated
     * {@link VulkanFence} signalled.
     */
    public void gc() {
        try {
            DowncallHandles.gst_vulkan_trash_list_gc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean wait_(long timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_trash_list_wait.invokeExact(
                    handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_trash_list_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VulkanTrashList.Builder} object constructs a {@link VulkanTrashList} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanTrashList.Builder#build()}. 
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
         * Finish building the {@link VulkanTrashList} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanTrashList}.
         * @return A new instance of {@code VulkanTrashList} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanTrashList build() {
            return (VulkanTrashList) org.gtk.gobject.GObject.newWithProperties(
                VulkanTrashList.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_trash_list_acquire = Interop.downcallHandle(
            "gst_vulkan_trash_list_acquire",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_list_add = Interop.downcallHandle(
            "gst_vulkan_trash_list_add",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_list_gc = Interop.downcallHandle(
            "gst_vulkan_trash_list_gc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_list_wait = Interop.downcallHandle(
            "gst_vulkan_trash_list_wait",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_list_get_type = Interop.downcallHandle(
            "gst_vulkan_trash_list_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
