package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSocketConnection is a #GIOStream for a connected socket. They
 * can be created either by #GSocketClient when connecting to a host,
 * or by #GSocketListener when accepting a new client.
 * 
 * The type of the #GSocketConnection object returned from these calls
 * depends on the type of the underlying socket that is in use. For
 * instance, for a TCP/IP connection it will be a #GTcpConnection.
 * 
 * Choosing what type of object to construct is done with the socket
 * connection factory, and it is possible for 3rd parties to register
 * custom socket connection types for specific combination of socket
 * family/type/protocol using g_socket_connection_factory_register_type().
 * 
 * To close a #GSocketConnection, use g_io_stream_close(). Closing both
 * substreams of the #GIOStream separately will not close the underlying
 * #GSocket.
 */
public class SocketConnection extends IOStream {

    public SocketConnection(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SocketConnection */
    public static SocketConnection castFrom(org.gtk.gobject.Object gobject) {
        return new SocketConnection(gobject.getReference());
    }
    
    /**
     * Connect @connection to the specified remote address.
     */
    public boolean connect(SocketAddress address, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_connection_connect(HANDLE(), address.HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the result of a g_socket_connection_connect_async() call.
     */
    public boolean connectFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_connection_connect_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Try to get the local address of a socket connection.
     */
    public SocketAddress getLocalAddress() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_connection_get_local_address(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new SocketAddress(References.get(RESULT, true));
    }
    
    /**
     * Try to get the remote address of a socket connection.
     * 
     * Since GLib 2.40, when used with g_socket_client_connect() or
     * g_socket_client_connect_async(), during emission of
     * %G_SOCKET_CLIENT_CONNECTING, this function will return the remote
     * address that will be used for the connection.  This allows
     * applications to print e.g. "Connecting to example.com
     * (10.42.77.3)...".
     */
    public SocketAddress getRemoteAddress() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_connection_get_remote_address(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new SocketAddress(References.get(RESULT, true));
    }
    
    /**
     * Gets the underlying #GSocket object of the connection.
     * This can be useful if you want to do something unusual on it
     * not supported by the #GSocketConnection APIs.
     */
    public Socket getSocket() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_connection_get_socket(HANDLE());
        return new Socket(References.get(RESULT, false));
    }
    
    /**
     * Checks if @connection is connected. This is equivalent to calling
     * g_socket_is_connected() on @connection's underlying #GSocket.
     */
    public boolean isConnected() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_connection_is_connected(HANDLE());
        return (RESULT != 0);
    }
    
}
