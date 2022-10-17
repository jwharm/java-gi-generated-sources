package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link StaticResource} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class StaticResource extends io.github.jwharm.javagi.ResourceBase {

    public StaticResource(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_static_resource_fini = Interop.downcallHandle(
        "g_static_resource_fini",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Finalized a GResource initialized by g_static_resource_init().
     * <p>
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     */
    public @NotNull void fini() {
        try {
            g_static_resource_fini.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_static_resource_get_resource = Interop.downcallHandle(
        "g_static_resource_get_resource",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the GResource that was registered by a call to g_static_resource_init().
     * <p>
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     */
    public @NotNull Resource getResource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_static_resource_get_resource.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Resource(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_static_resource_init = Interop.downcallHandle(
        "g_static_resource_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a GResource from static data using a
     * GStaticResource.
     * <p>
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     */
    public @NotNull void init() {
        try {
            g_static_resource_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
