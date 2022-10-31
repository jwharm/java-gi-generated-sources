package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DBusActionGroup} is an implementation of the {@link ActionGroup}
 * interface that can be used as a proxy for an action group
 * that is exported over D-Bus with g_dbus_connection_export_action_group().
 */
public class DBusActionGroup extends org.gtk.gobject.Object implements org.gtk.gio.ActionGroup, org.gtk.gio.RemoteActionGroup {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusActionGroup";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public DBusActionGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to DBusActionGroup if its GType is a (or inherits from) "GDBusActionGroup".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DBusActionGroup" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusActionGroup", a ClassCastException will be thrown.
     */
    public static DBusActionGroup castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusActionGroup"))) {
            return new DBusActionGroup(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusActionGroup");
        }
    }
    
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
     * @param connection A {@link DBusConnection}
     * @param busName the bus name which exports the action
     *     group or {@code null} if {@code connection} is not a message bus connection
     * @param objectPath the object path at which the action group is exported
     * @return a {@link DBusActionGroup}
     */
    public static @NotNull org.gtk.gio.DBusActionGroup get(@NotNull org.gtk.gio.DBusConnection connection, @Nullable java.lang.String busName, @NotNull java.lang.String objectPath) {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_action_group_get.invokeExact(
                    connection.handle(),
                    (Addressable) (busName == null ? MemoryAddress.NULL : Interop.allocateNativeString(busName)),
                    Interop.allocateNativeString(objectPath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusActionGroup(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_action_group_get = Interop.downcallHandle(
            "g_dbus_action_group_get",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
