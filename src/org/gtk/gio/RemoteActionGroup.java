package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GRemoteActionGroup interface is implemented by #GActionGroup
 * instances that either transmit action invocations to other processes
 * or receive action invocations in the local process from other
 * processes.
 * 
 * The interface has `_full` variants of the two
 * methods on #GActionGroup used to activate actions:
 * g_action_group_activate_action() and
 * g_action_group_change_action_state(). These variants allow a
 * "platform data" #GVariant to be specified: a dictionary providing
 * context for the action invocation (for example: timestamps, startup
 * notification IDs, etc).
 * 
 * #GDBusActionGroup implements #GRemoteActionGroup.  This provides a
 * mechanism to send platform data for action invocations over D-Bus.
 * 
 * Additionally, g_dbus_connection_export_action_group() will check if
 * the exported #GActionGroup implements #GRemoteActionGroup and use the
 * `_full` variants of the calls if available.  This
 * provides a mechanism by which to receive platform data for action
 * invocations that arrive by way of D-Bus.
 */
public interface RemoteActionGroup extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Activates the remote action.
     * 
     * This is the same as g_action_group_activate_action() except that it
     * allows for provision of "platform data" to be sent along with the
     * activation request.  This typically contains details such as the user
     * interaction timestamp or startup notification information.
     * 
     * @platform_data must be non-%NULL and must have the type
     * %G_VARIANT_TYPE_VARDICT.  If it is floating, it will be consumed.
     */
    public default void activateActionFull(java.lang.String actionName, org.gtk.glib.Variant parameter, org.gtk.glib.Variant platformData) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_remote_action_group_activate_action_full(HANDLE(), Interop.allocateNativeString(actionName).HANDLE(), parameter.HANDLE(), platformData.HANDLE());
    }
    
    /**
     * Changes the state of a remote action.
     * 
     * This is the same as g_action_group_change_action_state() except that
     * it allows for provision of "platform data" to be sent along with the
     * state change request.  This typically contains details such as the
     * user interaction timestamp or startup notification information.
     * 
     * @platform_data must be non-%NULL and must have the type
     * %G_VARIANT_TYPE_VARDICT.  If it is floating, it will be consumed.
     */
    public default void changeActionStateFull(java.lang.String actionName, org.gtk.glib.Variant value, org.gtk.glib.Variant platformData) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_remote_action_group_change_action_state_full(HANDLE(), Interop.allocateNativeString(actionName).HANDLE(), value.HANDLE(), platformData.HANDLE());
    }
    
    class RemoteActionGroupImpl extends org.gtk.gobject.Object implements RemoteActionGroup {
        public RemoteActionGroupImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
