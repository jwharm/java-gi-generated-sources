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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Create a DBusObjectProxy proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusObjectProxy(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DBusObjectProxy if its GType is a (or inherits from) "GDBusObjectProxy".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DBusObjectProxy} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusObjectProxy", a ClassCastException will be thrown.
     */
    public static DBusObjectProxy castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DBusObjectProxy.getType())) {
            return new DBusObjectProxy(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusObjectProxy");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.DBusConnection connection, @NotNull java.lang.String objectPath) {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_proxy_new.invokeExact(
                    connection.handle(),
                    Interop.allocateNativeString(objectPath));
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
        super(constructNew(connection, objectPath), Ownership.FULL);
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
        return new org.gtk.gio.DBusConnection(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_object_proxy_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link DBusObjectProxy.Build} object constructs a {@link DBusObjectProxy} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DBusObjectProxy} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusObjectProxy} using {@link DBusObjectProxy#castFrom}.
         * @return A new instance of {@code DBusObjectProxy} with the properties 
         *         that were set in the Build object.
         */
        public DBusObjectProxy construct() {
            return DBusObjectProxy.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DBusObjectProxy.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The connection of the proxy.
         * @param gConnection The value for the {@code g-connection} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGConnection(org.gtk.gio.DBusConnection gConnection) {
            names.add("g-connection");
            values.add(org.gtk.gobject.Value.create(gConnection));
            return this;
        }
        
        /**
         * The object path of the proxy.
         * @param gObjectPath The value for the {@code g-object-path} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGObjectPath(java.lang.String gObjectPath) {
            names.add("g-object-path");
            values.add(org.gtk.gobject.Value.create(gObjectPath));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_object_proxy_new = Interop.downcallHandle(
            "g_dbus_object_proxy_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_proxy_get_connection = Interop.downcallHandle(
            "g_dbus_object_proxy_get_connection",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_proxy_get_type = Interop.downcallHandle(
            "g_dbus_object_proxy_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
