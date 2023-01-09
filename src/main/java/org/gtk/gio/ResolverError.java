package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An error code used with {@code G_RESOLVER_ERROR} in a {@link org.gtk.glib.Error} returned
 * from a {@link Resolver} routine.
 * @version 2.22
 */
public enum ResolverError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the requested name/address/service was not
     *     found
     */
    NOT_FOUND(0),
    
    /**
     * the requested information could not
     *     be looked up due to a network error or similar problem
     */
    TEMPORARY_FAILURE(1),
    
    /**
     * unknown error
     */
    INTERNAL(2);
    
    private static final java.lang.String C_TYPE_NAME = "GResolverError";
    
    private final int value;
    
    /**
     * Create a new ResolverError for the provided value
     * @param numeric value the enum value
     */
    ResolverError(int value) {
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
     * Create a new ResolverError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ResolverError of(int value) {
        return switch (value) {
            case 0 -> NOT_FOUND;
            case 1 -> TEMPORARY_FAILURE;
            case 2 -> INTERNAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets the {@link Resolver} Error Quark.
     * @return a {@link org.gtk.glib.Quark}.
     */
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_resolver_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_resolver_error_quark = Interop.downcallHandle(
                "g_resolver_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
