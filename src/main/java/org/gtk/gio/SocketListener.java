package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link SocketListener} is an object that keeps track of a set
 * of server sockets and helps you accept sockets from any of the
 * socket, either sync or async.
 * <p>
 * Add addresses and ports to listen on using g_socket_listener_add_address()
 * and g_socket_listener_add_inet_port(). These will be listened on until
 * g_socket_listener_close() is called. Dropping your final reference to the
 * {@link SocketListener} will not cause g_socket_listener_close() to be called
 * implicitly, as some references to the {@link SocketListener} may be held
 * internally.
 * <p>
 * If you want to implement a network server, also look at {@link SocketService}
 * and {@link ThreadedSocketService} which are subclasses of {@link SocketListener}
 * that make this even easier.
 * @version 2.22
 */
public class SocketListener extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketListener";
    
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
     * Create a SocketListener proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SocketListener(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SocketListener> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SocketListener(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_listener_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link SocketListener} with no sockets to listen for.
     * New listeners can be added with e.g. g_socket_listener_add_address()
     * or g_socket_listener_add_inet_port().
     */
    public SocketListener() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Blocks waiting for a client to connect to any of the sockets added
     * to the listener. Returns a {@link SocketConnection} for the socket that was
     * accepted.
     * <p>
     * If {@code source_object} is not {@code null} it will be filled out with the source
     * object specified when the corresponding socket or address was added
     * to the listener.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param sourceObject location where {@link org.gtk.gobject.GObject} pointer will be stored, or {@code null}
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.SocketConnection accept(@Nullable Out<org.gtk.gobject.GObject> sourceObject, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment sourceObjectPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_listener_accept.invokeExact(
                    handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : (Addressable) sourceObjectPOINTER.address()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (sourceObject != null) sourceObject.set((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sourceObjectPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gobject.GObject.fromAddress).marshal(sourceObjectPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return (org.gtk.gio.SocketConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.SocketConnection.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * This is the asynchronous version of g_socket_listener_accept().
     * <p>
     * When the operation is finished {@code callback} will be
     * called. You can then call g_socket_listener_accept_finish()
     * to get the result of the operation.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback a {@link AsyncReadyCallback}
     */
    public void acceptAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_socket_listener_accept_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an async accept operation. See g_socket_listener_accept_async()
     * @param result a {@link AsyncResult}.
     * @param sourceObject Optional {@link org.gtk.gobject.GObject} identifying this source
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.SocketConnection acceptFinish(org.gtk.gio.AsyncResult result, @Nullable Out<org.gtk.gobject.GObject> sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment sourceObjectPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_listener_accept_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : (Addressable) sourceObjectPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (sourceObject != null) sourceObject.set((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sourceObjectPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gobject.GObject.fromAddress).marshal(sourceObjectPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return (org.gtk.gio.SocketConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.SocketConnection.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Blocks waiting for a client to connect to any of the sockets added
     * to the listener. Returns the {@link Socket} that was accepted.
     * <p>
     * If you want to accept the high-level {@link SocketConnection}, not a {@link Socket},
     * which is often the case, then you should use g_socket_listener_accept()
     * instead.
     * <p>
     * If {@code source_object} is not {@code null} it will be filled out with the source
     * object specified when the corresponding socket or address was added
     * to the listener.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param sourceObject location where {@link org.gtk.gobject.GObject} pointer will be stored, or {@code null}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a {@link Socket} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.Socket acceptSocket(@Nullable Out<org.gtk.gobject.GObject> sourceObject, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment sourceObjectPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_listener_accept_socket.invokeExact(
                    handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : (Addressable) sourceObjectPOINTER.address()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (sourceObject != null) sourceObject.set((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sourceObjectPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gobject.GObject.fromAddress).marshal(sourceObjectPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return (org.gtk.gio.Socket) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Socket.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * This is the asynchronous version of g_socket_listener_accept_socket().
     * <p>
     * When the operation is finished {@code callback} will be
     * called. You can then call g_socket_listener_accept_socket_finish()
     * to get the result of the operation.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback a {@link AsyncReadyCallback}
     */
    public void acceptSocketAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_socket_listener_accept_socket_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an async accept operation. See g_socket_listener_accept_socket_async()
     * @param result a {@link AsyncResult}.
     * @param sourceObject Optional {@link org.gtk.gobject.GObject} identifying this source
     * @return a {@link Socket} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.Socket acceptSocketFinish(org.gtk.gio.AsyncResult result, @Nullable Out<org.gtk.gobject.GObject> sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment sourceObjectPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_listener_accept_socket_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : (Addressable) sourceObjectPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (sourceObject != null) sourceObject.set((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sourceObjectPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gobject.GObject.fromAddress).marshal(sourceObjectPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return (org.gtk.gio.Socket) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Socket.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a socket of type {@code type} and protocol {@code protocol}, binds
     * it to {@code address} and adds it to the set of sockets we're accepting
     * sockets from.
     * <p>
     * Note that adding an IPv6 address, depending on the platform,
     * may or may not result in a listener that also accepts IPv4
     * connections.  For more deterministic behavior, see
     * g_socket_listener_add_inet_port().
     * <p>
     * {@code source_object} will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     * <p>
     * If successful and {@code effective_address} is non-{@code null} then it will
     * be set to the address that the binding actually occurred at.  This
     * is helpful for determining the port number that was used for when
     * requesting a binding to port 0 (ie: "any port").  This address, if
     * requested, belongs to the caller and must be freed.
     * <p>
     * Call g_socket_listener_close() to stop listening on {@code address}; this will not
     * be done automatically when you drop your final reference to {@code listener}, as
     * references may be held internally.
     * @param address a {@link SocketAddress}
     * @param type a {@link SocketType}
     * @param protocol a {@link SocketProtocol}
     * @param sourceObject Optional {@link org.gtk.gobject.GObject} identifying this source
     * @param effectiveAddress location to store the address that was bound to, or {@code null}.
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addAddress(org.gtk.gio.SocketAddress address, org.gtk.gio.SocketType type, org.gtk.gio.SocketProtocol protocol, @Nullable org.gtk.gobject.GObject sourceObject, @Nullable Out<org.gtk.gio.SocketAddress> effectiveAddress) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment effectiveAddressPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_listener_add_address.invokeExact(
                    handle(),
                    address.handle(),
                    type.getValue(),
                    protocol.getValue(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    (Addressable) (effectiveAddress == null ? MemoryAddress.NULL : (Addressable) effectiveAddressPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (effectiveAddress != null) effectiveAddress.set((org.gtk.gio.SocketAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(effectiveAddressPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gio.SocketAddress.fromAddress).marshal(effectiveAddressPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Listens for TCP connections on any available port number for both
     * IPv6 and IPv4 (if each is available).
     * <p>
     * This is useful if you need to have a socket for incoming connections
     * but don't care about the specific port number.
     * <p>
     * {@code source_object} will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     * @param sourceObject Optional {@link org.gtk.gobject.GObject} identifying this source
     * @return the port number, or 0 in case of failure.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public short addAnyInetPort(@Nullable org.gtk.gobject.GObject sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_socket_listener_add_any_inet_port.invokeExact(
                    handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
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
     * Helper function for g_socket_listener_add_address() that
     * creates a TCP/IP socket listening on IPv4 and IPv6 (if
     * supported) on the specified port on all interfaces.
     * <p>
     * {@code source_object} will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     * <p>
     * Call g_socket_listener_close() to stop listening on {@code port}; this will not
     * be done automatically when you drop your final reference to {@code listener}, as
     * references may be held internally.
     * @param port an IP port number (non-zero)
     * @param sourceObject Optional {@link org.gtk.gobject.GObject} identifying this source
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addInetPort(short port, @Nullable org.gtk.gobject.GObject sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_listener_add_inet_port.invokeExact(
                    handle(),
                    port,
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Adds {@code socket} to the set of sockets that we try to accept
     * new clients from. The socket must be bound to a local
     * address and listened to.
     * <p>
     * {@code source_object} will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     * <p>
     * The {@code socket} will not be automatically closed when the {@code listener} is finalized
     * unless the listener held the final reference to the socket. Before GLib 2.42,
     * the {@code socket} was automatically closed on finalization of the {@code listener}, even
     * if references to it were held elsewhere.
     * @param socket a listening {@link Socket}
     * @param sourceObject Optional {@link org.gtk.gobject.GObject} identifying this source
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addSocket(org.gtk.gio.Socket socket, @Nullable org.gtk.gobject.GObject sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_listener_add_socket.invokeExact(
                    handle(),
                    socket.handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Closes all the sockets in the listener.
     */
    public void close() {
        try {
            DowncallHandles.g_socket_listener_close.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the listen backlog on the sockets in the listener. This must be called
     * before adding any sockets, addresses or ports to the {@link SocketListener} (for
     * example, by calling g_socket_listener_add_inet_port()) to be effective.
     * <p>
     * See g_socket_set_listen_backlog() for details
     * @param listenBacklog an integer
     */
    public void setBacklog(int listenBacklog) {
        try {
            DowncallHandles.g_socket_listener_set_backlog.invokeExact(
                    handle(),
                    listenBacklog);
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
            RESULT = (long) DowncallHandles.g_socket_listener_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Event {
        void run(org.gtk.gio.SocketListenerEvent event, org.gtk.gio.Socket socket);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceSocketListener, int event, MemoryAddress socket) {
            run(org.gtk.gio.SocketListenerEvent.of(event), (org.gtk.gio.Socket) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(socket)), org.gtk.gio.Socket.fromAddress).marshal(socket, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Event.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when {@code listener}'s activity on {@code socket} changes state.
     * Note that when {@code listener} is used to listen on both IPv4 and
     * IPv6, a separate set of signals will be emitted for each, and
     * the order they happen in is undefined.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SocketListener.Event> onEvent(SocketListener.Event handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("event"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link SocketListener.Builder} object constructs a {@link SocketListener} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SocketListener.Builder#build()}. 
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
         * Finish building the {@link SocketListener} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SocketListener}.
         * @return A new instance of {@code SocketListener} with the properties 
         *         that were set in the Builder object.
         */
        public SocketListener build() {
            return (SocketListener) org.gtk.gobject.GObject.newWithProperties(
                SocketListener.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setListenBacklog(int listenBacklog) {
            names.add("listen-backlog");
            values.add(org.gtk.gobject.Value.create(listenBacklog));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_listener_new = Interop.downcallHandle(
            "g_socket_listener_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_accept = Interop.downcallHandle(
            "g_socket_listener_accept",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_accept_async = Interop.downcallHandle(
            "g_socket_listener_accept_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_accept_finish = Interop.downcallHandle(
            "g_socket_listener_accept_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_accept_socket = Interop.downcallHandle(
            "g_socket_listener_accept_socket",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_accept_socket_async = Interop.downcallHandle(
            "g_socket_listener_accept_socket_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_accept_socket_finish = Interop.downcallHandle(
            "g_socket_listener_accept_socket_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_add_address = Interop.downcallHandle(
            "g_socket_listener_add_address",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_add_any_inet_port = Interop.downcallHandle(
            "g_socket_listener_add_any_inet_port",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_add_inet_port = Interop.downcallHandle(
            "g_socket_listener_add_inet_port",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_add_socket = Interop.downcallHandle(
            "g_socket_listener_add_socket",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_close = Interop.downcallHandle(
            "g_socket_listener_close",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_listener_set_backlog = Interop.downcallHandle(
            "g_socket_listener_set_backlog",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_socket_listener_get_type = Interop.downcallHandle(
            "g_socket_listener_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
