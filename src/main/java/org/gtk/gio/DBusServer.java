package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DBusServer} is a helper for listening to and accepting D-Bus
 * connections. This can be used to create a new D-Bus server, allowing two
 * peers to use the D-Bus protocol for their own specialized communication.
 * A server instance provided in this way will not perform message routing or
 * implement the org.freedesktop.DBus interface.
 * <p>
 * To just export an object on a well-known name on a message bus, such as the
 * session or system bus, you should instead use g_bus_own_name().
 * <p>
 * An example of peer-to-peer communication with GDBus can be found
 * in <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-peer.c">gdbus-example-peer.c</a>.
 * <p>
 * Note that a minimal {@link DBusServer} will accept connections from any
 * peer. In many use-cases it will be necessary to add a {@link DBusAuthObserver}
 * that only accepts connections that have successfully authenticated
 * as the same user that is running the {@link DBusServer}. Since GLib 2.68 this can
 * be achieved more simply by passing the
 * {@link DBusServerFlags#AUTHENTICATION_REQUIRE_SAME_USER} flag to the server.
 * @version 2.26
 */
public class DBusServer extends org.gtk.gobject.GObject implements org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusServer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DBusServer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusServer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusServer> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusServer(input, ownership);
    
    private static MemoryAddress constructNewSync(java.lang.String address, org.gtk.gio.DBusServerFlags flags, java.lang.String guid, @Nullable org.gtk.gio.DBusAuthObserver observer, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_server_new_sync.invokeExact(
                    Marshal.stringToAddress.marshal(address, null),
                    flags.getValue(),
                    Marshal.stringToAddress.marshal(guid, null),
                    (Addressable) (observer == null ? MemoryAddress.NULL : observer.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new D-Bus server that listens on the first address in
     * {@code address} that works.
     * <p>
     * Once constructed, you can use g_dbus_server_get_client_address() to
     * get a D-Bus address string that clients can use to connect.
     * <p>
     * To have control over the available authentication mechanisms and
     * the users that are authorized to connect, it is strongly recommended
     * to provide a non-{@code null} {@link DBusAuthObserver}.
     * <p>
     * Connect to the {@link DBusServer}::new-connection signal to handle
     * incoming connections.
     * <p>
     * The returned {@link DBusServer} isn't active - you have to start it with
     * g_dbus_server_start().
     * <p>
     * {@link DBusServer} is used in this [example][gdbus-peer-to-peer].
     * <p>
     * This is a synchronous failable constructor. There is currently no
     * asynchronous version.
     * @param address A D-Bus address.
     * @param flags Flags from the {@link DBusServerFlags} enumeration.
     * @param guid A D-Bus GUID.
     * @param observer A {@link DBusAuthObserver} or {@code null}.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @return A {@link DBusServer} or {@code null} if {@code error} is set. Free with
     * g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusServer newSync(java.lang.String address, org.gtk.gio.DBusServerFlags flags, java.lang.String guid, @Nullable org.gtk.gio.DBusAuthObserver observer, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        var RESULT = constructNewSync(address, flags, guid, observer, cancellable);
        return (org.gtk.gio.DBusServer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusServer.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#addresses">D-Bus address</a>
     * string that can be used by clients to connect to {@code server}.
     * <p>
     * This is valid and non-empty if initializing the {@link DBusServer} succeeded.
     * @return A D-Bus address string. Do not free, the string is owned
     * by {@code server}.
     */
    public java.lang.String getClientAddress() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_server_get_client_address.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the flags for {@code server}.
     * @return A set of flags from the {@link DBusServerFlags} enumeration.
     */
    public org.gtk.gio.DBusServerFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_server_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusServerFlags(RESULT);
    }
    
    /**
     * Gets the GUID for {@code server}, as provided to g_dbus_server_new_sync().
     * @return A D-Bus GUID. Do not free this string, it is owned by {@code server}.
     */
    public java.lang.String getGuid() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_server_get_guid.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets whether {@code server} is active.
     * @return {@code true} if server is active, {@code false} otherwise.
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_server_is_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Starts {@code server}.
     */
    public void start() {
        try {
            DowncallHandles.g_dbus_server_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stops {@code server}.
     */
    public void stop() {
        try {
            DowncallHandles.g_dbus_server_stop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_server_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface NewConnection {
        boolean run(org.gtk.gio.DBusConnection connection);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDBusServer, MemoryAddress connection) {
            var RESULT = run((org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NewConnection.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a new authenticated connection has been made. Use
     * g_dbus_connection_get_peer_credentials() to figure out what
     * identity (if any), was authenticated.
     * <p>
     * If you want to accept the connection, take a reference to the
     * {@code connection} object and return {@code true}. When you are done with the
     * connection call g_dbus_connection_close() and give up your
     * reference. Note that the other peer may disconnect at any time -
     * a typical thing to do when accepting a connection is to listen to
     * the {@link DBusConnection}::closed signal.
     * <p>
     * If {@link DBusServer}:flags contains {@link DBusServerFlags#RUN_IN_THREAD}
     * then the signal is emitted in a new thread dedicated to the
     * connection. Otherwise the signal is emitted in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread that {@code server} was constructed in.
     * <p>
     * You are guaranteed that signal handlers for this signal runs
     * before incoming messages on {@code connection} are processed. This means
     * that it's suitable to call g_dbus_connection_register_object() or
     * similar from the signal handler.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusServer.NewConnection> onNewConnection(DBusServer.NewConnection handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("new-connection"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DBusServer.Builder} object constructs a {@link DBusServer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusServer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DBusServer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusServer}.
         * @return A new instance of {@code DBusServer} with the properties 
         *         that were set in the Builder object.
         */
        public DBusServer build() {
            return (DBusServer) org.gtk.gobject.GObject.newWithProperties(
                DBusServer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the server is currently active.
         * @param active The value for the {@code active} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActive(boolean active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
        
        /**
         * The D-Bus address to listen on.
         * @param address The value for the {@code address} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddress(java.lang.String address) {
            names.add("address");
            values.add(org.gtk.gobject.Value.create(address));
            return this;
        }
        
        /**
         * A {@link DBusAuthObserver} object to assist in the authentication process or {@code null}.
         * @param authenticationObserver The value for the {@code authentication-observer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAuthenticationObserver(org.gtk.gio.DBusAuthObserver authenticationObserver) {
            names.add("authentication-observer");
            values.add(org.gtk.gobject.Value.create(authenticationObserver));
            return this;
        }
        
        /**
         * The D-Bus address that clients can use.
         * @param clientAddress The value for the {@code client-address} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClientAddress(java.lang.String clientAddress) {
            names.add("client-address");
            values.add(org.gtk.gobject.Value.create(clientAddress));
            return this;
        }
        
        /**
         * Flags from the {@link DBusServerFlags} enumeration.
         * @param flags The value for the {@code flags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gtk.gio.DBusServerFlags flags) {
            names.add("flags");
            values.add(org.gtk.gobject.Value.create(flags));
            return this;
        }
        
        /**
         * The GUID of the server.
         * <p>
         * See {@link DBusConnection}:guid for more details.
         * @param guid The value for the {@code guid} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGuid(java.lang.String guid) {
            names.add("guid");
            values.add(org.gtk.gobject.Value.create(guid));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_server_new_sync = Interop.downcallHandle(
            "g_dbus_server_new_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_get_client_address = Interop.downcallHandle(
            "g_dbus_server_get_client_address",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_get_flags = Interop.downcallHandle(
            "g_dbus_server_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_get_guid = Interop.downcallHandle(
            "g_dbus_server_get_guid",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_is_active = Interop.downcallHandle(
            "g_dbus_server_is_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_start = Interop.downcallHandle(
            "g_dbus_server_start",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_stop = Interop.downcallHandle(
            "g_dbus_server_stop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_get_type = Interop.downcallHandle(
            "g_dbus_server_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
