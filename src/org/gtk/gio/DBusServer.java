package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDBusServer is a helper for listening to and accepting D-Bus
 * connections. This can be used to create a new D-Bus server, allowing two
 * peers to use the D-Bus protocol for their own specialized communication.
 * A server instance provided in this way will not perform message routing or
 * implement the org.freedesktop.DBus interface.
 * 
 * To just export an object on a well-known name on a message bus, such as the
 * session or system bus, you should instead use g_bus_own_name().
 * 
 * An example of peer-to-peer communication with GDBus can be found
 * in [gdbus-example-peer.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-peer.c).
 * 
 * Note that a minimal #GDBusServer will accept connections from any
 * peer. In many use-cases it will be necessary to add a #GDBusAuthObserver
 * that only accepts connections that have successfully authenticated
 * as the same user that is running the #GDBusServer. Since GLib 2.68 this can
 * be achieved more simply by passing the
 * %G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flag to the server.
 */
public class DBusServer extends org.gtk.gobject.Object implements Initable {

    public DBusServer(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusServer */
    public static DBusServer castFrom(org.gtk.gobject.Object gobject) {
        return new DBusServer(gobject.getReference());
    }
    
    private static Reference constructNewSyncOrThrow(java.lang.String address, int flags, java.lang.String guid, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_server_new_sync(Interop.allocateNativeString(address).handle(), flags, Interop.allocateNativeString(guid).handle(), observer.handle(), cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new D-Bus server that listens on the first address in
     * @address that works.
     * 
     * Once constructed, you can use g_dbus_server_get_client_address() to
     * get a D-Bus address string that clients can use to connect.
     * 
     * To have control over the available authentication mechanisms and
     * the users that are authorized to connect, it is strongly recommended
     * to provide a non-%NULL #GDBusAuthObserver.
     * 
     * Connect to the #GDBusServer::new-connection signal to handle
     * incoming connections.
     * 
     * The returned #GDBusServer isn't active - you have to start it with
     * g_dbus_server_start().
     * 
     * #GDBusServer is used in this [example][gdbus-peer-to-peer].
     * 
     * This is a synchronous failable constructor. There is currently no
     * asynchronous version.
     */
    public static DBusServer newSync(java.lang.String address, int flags, java.lang.String guid, DBusAuthObserver observer, Cancellable cancellable) throws GErrorException {
        return new DBusServer(constructNewSyncOrThrow(address, flags, guid, observer, cancellable));
    }
    
    /**
     * Gets a
     * [D-Bus address](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses)
     * string that can be used by clients to connect to @server.
     * 
     * This is valid and non-empty if initializing the #GDBusServer succeeded.
     */
    public java.lang.String getClientAddress() {
        var RESULT = gtk_h.g_dbus_server_get_client_address(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the flags for @server.
     */
    public int getFlags() {
        var RESULT = gtk_h.g_dbus_server_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Gets the GUID for @server, as provided to g_dbus_server_new_sync().
     */
    public java.lang.String getGuid() {
        var RESULT = gtk_h.g_dbus_server_get_guid(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether @server is active.
     */
    public boolean isActive() {
        var RESULT = gtk_h.g_dbus_server_is_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Starts @server.
     */
    public void start() {
        gtk_h.g_dbus_server_start(handle());
    }
    
    /**
     * Stops @server.
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
     * 
     * If you want to accept the connection, take a reference to the
     * @connection object and return %TRUE. When you are done with the
     * connection call g_dbus_connection_close() and give up your
     * reference. Note that the other peer may disconnect at any time -
     * a typical thing to do when accepting a connection is to listen to
     * the #GDBusConnection::closed signal.
     * 
     * If #GDBusServer:flags contains %G_DBUS_SERVER_FLAGS_RUN_IN_THREAD
     * then the signal is emitted in a new thread dedicated to the
     * connection. Otherwise the signal is emitted in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread that @server was constructed in.
     * 
     * You are guaranteed that signal handlers for this signal runs
     * before incoming messages on @connection are processed. This means
     * that it's suitable to call g_dbus_connection_register_object() or
     * similar from the signal handler.
     */
    public void onNewConnection(NewConnectionHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusServerNewConnection", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("new-connection").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
