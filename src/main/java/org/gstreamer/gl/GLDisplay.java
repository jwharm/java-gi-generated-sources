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
public class GLDisplay extends org.gstreamer.gst.GstObject {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLDisplay";
    
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
            Interop.valueLayout.ADDRESS.withName("windows"),
            Interop.valueLayout.ADDRESS.withName("main_context"),
            Interop.valueLayout.ADDRESS.withName("main_loop"),
            Interop.valueLayout.ADDRESS.withName("event_source"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLDisplay proxy instance for the provided memory address.
     * <p>
     * Because GLDisplay is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLDisplay(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, GLDisplay> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLDisplay(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    
    private static MemoryAddress constructNewWithType(org.gstreamer.gl.GLDisplayType type) {
        MemoryAddress RESULT;
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
    public static GLDisplay newWithType(org.gstreamer.gl.GLDisplayType type) {
        var RESULT = constructNewWithType(type);
        return (org.gstreamer.gl.GLDisplay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gl.GLDisplay.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    public boolean addContext(org.gstreamer.gl.GLContext context) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_display_add_context.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * It requires the display's object lock to be held.
     * @param otherContext other {@link GLContext} to share resources with.
     * @param pContext resulting {@link GLContext}
     * @return whether a new context could be created.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean createContext(org.gstreamer.gl.GLContext otherContext, Out<org.gstreamer.gl.GLContext> pContext) throws io.github.jwharm.javagi.GErrorException {
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
        pContext.set((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pContextPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gl.GLContext.fromAddress).marshal(pContextPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public org.gstreamer.gl.GLWindow createWindow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_create_window.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gl.GLWindow.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * limit the use of OpenGL to the requested {@code gl_api}.  This is intended to allow
     * application and elements to request a specific set of OpenGL API's based on
     * what they support.  See gst_gl_context_get_gl_api() for the retrieving the
     * API supported by a {@link GLContext}.
     * @param glApi a {@link GLAPI} to filter with
     */
    public void filterGlApi(org.gstreamer.gl.GLAPI glApi) {
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
    public org.gstreamer.gl.GLWindow findWindow(org.gtk.glib.CompareFunc compareFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_find_window.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) compareFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gl.GLWindow.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * see gst_gl_display_filter_gl_api() for what the returned value represents
     * @return the {@link GLAPI} configured for {@code display}
     */
    public org.gstreamer.gl.GLAPI getGlApi() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_display_get_gl_api.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLAPI(RESULT);
    }
    
    public org.gstreamer.gl.GLAPI getGlApiUnlocked() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_display_get_gl_api_unlocked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLAPI(RESULT);
    }
    
    public org.gstreamer.gl.GLContext getGlContextForThread(org.gtk.glib.Thread thread) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_get_gl_context_for_thread.invokeExact(
                    handle(),
                    thread.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gl.GLContext.fromAddress).marshal(RESULT, Ownership.FULL);
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
    
    public org.gstreamer.gl.GLDisplayType getHandleType() {
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
    public void removeContext(org.gstreamer.gl.GLContext context) {
        try {
            DowncallHandles.gst_gl_display_remove_context.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean removeWindow(org.gstreamer.gl.GLWindow window) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_display_remove_window.invokeExact(
                    handle(),
                    window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Execute {@code compare_func} over the list of windows stored by {@code display}.  The
     * first argument to {@code compare_func} is the {@link GLWindow} being checked and the
     * second argument is {@code data}.
     * @param compareFunc a comparison function to run
     * @return The first {@link GLWindow} that causes a match
     *          from {@code compare_func}
     */
    public org.gstreamer.gl.GLWindow retrieveWindow(org.gtk.glib.CompareFunc compareFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_retrieve_window.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) compareFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gl.GLWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gl.GLWindow.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
        org.gstreamer.gl.GLContext run(org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceGLDisplay, MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateContext.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("create-context"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GLDisplay.Builder} object constructs a {@link GLDisplay} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLDisplay.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLDisplay} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLDisplay}.
         * @return A new instance of {@code GLDisplay} with the properties 
         *         that were set in the Builder object.
         */
        public GLDisplay build() {
            return (GLDisplay) org.gtk.gobject.GObject.newWithProperties(
                GLDisplay.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
}
