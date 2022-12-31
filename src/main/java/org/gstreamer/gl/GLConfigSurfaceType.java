package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLConfigSurfaceType extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstGLConfigSurfaceType";
    
    /**
     * none
     */
    public static final GLConfigSurfaceType NONE = new GLConfigSurfaceType(0);
    
    /**
     * window
     */
    public static final GLConfigSurfaceType WINDOW = new GLConfigSurfaceType(1);
    
    /**
     * pbuffer
     */
    public static final GLConfigSurfaceType PBUFFER = new GLConfigSurfaceType(2);
    
    /**
     * pixmap
     */
    public static final GLConfigSurfaceType PIXMAP = new GLConfigSurfaceType(4);
    
    public GLConfigSurfaceType(int value) {
        super(value);
    }
    
    public static @Nullable java.lang.String toString(org.gstreamer.gl.GLConfigSurfaceType surfaceType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_config_surface_type_to_string.invokeExact(
                    surfaceType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public GLConfigSurfaceType or(GLConfigSurfaceType... masks) {
        int value = this.getValue();
        for (GLConfigSurfaceType arg : masks) {
            value |= arg.getValue();
        }
        return new GLConfigSurfaceType(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static GLConfigSurfaceType combined(GLConfigSurfaceType mask, GLConfigSurfaceType... masks) {
        int value = mask.getValue();
        for (GLConfigSurfaceType arg : masks) {
            value |= arg.getValue();
        }
        return new GLConfigSurfaceType(value);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_config_surface_type_to_string = Interop.downcallHandle(
            "gst_gl_config_surface_type_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
