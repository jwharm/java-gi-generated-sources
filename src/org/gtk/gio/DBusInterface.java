package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link org.gtk.gio.DBusInterface} type is the base type for D-Bus interfaces both
 * on the service side (see {@link org.gtk.gio.DBusInterfaceSkeleton}  and client side
 * (see {@link org.gtk.gio.DBusProxy} .
 */
public interface DBusInterface extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets the {@link org.gtk.gio.DBusObject} that @interface_ belongs to, if any.
     */
    public default DBusObject dupObject() {
        var RESULT = gtk_h.g_dbus_interface_dup_object(handle());
        return new DBusObject.DBusObjectImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by @interface_.
     */
    public default DBusInterfaceInfo getInfo() {
        var RESULT = gtk_h.g_dbus_interface_get_info(handle());
        return new DBusInterfaceInfo(References.get(RESULT, false));
    }
    
    /**
     * Gets the {@link org.gtk.gio.DBusObject} that @interface_ belongs to, if any.
     * 
     * It is not safe to use the returned object if @interface_ or
     * the returned object is being used from other threads. See
     * g_dbus_interface_dup_object() for a thread-safe alternative.
     */
    public default DBusObject getObject() {
        var RESULT = gtk_h.g_dbus_interface_get_object(handle());
        return new DBusObject.DBusObjectImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets the {@link org.gtk.gio.DBusObject} for @interface_ to @object.
     * 
     * Note that @interface_ will hold a weak reference to @object.
     */
    public default void setObject(DBusObject object) {
        gtk_h.g_dbus_interface_set_object(handle(), object.handle());
    }
    
    class DBusInterfaceImpl extends org.gtk.gobject.Object implements DBusInterface {
        public DBusInterfaceImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
