package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link DBusActionGroup} is an implementation of the {@link ActionGroup}
 * interface that can be used as a proxy for an action group
 * that is exported over D-Bus with g_dbus_connection_export_action_group().
 */
public class DBusActionGroup extends org.gtk.gobject.Object implements ActionGroup, RemoteActionGroup {

    public DBusActionGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusActionGroup */
    public static DBusActionGroup castFrom(org.gtk.gobject.Object gobject) {
        return new DBusActionGroup(gobject.refcounted());
    }
    
    static final MethodHandle g_dbus_action_group_get = Interop.downcallHandle(
        "g_dbus_action_group_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains a {@link DBusActionGroup} for the action group which is exported at
     * the given {@code bus_name} and {@code object_path}.
     * <p>
     * The thread default main context is taken at the time of this call.
     * All signals on the menu model (and any linked models) are reported
     * with respect to this context.  All calls on the returned menu model
     * (and linked models) must also originate from this same context, with
     * the thread default main context unchanged.
     * <p>
     * This call is non-blocking.  The returned action group may or may not
     * already be filled in.  The correct thing to do is connect the signals
     * for the action group to monitor for changes and then to call
     * g_action_group_list_actions() to get the initial list.
     */
    public static DBusActionGroup get(DBusConnection connection, java.lang.String busName, java.lang.String objectPath) {
        try {
            var RESULT = (MemoryAddress) g_dbus_action_group_get.invokeExact(connection.handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle());
            return new DBusActionGroup(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}