package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link DBusObjectProxy} is an object used to represent a remote object
 * with one or more D-Bus interfaces. Normally, you don't instantiate
 * a {@link DBusObjectProxy} yourself - typically {@link DBusObjectManagerClient}
 * is used to obtain it.
 * @version 2.30
 */
public class DBusObjectProxy extends org.gtk.gobject.Object implements org.gtk.gio.DBusObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectProxy";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    @ApiStatus.Internal
    public DBusObjectProxy(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to DBusObjectProxy if its GType is a (or inherits from) "GDBusObjectProxy".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DBusObjectProxy" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusObjectProxy", a ClassCastException will be thrown.
     */
    public static DBusObjectProxy castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusObjectProxy"))) {
            return new DBusObjectProxy(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusObjectProxy");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.DBusConnection connection, @NotNull java.lang.String objectPath) {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_dbus_object_proxy_new.invokeExact(
                    connection.handle(),
                    Interop.allocateNativeString(objectPath)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusObjectProxy} for the given connection and
     * object path.
     * @param connection a {@link DBusConnection}
     * @param objectPath the object path
     */
    public DBusObjectProxy(@NotNull org.gtk.gio.DBusConnection connection, @NotNull java.lang.String objectPath) {
        super(constructNew(connection, objectPath));
    }
    
    /**
     * Gets the connection that {@code proxy} is for.
     * @return A {@link DBusConnection}. Do not free, the
     *   object is owned by {@code proxy}.
     */
    public @NotNull org.gtk.gio.DBusConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_proxy_get_connection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusConnection(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_object_proxy_new = Interop.downcallHandle(
            "g_dbus_object_proxy_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_proxy_get_connection = Interop.downcallHandle(
            "g_dbus_object_proxy_get_connection",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
