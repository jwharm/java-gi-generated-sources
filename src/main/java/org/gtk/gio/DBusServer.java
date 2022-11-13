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
public class DBusServer extends org.gtk.gobject.Object implements org.gtk.gio.Initable {
    
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
    @ApiStatus.Internal
    public DBusServer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DBusServer if its GType is a (or inherits from) "GDBusServer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DBusServer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusServer", a ClassCastException will be thrown.
     */
    public static DBusServer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusServer"))) {
            return new DBusServer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusServer");
        }
    }
    
    private static Addressable constructNewSync(@NotNull java.lang.String address, @NotNull org.gtk.gio.DBusServerFlags flags, @NotNull java.lang.String guid, @Nullable org.gtk.gio.DBusAuthObserver observer, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(guid, "Parameter 'guid' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_server_new_sync.invokeExact(
                    Interop.allocateNativeString(address),
                    flags.getValue(),
                    Interop.allocateNativeString(guid),
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
    public static DBusServer newSync(@NotNull java.lang.String address, @NotNull org.gtk.gio.DBusServerFlags flags, @NotNull java.lang.String guid, @Nullable org.gtk.gio.DBusAuthObserver observer, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        return new DBusServer(constructNewSync(address, flags, guid, observer, cancellable), Ownership.FULL);
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
    public @NotNull java.lang.String getClientAddress() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_server_get_client_address.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the flags for {@code server}.
     * @return A set of flags from the {@link DBusServerFlags} enumeration.
     */
    public @NotNull org.gtk.gio.DBusServerFlags getFlags() {
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
    public @NotNull java.lang.String getGuid() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_server_get_guid.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
        return RESULT != 0;
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
    
    @FunctionalInterface
    public interface NewConnection {
        boolean signalReceived(DBusServer source, @NotNull org.gtk.gio.DBusConnection connection);
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
                handle(),
                Interop.allocateNativeString("new-connection"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusServer.Callbacks.class, "signalDBusServerNewConnection",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusServer.NewConnection>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_server_new_sync = Interop.downcallHandle(
            "g_dbus_server_new_sync",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_get_client_address = Interop.downcallHandle(
            "g_dbus_server_get_client_address",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_get_flags = Interop.downcallHandle(
            "g_dbus_server_get_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_get_guid = Interop.downcallHandle(
            "g_dbus_server_get_guid",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_is_active = Interop.downcallHandle(
            "g_dbus_server_is_active",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_start = Interop.downcallHandle(
            "g_dbus_server_start",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_server_stop = Interop.downcallHandle(
            "g_dbus_server_stop",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalDBusServerNewConnection(MemoryAddress source, MemoryAddress connection, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DBusServer.NewConnection) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DBusServer(source, Ownership.UNKNOWN), new org.gtk.gio.DBusConnection(connection, Ownership.NONE));
        }
    }
}
