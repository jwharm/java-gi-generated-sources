package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum GLBaseMemoryError implements io.github.jwharm.javagi.Enumeration {
    /**
     * generic failure
     */
    FAILED(0),
    /**
     * the implementation is too old and doesn't
     *                                     implement enough features
     */
    OLD_LIBS(1),
    /**
     * a resource could not be found
     */
    RESOURCE_UNAVAILABLE(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBaseMemoryError";
    
    private final int value;
    GLBaseMemoryError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static GLBaseMemoryError of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            case 1 -> OLD_LIBS;
            case 2 -> RESOURCE_UNAVAILABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_base_memory_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_base_memory_error_quark = Interop.downcallHandle(
            "gst_gl_base_memory_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
