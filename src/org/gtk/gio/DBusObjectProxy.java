package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GDBusObjectProxy is an object used to represent a remote object
 * with one or more D-Bus interfaces. Normally, you don't instantiate
 * a #GDBusObjectProxy yourself - typically #GDBusObjectManagerClient
 * is used to obtain it.
 */
public class DBusObjectProxy extends org.gtk.gobject.Object implements DBusObject {

    public DBusObjectProxy(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to DBusObjectProxy */
    public static DBusObjectProxy castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectProxy(gobject.getProxy());
    }
    
    /**
     * Creates a new #GDBusObjectProxy for the given connection and
     * object path.
     */
    public DBusObjectProxy(DBusConnection connection, java.lang.String objectPath) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_proxy_new(connection.HANDLE(), Interop.allocateNativeString(objectPath).HANDLE()), true));
    }
    
    /**
     * Gets the connection that @proxy is for.
     */
    public DBusConnection getConnection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_proxy_get_connection(HANDLE());
        return new DBusConnection(ProxyFactory.get(RESULT, false));
    }
    
}
