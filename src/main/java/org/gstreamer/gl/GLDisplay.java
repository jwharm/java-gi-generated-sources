package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLDisplay} represents a connection to the underlying windowing system.
 * Elements are required to make use of {@link org.gstreamer.gst.Context} to share and propagate
 * a {@link GLDisplay}.
 * <p>
 * There are a number of environment variables that influence the choice of
 * platform and window system specific functionality.
 * <ul>
 * <li>GST_GL_WINDOW influences the window system to use.  Common values are
 *   'x11', 'wayland', 'win32' or 'cocoa'.
 * <li>GST_GL_PLATFORM influences the OpenGL platform to use.  Common values are
 *   'egl', 'glx', 'wgl' or 'cgl'.
 * <li>GST_GL_API influences the OpenGL API requested by the OpenGL platform.
 *   Common values are 'opengl', 'opengl3' and 'gles2'.
 * </ul>
 * <p>
 * <blockquote>
 *  Certain window systems require a special function to be called to
 *  initialize threading support.  As this GStreamer GL library does not preclude
 *  concurrent access to the windowing system, it is strongly advised that
 *  applications ensure that threading support has been initialized before any
 *  other toolkit/library functionality is accessed.  Failure to do so could
 *  result in sudden application abortion during execution.  The most notably
 *  example of such a function is X11's XInitThreads\\().
 * </blockquote>
 */
