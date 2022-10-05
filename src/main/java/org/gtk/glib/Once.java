package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link Once} struct controls a one-time initialization function. Any
 * one-time initialization function must have its own unique {@link Once}
 * struct.
 */
public class Once extends io.github.jwharm.javagi.ResourceBase {

    public Once(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_once_init_enter = Interop.downcallHandle(
        "g_once_init_enter",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Function to be called when starting a critical initialization
     * section. The argument {@code location} must point to a static
     * 0-initialized variable that will be set to a value other than 0 at
     * the end of the initialization section. In combination with
     * g_once_init_leave() and the unique address {@code value_location}, it can
     * be ensured that an initialization section will be executed only once
     * during a program's life time, and that concurrent threads are
     * blocked until initialization completed. To be used in constructs
     * like this:
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   static gsize initialization_value = 0;
     * 
     *   if (g_once_init_enter (&initialization_value))
     *     {
     *       gsize setup_value = 42; // initialization code here
     * 
     *       g_once_init_leave (&initialization_value, setup_value);
     *     }
     * 
     *   // use initialization_value here
     * }</pre>
     * <p>
     * While {@code location} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static boolean initEnter(java.lang.foreign.MemoryAddress location) {
        try {
            var RESULT = (int) g_once_init_enter.invokeExact(location);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_once_init_leave = Interop.downcallHandle(
        "g_once_init_leave",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Counterpart to g_once_init_enter(). Expects a location of a static
     * 0-initialized initialization variable, and an initialization value
     * other than 0. Sets the variable to the initialization value, and
     * releases concurrent threads blocking in g_once_init_enter() on this
     * initialization variable.
     * <p>
     * While {@code location} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static void initLeave(java.lang.foreign.MemoryAddress location, long result) {
        try {
            g_once_init_leave.invokeExact(location, result);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
