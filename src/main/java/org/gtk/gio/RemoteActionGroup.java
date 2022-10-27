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
    default void activateActionFull(@NotNull java.lang.String actionName, @Nullable org.gtk.glib.Variant parameter, @NotNull org.gtk.glib.Variant platformData) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        java.util.Objects.requireNonNullElse(parameter, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(platformData, "Parameter 'platformData' must not be null");
        try {
            DowncallHandles.g_remote_action_group_activate_action_full.invokeExact(handle(), Interop.allocateNativeString(actionName), parameter.handle(), platformData.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    default void changeActionStateFull(@NotNull java.lang.String actionName, @NotNull org.gtk.glib.Variant value, @NotNull org.gtk.glib.Variant platformData) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(platformData, "Parameter 'platformData' must not be null");
        try {
            DowncallHandles.g_remote_action_group_change_action_state_full.invokeExact(handle(), Interop.allocateNativeString(actionName), value.handle(), platformData.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_remote_action_group_activate_action_full = Interop.downcallHandle(
            "g_remote_action_group_activate_action_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_remote_action_group_change_action_state_full = Interop.downcallHandle(
            "g_remote_action_group_change_action_state_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class RemoteActionGroupImpl extends org.gtk.gobject.Object implements RemoteActionGroup {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public RemoteActionGroupImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
