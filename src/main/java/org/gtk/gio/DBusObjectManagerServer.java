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
 * @version 2.30
 */
public class DBusObjectManagerServer extends org.gtk.gobject.Object implements org.gtk.gio.DBusObjectManager {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectManagerServer";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a DBusObjectManagerServer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusObjectManagerServer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DBusObjectManagerServer if its GType is a (or inherits from) "GDBusObjectManagerServer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DBusObjectManagerServer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusObjectManagerServer", a ClassCastException will be thrown.
     */
    public static DBusObjectManagerServer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusObjectManagerServer"))) {
            return new DBusObjectManagerServer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusObjectManagerServer");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String objectPath) {
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_server_new.invokeExact(
                    Interop.allocateNativeString(objectPath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param objectPath The object path to export the manager object at.
     */
    public DBusObjectManagerServer(@NotNull java.lang.String objectPath) {
        super(constructNew(objectPath), Ownership.FULL);
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
     * @param object A {@link DBusObjectSkeleton}.
     */
    public void export(@NotNull org.gtk.gio.DBusObjectSkeleton object) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        try {
            DowncallHandles.g_dbus_object_manager_server_export.invokeExact(
                    handle(),
                    object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Like g_dbus_object_manager_server_export() but appends a string of
     * the form _N (with N being a natural number) to {@code object}'s object path
     * if an object with the given path already exists. As such, the
     * {@link DBusObjectProxy}:g-object-path property of {@code object} may be modified.
     * @param object An object.
     */
    public void exportUniquely(@NotNull org.gtk.gio.DBusObjectSkeleton object) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        try {
            DowncallHandles.g_dbus_object_manager_server_export_uniquely.invokeExact(
                    handle(),
                    object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the {@link DBusConnection} used by {@code manager}.
     * @return A {@link DBusConnection} object or {@code null} if
     *   {@code manager} isn't exported on a connection. The returned object should
     *   be freed with g_object_unref().
     */
    public @Nullable org.gtk.gio.DBusConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_server_get_connection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusConnection(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns whether {@code object} is currently exported on {@code manager}.
     * @param object An object.
     * @return {@code true} if {@code object} is exported
     */
    public boolean isExported(@NotNull org.gtk.gio.DBusObjectSkeleton object) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_object_manager_server_is_exported.invokeExact(
                    handle(),
                    object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Exports all objects managed by {@code manager} on {@code connection}. If
     * {@code connection} is {@code null}, stops exporting objects.
     * @param connection A {@link DBusConnection} or {@code null}.
     */
    public void setConnection(@Nullable org.gtk.gio.DBusConnection connection) {
        try {
            DowncallHandles.g_dbus_object_manager_server_set_connection.invokeExact(
                    handle(),
                    (Addressable) (connection == null ? MemoryAddress.NULL : connection.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code manager} has an object at {@code path}, removes the object. Otherwise
     * does nothing.
     * <p>
     * Note that {@code object_path} must be in the hierarchy rooted by the
     * object path for {@code manager}.
     * @param objectPath An object path.
     * @return {@code true} if object at {@code object_path} was removed, {@code false} otherwise.
     */
    public boolean unexport(@NotNull java.lang.String objectPath) {
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_object_manager_server_unexport.invokeExact(
                    handle(),
                    Interop.allocateNativeString(objectPath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_object_manager_server_new = Interop.downcallHandle(
            "g_dbus_object_manager_server_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_export = Interop.downcallHandle(
            "g_dbus_object_manager_server_export",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_export_uniquely = Interop.downcallHandle(
            "g_dbus_object_manager_server_export_uniquely",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_get_connection = Interop.downcallHandle(
            "g_dbus_object_manager_server_get_connection",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_is_exported = Interop.downcallHandle(
            "g_dbus_object_manager_server_is_exported",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_set_connection = Interop.downcallHandle(
            "g_dbus_object_manager_server_set_connection",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_unexport = Interop.downcallHandle(
            "g_dbus_object_manager_server_unexport",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
