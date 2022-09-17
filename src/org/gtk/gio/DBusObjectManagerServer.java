package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDBusObjectManagerServer is used to export #GDBusObject instances using
 * the standardized
 * {@link [org.freedesktop.DBus.ObjectManager]}(http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
 * interface. For example, remote D-Bus clients can get all objects
 * and properties in a single call. Additionally, any change in the
 * object hierarchy is broadcast using signals. This means that D-Bus
 * clients can keep caches up to date by only listening to D-Bus
 * signals.
 * <p>
 * The recommended path to export an object manager at is the path form of the
 * well-known name of a D-Bus service, or below. For example, if a D-Bus service
 * is available at the well-known name <code>net.example.ExampleService1</code>, the object
 * manager should typically be exported at <code>/net/example/ExampleService1</code>, or
 * below (to allow for multiple object managers in a service).
 * <p>
 * It is supported, but not recommended, to export an object manager at the root
 * path, <code>/</code>.
 * 
 * See #GDBusObjectManagerClient for the client-side code that is
 * intended to be used with #GDBusObjectManagerServer or any D-Bus
 * object implementing the org.freedesktop.DBus.ObjectManager
 * interface.
 */
public class DBusObjectManagerServer extends org.gtk.gobject.Object implements DBusObjectManager {

    public DBusObjectManagerServer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusObjectManagerServer */
    public static DBusObjectManagerServer castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectManagerServer(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String objectPath) {
        Reference RESULT = References.get(gtk_h.g_dbus_object_manager_server_new(Interop.allocateNativeString(objectPath).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GDBusObjectManagerServer object.
     * 
     * The returned server isn&#39;t yet exported on any connection. To do so,
     * use g_dbus_object_manager_server_set_connection(). Normally you
     * want to export all of your objects before doing so to avoid
     * {@link [InterfacesAdded]}(http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
     * signals being emitted.
     */
    public DBusObjectManagerServer(java.lang.String objectPath) {
        super(constructNew(objectPath));
    }
    
    /**
     * Exports @object on @manager.
     * 
     * If there is already a #GDBusObject exported at the object path,
     * then the old object is removed.
     * 
     * The object path for @object must be in the hierarchy rooted by the
     * object path for @manager.
     * 
     * Note that @manager will take a reference on @object for as long as
     * it is exported.
     */
    public void export(DBusObjectSkeleton object) {
        gtk_h.g_dbus_object_manager_server_export(handle(), object.handle());
    }
    
    /**
     * Like g_dbus_object_manager_server_export() but appends a string of
     * the form _N (with N being a natural number) to @object&#39;s object path
     * if an object with the given path already exists. As such, the
     * #GDBusObjectProxy:g-object-path property of @object may be modified.
     */
    public void exportUniquely(DBusObjectSkeleton object) {
        gtk_h.g_dbus_object_manager_server_export_uniquely(handle(), object.handle());
    }
    
    /**
     * Gets the #GDBusConnection used by @manager.
     */
    public DBusConnection getConnection() {
        var RESULT = gtk_h.g_dbus_object_manager_server_get_connection(handle());
        return new DBusConnection(References.get(RESULT, true));
    }
    
    /**
     * Returns whether @object is currently exported on @manager.
     */
    public boolean isExported(DBusObjectSkeleton object) {
        var RESULT = gtk_h.g_dbus_object_manager_server_is_exported(handle(), object.handle());
        return (RESULT != 0);
    }
    
    /**
     * Exports all objects managed by @manager on @connection. If
     * @connection is <code>NULL,</code> stops exporting objects.
     */
    public void setConnection(DBusConnection connection) {
        gtk_h.g_dbus_object_manager_server_set_connection(handle(), connection.handle());
    }
    
    /**
     * If @manager has an object at @path, removes the object. Otherwise
     * does nothing.
     * 
     * Note that @object_path must be in the hierarchy rooted by the
     * object path for @manager.
     */
    public boolean unexport(java.lang.String objectPath) {
        var RESULT = gtk_h.g_dbus_object_manager_server_unexport(handle(), Interop.allocateNativeString(objectPath).handle());
        return (RESULT != 0);
    }
    
}
