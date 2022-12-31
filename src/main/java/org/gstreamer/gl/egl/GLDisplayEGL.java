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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLDisplay.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("display"),
            Interop.valueLayout.C_INT.withName("foreign_display"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLDisplayEGL proxy instance for the provided memory address.
     * <p>
     * Because GLDisplayEGL is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLDisplayEGL(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, GLDisplayEGL> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLDisplayEGL(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    
    private static MemoryAddress constructNewWithEglDisplay(@Nullable java.lang.foreign.MemoryAddress display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_egl_new_with_egl_display.invokeExact(
                    (Addressable) (display == null ? MemoryAddress.NULL : (Addressable) display));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLDisplayEGL newWithEglDisplay(@Nullable java.lang.foreign.MemoryAddress display) {
        var RESULT = constructNewWithEglDisplay(display);
        return (org.gstreamer.gl.egl.GLDisplayEGL) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gl.egl.GLDisplayEGL.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    public static org.gstreamer.gl.egl.GLDisplayEGL fromGlDisplay(org.gstreamer.gl.GLDisplay display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_display_egl_from_gl_display.invokeExact(
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gl.egl.GLDisplayEGL) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gl.egl.GLDisplayEGL.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Attempts to create a new {@code EGLDisplay} from {@code display}.  If {@code type} is
     * {@link org.gstreamer.gl.GLDisplayType#ANY}, then {@code display} must be 0. {@code type} must not be
     * {@link org.gstreamer.gl.GLDisplayType#NONE}.
     * @param type a {@link org.gstreamer.gl.GLDisplayType}
     * @param display pointer to a display (or 0)
     * @return A {@code EGLDisplay} or {@code EGL_NO_DISPLAY}
     */
    public static @Nullable java.lang.foreign.MemoryAddress getFromNative(org.gstreamer.gl.GLDisplayType type, long display) {
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
     * A {@link GLDisplayEGL.Builder} object constructs a {@link GLDisplayEGL} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLDisplayEGL.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gl.GLDisplay.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLDisplayEGL} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLDisplayEGL}.
         * @return A new instance of {@code GLDisplayEGL} with the properties 
         *         that were set in the Builder object.
         */
        public GLDisplayEGL build() {
            return (GLDisplayEGL) org.gtk.gobject.GObject.newWithProperties(
                GLDisplayEGL.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
