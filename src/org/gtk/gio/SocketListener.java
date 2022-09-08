package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GSocketListener is an object that keeps track of a set
 * of server sockets and helps you accept sockets from any of the
 * socket, either sync or async.
 * 
 * Add addresses and ports to listen on using g_socket_listener_add_address()
 * and g_socket_listener_add_inet_port(). These will be listened on until
 * g_socket_listener_close() is called. Dropping your final reference to the
 * #GSocketListener will not cause g_socket_listener_close() to be called
 * implicitly, as some references to the #GSocketListener may be held
 * internally.
 * 
 * If you want to implement a network server, also look at #GSocketService
 * and #GThreadedSocketService which are subclasses of #GSocketListener
 * that make this even easier.
 */
public class SocketListener extends org.gtk.gobject.Object {

    public SocketListener(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SocketListener */
    public static SocketListener castFrom(org.gtk.gobject.Object gobject) {
        return new SocketListener(gobject.getReference());
    }
    
    /**
     * Creates a new #GSocketListener with no sockets to listen for.
     * New listeners can be added with e.g. g_socket_listener_add_address()
     * or g_socket_listener_add_inet_port().
     */
    public SocketListener() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_new(), true));
    }
    
    /**
     * Blocks waiting for a client to connect to any of the sockets added
     * to the listener. Returns a #GSocketConnection for the socket that was
     * accepted.
     * 
     * If @source_object is not %NULL it will be filled out with the source
     * object specified when the corresponding socket or address was added
     * to the listener.
     * 
     * If @cancellable is not %NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     */
    public SocketConnection accept(org.gtk.gobject.Object[] sourceObject, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_accept(HANDLE(), Interop.allocateNativeArray(sourceObject), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * Finishes an async accept operation. See g_socket_listener_accept_async()
     */
    public SocketConnection acceptFinish(AsyncResult result, org.gtk.gobject.Object[] sourceObject) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_accept_finish(HANDLE(), result.HANDLE(), Interop.allocateNativeArray(sourceObject), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * Blocks waiting for a client to connect to any of the sockets added
     * to the listener. Returns the #GSocket that was accepted.
     * 
     * If you want to accept the high-level #GSocketConnection, not a #GSocket,
     * which is often the case, then you should use g_socket_listener_accept()
     * instead.
     * 
     * If @source_object is not %NULL it will be filled out with the source
     * object specified when the corresponding socket or address was added
     * to the listener.
     * 
     * If @cancellable is not %NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     */
    public Socket acceptSocket(org.gtk.gobject.Object[] sourceObject, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_accept_socket(HANDLE(), Interop.allocateNativeArray(sourceObject), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new Socket(References.get(RESULT, true));
    }
    
    /**
     * Finishes an async accept operation. See g_socket_listener_accept_socket_async()
     */
    public Socket acceptSocketFinish(AsyncResult result, org.gtk.gobject.Object[] sourceObject) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_accept_socket_finish(HANDLE(), result.HANDLE(), Interop.allocateNativeArray(sourceObject), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new Socket(References.get(RESULT, true));
    }
    
    /**
     * Creates a socket of type @type and protocol @protocol, binds
     * it to @address and adds it to the set of sockets we're accepting
     * sockets from.
     * 
     * Note that adding an IPv6 address, depending on the platform,
     * may or may not result in a listener that also accepts IPv4
     * connections.  For more deterministic behavior, see
     * g_socket_listener_add_inet_port().
     * 
     * @source_object will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     * 
     * If successful and @effective_address is non-%NULL then it will
     * be set to the address that the binding actually occurred at.  This
     * is helpful for determining the port number that was used for when
     * requesting a binding to port 0 (ie: "any port").  This address, if
     * requested, belongs to the caller and must be freed.
     * 
     * Call g_socket_listener_close() to stop listening on @address; this will not
     * be done automatically when you drop your final reference to @listener, as
     * references may be held internally.
     */
    public boolean addAddress(SocketAddress address, SocketType type, SocketProtocol protocol, org.gtk.gobject.Object sourceObject, SocketAddress[] effectiveAddress) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_add_address(HANDLE(), address.HANDLE(), type.getValue(), protocol.getValue(), sourceObject.HANDLE(), Interop.allocateNativeArray(effectiveAddress), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Listens for TCP connections on any available port number for both
     * IPv6 and IPv4 (if each is available).
     * 
     * This is useful if you need to have a socket for incoming connections
     * but don't care about the specific port number.
     * 
     * @source_object will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     */
    public short addAnyInetPort(org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_add_any_inet_port(HANDLE(), sourceObject.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Helper function for g_socket_listener_add_address() that
     * creates a TCP/IP socket listening on IPv4 and IPv6 (if
     * supported) on the specified port on all interfaces.
     * 
     * @source_object will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     * 
     * Call g_socket_listener_close() to stop listening on @port; this will not
     * be done automatically when you drop your final reference to @listener, as
     * references may be held internally.
     */
    public boolean addInetPort(short port, org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_add_inet_port(HANDLE(), port, sourceObject.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Adds @socket to the set of sockets that we try to accept
     * new clients from. The socket must be bound to a local
     * address and listened to.
     * 
     * @source_object will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     * 
     * The @socket will not be automatically closed when the @listener is finalized
     * unless the listener held the final reference to the socket. Before GLib 2.42,
     * the @socket was automatically closed on finalization of the @listener, even
     * if references to it were held elsewhere.
     */
    public boolean addSocket(Socket socket, org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_add_socket(HANDLE(), socket.HANDLE(), sourceObject.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Closes all the sockets in the listener.
     */
    public void close() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_close(HANDLE());
    }
    
    /**
     * Sets the listen backlog on the sockets in the listener. This must be called
     * before adding any sockets, addresses or ports to the #GSocketListener (for
     * example, by calling g_socket_listener_add_inet_port()) to be effective.
     * 
     * See g_socket_set_listen_backlog() for details
     */
    public void setBacklog(int listenBacklog) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_listener_set_backlog(HANDLE(), listenBacklog);
    }
    
    @FunctionalInterface
    public interface EventHandler {
        void signalReceived(SocketListener source, SocketListenerEvent event, Socket socket);
    }
    
    /**
     * Emitted when @listener's activity on @socket changes state.
     * Note that when @listener is used to listen on both IPv4 and
     * IPv6, a separate set of signals will be emitted for each, and
     * the order they happen in is undefined.
     */
    public void onEvent(EventHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSocketListenerEvent", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("event").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
