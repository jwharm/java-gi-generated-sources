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
public class DBusObjectManagerServer extends org.gtk.gobject.GObject implements org.gtk.gio.DBusObjectManager {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectManagerServer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DBusObjectManagerServer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusObjectManagerServer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectManagerServer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectManagerServer(input);
    
    private static MemoryAddress constructNew(java.lang.String objectPath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_server_new.invokeExact(Marshal.stringToAddress.marshal(objectPath, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
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
     * @param objectPath The object path to export the manager object at.
     */
    public DBusObjectManagerServer(java.lang.String objectPath) {
        super(constructNew(objectPath));
        this.takeOwnership();
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
    public void export(org.gtk.gio.DBusObjectSkeleton object) {
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
    public void exportUniquely(org.gtk.gio.DBusObjectSkeleton object) {
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
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_server_get_connection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.DBusConnection) Interop.register(RESULT, org.gtk.gio.DBusConnection.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns whether {@code object} is currently exported on {@code manager}.
     * @param object An object.
     * @return {@code true} if {@code object} is exported
     */
    public boolean isExported(org.gtk.gio.DBusObjectSkeleton object) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_object_manager_server_is_exported.invokeExact(
                    handle(),
                    object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean unexport(java.lang.String objectPath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_dbus_object_manager_server_unexport.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(objectPath, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_object_manager_server_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link DBusObjectManagerServer.Builder} object constructs a {@link DBusObjectManagerServer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusObjectManagerServer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DBusObjectManagerServer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusObjectManagerServer}.
         * @return A new instance of {@code DBusObjectManagerServer} with the properties 
         *         that were set in the Builder object.
         */
        public DBusObjectManagerServer build() {
            return (DBusObjectManagerServer) org.gtk.gobject.GObject.newWithProperties(
                DBusObjectManagerServer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@link DBusConnection} to export objects on.
         * @param connection The value for the {@code connection} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setConnection(org.gtk.gio.DBusConnection connection) {
            names.add("connection");
            values.add(org.gtk.gobject.Value.create(connection));
            return this;
        }
        
        /**
         * The object path to register the manager object at.
         * @param objectPath The value for the {@code object-path} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setObjectPath(java.lang.String objectPath) {
            names.add("object-path");
            values.add(org.gtk.gobject.Value.create(objectPath));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_object_manager_server_new = Interop.downcallHandle(
                "g_dbus_object_manager_server_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_export = Interop.downcallHandle(
                "g_dbus_object_manager_server_export",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_export_uniquely = Interop.downcallHandle(
                "g_dbus_object_manager_server_export_uniquely",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_get_connection = Interop.downcallHandle(
                "g_dbus_object_manager_server_get_connection",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_is_exported = Interop.downcallHandle(
                "g_dbus_object_manager_server_is_exported",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_set_connection = Interop.downcallHandle(
                "g_dbus_object_manager_server_set_connection",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_unexport = Interop.downcallHandle(
                "g_dbus_object_manager_server_unexport",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_object_manager_server_get_type = Interop.downcallHandle(
                "g_dbus_object_manager_server_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_dbus_object_manager_server_get_type != null;
    }
}
