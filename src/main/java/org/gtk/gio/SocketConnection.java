package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.22
 */
public class SocketConnection extends org.gtk.gio.IOStream {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketConnection";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.IOStream.getMemoryLayout().withName("parent_instance"),
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
     * Create a SocketConnection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SocketConnection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SocketConnection if its GType is a (or inherits from) "GSocketConnection".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SocketConnection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSocketConnection", a ClassCastException will be thrown.
     */
    public static SocketConnection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), SocketConnection.getType())) {
            return new SocketConnection(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GSocketConnection");
        }
    }
    
    /**
     * Connect {@code connection} to the specified remote address.
     * @param address a {@link SocketAddress} specifying the remote address.
     * @param cancellable a {@code GCancellable} or {@code null}
     * @return {@code true} if the connection succeeded, {@code false} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean connect(@NotNull org.gtk.gio.SocketAddress address, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_connection_connect.invokeExact(
                    handle(),
                    address.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously connect {@code connection} to the specified remote address.
     * <p>
     * This clears the {@link Socket}:blocking flag on {@code connection}'s underlying
     * socket if it is currently set.
     * <p>
     * Use g_socket_connection_connect_finish() to retrieve the result.
     * @param address a {@link SocketAddress} specifying the remote address.
     * @param cancellable a {@code GCancellable} or {@code null}
     * @param callback a {@link AsyncReadyCallback}
     */
    public void connectAsync(@NotNull org.gtk.gio.SocketAddress address, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        try {
            DowncallHandles.g_socket_connection_connect_async.invokeExact(
                    handle(),
                    address.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the result of a g_socket_connection_connect_async() call.
     * @param result the {@link AsyncResult}
     * @return {@code true} if the connection succeeded, {@code false} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean connectFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_connection_connect_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Try to get the local address of a socket connection.
     * @return a {@link SocketAddress} or {@code null} on error.
     *     Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketAddress getLocalAddress() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_connection_get_local_address.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketAddress(RESULT, Ownership.FULL);
    }
    
    /**
     * Try to get the remote address of a socket connection.
     * <p>
     * Since GLib 2.40, when used with g_socket_client_connect() or
     * g_socket_client_connect_async(), during emission of
     * {@link SocketClientEvent#CONNECTING}, this function will return the remote
     * address that will be used for the connection.  This allows
     * applications to print e.g. "Connecting to example.com
     * (10.42.77.3)...".
     * @return a {@link SocketAddress} or {@code null} on error.
     *     Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketAddress getRemoteAddress() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_connection_get_remote_address.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketAddress(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the underlying {@link Socket} object of the connection.
     * This can be useful if you want to do something unusual on it
     * not supported by the {@link SocketConnection} APIs.
     * @return a {@link Socket} or {@code null} on error.
     */
    public @NotNull org.gtk.gio.Socket getSocket() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_connection_get_socket.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Socket(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks if {@code connection} is connected. This is equivalent to calling
     * g_socket_is_connected() on {@code connection}'s underlying {@link Socket}.
     * @return whether {@code connection} is connected
     */
    public boolean isConnected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_connection_is_connected.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_socket_connection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Looks up the {@link org.gtk.gobject.Type} to be used when creating socket connections on
     * sockets with the specified {@code family}, {@code type} and {@code protocol_id}.
     * <p>
     * If no type is registered, the {@link SocketConnection} base type is returned.
     * @param family a {@link SocketFamily}
     * @param type a {@link SocketType}
     * @param protocolId a protocol id
     * @return a {@link org.gtk.gobject.Type}
     */
    public static @NotNull org.gtk.glib.Type factoryLookupType(@NotNull org.gtk.gio.SocketFamily family, @NotNull org.gtk.gio.SocketType type, int protocolId) {
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_socket_connection_factory_lookup_type.invokeExact(
                    family.getValue(),
                    type.getValue(),
                    protocolId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Looks up the {@link org.gtk.gobject.Type} to be used when creating socket connections on
     * sockets with the specified {@code family}, {@code type} and {@code protocol}.
     * <p>
     * If no type is registered, the {@link SocketConnection} base type is returned.
     * @param gType a {@link org.gtk.gobject.Type}, inheriting from {@code G_TYPE_SOCKET_CONNECTION}
     * @param family a {@link SocketFamily}
     * @param type a {@link SocketType}
     * @param protocol a protocol id
     */
    public static void factoryRegisterType(@NotNull org.gtk.glib.Type gType, @NotNull org.gtk.gio.SocketFamily family, @NotNull org.gtk.gio.SocketType type, int protocol) {
        java.util.Objects.requireNonNull(gType, "Parameter 'gType' must not be null");
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.g_socket_connection_factory_register_type.invokeExact(
                    gType.getValue().longValue(),
                    family.getValue(),
                    type.getValue(),
                    protocol);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.IOStream.Build {
        
         /**
         * A {@link SocketConnection.Build} object constructs a {@link SocketConnection} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SocketConnection} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SocketConnection} using {@link SocketConnection#castFrom}.
         * @return A new instance of {@code SocketConnection} with the properties 
         *         that were set in the Build object.
         */
        public SocketConnection construct() {
            return SocketConnection.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SocketConnection.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setSocket(org.gtk.gio.Socket socket) {
            names.add("socket");
            values.add(org.gtk.gobject.Value.create(socket));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_connection_connect = Interop.downcallHandle(
            "g_socket_connection_connect",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_connection_connect_async = Interop.downcallHandle(
            "g_socket_connection_connect_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_connection_connect_finish = Interop.downcallHandle(
            "g_socket_connection_connect_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_connection_get_local_address = Interop.downcallHandle(
            "g_socket_connection_get_local_address",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_connection_get_remote_address = Interop.downcallHandle(
            "g_socket_connection_get_remote_address",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_connection_get_socket = Interop.downcallHandle(
            "g_socket_connection_get_socket",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_connection_is_connected = Interop.downcallHandle(
            "g_socket_connection_is_connected",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_connection_get_type = Interop.downcallHandle(
            "g_socket_connection_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_socket_connection_factory_lookup_type = Interop.downcallHandle(
            "g_socket_connection_factory_lookup_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_socket_connection_factory_register_type = Interop.downcallHandle(
            "g_socket_connection_factory_register_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
