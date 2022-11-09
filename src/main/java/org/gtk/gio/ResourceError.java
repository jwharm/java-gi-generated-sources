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
public class ResourceError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GResourceError";
    
    /**
     * no file was found at the requested path
     */
    public static final ResourceError NOT_FOUND = new ResourceError(0);
    
    /**
     * unknown error
     */
    public static final ResourceError INTERNAL = new ResourceError(1);
    
    public ResourceError(int value) {
        super(value);
    }
    
    /**
     * Gets the {@link Resource} Error Quark.
     * @return a {@link org.gtk.glib.Quark}
     */
    public static @NotNull org.gtk.glib.Quark quark() {
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
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
    }
}
