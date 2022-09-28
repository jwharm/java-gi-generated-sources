package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link SocketService} is an object that represents a service that
 * is provided to the network or over local sockets.  When a new
 * connection is made to the service the {@link SocketService}::incoming
 * signal is emitted.
 * <p>
 * A {@link SocketService} is a subclass of {@link SocketListener} and you need
 * to add the addresses you want to accept connections on with the
 * {@link SocketListener} APIs.
 * <p>
 * There are two options for implementing a network service based on
 * {@link SocketService}. The first is to create the service using
 * g_socket_service_new() and to connect to the {@link SocketService}::incoming
 * signal. The second is to subclass {@link SocketService} and override the
 * default signal handler implementation.
 * <p>
 * In either case, the handler must immediately return, or else it
 * will block additional incoming connections from being serviced.
 * If you are interested in writing connection handlers that contain
 * blocking code then see {@link ThreadedSocketService}.
 * <p>
 * The socket service runs on the main loop of the
 * [thread-default context][g-main-context-push-thread-default-context]
 * of the thread it is created in, and is not
 * threadsafe in general. However, the calls to start and stop the
 * service are thread-safe so these can be used from threads that
 * handle incoming clients.
 */
public class SocketService extends SocketListener {

    public SocketService(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SocketService */
    public static SocketService castFrom(org.gtk.gobject.Object gobject) {
        return new SocketService(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_socket_service_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link SocketService} with no sockets to listen for.
     * New listeners can be added with e.g. g_socket_listener_add_address()
     * or g_socket_listener_add_inet_port().
     * <p>
     * New services are created active, there is no need to call
     * g_socket_service_start(), unless g_socket_service_stop() has been
     * called before.
     */
    public SocketService() {
        super(constructNew());
    }
    
    /**
     * Check whether the service is active or not. An active
     * service will accept new clients that connect, while
     * a non-active service will let connecting clients queue
     * up until the service is started.
     */
    public boolean isActive() {
        var RESULT = gtk_h.g_socket_service_is_active(handle());
        return RESULT != 0;
    }
    
    /**
     * Restarts the service, i.e. start accepting connections
     * from the added sockets when the mainloop runs. This only needs
     * to be called after the service has been stopped from
     * g_socket_service_stop().
     * <p>
     * This call is thread-safe, so it may be called from a thread
     * handling an incoming client request.
     */
    public void start() {
        gtk_h.g_socket_service_start(handle());
    }
    
    /**
     * Stops the service, i.e. stops accepting connections
     * from the added sockets when the mainloop runs.
     * <p>
     * This call is thread-safe, so it may be called from a thread
     * handling an incoming client request.
     * <p>
     * Note that this only stops accepting new connections; it does not
     * close the listening sockets, and you can call
     * g_socket_service_start() again later to begin listening again. To
     * close the listening sockets, call g_socket_listener_close(). (This
     * will happen automatically when the {@link SocketService} is finalized.)
     * <p>
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
     * to {@code service} needs to be handled. The handler must initiate the
     * handling of {@code connection}, but may not block; in essence,
     * asynchronous operations must be used.
     * <p>
     * {@code connection} will be unreffed once the signal handler returns,
     * so you need to ref it yourself if you are planning to use it.
     */
    public SignalHandle onIncoming(IncomingHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("incoming").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SocketService.class, "__signalSocketServiceIncoming",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalSocketServiceIncoming(MemoryAddress source, MemoryAddress connection, MemoryAddress sourceObject, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (SocketService.IncomingHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new SocketService(References.get(source)), new SocketConnection(References.get(connection, false)), new org.gtk.gobject.Object(References.get(sourceObject, false)));
    }
    
}
