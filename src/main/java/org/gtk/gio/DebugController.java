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
     * Cast object to DebugController if its GType is a (or inherits from) "GDebugController".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DebugController} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDebugController", a ClassCastException will be thrown.
     */
    public static DebugController castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DebugController.getType())) {
            return new DebugControllerImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDebugController");
        }
    }
    
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
        return RESULT != 0;
    }
    
    /**
     * Set the value of {@link DebugController}:debug-enabled.
     * @param debugEnabled {@code true} if debug output should be exposed, {@code false} otherwise
     */
    default void setDebugEnabled(boolean debugEnabled) {
        try {
            DowncallHandles.g_debug_controller_set_debug_enabled.invokeExact(
                    handle(),
                    debugEnabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    
    class DebugControllerImpl extends org.gtk.gobject.Object implements DebugController {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DebugControllerImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
