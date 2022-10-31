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
public class SocketListener extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketListener";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public SocketListener(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to SocketListener if its GType is a (or inherits from) "GSocketListener".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SocketListener" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSocketListener", a ClassCastException will be thrown.
     */
    public static SocketListener castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GSocketListener"))) {
            return new SocketListener(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GSocketListener");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_socket_listener_new.invokeExact(), true);
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
        super(constructNew());
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
     * @param sourceObject location where {@link org.gtk.gobject.Object} pointer will be stored, or {@code null}
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketConnection accept(@Nullable PointerProxy<org.gtk.gobject.Object> sourceObject, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_listener_accept.invokeExact(
                    handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketConnection(Refcounted.get(RESULT, true));
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
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an async accept operation. See g_socket_listener_accept_async()
     * @param result a {@link AsyncResult}.
     * @param sourceObject Optional {@link org.gtk.gobject.Object} identifying this source
     * @return a {@link SocketConnection} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketConnection acceptFinish(@NotNull org.gtk.gio.AsyncResult result, @Nullable PointerProxy<org.gtk.gobject.Object> sourceObject) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_listener_accept_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketConnection(Refcounted.get(RESULT, true));
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
     * @param sourceObject location where {@link org.gtk.gobject.Object} pointer will be stored, or {@code null}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a {@link Socket} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.Socket acceptSocket(@Nullable PointerProxy<org.gtk.gobject.Object> sourceObject, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_listener_accept_socket.invokeExact(
                    handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.Socket(Refcounted.get(RESULT, true));
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
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an async accept operation. See g_socket_listener_accept_socket_async()
     * @param result a {@link AsyncResult}.
     * @param sourceObject Optional {@link org.gtk.gobject.Object} identifying this source
     * @return a {@link Socket} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.Socket acceptSocketFinish(@NotNull org.gtk.gio.AsyncResult result, @Nullable PointerProxy<org.gtk.gobject.Object> sourceObject) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_listener_accept_socket_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.Socket(Refcounted.get(RESULT, true));
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
     * @param sourceObject Optional {@link org.gtk.gobject.Object} identifying this source
     * @param effectiveAddress location to store the address that was bound to, or {@code null}.
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addAddress(@NotNull org.gtk.gio.SocketAddress address, @NotNull org.gtk.gio.SocketType type, @NotNull org.gtk.gio.SocketProtocol protocol, @Nullable org.gtk.gobject.Object sourceObject, @NotNull PointerProxy<org.gtk.gio.SocketAddress> effectiveAddress) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        java.util.Objects.requireNonNull(effectiveAddress, "Parameter 'effectiveAddress' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_listener_add_address.invokeExact(
                    handle(),
                    address.handle(),
                    type.getValue(),
                    protocol.getValue(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    effectiveAddress.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
     * @param sourceObject Optional {@link org.gtk.gobject.Object} identifying this source
     * @return the port number, or 0 in case of failure.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public short addAnyInetPort(@Nullable org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_socket_listener_add_any_inet_port.invokeExact(
                    handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()), (Addressable) GERROR);
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
     * @param sourceObject Optional {@link org.gtk.gobject.Object} identifying this source
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addInetPort(short port, @Nullable org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_listener_add_inet_port.invokeExact(
                    handle(),
                    port,
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
     * @param sourceObject Optional {@link org.gtk.gobject.Object} identifying this source
     * @return {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean addSocket(@NotNull org.gtk.gio.Socket socket, @Nullable org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(socket, "Parameter 'socket' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_listener_add_socket.invokeExact(
                    handle(),
                    socket.handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    
    @FunctionalInterface
    public interface Event {
        void signalReceived(SocketListener source, @NotNull org.gtk.gio.SocketListenerEvent event, @NotNull org.gtk.gio.Socket socket);
    }
    
    /**
     * Emitted when {@code listener}'s activity on {@code socket} changes state.
     * Note that when {@code listener} is used to listen on both IPv4 and
     * IPv6, a separate set of signals will be emitted for each, and
     * the order they happen in is undefined.
     */
    public Signal<SocketListener.Event> onEvent(SocketListener.Event handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SocketListener.Callbacks.class, "signalSocketListenerEvent",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SocketListener.Event>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_listener_new = Interop.downcallHandle(
            "g_socket_listener_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_accept = Interop.downcallHandle(
            "g_socket_listener_accept",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_accept_async = Interop.downcallHandle(
            "g_socket_listener_accept_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_accept_finish = Interop.downcallHandle(
            "g_socket_listener_accept_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_accept_socket = Interop.downcallHandle(
            "g_socket_listener_accept_socket",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_accept_socket_async = Interop.downcallHandle(
            "g_socket_listener_accept_socket_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_accept_socket_finish = Interop.downcallHandle(
            "g_socket_listener_accept_socket_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_add_address = Interop.downcallHandle(
            "g_socket_listener_add_address",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_add_any_inet_port = Interop.downcallHandle(
            "g_socket_listener_add_any_inet_port",
            FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_add_inet_port = Interop.downcallHandle(
            "g_socket_listener_add_inet_port",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_add_socket = Interop.downcallHandle(
            "g_socket_listener_add_socket",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_close = Interop.downcallHandle(
            "g_socket_listener_close",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_listener_set_backlog = Interop.downcallHandle(
            "g_socket_listener_set_backlog",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalSocketListenerEvent(MemoryAddress source, int event, MemoryAddress socket, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SocketListener.Event) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SocketListener(Refcounted.get(source)), new org.gtk.gio.SocketListenerEvent(event), new org.gtk.gio.Socket(Refcounted.get(socket, false)));
        }
    }
}
