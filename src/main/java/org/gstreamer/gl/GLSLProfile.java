package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GLSL profiles
 * @version 1.8
 */
public class GLSLProfile extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstGLSLProfile";
    
    /**
     * no profile supported/available
     */
    public static final GLSLProfile NONE = new GLSLProfile(0);
    
    /**
     * OpenGL|ES profile
     */
    public static final GLSLProfile ES = new GLSLProfile(1);
    
    /**
     * OpenGL core profile
     */
    public static final GLSLProfile CORE = new GLSLProfile(2);
    
    /**
     * OpenGL compatibility profile
     */
    public static final GLSLProfile COMPATIBILITY = new GLSLProfile(4);
    
    /**
     * any OpenGL/OpenGL|ES profile
     */
    public static final GLSLProfile ANY = new GLSLProfile(-1);
    
    public GLSLProfile(int value) {
        super(value);
    }
    
    public static org.gstreamer.gl.GLSLProfile fromString(java.lang.String string) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_profile_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLSLProfile(RESULT);
    }
    
    public static @Nullable java.lang.String toString(org.gstreamer.gl.GLSLProfile profile) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_profile_to_string.invokeExact(
                    profile.getValue());
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
    public GLSLProfile or(GLSLProfile... masks) {
        int value = this.getValue();
        for (GLSLProfile arg : masks) {
            value |= arg.getValue();
        }
        return new GLSLProfile(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static GLSLProfile combined(GLSLProfile mask, GLSLProfile... masks) {
        int value = mask.getValue();
        for (GLSLProfile arg : masks) {
            value |= arg.getValue();
        }
        return new GLSLProfile(value);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_glsl_profile_from_string = Interop.downcallHandle(
            "gst_glsl_profile_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_glsl_profile_to_string = Interop.downcallHandle(
            "gst_glsl_profile_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
