package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GRemoteActionGroup interface is implemented by {@link org.gtk.gio.ActionGroup} instances that either transmit action invocations to other processes
 * or receive action invocations in the local process from other
 * processes.
 * <p>
 * The interface has <code>_full</code> variants of the two
 * methods on {@link org.gtk.gio.ActionGroup} used to activate actions:
 * g_action_group_activate_action() and
 * g_action_group_change_action_state(). These variants allow a
 * &<code>#34</code> platform data&<code>#34</code>  {@link org.gtk.glib.Variant} to be specified: a dictionary providing
 * context for the action invocation (for example: timestamps, startup
 * notification IDs, etc).
 * <p>
 * {@link org.gtk.gio.DBusActionGroup} implements {@link org.gtk.gio.RemoteActionGroup}   This provides a
 * mechanism to send platform data for action invocations over D-Bus.
 * <p>
 * Additionally, g_dbus_connection_export_action_group() will check if
 * the exported {@link org.gtk.gio.ActionGroup} implements {@link org.gtk.gio.RemoteActionGroup} and use the<code>_full</code> variants of the calls if available.  This
 * provides a mechanism by which to receive platform data for action
 * invocations that arrive by way of D-Bus.
 */
public interface RemoteActionGroup extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Activates the remote action.
     * 
     * This is the same as g_action_group_activate_action() except that it
     * allows for provision of &<code>#34</code> platform data&<code>#34</code>  to be sent along with the
     * activation request.  This typically contains details such as the user
     * interaction timestamp or startup notification information.
     * 
     * @platform_data must be non-<code>null</code> and must have the type
     * <code>G_VARIANT_TYPE_VARDICT</code>   If it is floating, it will be consumed.
     */
    public default void activateActionFull(java.lang.String actionName, org.gtk.glib.Variant parameter, org.gtk.glib.Variant platformData) {
        gtk_h.g_remote_action_group_activate_action_full(handle(), Interop.allocateNativeString(actionName).handle(), parameter.handle(), platformData.handle());
    }
    
    /**
     * Changes the state of a remote action.
     * 
     * This is the same as g_action_group_change_action_state() except that
     * it allows for provision of &<code>#34</code> platform data&<code>#34</code>  to be sent along with the
     * state change request.  This typically contains details such as the
     * user interaction timestamp or startup notification information.
     * 
     * @platform_data must be non-<code>null</code> and must have the type
     * <code>G_VARIANT_TYPE_VARDICT</code>   If it is floating, it will be consumed.
     */
    public default void changeActionStateFull(java.lang.String actionName, org.gtk.glib.Variant value, org.gtk.glib.Variant platformData) {
        gtk_h.g_remote_action_group_change_action_state_full(handle(), Interop.allocateNativeString(actionName).handle(), value.handle(), platformData.handle());
    }
    
    class RemoteActionGroupImpl extends org.gtk.gobject.Object implements RemoteActionGroup {
        public RemoteActionGroupImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
