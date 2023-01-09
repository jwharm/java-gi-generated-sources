package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * OpenGL context errors.
 */
public enum GLContextError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Failed for an unspecified reason
     */
    FAILED(0),
    
    /**
     * The configuration requested is not correct
     */
    WRONG_CONFIG(1),
    
    /**
     * The OpenGL API requested is not correct
     */
    WRONG_API(2),
    
    /**
     * The OpenGL libraries are too old
     */
    OLD_LIBS(3),
    
    /**
     * glXCreateContext (or similar) failed
     */
    CREATE_CONTEXT(4),
    
    /**
     * A resource is not available
     */
    RESOURCE_UNAVAILABLE(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLContextError";
    
    private final int value;
    
    /**
     * Create a new GLContextError for the provided value
     * @param numeric value the enum value
     */
    GLContextError(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new GLContextError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static GLContextError of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            case 1 -> WRONG_CONFIG;
            case 2 -> WRONG_API;
            case 3 -> OLD_LIBS;
            case 4 -> CREATE_CONTEXT;
            case 5 -> RESOURCE_UNAVAILABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_context_error_quark = Interop.downcallHandle(
                "gst_gl_context_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