public class GLDisplay extends org.gstreamer.gst.Object {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLDisplay";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("object"),
        Interop.valueLayout.C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("windows"),
        Interop.valueLayout.ADDRESS.withName("main_context"),
        Interop.valueLayout.ADDRESS.withName("main_loop"),
        Interop.valueLayout.ADDRESS.withName("event_source"),
        Interop.valueLayout.ADDRESS.withName("priv")
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
     * Create a GLDisplay proxy instance for the provided memory address.
     * <p>
     * Because GLDisplay is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLDisplay(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLDisplay if its GType is a (or inherits from) "GstGLDisplay".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLDisplay} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLDisplay", a ClassCastException will be thrown.
     */
    public static GLDisplay castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLDisplay.getType())) {
            return new GLDisplay(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLDisplay");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLDisplay() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewWithType(@NotNull org.gstreamer.gl.GLDisplayType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_new_with_type.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Will always return a {@link GLDisplay} of a single type.  This differs from
     * gst_gl_display_new() and the seemingly equivalent call
     * gst_gl_display_new_with_type (GST_GL_DISPLAY_TYPE_ANY) in that the latter
     * may return NULL.
     * @param type {@link GLDisplayType}
     * @return a new {@link GLDisplay} or {@code null} if {@code type} is
     *          not supported
     */
    public static GLDisplay newWithType(@NotNull org.gstreamer.gl.GLDisplayType type) {
        return new GLDisplay(constructNewWithType(type), Ownership.FULL);
    }
    
    public boolean addContext(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_display_add_context.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * It requires the display's object lock to be held.
     * @param otherContext other {@link GLContext} to share resources with.
     * @param pContext resulting {@link GLContext}
     * @return whether a new context could be created.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean createContext(@NotNull org.gstreamer.gl.GLContext otherContext, @NotNull Out<org.gstreamer.gl.GLContext> pContext) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(otherContext, "Parameter 'otherContext' must not be null");
        java.util.Objects.requireNonNull(pContext, "Parameter 'pContext' must not be null");
        MemorySegment pContextPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_display_create_context.invokeExact(
                    handle(),
                    otherContext.handle(),
                    (Addressable) pContextPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        pContext.set(new org.gstreamer.gl.GLContext(pContextPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    public @NotNull org.gstreamer.gl.GLWindow createWindow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_create_window.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLWindow(RESULT, Ownership.FULL);
    }
    
    /**
     * limit the use of OpenGL to the requested {@code gl_api}.  This is intended to allow
     * application and elements to request a specific set of OpenGL API's based on
     * what they support.  See gst_gl_context_get_gl_api() for the retrieving the
     * API supported by a {@link GLContext}.
     * @param glApi a {@link GLAPI} to filter with
     */
    public void filterGlApi(@NotNull org.gstreamer.gl.GLAPI glApi) {
        java.util.Objects.requireNonNull(glApi, "Parameter 'glApi' must not be null");
        try {
            DowncallHandles.gst_gl_display_filter_gl_api.invokeExact(
                    handle(),
                    glApi.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deprecated for gst_gl_display_retrieve_window().
     * <p>
     * Execute {@code compare_func} over the list of windows stored by {@code display}.  The
     * first argument to {@code compare_func} is the {@link GLWindow} being checked and the
     * second argument is {@code data}.
     * @param compareFunc a comparison function to run
     * @return The first {@link GLWindow} that causes a match
     *          from {@code compare_func}
     */
    public @NotNull org.gstreamer.gl.GLWindow findWindow(@NotNull org.gtk.glib.CompareFunc compareFunc) {
        java.util.Objects.requireNonNull(compareFunc, "Parameter 'compareFunc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_find_window.invokeExact(
                    handle(),
                    (Addressable) (Interop.registerCallback(compareFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLWindow(RESULT, Ownership.NONE);
    }
    
    /**
     * see gst_gl_display_filter_gl_api() for what the returned value represents
     * @return the {@link GLAPI} configured for {@code display}
     */
    public @NotNull org.gstreamer.gl.GLAPI getGlApi() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_display_get_gl_api.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLAPI(RESULT);
    }
    
    public @NotNull org.gstreamer.gl.GLAPI getGlApiUnlocked() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_display_get_gl_api_unlocked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLAPI(RESULT);
    }
    
    public @NotNull org.gstreamer.gl.GLContext getGlContextForThread(@NotNull org.gtk.glib.Thread thread) {
        java.util.Objects.requireNonNull(thread, "Parameter 'thread' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_get_gl_context_for_thread.invokeExact(
                    handle(),
                    thread.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLContext(RESULT, Ownership.FULL);
    }
    
    public long getHandle() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_display_get_handle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull org.gstreamer.gl.GLDisplayType getHandleType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_display_get_handle_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLDisplayType(RESULT);
    }
    
    /**
     * Must be called with the object lock held.
     * @param context the {@link GLContext} to remove
     */
    public void removeContext(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        try {
            DowncallHandles.gst_gl_display_remove_context.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean removeWindow(@NotNull org.gstreamer.gl.GLWindow window) {
        java.util.Objects.requireNonNull(window, "Parameter 'window' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_display_remove_window.invokeExact(
                    handle(),
                    window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Execute {@code compare_func} over the list of windows stored by {@code display}.  The
     * first argument to {@code compare_func} is the {@link GLWindow} being checked and the
     * second argument is {@code data}.
     * @param compareFunc a comparison function to run
     * @return The first {@link GLWindow} that causes a match
     *          from {@code compare_func}
     */
    public @NotNull org.gstreamer.gl.GLWindow retrieveWindow(@NotNull org.gtk.glib.CompareFunc compareFunc) {
        java.util.Objects.requireNonNull(compareFunc, "Parameter 'compareFunc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_retrieve_window.invokeExact(
                    handle(),
                    (Addressable) (Interop.registerCallback(compareFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLWindow(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_display_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface CreateContext {
        void signalReceived(GLDisplay sourceGLDisplay, @NotNull org.gstreamer.gl.GLContext context);
    }
    
    /**
     * Overrides the {@code GstGLContext} creation mechanism.
     * It can be called in any thread and it is emitted with
     * display's object lock held.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GLDisplay.CreateContext> onCreateContext(GLDisplay.CreateContext handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("create-context"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLDisplay.Callbacks.class, "signalGLDisplayCreateContext",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GLDisplay.CreateContext>(handle(), RESULT);
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
         * A {@link GLDisplay.Build} object constructs a {@link GLDisplay} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLDisplay} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLDisplay} using {@link GLDisplay#castFrom}.
         * @return A new instance of {@code GLDisplay} with the properties 
         *         that were set in the Build object.
         */
        public GLDisplay construct() {
            return GLDisplay.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLDisplay.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_display_new = Interop.downcallHandle(
            "gst_gl_display_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_new_with_type = Interop.downcallHandle(
            "gst_gl_display_new_with_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_display_add_context = Interop.downcallHandle(
            "gst_gl_display_add_context",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_create_context = Interop.downcallHandle(
            "gst_gl_display_create_context",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_create_window = Interop.downcallHandle(
            "gst_gl_display_create_window",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_filter_gl_api = Interop.downcallHandle(
            "gst_gl_display_filter_gl_api",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_display_find_window = Interop.downcallHandle(
            "gst_gl_display_find_window",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_get_gl_api = Interop.downcallHandle(
            "gst_gl_display_get_gl_api",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_get_gl_api_unlocked = Interop.downcallHandle(
            "gst_gl_display_get_gl_api_unlocked",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_get_gl_context_for_thread = Interop.downcallHandle(
            "gst_gl_display_get_gl_context_for_thread",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_get_handle = Interop.downcallHandle(
            "gst_gl_display_get_handle",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_get_handle_type = Interop.downcallHandle(
            "gst_gl_display_get_handle_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_remove_context = Interop.downcallHandle(
            "gst_gl_display_remove_context",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_remove_window = Interop.downcallHandle(
            "gst_gl_display_remove_window",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_retrieve_window = Interop.downcallHandle(
            "gst_gl_display_retrieve_window",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_get_type = Interop.downcallHandle(
            "gst_gl_display_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalGLDisplayCreateContext(MemoryAddress sourceGLDisplay, MemoryAddress context, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GLDisplay.CreateContext) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GLDisplay(sourceGLDisplay, Ownership.NONE), new org.gstreamer.gl.GLContext(context, Ownership.NONE));
        }
    }
}
