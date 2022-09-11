package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GSocketService is an object that represents a service that
 * is provided to the network or over local sockets.  When a new
 * connection is made to the service the #GSocketService::incoming
 * signal is emitted.
 * 
 * A #GSocketService is a subclass of #GSocketListener and you need
 * to add the addresses you want to accept connections on with the
 * #GSocketListener APIs.
 * 
 * There are two options for implementing a network service based on
 * #GSocketService. The first is to create the service using
 * g_socket_service_new() and to connect to the #GSocketService::incoming
 * signal. The second is to subclass #GSocketService and override the
 * default signal handler implementation.
 * 
 * In either case, the handler must immediately return, or else it
 * will block additional incoming connections from being serviced.
 * If you are interested in writing connection handlers that contain
 * blocking code then see #GThreadedSocketService.
 * 
 * The socket service runs on the main loop of the
 * [thread-default context][g-main-context-push-thread-default-context]
 * of the thread it is created in, and is not
 * threadsafe in general. However, the calls to start and stop the
 * service are thread-safe so these can be used from threads that
 * handle incoming clients.
 */
public class SocketService extends SocketListener {

    public SocketService(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SocketService */
    public static SocketService castFrom(org.gtk.gobject.Object gobject) {
        return new SocketService(gobject.getReference());
    }
    
    /**
     * Creates a new #GSocketService with no sockets to listen for.
     * New listeners can be added with e.g. g_socket_listener_add_address()
     * or g_socket_listener_add_inet_port().
     * 
     * New services are created active, there is no need to call
     * g_socket_service_start(), unless g_socket_service_stop() has been
     * called before.
     */
    public SocketService() {
        super(References.get(gtk_h.g_socket_service_new(), true));
    }
    
    /**
     * Check whether the service is active or not. An active
     * service will accept new clients that connect, while
     * a non-active service will let connecting clients queue
     * up until the service is started.
     */
    public boolean isActive() {
        var RESULT = gtk_h.g_socket_service_is_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Restarts the service, i.e. start accepting connections
     * from the added sockets when the mainloop runs. This only needs
     * to be called after the service has been stopped from
     * g_socket_service_stop().
     * 
     * This call is thread-safe, so it may be called from a thread
     * handling an incoming client request.
     */
    public void start() {
        gtk_h.g_socket_service_start(handle());
    }
    
    /**
     * Stops the service, i.e. stops accepting connections
     * from the added sockets when the mainloop runs.
     * 
     * This call is thread-safe, so it may be called from a thread
     * handling an incoming client request.
     * 
     * Note that this only stops accepting new connections; it does not
     * close the listening sockets, and you can call
     * g_socket_service_start() again later to begin listening again. To
     * close the listening sockets, call g_socket_listener_close(). (This
     * will happen automatically when the #GSocketService is finalized.)
     * 
     * This must be called before calling g_socket_listener_close() as
     * the socket service will start accepting connections immediately
     * when a new socket is added.
     */
    public void stop() {
        gtk_h.g_socket_service_stop(handle());
    }
    
    @FunctionalInterface
    public interface IncomingHandler {
        boolean signalReceived(SocketService source, SocketConnection connection, org.gtk.gobject.Object sourceObject);
    }
    
    /**
     * The ::incoming signal is emitted when a new incoming connection
     * to @service needs to be handled. The handler must initiate the
     * handling of @connection, but may not block; in essence,
     * asynchronous operations must be used.
     * 
     * @connection will be unreffed once the signal handler returns,
     * so you need to ref it yourself if you are planning to use it.
     */
    public void onIncoming(IncomingHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSocketServiceIncoming", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("incoming").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
