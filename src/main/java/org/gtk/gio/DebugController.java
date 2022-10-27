package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DebugController} is an interface to expose control of debugging features and
 * debug output.
 * <p>
 * It is implemented on Linux using {@link DebugControllerDBus}, which exposes a D-Bus
 * interface to allow authenticated peers to control debug features in this
 * process.
 * <p>
 * Whether debug output is enabled is exposed as
 * {@link DebugController}:debug-enabled. This controls g_log_set_debug_enabled() by
 * default. Application code may connect to the {@link org.gtk.gobject.Object}::notify signal for it
 * to control other parts of its debug infrastructure as necessary.
 * <p>
 * If your application or service is using the default GLib log writer function,
 * creating one of the built-in implementations of {@link DebugController} should be
 * all that’s needed to dynamically enable or disable debug output.
 * @version 2.72
 */
public interface DebugController extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Get the value of {@link DebugController}:debug-enabled.
     * @return {@code true} if debug output should be exposed, {@code false} otherwise
     */
    default boolean getDebugEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_debug_controller_get_debug_enabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the value of {@link DebugController}:debug-enabled.
     * @param debugEnabled {@code true} if debug output should be exposed, {@code false} otherwise
     */
    default void setDebugEnabled(boolean debugEnabled) {
        try {
            DowncallHandles.g_debug_controller_set_debug_enabled.invokeExact(handle(), debugEnabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_debug_controller_get_debug_enabled = Interop.downcallHandle(
            "g_debug_controller_get_debug_enabled",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_debug_controller_set_debug_enabled = Interop.downcallHandle(
            "g_debug_controller_set_debug_enabled",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    class DebugControllerImpl extends org.gtk.gobject.Object implements DebugController {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DebugControllerImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
