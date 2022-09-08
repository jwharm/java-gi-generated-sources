package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GDBusInterface type is the base type for D-Bus interfaces both
 * on the service side (see #GDBusInterfaceSkeleton) and client side
 * (see #GDBusProxy).
 */
public interface DBusInterface extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets the #GDBusObject that @interface_ belongs to, if any.
     */
    public default DBusObject dupObject() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_dup_object(HANDLE());
        return new DBusObject.DBusObjectImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by @interface_.
     */
    public default DBusInterfaceInfo getInfo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_get_info(HANDLE());
        return new DBusInterfaceInfo(References.get(RESULT, false));
    }
    
    /**
     * Gets the #GDBusObject that @interface_ belongs to, if any.
     * 
     * It is not safe to use the returned object if @interface_ or
     * the returned object is being used from other threads. See
     * g_dbus_interface_dup_object() for a thread-safe alternative.
     */
    public default DBusObject getObject() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_get_object(HANDLE());
        return new DBusObject.DBusObjectImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets the #GDBusObject for @interface_ to @object.
     * 
     * Note that @interface_ will hold a weak reference to @object.
     */
    public default void setObject(DBusObject object) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_set_object(HANDLE(), object.HANDLE());
    }
    
    class DBusInterfaceImpl extends org.gtk.gobject.Object implements DBusInterface {
        public DBusInterfaceImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
