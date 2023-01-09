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
    
    private static final java.lang.String C_TYPE_NAME = "GSocketService";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.SocketListener.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a SocketService proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SocketService(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SocketService> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SocketService(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_service_new.invokeExact();
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
        this.takeOwnership();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_socket_service_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Incoming} callback.
     */
    @FunctionalInterface
    public interface Incoming {
    
        /**
         * The ::incoming signal is emitted when a new incoming connection
         * to {@code service} needs to be handled. The handler must initiate the
         * handling of {@code connection}, but may not block; in essence,
         * asynchronous operations must be used.
         * <p>
         * {@code connection} will be unreffed once the signal handler returns,
         * so you need to ref it yourself if you are planning to use it.
         */
        boolean run(org.gtk.gio.SocketConnection connection, @Nullable org.gtk.gobject.GObject sourceObject);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceSocketService, MemoryAddress connection, MemoryAddress sourceObject) {
            var RESULT = run((org.gtk.gio.SocketConnection) Interop.register(connection, org.gtk.gio.SocketConnection.fromAddress).marshal(connection, null), (org.gtk.gobject.GObject) Interop.register(sourceObject, org.gtk.gobject.GObject.fromAddress).marshal(sourceObject, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Incoming.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * The ::incoming signal is emitted when a new incoming connection
     * to {@code service} needs to be handled. The handler must initiate the
     * handling of {@code connection}, but may not block; in essence,
     * asynchronous operations must be used.
     * <p>
     * {@code connection} will be unreffed once the signal handler returns,
     * so you need to ref it yourself if you are planning to use it.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SocketService.Incoming> onIncoming(SocketService.Incoming handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("incoming", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link SocketService.Builder} object constructs a {@link SocketService} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SocketService.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.SocketListener.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SocketService} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SocketService}.
         * @return A new instance of {@code SocketService} with the properties 
         *         that were set in the Builder object.
         */
        public SocketService build() {
            return (SocketService) org.gtk.gobject.GObject.newWithProperties(
                SocketService.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the service is currently accepting connections.
         * @param active The value for the {@code active} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActive(boolean active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_service_new = Interop.downcallHandle(
                "g_socket_service_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_service_is_active = Interop.downcallHandle(
                "g_socket_service_is_active",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_service_start = Interop.downcallHandle(
                "g_socket_service_start",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_service_stop = Interop.downcallHandle(
                "g_socket_service_stop",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_service_get_type = Interop.downcallHandle(
                "g_socket_service_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_socket_service_get_type != null;
    }
}
