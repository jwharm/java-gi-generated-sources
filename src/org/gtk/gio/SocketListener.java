package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gio.SocketListener} is an object that keeps track of a set
 * of server sockets and helps you accept sockets from any of the
 * socket, either sync or async.
 * 
 * Add addresses and ports to listen on using g_socket_listener_add_address()
 * and g_socket_listener_add_inet_port(). These will be listened on until
 * g_socket_listener_close() is called. Dropping your final reference to the
 * {@link org.gtk.gio.SocketListener} will not cause g_socket_listener_close() to be called
 * implicitly, as some references to the {@link org.gtk.gio.SocketListener} may be held
 * internally.
 * 
 * If you want to implement a network server, also look at {@link org.gtk.gio.SocketService} and {@link org.gtk.gio.ThreadedSocketService} which are subclasses of {@link org.gtk.gio.SocketListener} that make this even easier.
 */
public class SocketListener extends org.gtk.gobject.Object {

    public SocketListener(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SocketListener */
    public static SocketListener castFrom(org.gtk.gobject.Object gobject) {
        return new SocketListener(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_socket_listener_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.SocketListener} with no sockets to listen for.
     * New listeners can be added with e.g. g_socket_listener_add_address()
     * or g_socket_listener_add_inet_port().
     */
    public SocketListener() {
        super(constructNew());
    }
    
    /**
     * Blocks waiting for a client to connect to any of the sockets added
     * to the listener. Returns a {@link org.gtk.gio.SocketConnection} for the socket that was
     * accepted.
     * 
     * If @source_object is not <code>null</code> it will be filled out with the source
     * object specified when the corresponding socket or address was added
     * to the listener.
     * 
     * If @cancellable is not <code>null</code>  then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>  will be returned.
     */
    public SocketConnection accept(org.gtk.gobject.Object[] sourceObject, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_listener_accept(handle(), Interop.allocateNativeArray(sourceObject).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * This is the asynchronous version of g_socket_listener_accept().
     * 
     * When the operation is finished @callback will be
     * called. You can then call g_socket_listener_accept_finish()
     * to get the result of the operation.
     */
    public void acceptAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_socket_listener_accept_async(handle(), cancellable.handle(), 
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
     * Finishes an async accept operation. See g_socket_listener_accept_async()
     */
    public SocketConnection acceptFinish(AsyncResult result, org.gtk.gobject.Object[] sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_listener_accept_finish(handle(), result.handle(), Interop.allocateNativeArray(sourceObject).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketConnection(References.get(RESULT, true));
    }
    
    /**
     * Blocks waiting for a client to connect to any of the sockets added
     * to the listener. Returns the {@link org.gtk.gio.Socket} that was accepted.
     * 
     * If you want to accept the high-level {@link org.gtk.gio.SocketConnection}  not a {@link org.gtk.gio.Socket} 
     * which is often the case, then you should use g_socket_listener_accept()
     * instead.
     * 
     * If @source_object is not <code>null</code> it will be filled out with the source
     * object specified when the corresponding socket or address was added
     * to the listener.
     * 
     * If @cancellable is not <code>null</code>  then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>  will be returned.
     */
    public Socket acceptSocket(org.gtk.gobject.Object[] sourceObject, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_listener_accept_socket(handle(), Interop.allocateNativeArray(sourceObject).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Socket(References.get(RESULT, true));
    }
    
    /**
     * This is the asynchronous version of g_socket_listener_accept_socket().
     * 
     * When the operation is finished @callback will be
     * called. You can then call g_socket_listener_accept_socket_finish()
     * to get the result of the operation.
     */
    public void acceptSocketAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_socket_listener_accept_socket_async(handle(), cancellable.handle(), 
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
     * Finishes an async accept operation. See g_socket_listener_accept_socket_async()
     */
    public Socket acceptSocketFinish(AsyncResult result, org.gtk.gobject.Object[] sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_listener_accept_socket_finish(handle(), result.handle(), Interop.allocateNativeArray(sourceObject).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Socket(References.get(RESULT, true));
    }
    
    /**
     * Creates a socket of type @type and protocol @protocol, binds
     * it to @address and adds it to the set of sockets we&<code>#39</code> re accepting
     * sockets from.
     * 
     * Note that adding an IPv6 address, depending on the platform,
     * may or may not result in a listener that also accepts IPv4
     * connections.  For more deterministic behavior, see
     * g_socket_listener_add_inet_port().
     * 
     * @source_object will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you&<code>#39</code> re listening on multiple addresses and do
     * different things depending on what address is connected to.
     * 
     * If successful and @effective_address is non-<code>null</code> then it will
     * be set to the address that the binding actually occurred at.  This
     * is helpful for determining the port number that was used for when
     * requesting a binding to port 0 (ie: &<code>#34</code> any port&<code>#34</code> ).  This address, if
     * requested, belongs to the caller and must be freed.
     * 
     * Call g_socket_listener_close() to stop listening on @address; this will not
     * be done automatically when you drop your final reference to @listener, as
     * references may be held internally.
     */
    public boolean addAddress(SocketAddress address, SocketType type, SocketProtocol protocol, org.gtk.gobject.Object sourceObject, SocketAddress[] effectiveAddress) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_listener_add_address(handle(), address.handle(), type.getValue(), protocol.getValue(), sourceObject.handle(), Interop.allocateNativeArray(effectiveAddress).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Listens for TCP connections on any available port number for both
     * IPv6 and IPv4 (if each is available).
     * 
     * This is useful if you need to have a socket for incoming connections
     * but don&<code>#39</code> t care about the specific port number.
     * 
     * @source_object will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you&<code>#39</code> re listening on multiple addresses and do
     * different things depending on what address is connected to.
     */
    public short addAnyInetPort(org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_listener_add_any_inet_port(handle(), sourceObject.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
     * useful if you&<code>#39</code> re listening on multiple addresses and do
     * different things depending on what address is connected to.
     * 
     * Call g_socket_listener_close() to stop listening on @port; this will not
     * be done automatically when you drop your final reference to @listener, as
     * references may be held internally.
     */
    public boolean addInetPort(short port, org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_listener_add_inet_port(handle(), port, sourceObject.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
     * useful if you&<code>#39</code> re listening on multiple addresses and do
     * different things depending on what address is connected to.
     * 
     * The @socket will not be automatically closed when the @listener is finalized
     * unless the listener held the final reference to the socket. Before GLib 2.42,
     * the @socket was automatically closed on finalization of the @listener, even
     * if references to it were held elsewhere.
     */
    public boolean addSocket(Socket socket, org.gtk.gobject.Object sourceObject) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_listener_add_socket(handle(), socket.handle(), sourceObject.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Closes all the sockets in the listener.
     */
    public void close() {
        gtk_h.g_socket_listener_close(handle());
    }
    
    /**
     * Sets the listen backlog on the sockets in the listener. This must be called
     * before adding any sockets, addresses or ports to the {@link org.gtk.gio.SocketListener} (for
     * example, by calling g_socket_listener_add_inet_port()) to be effective.
     * 
     * See g_socket_set_listen_backlog() for details
     */
    public void setBacklog(int listenBacklog) {
        gtk_h.g_socket_listener_set_backlog(handle(), listenBacklog);
    }
    
    @FunctionalInterface
    public interface EventHandler {
        void signalReceived(SocketListener source, SocketListenerEvent event, Socket socket);
    }
    
    /**
     * Emitted when @listener&<code>#39</code> s activity on @socket changes state.
     * Note that when @listener is used to listen on both IPv4 and
     * IPv6, a separate set of signals will be emitted for each, and
     * the order they happen in is undefined.
     */
    public SignalHandle onEvent(EventHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSocketListenerEvent", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("event").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
