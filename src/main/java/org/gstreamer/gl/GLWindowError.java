package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum GLWindowError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * failed for a unspecified reason
     */
    FAILED(0),
    
    /**
     * the implementation is too old
     */
    OLD_LIBS(1),
    
    /**
     * no such resource was found
     */
    RESOURCE_UNAVAILABLE(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLWindowError";
    
    private final int value;
    
    /**
     * Create a new GLWindowError for the provided value
     * @param numeric value the enum value
     */
    GLWindowError(int value) {
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
     * Create a new GLWindowError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static GLWindowError of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            case 1 -> OLD_LIBS;
            case 2 -> RESOURCE_UNAVAILABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_window_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_window_error_quark = Interop.downcallHandle(
                "gst_gl_window_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
