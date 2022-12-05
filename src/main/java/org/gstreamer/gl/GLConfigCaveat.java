package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum GLConfigCaveat implements io.github.jwharm.javagi.Enumeration {
    /**
     * none
     */
    NONE(0),
    /**
     * slow
     */
    SLOW(1),
    /**
     * non-conformant
     */
    NON_CONFORMANT(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLConfigCaveat";
    
    private final int value;
    GLConfigCaveat(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static GLConfigCaveat of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> SLOW;
            case 2 -> NON_CONFORMANT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static @Nullable java.lang.String toString(@NotNull org.gstreamer.gl.GLConfigCaveat caveat) {
        java.util.Objects.requireNonNull(caveat, "Parameter 'caveat' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_config_caveat_to_string.invokeExact(
                    caveat.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_config_caveat_to_string = Interop.downcallHandle(
            "gst_gl_config_caveat_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
