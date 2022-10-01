package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class DBusServer extends org.gtk.gobject.Object implements Initable {

    public DBusServer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusServer */
    public static DBusServer castFrom(org.gtk.gobject.Object gobject) {
        return new DBusServer(gobject.getReference());
    }
    
    private static Reference constructNewSync(java.lang.String address, DBusServerFlags flags, java.lang.String guid, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_server_new_sync(Interop.allocateNativeString(address).handle(), flags.getValue(), Interop.allocateNativeString(guid).handle(), observer.handle(), cancellable.handle(), GERROR), true);
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
     */
    public static DBusServer newSync(java.lang.String address, DBusServerFlags flags, java.lang.String guid, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        return new DBusServer(constructNewSync(address, flags, guid, observer, cancellable));
    }
    
    /**
     * Gets a
     * <a href="https://dbus.freedesktop.org/doc/dbus-specification.html#addresses">D-Bus address</a>
     * string that can be used by clients to connect to {@code server}.
     * <p>
     * This is valid and non-empty if initializing the {@link DBusServer} succeeded.
     */
    public java.lang.String getClientAddress() {
        var RESULT = gtk_h.g_dbus_server_get_client_address(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the flags for {@code server}.
     */
    public DBusServerFlags getFlags() {
        var RESULT = gtk_h.g_dbus_server_get_flags(handle());
        return new DBusServerFlags(RESULT);
    }
    
    /**
     * Gets the GUID for {@code server}, as provided to g_dbus_server_new_sync().
     */
    public java.lang.String getGuid() {
        var RESULT = gtk_h.g_dbus_server_get_guid(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether {@code server} is active.
     */
    public boolean isActive() {
        var RESULT = gtk_h.g_dbus_server_is_active(handle());
        return RESULT != 0;
    }
    
    /**
     * Starts {@code server}.
     */
    public void start() {
        gtk_h.g_dbus_server_start(handle());
    }
    
    /**
     * Stops {@code server}.
     */
    public void stop() {
        gtk_h.g_dbus_server_stop(handle());
    }
    
    @FunctionalInterface
    public interface NewConnectionHandler {
        boolean signalReceived(DBusServer source, DBusConnection connection);
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
     */
    public SignalHandle onNewConnection(NewConnectionHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("new-connection").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusServer.Callbacks.class, "signalDBusServerNewConnection",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalDBusServerNewConnection(MemoryAddress source, MemoryAddress connection, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusServer.NewConnectionHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new DBusServer(References.get(source)), new DBusConnection(References.get(connection, false)));
        }
        
    }
}
