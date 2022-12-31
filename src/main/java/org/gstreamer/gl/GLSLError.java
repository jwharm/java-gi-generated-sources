package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Compilation stage that caused an error
 * @version 1.8
 */
public enum GLSLError implements io.github.jwharm.javagi.Enumeration {
    /**
     * Compilation error occurred
     */
    COMPILE(0),
    /**
     * Link error occurred
     */
    LINK(1),
    /**
     * General program error occurred
     */
    PROGRAM(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLSLError";
    
    private final int value;
    GLSLError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static GLSLError of(int value) {
        return switch (value) {
            case 0 -> COMPILE;
            case 1 -> LINK;
            case 2 -> PROGRAM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_glsl_error_quark = Interop.downcallHandle(
            "gst_glsl_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
