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
 * default. Application code may connect to the {@link org.gtk.gobject.GObject}::notify signal for it
 * to control other parts of its debug infrastructure as necessary.
 * <p>
 * If your application or service is using the default GLib log writer function,
 * creating one of the built-in implementations of {@link DebugController} should be
 * all that’s needed to dynamically enable or disable debug output.
 * @version 2.72
 */
public interface DebugController extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DebugControllerImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DebugControllerImpl(input, ownership);
    
    /**
     * Get the value of {@link DebugController}:debug-enabled.
     * @return {@code true} if debug output should be exposed, {@code false} otherwise
     */
    default boolean getDebugEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_debug_controller_get_debug_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the value of {@link DebugController}:debug-enabled.
     * @param debugEnabled {@code true} if debug output should be exposed, {@code false} otherwise
     */
    default void setDebugEnabled(boolean debugEnabled) {
        try {
            DowncallHandles.g_debug_controller_set_debug_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(debugEnabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_debug_controller_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_debug_controller_get_debug_enabled = Interop.downcallHandle(
            "g_debug_controller_get_debug_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_debug_controller_set_debug_enabled = Interop.downcallHandle(
            "g_debug_controller_set_debug_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_debug_controller_get_type = Interop.downcallHandle(
            "g_debug_controller_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class DebugControllerImpl extends org.gtk.gobject.GObject implements DebugController {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DebugControllerImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
