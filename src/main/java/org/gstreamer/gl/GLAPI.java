package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLAPI extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstGLAPI";
    
    /**
     * no API
     */
    public static final GLAPI NONE = new GLAPI(0);
    
    /**
     * Desktop OpenGL up to and including 3.1.  The
     *                    compatibility profile when the OpenGL version is &gt;= 3.2
     */
    public static final GLAPI OPENGL = new GLAPI(1);
    
    /**
     * Desktop OpenGL &gt;= 3.2 core profile
     */
    public static final GLAPI OPENGL3 = new GLAPI(2);
    
    /**
     * OpenGL ES 1.x
     */
    public static final GLAPI GLES1 = new GLAPI(32768);
    
    /**
     * OpenGL ES 2.x and 3.x
     */
    public static final GLAPI GLES2 = new GLAPI(65536);
    
    /**
     * Any OpenGL API
     */
    public static final GLAPI ANY = new GLAPI(-1);
    
    /**
     * Create a new GLAPI with the provided value
     */
    public GLAPI(int value) {
        super(value);
    }
    
    public static org.gstreamer.gl.GLAPI fromString(java.lang.String apiS) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_gl_api_from_string.invokeExact(Marshal.stringToAddress.marshal(apiS, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new org.gstreamer.gl.GLAPI(RESULT);
        }
    }
    
    public static java.lang.String toString(org.gstreamer.gl.GLAPI api) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_api_to_string.invokeExact(api.getValue());
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
    public GLAPI or(GLAPI... masks) {
        int value = this.getValue();
        for (GLAPI arg : masks) {
            value |= arg.getValue();
        }
        return new GLAPI(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static GLAPI combined(GLAPI mask, GLAPI... masks) {
        int value = mask.getValue();
        for (GLAPI arg : masks) {
            value |= arg.getValue();
        }
        return new GLAPI(value);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_api_from_string = Interop.downcallHandle(
                "gst_gl_api_from_string",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_api_to_string = Interop.downcallHandle(
                "gst_gl_api_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
}
