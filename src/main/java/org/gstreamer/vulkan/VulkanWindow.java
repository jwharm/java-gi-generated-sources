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
public class VulkanWindow extends org.gstreamer.gst.GstObject {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanWindow";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("display"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanWindow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanWindow(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanWindow> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanWindow(input);
    
    private static MemoryAddress constructNew(org.gstreamer.vulkan.VulkanDisplay display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_window_new.invokeExact(display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanWindow(org.gstreamer.vulkan.VulkanDisplay display) {
        super(constructNew(display));
        this.takeOwnership();
    }
    
    /**
     * Attempt to close the window.
     */
    public void close() {
        try {
            DowncallHandles.gst_vulkan_window_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public org.gstreamer.vulkan.VulkanDisplay getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_window_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.vulkan.VulkanDisplay) Interop.register(RESULT, org.gstreamer.vulkan.VulkanDisplay.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public boolean getPresentationSupport(org.gstreamer.vulkan.VulkanDevice device, int queueFamilyIdx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_window_get_presentation_support.invokeExact(
                    handle(),
                    device.handle(),
                    queueFamilyIdx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public org.vulkan.SurfaceKHR getSurface() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_window_get_surface.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.vulkan.SurfaceKHR.fromAddress.marshal(RESULT, null);
        }
    }
    
    public void getSurfaceDimensions(PointerInteger width, PointerInteger height) {
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
                    Marshal.booleanToInteger.marshal(handleEvents, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean open() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_window_open.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Ask the {@code window} to redraw its contents
     */
    public void redraw() {
        try {
            DowncallHandles.gst_vulkan_window_redraw.invokeExact(handle());
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
    
    public void sendKeyEvent(java.lang.String eventType, java.lang.String keyStr) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_vulkan_window_send_key_event.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(eventType, SCOPE),
                        Marshal.stringToAddress.marshal(keyStr, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    public void sendMouseEvent(java.lang.String eventType, int button, double posx, double posy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_vulkan_window_send_mouse_event.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(eventType, SCOPE),
                        button,
                        posx,
                        posy);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_window_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Close} callback.
     */
    @FunctionalInterface
    public interface Close {
    
        boolean run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceVulkanWindow) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Close.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    public Signal<VulkanWindow.Close> onClose(VulkanWindow.Close handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("close", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Draw} callback.
     */
    @FunctionalInterface
    public interface Draw {
    
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVulkanWindow) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Draw.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    public Signal<VulkanWindow.Draw> onDraw(VulkanWindow.Draw handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("draw", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code KeyEvent} callback.
     */
    @FunctionalInterface
    public interface KeyEvent {
    
        /**
         * Will be emitted when a key event is received by the {@link VulkanWindow}.
         */
        void run(java.lang.String id, java.lang.String key);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVulkanWindow, MemoryAddress id, MemoryAddress key) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(id, null), Marshal.addressToString.marshal(key, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), KeyEvent.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Will be emitted when a key event is received by the {@link VulkanWindow}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VulkanWindow.KeyEvent> onKeyEvent(VulkanWindow.KeyEvent handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("key-event", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MouseEvent} callback.
     */
    @FunctionalInterface
    public interface MouseEvent {
    
        /**
         * Will be emitted when a mouse event is received by the {@link VulkanWindow}.
         */
        void run(java.lang.String id, int button, double x, double y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVulkanWindow, MemoryAddress id, int button, double x, double y) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(id, null), button, x, y);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MouseEvent.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Will be emitted when a mouse event is received by the {@link VulkanWindow}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VulkanWindow.MouseEvent> onMouseEvent(VulkanWindow.MouseEvent handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mouse-event", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Resize} callback.
     */
    @FunctionalInterface
    public interface Resize {
    
        void run(int object, int p0);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVulkanWindow, int object, int p0) {
            run(object, p0);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Resize.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    public Signal<VulkanWindow.Resize> onResize(VulkanWindow.Resize handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("resize", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link VulkanWindow.Builder} object constructs a {@link VulkanWindow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanWindow.Builder#build()}. 
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
         * Finish building the {@link VulkanWindow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanWindow}.
         * @return A new instance of {@code VulkanWindow} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanWindow build() {
            return (VulkanWindow) org.gtk.gobject.GObject.newWithProperties(
                VulkanWindow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setDisplay(org.gstreamer.vulkan.VulkanDisplay display) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_vulkan_window_get_type != null;
    }
}
