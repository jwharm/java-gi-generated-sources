package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link DBusInterface} type is the base type for D-Bus interfaces both
 * on the service side (see {@link DBusInterfaceSkeleton}) and client side
 * (see {@link DBusProxy}).
 */
public interface DBusInterface extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets the {@link DBusObject} that {@code interface_} belongs to, if any.
     */
    public default DBusObject dupObject() {
        var RESULT = gtk_h.g_dbus_interface_dup_object(handle());
        return new DBusObject.DBusObjectImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by {@code interface_}.
     */
    public default DBusInterfaceInfo getInfo() {
        var RESULT = gtk_h.g_dbus_interface_get_info(handle());
        return new DBusInterfaceInfo(References.get(RESULT, false));
    }
    
    /**
     * Gets the {@link DBusObject} that {@code interface_} belongs to, if any.
     * <p>
     * It is not safe to use the returned object if {@code interface_} or
     * the returned object is being used from other threads. See
     * g_dbus_interface_dup_object() for a thread-safe alternative.
     */
    public default DBusObject getObject() {
        var RESULT = gtk_h.g_dbus_interface_get_object(handle());
        return new DBusObject.DBusObjectImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets the {@link DBusObject} for {@code interface_} to {@code object}.
     * <p>
     * Note that {@code interface_} will hold a weak reference to {@code object}.
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
