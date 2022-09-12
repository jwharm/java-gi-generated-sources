package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GDBusObjectProxy is an object used to represent a remote object
 * with one or more D-Bus interfaces. Normally, you don't instantiate
 * a #GDBusObjectProxy yourself - typically #GDBusObjectManagerClient
 * is used to obtain it.
 */
public class DBusObjectProxy extends org.gtk.gobject.Object implements DBusObject {

    public DBusObjectProxy(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusObjectProxy */
    public static DBusObjectProxy castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectProxy(gobject.getReference());
    }
    
    private static Reference constructNew(DBusConnection connection, java.lang.String objectPath) {
        Reference RESULT = References.get(gtk_h.g_dbus_object_proxy_new(connection.handle(), Interop.allocateNativeString(objectPath).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GDBusObjectProxy for the given connection and
     * object path.
     */
    public DBusObjectProxy(DBusConnection connection, java.lang.String objectPath) {
        super(constructNew(connection, objectPath));
    }
    
    /**
     * Gets the connection that @proxy is for.
     */
    public DBusConnection getConnection() {
        var RESULT = gtk_h.g_dbus_object_proxy_get_connection(handle());
        return new DBusConnection(References.get(RESULT, false));
    }
    
}
