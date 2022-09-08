package org.gtk.gio;

import org.gtk.gobject.*;
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
    
}
