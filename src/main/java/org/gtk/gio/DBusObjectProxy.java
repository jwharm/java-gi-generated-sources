package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link DBusObjectProxy} is an object used to represent a remote object
 * with one or more D-Bus interfaces. Normally, you don't instantiate
 * a {@link DBusObjectProxy} yourself - typically {@link DBusObjectManagerClient}
 * is used to obtain it.
 */
public class DBusObjectProxy extends org.gtk.gobject.Object implements DBusObject {

    public DBusObjectProxy(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusObjectProxy */
    public static DBusObjectProxy castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectProxy(gobject.refcounted());
    }
    
    private static Refcounted constructNew(DBusConnection connection, java.lang.String objectPath) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_dbus_object_proxy_new(connection.handle(), Interop.allocateNativeString(objectPath).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusObjectProxy} for the given connection and
     * object path.
     */
    public DBusObjectProxy(DBusConnection connection, java.lang.String objectPath) {
        super(constructNew(connection, objectPath));
    }
    
    /**
     * Gets the connection that {@code proxy} is for.
     */
    public DBusConnection getConnection() {
        var RESULT = gtk_h.g_dbus_object_proxy_get_connection(handle());
        return new DBusConnection(Refcounted.get(RESULT, false));
    }
    
}
