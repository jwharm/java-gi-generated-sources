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
public class DBusObjectProxy extends org.gtk.gobject.GObject implements org.gtk.gio.DBusObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectProxy";
    
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
     * Create a DBusObjectProxy proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusObjectProxy(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectProxy> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectProxy(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.DBusConnection connection, java.lang.String objectPath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_proxy_new.invokeExact(
                        connection.handle(),
                        Marshal.stringToAddress.marshal(objectPath, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link DBusObjectProxy} for the given connection and
     * object path.
     * @param connection a {@link DBusConnection}
     * @param objectPath the object path
     */
    public DBusObjectProxy(org.gtk.gio.DBusConnection connection, java.lang.String objectPath) {
        super(constructNew(connection, objectPath));
        this.takeOwnership();
    }
    
    /**
     * Gets the connection that {@code proxy} is for.
     * @return A {@link DBusConnection}. Do not free, the
     *   object is owned by {@code proxy}.
     */
    public org.gtk.gio.DBusConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_proxy_get_connection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.DBusConnection) Interop.register(RESULT, org.gtk.gio.DBusConnection.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_object_proxy_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link DBusObjectProxy.Builder} object constructs a {@link DBusObjectProxy} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusObjectProxy.Builder#build()}. 
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
         * Finish building the {@link DBusObjectProxy} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusObjectProxy}.
         * @return A new instance of {@code DBusObjectProxy} with the properties 
         *         that were set in the Builder object.
         */
        public DBusObjectProxy build() {
            return (DBusObjectProxy) org.gtk.gobject.GObject.newWithProperties(
                DBusObjectProxy.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The connection of the proxy.
         * @param gConnection The value for the {@code g-connection} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGConnection(org.gtk.gio.DBusConnection gConnection) {
            names.add("g-connection");
            values.add(org.gtk.gobject.Value.create(gConnection));
            return this;
        }
        
        /**
         * The object path of the proxy.
         * @param gObjectPath The value for the {@code g-object-path} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGObjectPath(java.lang.String gObjectPath) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_dbus_object_proxy_get_type != null;
    }
}
