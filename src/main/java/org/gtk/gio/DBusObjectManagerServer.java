package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle g_dbus_object_manager_server_new = Interop.downcallHandle(
        "g_dbus_object_manager_server_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String objectPath) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_object_manager_server_new.invokeExact(Interop.allocateNativeString(objectPath)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public DBusObjectManagerServer(@NotNull java.lang.String objectPath) {
        super(constructNew(objectPath));
    }
    
    private static final MethodHandle g_dbus_object_manager_server_export = Interop.downcallHandle(
        "g_dbus_object_manager_server_export",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void export(@NotNull DBusObjectSkeleton object) {
        try {
            g_dbus_object_manager_server_export.invokeExact(handle(), object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_dbus_object_manager_server_export_uniquely = Interop.downcallHandle(
        "g_dbus_object_manager_server_export_uniquely",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_dbus_object_manager_server_export() but appends a string of
     * the form _N (with N being a natural number) to {@code object}'s object path
     * if an object with the given path already exists. As such, the
     * {@link DBusObjectProxy}:g-object-path property of {@code object} may be modified.
     */
    public @NotNull void exportUniquely(@NotNull DBusObjectSkeleton object) {
        try {
            g_dbus_object_manager_server_export_uniquely.invokeExact(handle(), object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_dbus_object_manager_server_get_connection = Interop.downcallHandle(
        "g_dbus_object_manager_server_get_connection",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link DBusConnection} used by {@code manager}.
     */
    public @Nullable DBusConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_object_manager_server_get_connection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusConnection(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_dbus_object_manager_server_is_exported = Interop.downcallHandle(
        "g_dbus_object_manager_server_is_exported",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code object} is currently exported on {@code manager}.
     */
    public boolean isExported(@NotNull DBusObjectSkeleton object) {
        int RESULT;
        try {
            RESULT = (int) g_dbus_object_manager_server_is_exported.invokeExact(handle(), object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_dbus_object_manager_server_set_connection = Interop.downcallHandle(
        "g_dbus_object_manager_server_set_connection",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Exports all objects managed by {@code manager} on {@code connection}. If
     * {@code connection} is {@code null}, stops exporting objects.
     */
    public @NotNull void setConnection(@Nullable DBusConnection connection) {
        try {
            g_dbus_object_manager_server_set_connection.invokeExact(handle(), connection.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_dbus_object_manager_server_unexport = Interop.downcallHandle(
        "g_dbus_object_manager_server_unexport",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code manager} has an object at {@code path}, removes the object. Otherwise
     * does nothing.
     * <p>
     * Note that {@code object_path} must be in the hierarchy rooted by the
     * object path for {@code manager}.
     */
    public boolean unexport(@NotNull java.lang.String objectPath) {
        int RESULT;
        try {
            RESULT = (int) g_dbus_object_manager_server_unexport.invokeExact(handle(), Interop.allocateNativeString(objectPath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
