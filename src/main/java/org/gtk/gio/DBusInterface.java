package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link DBusInterface} type is the base type for D-Bus interfaces both
 * on the service side (see {@link DBusInterfaceSkeleton}) and client side
 * (see {@link DBusProxy}).
 */
public interface DBusInterface extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_dbus_interface_dup_object = Interop.downcallHandle(
        "g_dbus_interface_dup_object",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link DBusObject} that {@code interface_} belongs to, if any.
     */
    public default DBusObject dupObject() {
        try {
            var RESULT = (MemoryAddress) g_dbus_interface_dup_object.invokeExact(handle());
            return new DBusObject.DBusObjectImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_interface_get_info = Interop.downcallHandle(
        "g_dbus_interface_get_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by {@code interface_}.
     */
    public default DBusInterfaceInfo getInfo() {
        try {
            var RESULT = (MemoryAddress) g_dbus_interface_get_info.invokeExact(handle());
            return new DBusInterfaceInfo(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_interface_get_object = Interop.downcallHandle(
        "g_dbus_interface_get_object",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link DBusObject} that {@code interface_} belongs to, if any.
     * <p>
     * It is not safe to use the returned object if {@code interface_} or
     * the returned object is being used from other threads. See
     * g_dbus_interface_dup_object() for a thread-safe alternative.
     */
    public default DBusObject getObject() {
        try {
            var RESULT = (MemoryAddress) g_dbus_interface_get_object.invokeExact(handle());
            return new DBusObject.DBusObjectImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_interface_set_object = Interop.downcallHandle(
        "g_dbus_interface_set_object",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@link DBusObject} for {@code interface_} to {@code object}.
     * <p>
     * Note that {@code interface_} will hold a weak reference to {@code object}.
     */
    public default void setObject(DBusObject object) {
        try {
            g_dbus_interface_set_object.invokeExact(handle(), object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class DBusInterfaceImpl extends org.gtk.gobject.Object implements DBusInterface {
        public DBusInterfaceImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
