package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLPlatform extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstGLPlatform";
    
    /**
     * no platform
     */
    public static final GLPlatform NONE = new GLPlatform(0);
    
    /**
     * the EGL platform used primarily with the X11, wayland
     *                      and android window systems as well as on embedded Linux
     */
    public static final GLPlatform EGL = new GLPlatform(1);
    
    /**
     * the GLX platform used primarily with the X11 window system
     */
    public static final GLPlatform GLX = new GLPlatform(2);
    
    /**
     * the WGL platform used primarily on Windows
     */
    public static final GLPlatform WGL = new GLPlatform(4);
    
    /**
     * the CGL platform used primarily on OS X
     */
    public static final GLPlatform CGL = new GLPlatform(8);
    
    /**
     * the EAGL platform used primarily on iOS
     */
    public static final GLPlatform EAGL = new GLPlatform(16);
    
    /**
     * any OpenGL platform
     */
    public static final GLPlatform ANY = new GLPlatform(-1);
    
    public GLPlatform(int value) {
        super(value);
    }
    
    public static @NotNull org.gstreamer.gl.GLPlatform fromString(@NotNull java.lang.String platformS) {
        java.util.Objects.requireNonNull(platformS, "Parameter 'platformS' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_platform_from_string.invokeExact(
                    Interop.allocateNativeString(platformS));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLPlatform(RESULT);
    }
    
    public static @NotNull java.lang.String toString(@NotNull org.gstreamer.gl.GLPlatform platform) {
        java.util.Objects.requireNonNull(platform, "Parameter 'platform' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_platform_to_string.invokeExact(
                    platform.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public GLPlatform or(GLPlatform mask) {
        return new GLPlatform(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static GLPlatform combined(GLPlatform mask, GLPlatform... masks) {
        int value = mask.getValue();        for (GLPlatform arg : masks) {
            value |= arg.getValue();
        }
        return new GLPlatform(value);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_platform_from_string = Interop.downcallHandle(
            "gst_gl_platform_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_platform_to_string = Interop.downcallHandle(
            "gst_gl_platform_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
