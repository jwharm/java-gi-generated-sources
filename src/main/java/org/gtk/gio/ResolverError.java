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
public class ResolverError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * the requested name/address/service was not
     *     found
     */
    public static final ResolverError NOT_FOUND = new ResolverError(0);
    
    /**
     * the requested information could not
     *     be looked up due to a network error or similar problem
     */
    public static final ResolverError TEMPORARY_FAILURE = new ResolverError(1);
    
    /**
     * unknown error
     */
    public static final ResolverError INTERNAL = new ResolverError(2);
    
    public ResolverError(int value) {
        super(value);
    }
    
    /**
     * Gets the {@link Resolver} Error Quark.
     * @return a {@link org.gtk.glib.Quark}.
     */
    public static @NotNull org.gtk.glib.Quark quark() {
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
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
