package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The OpenGL texture target that an OpenGL texture can be bound to.  The
 * gst_gl_value_set_texture_target_from_mask(),
 * gst_gl_value_get_texture_target_mask(), and
 * gst_gl_value_set_texture_target() functions can be used for handling texture
 * targets with {@link org.gtk.gobject.Value}'s when e.g. dealing with {@link org.gstreamer.gst.Caps}.
 * @version 1.8
 */
public enum GLTextureTarget implements io.github.jwharm.javagi.Enumeration {
    /**
     * no texture target
     */
    NONE(0),
    /**
     * 2D texture target ({@code GL_TEXTURE_2D})
     */
    _2D(1),
    /**
     * rectangle texture target
     *     ({@code GL_TEXTURE_RECTANGLE})
     */
    RECTANGLE(2),
    /**
     * external oes texture target
     *     ({@code GL_TEXTURE_EXTERNAL_OES})
     */
    EXTERNAL_OES(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLTextureTarget";
    
    private final int value;
    GLTextureTarget(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static GLTextureTarget of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> _2D;
            case 2 -> RECTANGLE;
            case 3 -> EXTERNAL_OES;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gstreamer.gl.GLTextureTarget fromGl(int target) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_texture_target_from_gl.invokeExact(
                    target);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLTextureTarget.of(RESULT);
    }
    
    public static org.gstreamer.gl.GLTextureTarget fromString(java.lang.String str) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_texture_target_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(str, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLTextureTarget.of(RESULT);
    }
    
    public static java.lang.String toBufferPoolOption(org.gstreamer.gl.GLTextureTarget target) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_texture_target_to_buffer_pool_option.invokeExact(
                    target.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static int toGl(org.gstreamer.gl.GLTextureTarget target) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_texture_target_to_gl.invokeExact(
                    target.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static java.lang.String toString(org.gstreamer.gl.GLTextureTarget target) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_texture_target_to_string.invokeExact(
                    target.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_texture_target_from_gl = Interop.downcallHandle(
            "gst_gl_texture_target_from_gl",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_texture_target_from_string = Interop.downcallHandle(
            "gst_gl_texture_target_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_texture_target_to_buffer_pool_option = Interop.downcallHandle(
            "gst_gl_texture_target_to_buffer_pool_option",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_texture_target_to_gl = Interop.downcallHandle(
            "gst_gl_texture_target_to_gl",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_texture_target_to_string = Interop.downcallHandle(
            "gst_gl_texture_target_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
