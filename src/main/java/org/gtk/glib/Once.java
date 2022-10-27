package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Once} struct controls a one-time initialization function. Any
 * one-time initialization function must have its own unique {@link Once}
 * struct.
 * @version 2.4
 */
public class Once extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.glib.OnceStatus.getMemoryLayout().withName("status"),
        Interop.valueLayout.ADDRESS.withName("retval")
    ).withName("GOnce");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Once(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public @Nullable java.lang.foreign.MemoryAddress impl(@NotNull org.gtk.glib.ThreadFunc func, @Nullable java.lang.foreign.MemoryAddress arg) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
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
     * @param location location of a static initializable variable
     *    containing 0
     * @return {@code true} if the initialization section should be entered,
     *     {@code false} and blocks otherwise
     */
    public static boolean initEnter(@NotNull java.lang.foreign.MemoryAddress location) {
        java.util.Objects.requireNonNull(location, "Parameter 'location' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_once_init_enter.invokeExact(location);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Counterpart to g_once_init_enter(). Expects a location of a static
     * 0-initialized initialization variable, and an initialization value
     * other than 0. Sets the variable to the initialization value, and
     * releases concurrent threads blocking in g_once_init_enter() on this
     * initialization variable.
     * <p>
     * While {@code location} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     * @param location location of a static initializable variable
     *    containing 0
     * @param result new non-0 value for *{@code value_location}
     */
    public static void initLeave(@NotNull java.lang.foreign.MemoryAddress location, long result) {
        java.util.Objects.requireNonNull(location, "Parameter 'location' must not be null");
        try {
            DowncallHandles.g_once_init_leave.invokeExact(location, result);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_once_impl = Interop.downcallHandle(
            "g_once_impl",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_once_init_enter = Interop.downcallHandle(
            "g_once_init_enter",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_once_init_leave = Interop.downcallHandle(
            "g_once_init_leave",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
}
