package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.SocketConnection} is a {@link org.gtk.gio.IOStream} for a connected socket. They
 * can be created either by {@link org.gtk.gio.SocketClient} when connecting to a host,
 * or by {@link org.gtk.gio.SocketListener} when accepting a new client.
 * 
 * The type of the {@link org.gtk.gio.SocketConnection} object returned from these calls
 * depends on the type of the underlying socket that is in use. For
 * instance, for a TCP/IP connection it will be a {@link org.gtk.gio.TcpConnection} 
 * 
 * Choosing what type of object to construct is done with the socket
 * connection factory, and it is possible for 3rd parties to register
 * custom socket connection types for specific combination of socket
 * family/type/protocol using g_socket_connection_factory_register_type().
 * 
 * To close a {@link org.gtk.gio.SocketConnection}  use g_io_stream_close(). Closing both
 * substreams of the {@link org.gtk.gio.IOStream} separately will not close the underlying
 * {@link org.gtk.gio.Socket}
 */
public class SocketConnection extends IOStream {

    public SocketConnection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SocketConnection */
    public static SocketConnection castFrom(org.gtk.gobject.Object gobject) {
        return new SocketConnection(gobject.getReference());
    }
    
    /**
     * Connect @connection to the specified remote address.
     */
    public boolean connect(SocketAddress address, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_connection_connect(handle(), address.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously connect @connection to the specified remote address.
     * 
     * This clears the {@link org.gtk.gio.Socket} blocking flag on @connection&<code>#39</code> s underlying
     * socket if it is currently set.
     * 
     * Use g_socket_connection_connect_finish() to retrieve the result.
     */
    public void connectAsync(SocketAddress address, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_socket_connection_connect_async(handle(), address.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the result of a g_socket_connection_connect_async() call.
     */
    public boolean connectFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_connection_connect_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Try to get the local address of a socket connection.
     */
    public SocketAddress getLocalAddress() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_connection_get_local_address(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketAddress(References.get(RESULT, true));
    }
    
    /**
     * Try to get the remote address of a socket connection.
     * 
     * Since GLib 2.40, when used with g_socket_client_connect() or
     * g_socket_client_connect_async(), during emission of
     * {@link org.gtk.gio.SocketClientEvent<code>#CONNECTING</code>   this function will return the remote
     * address that will be used for the connection.  This allows
     * applications to print e.g. &<code>#34</code> Connecting to example.com
     * (10.42.77.3)...&<code>#34</code> .
     */
    public SocketAddress getRemoteAddress() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_connection_get_remote_address(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketAddress(References.get(RESULT, true));
    }
    
    /**
     * Gets the underlying {@link org.gtk.gio.Socket} object of the connection.
     * This can be useful if you want to do something unusual on it
     * not supported by the {@link org.gtk.gio.SocketConnection} APIs.
     */
    public Socket getSocket() {
        var RESULT = gtk_h.g_socket_connection_get_socket(handle());
        return new Socket(References.get(RESULT, false));
    }
    
    /**
     * Checks if @connection is connected. This is equivalent to calling
     * g_socket_is_connected() on @connection&<code>#39</code> s underlying {@link org.gtk.gio.Socket}
     */
    public boolean isConnected() {
        var RESULT = gtk_h.g_socket_connection_is_connected(handle());
        return (RESULT != 0);
    }
    
    /**
     * Looks up the {@link org.gtk.glib.Type} to be used when creating socket connections on
     * sockets with the specified @family, @type and @protocol_id.
     * 
     * If no type is registered, the {@link org.gtk.gio.SocketConnection} base type is returned.
     */
    public static org.gtk.gobject.Type factoryLookupType(SocketFamily family, SocketType type, int protocolId) {
        var RESULT = gtk_h.g_socket_connection_factory_lookup_type(family.getValue(), type.getValue(), protocolId);
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Looks up the {@link org.gtk.glib.Type} to be used when creating socket connections on
     * sockets with the specified @family, @type and @protocol.
     * 
     * If no type is registered, the {@link org.gtk.gio.SocketConnection} base type is returned.
     */
    public static void factoryRegisterType(Type gType, SocketFamily family, SocketType type, int protocol) {
        gtk_h.g_socket_connection_factory_register_type(gType.getValue(), family.getValue(), type.getValue(), protocol);
    }
    
}
