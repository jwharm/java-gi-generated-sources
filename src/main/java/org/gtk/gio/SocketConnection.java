package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link SocketConnection} is a {@link IOStream} for a connected socket. They
 * can be created either by {@link SocketClient} when connecting to a host,
 * or by {@link SocketListener} when accepting a new client.
 * <p>
 * The type of the {@link SocketConnection} object returned from these calls
 * depends on the type of the underlying socket that is in use. For
 * instance, for a TCP/IP connection it will be a {@link TcpConnection}.
 * <p>
 * Choosing what type of object to construct is done with the socket
 * connection factory, and it is possible for 3rd parties to register
 * custom socket connection types for specific combination of socket
 * family/type/protocol using g_socket_connection_factory_register_type().
 * <p>
 * To close a {@link SocketConnection}, use g_io_stream_close(). Closing both
 * substreams of the {@link IOStream} separately will not close the underlying
 * {@link Socket}.
 */
public class SocketConnection extends IOStream {

    public SocketConnection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SocketConnection */
    public static SocketConnection castFrom(org.gtk.gobject.Object gobject) {
        return new SocketConnection(gobject.refcounted());
    }
    
    static final MethodHandle g_socket_connection_connect = Interop.downcallHandle(
        "g_socket_connection_connect",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Connect {@code connection} to the specified remote address.
     */
    public boolean connect(SocketAddress address, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_socket_connection_connect.invokeExact(handle(), address.handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_socket_connection_connect_async = Interop.downcallHandle(
        "g_socket_connection_connect_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously connect {@code connection} to the specified remote address.
     * <p>
     * This clears the {@link Socket}:blocking flag on {@code connection}'s underlying
     * socket if it is currently set.
     * <p>
     * Use g_socket_connection_connect_finish() to retrieve the result.
     */
    public void connectAsync(SocketAddress address, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_socket_connection_connect_async.invokeExact(handle(), address.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_socket_connection_connect_finish = Interop.downcallHandle(
        "g_socket_connection_connect_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the result of a g_socket_connection_connect_async() call.
     */
    public boolean connectFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_socket_connection_connect_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_socket_connection_get_local_address = Interop.downcallHandle(
        "g_socket_connection_get_local_address",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Try to get the local address of a socket connection.
     */
    public SocketAddress getLocalAddress() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_socket_connection_get_local_address.invokeExact(handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new SocketAddress(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_socket_connection_get_remote_address = Interop.downcallHandle(
        "g_socket_connection_get_remote_address",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Try to get the remote address of a socket connection.
     * <p>
     * Since GLib 2.40, when used with g_socket_client_connect() or
     * g_socket_client_connect_async(), during emission of
     * {@link SocketClientEvent#CONNECTING}, this function will return the remote
     * address that will be used for the connection.  This allows
     * applications to print e.g. "Connecting to example.com
     * (10.42.77.3)...".
     */
    public SocketAddress getRemoteAddress() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_socket_connection_get_remote_address.invokeExact(handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new SocketAddress(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_socket_connection_get_socket = Interop.downcallHandle(
        "g_socket_connection_get_socket",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the underlying {@link Socket} object of the connection.
     * This can be useful if you want to do something unusual on it
     * not supported by the {@link SocketConnection} APIs.
     */
    public Socket getSocket() {
        try {
            var RESULT = (MemoryAddress) g_socket_connection_get_socket.invokeExact(handle());
            return new Socket(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_socket_connection_is_connected = Interop.downcallHandle(
        "g_socket_connection_is_connected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code connection} is connected. This is equivalent to calling
     * g_socket_is_connected() on {@code connection}'s underlying {@link Socket}.
     */
    public boolean isConnected() {
        try {
            var RESULT = (int) g_socket_connection_is_connected.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_socket_connection_factory_lookup_type = Interop.downcallHandle(
        "g_socket_connection_factory_lookup_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Looks up the {@link org.gtk.glib.Type} to be used when creating socket connections on
     * sockets with the specified {@code family}, {@code type} and {@code protocol_id}.
     * <p>
     * If no type is registered, the {@link SocketConnection} base type is returned.
     */
    public static org.gtk.gobject.Type factoryLookupType(SocketFamily family, SocketType type, int protocolId) {
        try {
            var RESULT = (long) g_socket_connection_factory_lookup_type.invokeExact(family.getValue(), type.getValue(), protocolId);
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_socket_connection_factory_register_type = Interop.downcallHandle(
        "g_socket_connection_factory_register_type",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Looks up the {@link org.gtk.glib.Type} to be used when creating socket connections on
     * sockets with the specified {@code family}, {@code type} and {@code protocol}.
     * <p>
     * If no type is registered, the {@link SocketConnection} base type is returned.
     */
    public static void factoryRegisterType(org.gtk.gobject.Type gType, SocketFamily family, SocketType type, int protocol) {
        try {
            g_socket_connection_factory_register_type.invokeExact(gType.getValue(), family.getValue(), type.getValue(), protocol);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
