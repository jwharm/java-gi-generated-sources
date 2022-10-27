package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.22
 */
public class SocketService extends org.gtk.gio.SocketListener {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketListener.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.SocketServicePrivate.getMemoryLayout().withName("priv")
    ).withName("GSocketService");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public SocketService(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SocketService */
    public static SocketService castFrom(org.gtk.gobject.Object gobject) {
        return new SocketService(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_socket_service_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return {@code true} if the service is active, {@code false} otherwise
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_service_is_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.g_socket_service_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.g_socket_service_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Incoming {
        boolean signalReceived(SocketService source, @NotNull org.gtk.gio.SocketConnection connection, @Nullable org.gtk.gobject.Object sourceObject);
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
    public Signal<SocketService.Incoming> onIncoming(SocketService.Incoming handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("incoming"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SocketService.Callbacks.class, "signalSocketServiceIncoming",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SocketService.Incoming>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_service_new = Interop.downcallHandle(
            "g_socket_service_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_service_is_active = Interop.downcallHandle(
            "g_socket_service_is_active",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_service_start = Interop.downcallHandle(
            "g_socket_service_start",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_service_stop = Interop.downcallHandle(
            "g_socket_service_stop",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalSocketServiceIncoming(MemoryAddress source, MemoryAddress connection, MemoryAddress sourceObject, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SocketService.Incoming) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new SocketService(Refcounted.get(source)), new org.gtk.gio.SocketConnection(Refcounted.get(connection, false)), new org.gtk.gobject.Object(Refcounted.get(sourceObject, false)));
        }
    }
}
