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
public class VulkanDisplay extends org.gstreamer.gst.GstObject {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDisplay";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.C_INT.withName("type"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("instance"),
            Interop.valueLayout.ADDRESS.withName("windows"),
            Interop.valueLayout.ADDRESS.withName("main_context"),
            Interop.valueLayout.ADDRESS.withName("main_loop"),
            Interop.valueLayout.ADDRESS.withName("event_source"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanDisplay proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanDisplay(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanDisplay> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanDisplay(input);
    
    private static MemoryAddress constructNew(org.gstreamer.vulkan.VulkanInstance instance) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_new.invokeExact(instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanDisplay(org.gstreamer.vulkan.VulkanInstance instance) {
        super(constructNew(instance));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithType(org.gstreamer.vulkan.VulkanInstance instance, org.gstreamer.vulkan.VulkanDisplayType type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_new_with_type.invokeExact(
                    instance.handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    public static VulkanDisplay newWithType(org.gstreamer.vulkan.VulkanInstance instance, org.gstreamer.vulkan.VulkanDisplayType type) {
        var RESULT = constructNewWithType(instance, type);
        var OBJECT = (org.gstreamer.vulkan.VulkanDisplay) Interop.register(RESULT, org.gstreamer.vulkan.VulkanDisplay.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public org.gstreamer.vulkan.VulkanWindow createWindow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_create_window.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.vulkan.VulkanWindow) Interop.register(RESULT, org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Execute {@code compare_func} over the list of windows stored by {@code display}.  The
     * first argument to {@code compare_func} is the {@link VulkanWindow} being checked and the
     * second argument is {@code data}.
     * @param compareFunc a comparison function to run
     * @return The first {@link VulkanWindow} that causes a match
     *          from {@code compare_func}
     */
    public org.gstreamer.vulkan.VulkanWindow findWindow(org.gtk.glib.CompareFunc compareFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_find_window.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) compareFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.vulkan.VulkanWindow) Interop.register(RESULT, org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public @Nullable java.lang.foreign.MemoryAddress getHandle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_display_get_handle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public org.gstreamer.vulkan.VulkanDisplayType getHandleType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_display_get_handle_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanDisplayType(RESULT);
    }
    
    public boolean removeWindow(org.gstreamer.vulkan.VulkanWindow window) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_display_remove_window.invokeExact(
                    handle(),
                    window.handle());
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
    public static org.gstreamer.vulkan.VulkanDisplayType chooseType(org.gstreamer.vulkan.VulkanInstance instance) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_display_choose_type.invokeExact(instance.handle());
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
    public static boolean handleContextQuery(org.gstreamer.gst.Element element, org.gstreamer.gst.Query query, @Nullable org.gstreamer.vulkan.VulkanDisplay display) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_display_handle_context_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    (Addressable) (display == null ? MemoryAddress.NULL : display.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Attempt to retrieve a {@link VulkanDisplay} using {@code GST_QUERY_CONTEXT} from the
     * surrounding elements of {@code element}.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param display a {@link VulkanDisplay}
     * @return whether {@code display} contains a valid {@link VulkanDisplay}
     */
    public static boolean runContextQuery(org.gstreamer.gst.Element element, Out<org.gstreamer.vulkan.VulkanDisplay> display) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment displayPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_display_run_context_query.invokeExact(
                        element.handle(),
                        (Addressable) displayPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    display.set((org.gstreamer.vulkan.VulkanDisplay) Interop.register(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.vulkan.VulkanDisplay.fromAddress).marshal(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * A {@link VulkanDisplay.Builder} object constructs a {@link VulkanDisplay} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanDisplay.Builder#build()}. 
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
         * Finish building the {@link VulkanDisplay} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanDisplay}.
         * @return A new instance of {@code VulkanDisplay} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanDisplay build() {
            return (VulkanDisplay) org.gtk.gobject.GObject.newWithProperties(
                VulkanDisplay.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_vulkan_display_get_type != null;
    }
}
