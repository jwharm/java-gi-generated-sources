package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error enumeration for {@code GdkGLContext}.
 */
public enum GLError implements io.github.jwharm.javagi.Enumeration {
    /**
     * OpenGL support is not available
     */
    NOT_AVAILABLE(0),
    /**
     * The requested visual format is not supported
     */
    UNSUPPORTED_FORMAT(1),
    /**
     * The requested profile is not supported
     */
    UNSUPPORTED_PROFILE(2),
    /**
     * The shader compilation failed
     */
    COMPILATION_FAILED(3),
    /**
     * The shader linking failed
     */
    LINK_FAILED(4);
    
    private static final java.lang.String C_TYPE_NAME = "GdkGLError";
    
    private final int value;
    GLError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static GLError of(int value) {
        return switch (value) {
            case 0 -> NOT_AVAILABLE;
            case 1 -> UNSUPPORTED_FORMAT;
            case 2 -> UNSUPPORTED_PROFILE;
            case 3 -> COMPILATION_FAILED;
            case 4 -> LINK_FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_gl_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_gl_error_quark = Interop.downcallHandle(
            "gdk_gl_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
