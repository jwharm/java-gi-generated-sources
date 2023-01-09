package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GRemoteActionGroup interface is implemented by {@link ActionGroup}
 * instances that either transmit action invocations to other processes
 * or receive action invocations in the local process from other
 * processes.
 * <p>
 * The interface has {@code _full} variants of the two
 * methods on {@link ActionGroup} used to activate actions:
 * g_action_group_activate_action() and
 * g_action_group_change_action_state(). These variants allow a
 * "platform data" {@link org.gtk.glib.Variant} to be specified: a dictionary providing
 * context for the action invocation (for example: timestamps, startup
 * notification IDs, etc).
 * <p>
 * {@link DBusActionGroup} implements {@link RemoteActionGroup}.  This provides a
 * mechanism to send platform data for action invocations over D-Bus.
 * <p>
 * Additionally, g_dbus_connection_export_action_group() will check if
 * the exported {@link ActionGroup} implements {@link RemoteActionGroup} and use the
 * {@code _full} variants of the calls if available.  This
 * provides a mechanism by which to receive platform data for action
 * invocations that arrive by way of D-Bus.
 * @version 2.32
 */
public interface RemoteActionGroup extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RemoteActionGroupImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RemoteActionGroupImpl(input);
    
    /**
     * Activates the remote action.
     * <p>
     * This is the same as g_action_group_activate_action() except that it
     * allows for provision of "platform data" to be sent along with the
     * activation request.  This typically contains details such as the user
     * interaction timestamp or startup notification information.
     * <p>
     * {@code platform_data} must be non-{@code null} and must have the type
     * {@code G_VARIANT_TYPE_VARDICT}.  If it is floating, it will be consumed.
     * @param actionName the name of the action to activate
     * @param parameter the optional parameter to the activation
     * @param platformData the platform data to send
     */
    default void activateActionFull(java.lang.String actionName, @Nullable org.gtk.glib.Variant parameter, org.gtk.glib.Variant platformData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_remote_action_group_activate_action_full.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        (Addressable) (parameter == null ? MemoryAddress.NULL : parameter.handle()),
                        platformData.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Changes the state of a remote action.
     * <p>
     * This is the same as g_action_group_change_action_state() except that
     * it allows for provision of "platform data" to be sent along with the
     * state change request.  This typically contains details such as the
     * user interaction timestamp or startup notification information.
     * <p>
     * {@code platform_data} must be non-{@code null} and must have the type
     * {@code G_VARIANT_TYPE_VARDICT}.  If it is floating, it will be consumed.
     * @param actionName the name of the action to change the state of
     * @param value the new requested value for the state
     * @param platformData the platform data to send
     */
    default void changeActionStateFull(java.lang.String actionName, org.gtk.glib.Variant value, org.gtk.glib.Variant platformData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_remote_action_group_change_action_state_full.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        value.handle(),
                        platformData.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_remote_action_group_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_remote_action_group_activate_action_full = Interop.downcallHandle(
                "g_remote_action_group_activate_action_full",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_remote_action_group_change_action_state_full = Interop.downcallHandle(
                "g_remote_action_group_change_action_state_full",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_remote_action_group_get_type = Interop.downcallHandle(
                "g_remote_action_group_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The RemoteActionGroupImpl type represents a native instance of the RemoteActionGroup interface.
     */
    class RemoteActionGroupImpl extends org.gtk.gobject.GObject implements RemoteActionGroup {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of RemoteActionGroup for the provided memory address.
         * @param address the memory address of the instance
         */
        public RemoteActionGroupImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_remote_action_group_get_type != null;
    }
}
