package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link DBusObjectManagerServer} is used to export {@link DBusObject} instances using
 * the standardized
 * <a href="http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager">org.freedesktop.DBus.ObjectManager</a>
 * interface. For example, remote D-Bus clients can get all objects
 * and properties in a single call. Additionally, any change in the
 * object hierarchy is broadcast using signals. This means that D-Bus
 * clients can keep caches up to date by only listening to D-Bus
 * signals.
 * <p>
 * The recommended path to export an object manager at is the path form of the
 * well-known name of a D-Bus service, or below. For example, if a D-Bus service
 * is available at the well-known name {@code net.example.ExampleService1}, the object
 * manager should typically be exported at {@code /net/example/ExampleService1}, or
 * below (to allow for multiple object managers in a service).
 * <p>
 * It is supported, but not recommended, to export an object manager at the root
 * path, {@code /}.
 * <p>
 * See {@link DBusObjectManagerClient} for the client-side code that is
 * intended to be used with {@link DBusObjectManagerServer} or any D-Bus
 * object implementing the org.freedesktop.DBus.ObjectManager
 * interface.
 */
public class DBusObjectManagerServer extends org.gtk.gobject.Object implements DBusObjectManager {

    public DBusObjectManagerServer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusObjectManagerServer */
    public static DBusObjectManagerServer castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectManagerServer(gobject.refcounted());
    }
    
    private static Refcounted constructNew(java.lang.String objectPath) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_dbus_object_manager_server_new(Interop.allocateNativeString(objectPath).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusObjectManagerServer} object.
     * <p>
     * The returned server isn't yet exported on any connection. To do so,
     * use g_dbus_object_manager_server_set_connection(). Normally you
     * want to export all of your objects before doing so to avoid
     * <a href="http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager">InterfacesAdded</a>
     * signals being emitted.
     */
    public DBusObjectManagerServer(java.lang.String objectPath) {
        super(constructNew(objectPath));
    }
    
    /**
     * Exports {@code object} on {@code manager}.
     * <p>
     * If there is already a {@link DBusObject} exported at the object path,
     * then the old object is removed.
     * <p>
     * The object path for {@code object} must be in the hierarchy rooted by the
     * object path for {@code manager}.
     * <p>
     * Note that {@code manager} will take a reference on {@code object} for as long as
     * it is exported.
     */
    public void export(DBusObjectSkeleton object) {
        gtk_h.g_dbus_object_manager_server_export(handle(), object.handle());
    }
    
    /**
     * Like g_dbus_object_manager_server_export() but appends a string of
     * the form _N (with N being a natural number) to {@code object}'s object path
     * if an object with the given path already exists. As such, the
     * {@link DBusObjectProxy}:g-object-path property of {@code object} may be modified.
     */
    public void exportUniquely(DBusObjectSkeleton object) {
        gtk_h.g_dbus_object_manager_server_export_uniquely(handle(), object.handle());
    }
    
    /**
     * Gets the {@link DBusConnection} used by {@code manager}.
     */
    public DBusConnection getConnection() {
        var RESULT = gtk_h.g_dbus_object_manager_server_get_connection(handle());
        return new DBusConnection(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns whether {@code object} is currently exported on {@code manager}.
     */
    public boolean isExported(DBusObjectSkeleton object) {
        var RESULT = gtk_h.g_dbus_object_manager_server_is_exported(handle(), object.handle());
        return RESULT != 0;
    }
    
    /**
     * Exports all objects managed by {@code manager} on {@code connection}. If
     * {@code connection} is {@code null}, stops exporting objects.
     */
    public void setConnection(DBusConnection connection) {
        gtk_h.g_dbus_object_manager_server_set_connection(handle(), connection.handle());
    }
    
    /**
     * If {@code manager} has an object at {@code path}, removes the object. Otherwise
     * does nothing.
     * <p>
     * Note that {@code object_path} must be in the hierarchy rooted by the
     * object path for {@code manager}.
     */
    public boolean unexport(java.lang.String objectPath) {
        var RESULT = gtk_h.g_dbus_object_manager_server_unexport(handle(), Interop.allocateNativeString(objectPath).handle());
        return RESULT != 0;
    }
    
}
