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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.vulkan.VulkanHandlePool.getMemoryLayout().withName("parent"),
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
     * Create a VulkanTrashList proxy instance for the provided memory address.
     * <p>
     * Because VulkanTrashList is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanTrashList(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanTrashList if its GType is a (or inherits from) "GstVulkanTrashList".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanTrashList} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanTrashList", a ClassCastException will be thrown.
     */
    public static VulkanTrashList castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanTrashList.getType())) {
            return new VulkanTrashList(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanTrashList");
        }
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanTrash acquire(@NotNull org.gstreamer.vulkan.VulkanFence fence, @NotNull org.gstreamer.vulkan.VulkanTrashNotify notify) {
        java.util.Objects.requireNonNull(fence, "Parameter 'fence' must not be null");
        java.util.Objects.requireNonNull(notify, "Parameter 'notify' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_trash_list_acquire.invokeExact(
                    handle(),
                    fence.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstVulkan.Callbacks.class, "cbVulkanTrashNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(notify)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanTrash(RESULT, Ownership.FULL);
    }
    
    public boolean add(@NotNull org.gstreamer.vulkan.VulkanTrash trash) {
        java.util.Objects.requireNonNull(trash, "Parameter 'trash' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_trash_list_add.invokeExact(
                    handle(),
                    trash.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_trash_list_get_type.invokeExact();
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
         * A {@link VulkanTrashList.Build} object constructs a {@link VulkanTrashList} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanTrashList} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanTrashList} using {@link VulkanTrashList#castFrom}.
         * @return A new instance of {@code VulkanTrashList} with the properties 
         *         that were set in the Build object.
         */
        public VulkanTrashList construct() {
            return VulkanTrashList.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanTrashList.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
