package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An error code used with {@code G_RESOURCE_ERROR} in a {@link org.gtk.glib.Error} returned
 * from a {@link Resource} routine.
 * @version 2.32
 */
public enum ResourceError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no file was found at the requested path
     */
    NOT_FOUND(0),
    
    /**
     * unknown error
     */
    INTERNAL(1);
    
    private static final java.lang.String C_TYPE_NAME = "GResourceError";
    
    private final int value;
    
    /**
     * Create a new ResourceError for the provided value
     * @param numeric value the enum value
     */
    ResourceError(int value) {
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
     * Create a new ResourceError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ResourceError of(int value) {
        return switch (value) {
            case 0 -> NOT_FOUND;
            case 1 -> INTERNAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets the {@link Resource} Error Quark.
     * @return a {@link org.gtk.glib.Quark}
     */
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_resource_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_resource_error_quark = Interop.downcallHandle(
                "g_resource_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
