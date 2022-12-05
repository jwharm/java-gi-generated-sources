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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketListener.getMemoryLayout().withName("parent_instance"),
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
     * Create a SocketService proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SocketService(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SocketService if its GType is a (or inherits from) "GSocketService".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SocketService} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSocketService", a ClassCastException will be thrown.
     */
    public static SocketService castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), SocketService.getType())) {
            return new SocketService(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GSocketService");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
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
            RESULT = (int) DowncallHandles.g_socket_service_is_active.invokeExact(
                    handle());
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
            DowncallHandles.g_socket_service_start.invokeExact(
                    handle());
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
            DowncallHandles.g_socket_service_stop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_socket_service_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Incoming {
        boolean signalReceived(SocketService sourceSocketService, @NotNull org.gtk.gio.SocketConnection connection, @Nullable org.gtk.gobject.Object sourceObject);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("incoming"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SocketService.Callbacks.class, "signalSocketServiceIncoming",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SocketService.Incoming>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.SocketListener.Build {
        
         /**
         * A {@link SocketService.Build} object constructs a {@link SocketService} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SocketService} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SocketService} using {@link SocketService#castFrom}.
         * @return A new instance of {@code SocketService} with the properties 
         *         that were set in the Build object.
         */
        public SocketService construct() {
            return SocketService.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SocketService.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the service is currently accepting connections.
         * @param active The value for the {@code active} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setActive(boolean active) {
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
    
    private static class Callbacks {
        
        public static boolean signalSocketServiceIncoming(MemoryAddress sourceSocketService, MemoryAddress connection, MemoryAddress sourceObject, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (SocketService.Incoming) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new SocketService(sourceSocketService, Ownership.NONE), new org.gtk.gio.SocketConnection(connection, Ownership.NONE), new org.gtk.gobject.Object(sourceObject, Ownership.NONE));
        }
    }
}
