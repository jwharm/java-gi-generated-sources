package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * the contents of a {@link GLDisplayEGL} are private and should only be accessed
 * through the provided API
 */
public class GLDisplayEGL extends org.gstreamer.gl.GLDisplay {
    
    static {
        GstGLEGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLDisplayEGL";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLDisplay.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("display"),
        Interop.valueLayout.C_INT.withName("foreign_display"),
        MemoryLayout.paddingLayout(96),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
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
     * Create a GLDisplayEGL proxy instance for the provided memory address.
     * <p>
     * Because GLDisplayEGL is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLDisplayEGL(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLDisplayEGL if its GType is a (or inherits from) "GstGLDisplayEGL".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLDisplayEGL} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLDisplayEGL", a ClassCastException will be thrown.
     */
    public static GLDisplayEGL castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLDisplayEGL.getType())) {
            return new GLDisplayEGL(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLDisplayEGL");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_egl_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link GLDisplayEGL} using the default EGL_DEFAULT_DISPLAY.
     */
    public GLDisplayEGL() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewWithEglDisplay(@Nullable java.lang.foreign.MemoryAddress display) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_egl_new_with_egl_display.invokeExact(
                    (Addressable) (display == null ? MemoryAddress.NULL : (Addressable) display));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLDisplayEGL newWithEglDisplay(@Nullable java.lang.foreign.MemoryAddress display) {
        return new GLDisplayEGL(constructNewWithEglDisplay(display), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_display_egl_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a EGL display connection from a native Display.
     * <p>
     * This function will return the same value for multiple calls with the same
     * {@code display}.
     * @param display an existing {@link org.gstreamer.gl.GLDisplay}
     * @return a new {@link GLDisplayEGL}
     */
    public static @NotNull org.gstreamer.gl.egl.GLDisplayEGL fromGlDisplay(@NotNull org.gstreamer.gl.GLDisplay display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_egl_from_gl_display.invokeExact(
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.egl.GLDisplayEGL(RESULT, Ownership.FULL);
    }
    
    /**
     * Attempts to create a new {@code EGLDisplay} from {@code display}.  If {@code type} is
     * {@link org.gstreamer.gl.GLDisplayType#ANY}, then {@code display} must be 0. {@code type} must not be
     * {@link org.gstreamer.gl.GLDisplayType#NONE}.
     * @param type a {@link org.gstreamer.gl.GLDisplayType}
     * @param display pointer to a display (or 0)
     * @return A {@code EGLDisplay} or {@code EGL_NO_DISPLAY}
     */
    public static @Nullable java.lang.foreign.MemoryAddress getFromNative(@NotNull org.gstreamer.gl.GLDisplayType type, long display) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_egl_get_from_native.invokeExact(
                    type.getValue(),
                    display);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gl.GLDisplay.Build {
        
         /**
         * A {@link GLDisplayEGL.Build} object constructs a {@link GLDisplayEGL} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLDisplayEGL} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLDisplayEGL} using {@link GLDisplayEGL#castFrom}.
         * @return A new instance of {@code GLDisplayEGL} with the properties 
         *         that were set in the Build object.
         */
        public GLDisplayEGL construct() {
            return GLDisplayEGL.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLDisplayEGL.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_display_egl_new = Interop.downcallHandle(
            "gst_gl_display_egl_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_egl_new_with_egl_display = Interop.downcallHandle(
            "gst_gl_display_egl_new_with_egl_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_egl_get_type = Interop.downcallHandle(
            "gst_gl_display_egl_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_display_egl_from_gl_display = Interop.downcallHandle(
            "gst_gl_display_egl_from_gl_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_display_egl_get_from_native = Interop.downcallHandle(
            "gst_gl_display_egl_get_from_native",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
    }
}
