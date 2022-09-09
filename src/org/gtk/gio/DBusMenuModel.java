package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDBusMenuModel is an implementation of #GMenuModel that can be used
 * as a proxy for a menu model that is exported over D-Bus with
 * g_dbus_connection_export_menu_model().
 */
public class DBusMenuModel extends MenuModel {

    public DBusMenuModel(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusMenuModel */
    public static DBusMenuModel castFrom(org.gtk.gobject.Object gobject) {
        return new DBusMenuModel(gobject.getReference());
    }
    
    /**
     * Obtains a #GDBusMenuModel for the menu model which is exported
     * at the given @bus_name and @object_path.
     * 
     * The thread default main context is taken at the time of this call.
     * All signals on the menu model (and any linked models) are reported
     * with respect to this context.  All calls on the returned menu model
     * (and linked models) must also originate from this same context, with
     * the thread default main context unchanged.
     */
    public static DBusMenuModel get(DBusConnection connection, java.lang.String busName, java.lang.String objectPath) {
        var RESULT = gtk_h.g_dbus_menu_model_get(connection.handle(), Interop.allocateNativeString(busName).handle(), Interop.allocateNativeString(objectPath).handle());
        return new DBusMenuModel(References.get(RESULT, true));
    }
    
}
