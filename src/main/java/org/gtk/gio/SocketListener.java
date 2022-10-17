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
 */
public class SocketListener extends org.gtk.gobject.Object {

    public SocketListener(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SocketListener */
    public static SocketListener castFrom(org.gtk.gobject.Object gobject) {
        return new SocketListener(gobject.refcounted());
    }
    
    private static final MethodHandle g_socket_listener_new = Interop.downcallHandle(
        "g_socket_listener_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_socket_listener_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link SocketListener} with no sockets to listen for.
     * New listeners can be added with e.g. g_socket_listener_add_address()
     * or g_socket_listener_add_inet_port().
     */
    public SocketListener() {
        super(constructNew());
    }
    
    private static final MethodHandle g_socket_listener_accept = Interop.downcallHandle(
        "g_socket_listener_accept",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull SocketConnection accept(@Nullable Out<org.gtk.gobject.Object> sourceObject, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment sourceObjectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_socket_listener_accept.invokeExact(handle(), (Addressable) sourceObjectPOINTER.address(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sourceObject.set(new org.gtk.gobject.Object(Refcounted.get(sourceObjectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_socket_listener_accept_async = Interop.downcallHandle(
        "g_socket_listener_accept_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This is the asynchronous version of g_socket_listener_accept().
     * <p>
     * When the operation is finished {@code callback} will be
     * called. You can then call g_socket_listener_accept_finish()
     * to get the result of the operation.
     */
    public @NotNull void acceptAsync(@Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_socket_listener_accept_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_socket_listener_accept_finish = Interop.downcallHandle(
        "g_socket_listener_accept_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an async accept operation. See g_socket_listener_accept_async()
     */
    public @NotNull SocketConnection acceptFinish(@NotNull AsyncResult result, @Nullable Out<org.gtk.gobject.Object> sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment sourceObjectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_socket_listener_accept_finish.invokeExact(handle(), result.handle(), (Addressable) sourceObjectPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sourceObject.set(new org.gtk.gobject.Object(Refcounted.get(sourceObjectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_socket_listener_accept_socket = Interop.downcallHandle(
        "g_socket_listener_accept_socket",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull Socket acceptSocket(@Nullable Out<org.gtk.gobject.Object> sourceObject, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment sourceObjectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_socket_listener_accept_socket.invokeExact(handle(), (Addressable) sourceObjectPOINTER.address(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sourceObject.set(new org.gtk.gobject.Object(Refcounted.get(sourceObjectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Socket(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_socket_listener_accept_socket_async = Interop.downcallHandle(
        "g_socket_listener_accept_socket_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This is the asynchronous version of g_socket_listener_accept_socket().
     * <p>
     * When the operation is finished {@code callback} will be
     * called. You can then call g_socket_listener_accept_socket_finish()
     * to get the result of the operation.
     */
    public @NotNull void acceptSocketAsync(@Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_socket_listener_accept_socket_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_socket_listener_accept_socket_finish = Interop.downcallHandle(
        "g_socket_listener_accept_socket_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an async accept operation. See g_socket_listener_accept_socket_async()
     */
    public @NotNull Socket acceptSocketFinish(@NotNull AsyncResult result, @Nullable Out<org.gtk.gobject.Object> sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment sourceObjectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_socket_listener_accept_socket_finish.invokeExact(handle(), result.handle(), (Addressable) sourceObjectPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sourceObject.set(new org.gtk.gobject.Object(Refcounted.get(sourceObjectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Socket(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_socket_listener_add_address = Interop.downcallHandle(
        "g_socket_listener_add_address",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean addAddress(@NotNull SocketAddress address, @NotNull SocketType type, @NotNull SocketProtocol protocol, @Nullable org.gtk.gobject.Object sourceObject, @NotNull Out<SocketAddress> effectiveAddress) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment effectiveAddressPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_socket_listener_add_address.invokeExact(handle(), address.handle(), type.getValue(), protocol.getValue(), sourceObject.handle(), (Addressable) effectiveAddressPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        effectiveAddress.set(new SocketAddress(Refcounted.get(effectiveAddressPOINTER.get(ValueLayout.ADDRESS, 0), true)));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_socket_listener_add_any_inet_port = Interop.downcallHandle(
        "g_socket_listener_add_any_inet_port",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public short addAnyInetPort(@Nullable org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        short RESULT;
        try {
            RESULT = (short) g_socket_listener_add_any_inet_port.invokeExact(handle(), sourceObject.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_socket_listener_add_inet_port = Interop.downcallHandle(
        "g_socket_listener_add_inet_port",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean addInetPort(@NotNull short port, @Nullable org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_socket_listener_add_inet_port.invokeExact(handle(), port, sourceObject.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_socket_listener_add_socket = Interop.downcallHandle(
        "g_socket_listener_add_socket",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean addSocket(@NotNull Socket socket, @Nullable org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_socket_listener_add_socket.invokeExact(handle(), socket.handle(), sourceObject.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_socket_listener_close = Interop.downcallHandle(
        "g_socket_listener_close",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Closes all the sockets in the listener.
     */
    public @NotNull void close() {
        try {
            g_socket_listener_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_socket_listener_set_backlog = Interop.downcallHandle(
        "g_socket_listener_set_backlog",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the listen backlog on the sockets in the listener. This must be called
     * before adding any sockets, addresses or ports to the {@link SocketListener} (for
     * example, by calling g_socket_listener_add_inet_port()) to be effective.
     * <p>
     * See g_socket_set_listen_backlog() for details
     */
    public @NotNull void setBacklog(@NotNull int listenBacklog) {
        try {
            g_socket_listener_set_backlog.invokeExact(handle(), listenBacklog);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EventHandler {
        void signalReceived(SocketListener source, @NotNull SocketListenerEvent event, @NotNull Socket socket);
    }
    
    /**
     * Emitted when {@code listener}'s activity on {@code socket} changes state.
     * Note that when {@code listener} is used to listen on both IPv4 and
     * IPv6, a separate set of signals will be emitted for each, and
     * the order they happen in is undefined.
     */
    public SignalHandle onEvent(EventHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SocketListener.Callbacks.class, "signalSocketListenerEvent",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalSocketListenerEvent(MemoryAddress source, int event, MemoryAddress socket, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SocketListener.EventHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SocketListener(Refcounted.get(source)), new SocketListenerEvent(event), new Socket(Refcounted.get(socket, false)));
        }
        
    }
}
