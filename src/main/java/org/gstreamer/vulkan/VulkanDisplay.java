package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The contents of a {@link VulkanDisplay} are private and should only be accessed
 * through the provided API
 * @version 1.18
 */
public class VulkanDisplay extends org.gstreamer.gst.Object {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDisplay";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("object"),
        Interop.valueLayout.C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("instance"),
        Interop.valueLayout.ADDRESS.withName("windows"),
        Interop.valueLayout.ADDRESS.withName("main_context"),
        Interop.valueLayout.ADDRESS.withName("main_loop"),
        Interop.valueLayout.ADDRESS.withName("event_source"),
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
     * Create a VulkanDisplay proxy instance for the provided memory address.
     * <p>
     * Because VulkanDisplay is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanDisplay(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanDisplay if its GType is a (or inherits from) "GstVulkanDisplay".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanDisplay} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanDisplay", a ClassCastException will be thrown.
     */
    public static VulkanDisplay castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanDisplay.getType())) {
            return new VulkanDisplay(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanDisplay");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.vulkan.VulkanInstance instance) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_new.invokeExact(
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanDisplay(@NotNull org.gstreamer.vulkan.VulkanInstance instance) {
        super(constructNew(instance), Ownership.FULL);
    }
    
    private static Addressable constructNewWithType(@NotNull org.gstreamer.vulkan.VulkanInstance instance, @NotNull org.gstreamer.vulkan.VulkanDisplayType type) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_new_with_type.invokeExact(
                    instance.handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static VulkanDisplay newWithType(@NotNull org.gstreamer.vulkan.VulkanInstance instance, @NotNull org.gstreamer.vulkan.VulkanDisplayType type) {
        return new VulkanDisplay(constructNewWithType(instance, type), Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanWindow createWindow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_create_window.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanWindow(RESULT, Ownership.FULL);
    }
    
    /**
     * Execute {@code compare_func} over the list of windows stored by {@code display}.  The
     * first argument to {@code compare_func} is the {@link VulkanWindow} being checked and the
     * second argument is {@code data}.
     * @param compareFunc a comparison function to run
     * @return The first {@link VulkanWindow} that causes a match
     *          from {@code compare_func}
     */
    public @NotNull org.gstreamer.vulkan.VulkanWindow findWindow(@NotNull org.gtk.glib.CompareFunc compareFunc) {
        java.util.Objects.requireNonNull(compareFunc, "Parameter 'compareFunc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_find_window.invokeExact(
                    handle(),
                    (Addressable) (Interop.registerCallback(compareFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstVulkan.Callbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanWindow(RESULT, Ownership.FULL);
    }
    
    public @Nullable java.lang.foreign.MemoryAddress getHandle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_get_handle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanDisplayType getHandleType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_display_get_handle_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanDisplayType(RESULT);
    }
    
    public boolean removeWindow(@NotNull org.gstreamer.vulkan.VulkanWindow window) {
        java.util.Objects.requireNonNull(window, "Parameter 'window' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_display_remove_window.invokeExact(
                    handle(),
                    window.handle());
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
            RESULT = (long) DowncallHandles.gst_vulkan_display_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * This function will read the {@code GST_VULKAN_WINDOW} environment variable for
     * a user choice or choose the first supported implementation.
     * <p>
     * gst_vulkan_instance_fill_info() must have been called prior to this function.
     * @param instance a {@link VulkanInstance}
     * @return the default {@link VulkanDisplayType} {@link VulkanInstance} will choose
     *          on creation
     */
    public static @NotNull org.gstreamer.vulkan.VulkanDisplayType chooseType(@NotNull org.gstreamer.vulkan.VulkanInstance instance) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_display_choose_type.invokeExact(
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanDisplayType(RESULT);
    }
    
    /**
     * If a {@link VulkanDisplay} is requested in {@code query}, sets {@code device} as the reply.
     * <p>
     * Intended for use with element query handlers to respond to {@code GST_QUERY_CONTEXT}
     * for a {@link VulkanDisplay}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param query a {@link org.gstreamer.gst.Query} of type {@code GST_QUERY_CONTEXT}
     * @param display the {@link VulkanDisplay}
     * @return whether {@code query} was responded to with {@code display}
     */
    public static boolean handleContextQuery(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Query query, @Nullable org.gstreamer.vulkan.VulkanDisplay display) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_display_handle_context_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    (Addressable) (display == null ? MemoryAddress.NULL : display.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Attempt to retrieve a {@link VulkanDisplay} using {@code GST_QUERY_CONTEXT} from the
     * surrounding elements of {@code element}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param display a {@link VulkanDisplay}
     * @return whether {@code display} contains a valid {@link VulkanDisplay}
     */
    public static boolean runContextQuery(@NotNull org.gstreamer.gst.Element element, @NotNull Out<org.gstreamer.vulkan.VulkanDisplay> display) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        MemorySegment displayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_display_run_context_query.invokeExact(
                    element.handle(),
                    (Addressable) displayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        display.set(new org.gstreamer.vulkan.VulkanDisplay(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link VulkanDisplay.Build} object constructs a {@link VulkanDisplay} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanDisplay} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanDisplay} using {@link VulkanDisplay#castFrom}.
         * @return A new instance of {@code VulkanDisplay} with the properties 
         *         that were set in the Build object.
         */
        public VulkanDisplay construct() {
            return VulkanDisplay.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanDisplay.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_display_new = Interop.downcallHandle(
            "gst_vulkan_display_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_new_with_type = Interop.downcallHandle(
            "gst_vulkan_display_new_with_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_create_window = Interop.downcallHandle(
            "gst_vulkan_display_create_window",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_find_window = Interop.downcallHandle(
            "gst_vulkan_display_find_window",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_get_handle = Interop.downcallHandle(
            "gst_vulkan_display_get_handle",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_get_handle_type = Interop.downcallHandle(
            "gst_vulkan_display_get_handle_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_remove_window = Interop.downcallHandle(
            "gst_vulkan_display_remove_window",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_get_type = Interop.downcallHandle(
            "gst_vulkan_display_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_choose_type = Interop.downcallHandle(
            "gst_vulkan_display_choose_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_handle_context_query = Interop.downcallHandle(
            "gst_vulkan_display_handle_context_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_display_run_context_query = Interop.downcallHandle(
            "gst_vulkan_display_run_context_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
