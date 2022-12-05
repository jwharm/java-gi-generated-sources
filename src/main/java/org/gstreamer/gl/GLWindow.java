package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstGLWindow represents a window that elements can render into.  A window can
 * either be a user visible window (onscreen) or hidden (offscreen).
 */
public class GLWindow extends org.gstreamer.gst.Object {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLWindow";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
        Interop.valueLayout.ADDRESS.withName("display"),
        org.gtk.gobject.WeakRef.getMemoryLayout().withName("context_ref"),
        Interop.valueLayout.C_INT.withName("is_drawing"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("draw"),
        Interop.valueLayout.ADDRESS.withName("draw_data"),
        Interop.valueLayout.ADDRESS.withName("draw_notify"),
        Interop.valueLayout.ADDRESS.withName("close"),
        Interop.valueLayout.ADDRESS.withName("close_data"),
        Interop.valueLayout.ADDRESS.withName("close_notify"),
        Interop.valueLayout.ADDRESS.withName("resize"),
        Interop.valueLayout.ADDRESS.withName("resize_data"),
        Interop.valueLayout.ADDRESS.withName("resize_notify"),
        Interop.valueLayout.C_INT.withName("queue_resize"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("main_context"),
        Interop.valueLayout.ADDRESS.withName("priv"),
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
     * Create a GLWindow proxy instance for the provided memory address.
     * <p>
     * Because GLWindow is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLWindow(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLWindow if its GType is a (or inherits from) "GstGLWindow".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLWindow} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLWindow", a ClassCastException will be thrown.
     */
    public static GLWindow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLWindow.getType())) {
            return new GLWindow(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLWindow");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLDisplay display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_window_new.invokeExact(
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLWindow(@NotNull org.gstreamer.gl.GLDisplay display) {
        super(constructNew(display), Ownership.FULL);
    }
    
    /**
     * Checks if {@code window} controls the GL viewport.
     * @return {@code true} if {@code window} controls the GL viewport, otherwise {@code false}
     */
    public boolean controlsViewport() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_window_controls_viewport.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Redraw the window contents.  Implementations should invoke the draw callback.
     */
    public void draw() {
        try {
            DowncallHandles.gst_gl_window_draw.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public @NotNull org.gstreamer.gl.GLContext getContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_window_get_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLContext(RESULT, Ownership.FULL);
    }
    
    public long getDisplay() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_window_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public void getSurfaceDimensions(Out<Integer> width, Out<Integer> height) {
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_gl_window_get_surface_dimensions.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    public long getWindowHandle() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_window_get_window_handle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
            DowncallHandles.gst_gl_window_handle_events.invokeExact(
                    handle(),
                    handleEvents ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Query whether {@code window} has output surface or not
     * @return {@code true} if {@code window} has useable output surface
     */
    public boolean hasOutputSurface() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_window_has_output_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Queue resizing of {@code window}.
     */
    public void queueResize() {
        try {
            DowncallHandles.gst_gl_window_queue_resize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Quit the runloop's execution.
     */
    public void quit() {
        try {
            DowncallHandles.gst_gl_window_quit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resize {@code window} to the given {@code width} and {@code height}.
     * @param width new width
     * @param height new height
     */
    public void resize(int width, int height) {
        try {
            DowncallHandles.gst_gl_window_resize.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Start the execution of the runloop.
     */
    public void run() {
        try {
            DowncallHandles.gst_gl_window_run.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void sendKeyEvent(@NotNull java.lang.String eventType, @NotNull java.lang.String keyStr) {
        java.util.Objects.requireNonNull(eventType, "Parameter 'eventType' must not be null");
        java.util.Objects.requireNonNull(keyStr, "Parameter 'keyStr' must not be null");
        try {
            DowncallHandles.gst_gl_window_send_key_event.invokeExact(
                    handle(),
                    Interop.allocateNativeString(eventType),
                    Interop.allocateNativeString(keyStr));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Invoke {@code callback} with data on the window thread.  {@code callback} is guaranteed to
     * have executed when this function returns.
     * @param callback function to invoke
     */
    public void sendMessage(@NotNull org.gstreamer.gl.GLWindowCB callback) {
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_gl_window_send_message.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLWindowCB",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Invoke {@code callback} with {@code data} on the window thread.  The callback may not
     * have been executed when this function returns.
     * @param callback function to invoke
     */
    public void sendMessageAsync(@NotNull org.gstreamer.gl.GLWindowCB callback) {
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_gl_window_send_message_async.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLWindowCB",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void sendMouseEvent(@NotNull java.lang.String eventType, int button, double posx, double posy) {
        java.util.Objects.requireNonNull(eventType, "Parameter 'eventType' must not be null");
        try {
            DowncallHandles.gst_gl_window_send_mouse_event.invokeExact(
                    handle(),
                    Interop.allocateNativeString(eventType),
                    button,
                    posx,
                    posy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Notify a {@code window} about a scroll event. A scroll signal holding the event
     * coordinates will be emitted.
     * @param posx x position of the mouse cursor
     * @param posy y position of the mouse cursor
     * @param deltaX the x offset of the scroll event
     * @param deltaY the y offset of the scroll event
     */
    public void sendScrollEvent(double posx, double posy, double deltaX, double deltaY) {
        try {
            DowncallHandles.gst_gl_window_send_scroll_event.invokeExact(
                    handle(),
                    posx,
                    posy,
                    deltaX,
                    deltaY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the callback called when the window is about to close.
     * @param callback function to invoke
     */
    public void setCloseCallback(@NotNull org.gstreamer.gl.GLWindowCB callback) {
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_gl_window_set_close_callback.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLWindowCB",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the draw callback called every time gst_gl_window_draw() is called
     * @param callback function to invoke
     */
    public void setDrawCallback(@NotNull org.gstreamer.gl.GLWindowCB callback) {
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_gl_window_set_draw_callback.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLWindowCB",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the preferred width and height of the window.  Implementations are free
     * to ignore this information.
     * @param width new preferred width
     * @param height new preferred height
     */
    public void setPreferredSize(int width, int height) {
        try {
            DowncallHandles.gst_gl_window_set_preferred_size.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tell a {@code window} that it should render into a specific region of the window
     * according to the {@link org.gstreamer.video.VideoOverlay} interface.
     * @param x x position
     * @param y y position
     * @param width width
     * @param height height
     * @return whether the specified region could be set
     */
    public boolean setRenderRectangle(int x, int y, int width, int height) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_window_set_render_rectangle.invokeExact(
                    handle(),
                    x,
                    y,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the resize callback called every time a resize of the window occurs.
     * @param callback function to invoke
     */
    public void setResizeCallback(@NotNull org.gstreamer.gl.GLWindowResizeCB callback) {
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_gl_window_set_resize_callback.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLWindowResizeCB",
                            MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the window that this {@code window} should render into.  Some implementations
     * require this to be called with a valid handle before drawing can commence.
     * @param handle handle to the window
     */
    public void setWindowHandle(long handle) {
        try {
            DowncallHandles.gst_gl_window_set_window_handle.invokeExact(
                    handle(),
                    handle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Present the window to the screen.
     */
    public void show() {
        try {
            DowncallHandles.gst_gl_window_show.invokeExact(
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
            RESULT = (long) DowncallHandles.gst_gl_window_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface KeyEvent {
        void signalReceived(GLWindow sourceGLWindow, @NotNull java.lang.String id, @NotNull java.lang.String key);
    }
    
    /**
     * Will be emitted when a key event is received by the GstGLwindow.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GLWindow.KeyEvent> onKeyEvent(GLWindow.KeyEvent handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("key-event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLWindow.Callbacks.class, "signalGLWindowKeyEvent",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GLWindow.KeyEvent>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MouseEvent {
        void signalReceived(GLWindow sourceGLWindow, @NotNull java.lang.String id, int button, double x, double y);
    }
    
    /**
     * Will be emitted when a mouse event is received by the GstGLwindow.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GLWindow.MouseEvent> onMouseEvent(GLWindow.MouseEvent handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mouse-event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLWindow.Callbacks.class, "signalGLWindowMouseEvent",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GLWindow.MouseEvent>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ScrollEvent {
        void signalReceived(GLWindow sourceGLWindow, double x, double y, double deltaX, double deltaY);
    }
    
    /**
     * Will be emitted when a mouse scroll event is received by the GstGLwindow.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GLWindow.ScrollEvent> onScrollEvent(GLWindow.ScrollEvent handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("scroll-event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLWindow.Callbacks.class, "signalGLWindowScrollEvent",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GLWindow.ScrollEvent>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface WindowHandleChanged {
        void signalReceived(GLWindow sourceGLWindow);
    }
    
    /**
     * Will be emitted when the window handle has been set into the native
     * implementation, but before the context is re-activated. By using this
     * signal, elements can refresh associated resource without relying on
     * direct handle comparision.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GLWindow.WindowHandleChanged> onWindowHandleChanged(GLWindow.WindowHandleChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("window-handle-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLWindow.Callbacks.class, "signalGLWindowWindowHandleChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GLWindow.WindowHandleChanged>(handle(), RESULT);
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
         * A {@link GLWindow.Build} object constructs a {@link GLWindow} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLWindow} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLWindow} using {@link GLWindow#castFrom}.
         * @return A new instance of {@code GLWindow} with the properties 
         *         that were set in the Build object.
         */
        public GLWindow construct() {
            return GLWindow.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLWindow.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_window_new = Interop.downcallHandle(
            "gst_gl_window_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_controls_viewport = Interop.downcallHandle(
            "gst_gl_window_controls_viewport",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_draw = Interop.downcallHandle(
            "gst_gl_window_draw",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_get_context = Interop.downcallHandle(
            "gst_gl_window_get_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_get_display = Interop.downcallHandle(
            "gst_gl_window_get_display",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_get_surface_dimensions = Interop.downcallHandle(
            "gst_gl_window_get_surface_dimensions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_get_window_handle = Interop.downcallHandle(
            "gst_gl_window_get_window_handle",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_handle_events = Interop.downcallHandle(
            "gst_gl_window_handle_events",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_window_has_output_surface = Interop.downcallHandle(
            "gst_gl_window_has_output_surface",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_queue_resize = Interop.downcallHandle(
            "gst_gl_window_queue_resize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_quit = Interop.downcallHandle(
            "gst_gl_window_quit",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_resize = Interop.downcallHandle(
            "gst_gl_window_resize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_window_run = Interop.downcallHandle(
            "gst_gl_window_run",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_send_key_event = Interop.downcallHandle(
            "gst_gl_window_send_key_event",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_send_message = Interop.downcallHandle(
            "gst_gl_window_send_message",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_send_message_async = Interop.downcallHandle(
            "gst_gl_window_send_message_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_send_mouse_event = Interop.downcallHandle(
            "gst_gl_window_send_mouse_event",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_gl_window_send_scroll_event = Interop.downcallHandle(
            "gst_gl_window_send_scroll_event",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_gl_window_set_close_callback = Interop.downcallHandle(
            "gst_gl_window_set_close_callback",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_set_draw_callback = Interop.downcallHandle(
            "gst_gl_window_set_draw_callback",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_set_preferred_size = Interop.downcallHandle(
            "gst_gl_window_set_preferred_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_window_set_render_rectangle = Interop.downcallHandle(
            "gst_gl_window_set_render_rectangle",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_window_set_resize_callback = Interop.downcallHandle(
            "gst_gl_window_set_resize_callback",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_set_window_handle = Interop.downcallHandle(
            "gst_gl_window_set_window_handle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_window_show = Interop.downcallHandle(
            "gst_gl_window_show",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_window_get_type = Interop.downcallHandle(
            "gst_gl_window_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalGLWindowKeyEvent(MemoryAddress sourceGLWindow, MemoryAddress id, MemoryAddress key, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GLWindow.KeyEvent) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GLWindow(sourceGLWindow, Ownership.NONE), Interop.getStringFrom(id), Interop.getStringFrom(key));
        }
        
        public static void signalGLWindowMouseEvent(MemoryAddress sourceGLWindow, MemoryAddress id, int button, double x, double y, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GLWindow.MouseEvent) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GLWindow(sourceGLWindow, Ownership.NONE), Interop.getStringFrom(id), button, x, y);
        }
        
        public static void signalGLWindowScrollEvent(MemoryAddress sourceGLWindow, double x, double y, double deltaX, double deltaY, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GLWindow.ScrollEvent) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GLWindow(sourceGLWindow, Ownership.NONE), x, y, deltaX, deltaY);
        }
        
        public static void signalGLWindowWindowHandleChanged(MemoryAddress sourceGLWindow, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GLWindow.WindowHandleChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GLWindow(sourceGLWindow, Ownership.NONE));
        }
    }
}
