package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VulkanWindow} is an opaque struct and should only be accessed through the
 * provided api.
 * @version 1.18
 */
public class VulkanWindow extends org.gstreamer.gst.Object {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanWindow";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("display"),
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
     * Create a VulkanWindow proxy instance for the provided memory address.
     * <p>
     * Because VulkanWindow is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanWindow(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanWindow if its GType is a (or inherits from) "GstVulkanWindow".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanWindow} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanWindow", a ClassCastException will be thrown.
     */
    public static VulkanWindow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanWindow.getType())) {
            return new VulkanWindow(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanWindow");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.vulkan.VulkanDisplay display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_window_new.invokeExact(
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanWindow(@NotNull org.gstreamer.vulkan.VulkanDisplay display) {
        super(constructNew(display), Ownership.FULL);
    }
    
    /**
     * Attempt to close the window.
     */
    public void close() {
        try {
            DowncallHandles.gst_vulkan_window_close.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanDisplay getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_window_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanDisplay(RESULT, Ownership.FULL);
    }
    
    public boolean getPresentationSupport(@NotNull org.gstreamer.vulkan.VulkanDevice device, int queueFamilyIdx) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_window_get_presentation_support.invokeExact(
                    handle(),
                    device.handle(),
                    queueFamilyIdx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public @NotNull org.vulkan.SurfaceKHR getSurface() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_window_get_surface.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.vulkan.SurfaceKHR(RESULT, Ownership.UNKNOWN);
    }
    
    public void getSurfaceDimensions(PointerInteger width, PointerInteger height) {
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        try {
            DowncallHandles.gst_vulkan_window_get_surface_dimensions.invokeExact(
                    handle(),
                    width.handle(),
                    height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tell a {@code window} that it should handle events from the window system. These
     * events are forwarded upstream as navigation events. In some window systems
     * events are not propagated in the window hierarchy if a client is listening
     * for them. This method allows you to disable events handling completely
     * from the {@code window}.
     * @param handleEvents a {@code gboolean} indicating if events should be handled or not.
     */
    public void handleEvents(boolean handleEvents) {
        try {
            DowncallHandles.gst_vulkan_window_handle_events.invokeExact(
                    handle(),
                    handleEvents ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean open() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_window_open.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Ask the {@code window} to redraw its contents
     */
    public void redraw() {
        try {
            DowncallHandles.gst_vulkan_window_redraw.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resize the output surface.
     * <p>
     * Currently intended for subclasses to update internal state.
     * @param width the new width
     * @param height the new height
     */
    public void resize(int width, int height) {
        try {
            DowncallHandles.gst_vulkan_window_resize.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void sendKeyEvent(@NotNull java.lang.String eventType, @NotNull java.lang.String keyStr) {
        java.util.Objects.requireNonNull(eventType, "Parameter 'eventType' must not be null");
        java.util.Objects.requireNonNull(keyStr, "Parameter 'keyStr' must not be null");
        try {
            DowncallHandles.gst_vulkan_window_send_key_event.invokeExact(
                    handle(),
                    Interop.allocateNativeString(eventType),
                    Interop.allocateNativeString(keyStr));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void sendMouseEvent(@NotNull java.lang.String eventType, int button, double posx, double posy) {
        java.util.Objects.requireNonNull(eventType, "Parameter 'eventType' must not be null");
        try {
            DowncallHandles.gst_vulkan_window_send_mouse_event.invokeExact(
                    handle(),
                    Interop.allocateNativeString(eventType),
                    button,
                    posx,
                    posy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void setWindowHandle(long handle) {
        try {
            DowncallHandles.gst_vulkan_window_set_window_handle.invokeExact(
                    handle(),
                    handle);
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
            RESULT = (long) DowncallHandles.gst_vulkan_window_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Close {
        boolean signalReceived(VulkanWindow sourceVulkanWindow);
    }
    
    public Signal<VulkanWindow.Close> onClose(VulkanWindow.Close handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VulkanWindow.Callbacks.class, "signalVulkanWindowClose",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VulkanWindow.Close>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Draw {
        void signalReceived(VulkanWindow sourceVulkanWindow);
    }
    
    public Signal<VulkanWindow.Draw> onDraw(VulkanWindow.Draw handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("draw"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VulkanWindow.Callbacks.class, "signalVulkanWindowDraw",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VulkanWindow.Draw>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface KeyEvent {
        void signalReceived(VulkanWindow sourceVulkanWindow, @NotNull java.lang.String id, @NotNull java.lang.String key);
    }
    
    /**
     * Will be emitted when a key event is received by the {@link VulkanWindow}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VulkanWindow.KeyEvent> onKeyEvent(VulkanWindow.KeyEvent handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("key-event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VulkanWindow.Callbacks.class, "signalVulkanWindowKeyEvent",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VulkanWindow.KeyEvent>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MouseEvent {
        void signalReceived(VulkanWindow sourceVulkanWindow, @NotNull java.lang.String id, int button, double x, double y);
    }
    
    /**
     * Will be emitted when a mouse event is received by the {@link VulkanWindow}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VulkanWindow.MouseEvent> onMouseEvent(VulkanWindow.MouseEvent handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mouse-event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VulkanWindow.Callbacks.class, "signalVulkanWindowMouseEvent",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VulkanWindow.MouseEvent>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Resize {
        void signalReceived(VulkanWindow sourceVulkanWindow, int object, int p0);
    }
    
    public Signal<VulkanWindow.Resize> onResize(VulkanWindow.Resize handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("resize"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VulkanWindow.Callbacks.class, "signalVulkanWindowResize",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VulkanWindow.Resize>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link VulkanWindow.Build} object constructs a {@link VulkanWindow} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanWindow} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanWindow} using {@link VulkanWindow#castFrom}.
         * @return A new instance of {@code VulkanWindow} with the properties 
         *         that were set in the Build object.
         */
        public VulkanWindow construct() {
            return VulkanWindow.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanWindow.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setDisplay(org.gstreamer.vulkan.VulkanDisplay display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_window_new = Interop.downcallHandle(
            "gst_vulkan_window_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_close = Interop.downcallHandle(
            "gst_vulkan_window_close",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_get_display = Interop.downcallHandle(
            "gst_vulkan_window_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_get_presentation_support = Interop.downcallHandle(
            "gst_vulkan_window_get_presentation_support",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_get_surface = Interop.downcallHandle(
            "gst_vulkan_window_get_surface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_get_surface_dimensions = Interop.downcallHandle(
            "gst_vulkan_window_get_surface_dimensions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_handle_events = Interop.downcallHandle(
            "gst_vulkan_window_handle_events",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_open = Interop.downcallHandle(
            "gst_vulkan_window_open",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_redraw = Interop.downcallHandle(
            "gst_vulkan_window_redraw",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_resize = Interop.downcallHandle(
            "gst_vulkan_window_resize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_send_key_event = Interop.downcallHandle(
            "gst_vulkan_window_send_key_event",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_send_mouse_event = Interop.downcallHandle(
            "gst_vulkan_window_send_mouse_event",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_set_window_handle = Interop.downcallHandle(
            "gst_vulkan_window_set_window_handle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_vulkan_window_get_type = Interop.downcallHandle(
            "gst_vulkan_window_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalVulkanWindowClose(MemoryAddress sourceVulkanWindow, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (VulkanWindow.Close) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new VulkanWindow(sourceVulkanWindow, Ownership.NONE));
        }
        
        public static void signalVulkanWindowDraw(MemoryAddress sourceVulkanWindow, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (VulkanWindow.Draw) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VulkanWindow(sourceVulkanWindow, Ownership.NONE));
        }
        
        public static void signalVulkanWindowKeyEvent(MemoryAddress sourceVulkanWindow, MemoryAddress id, MemoryAddress key, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (VulkanWindow.KeyEvent) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VulkanWindow(sourceVulkanWindow, Ownership.NONE), Interop.getStringFrom(id), Interop.getStringFrom(key));
        }
        
        public static void signalVulkanWindowMouseEvent(MemoryAddress sourceVulkanWindow, MemoryAddress id, int button, double x, double y, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (VulkanWindow.MouseEvent) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VulkanWindow(sourceVulkanWindow, Ownership.NONE), Interop.getStringFrom(id), button, x, y);
        }
        
        public static void signalVulkanWindowResize(MemoryAddress sourceVulkanWindow, int object, int p0, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (VulkanWindow.Resize) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VulkanWindow(sourceVulkanWindow, Ownership.NONE), object, p0);
        }
    }
}
