package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link DBusMenuModel} is an implementation of {@link MenuModel} that can be used
 * as a proxy for a menu model that is exported over D-Bus with
 * g_dbus_connection_export_menu_model().
 */
public class DBusMenuModel extends MenuModel {

    public DBusMenuModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusMenuModel */
    public static DBusMenuModel castFrom(org.gtk.gobject.Object gobject) {
        return new DBusMenuModel(gobject.refcounted());
    }
    
    static final MethodHandle g_dbus_menu_model_get = Interop.downcallHandle(
        "g_dbus_menu_model_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains a {@link DBusMenuModel} for the menu model which is exported
     * at the given {@code bus_name} and {@code object_path}.
     * <p>
     * The thread default main context is taken at the time of this call.
     * All signals on the menu model (and any linked models) are reported
     * with respect to this context.  All calls on the returned menu model
     * (and linked models) must also originate from this same context, with
     * the thread default main context unchanged.
     */
    public static DBusMenuModel get(DBusConnection connection, java.lang.String busName, java.lang.String objectPath) {
        try {
            var RESULT = (MemoryAddress) g_dbus_menu_model_get.invokeExact(connection.handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle());
            return new DBusMenuModel(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
