package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ThreadedSocketService} is a simple subclass of {@link SocketService}
 * that handles incoming connections by creating a worker thread and
 * dispatching the connection to it by emitting the
 * {@link ThreadedSocketService}::run signal in the new thread.
 * <p>
 * The signal handler may perform blocking IO and need not return
 * until the connection is closed.
 * <p>
 * The service is implemented using a thread pool, so there is a
 * limited amount of threads available to serve incoming requests.
 * The service automatically stops the {@link SocketService} from accepting
 * new connections when all threads are busy.
 * <p>
 * As with {@link SocketService}, you may connect to {@link ThreadedSocketService}::run,
 * or subclass and override the default handler.
 * @version 2.22
 */
public class ThreadedSocketService extends org.gtk.gio.SocketService {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GThreadedSocketService";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.SocketService.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ThreadedSocketService proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ThreadedSocketService(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ThreadedSocketService> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ThreadedSocketService(input);
    
    private static MemoryAddress constructNew(int maxThreads) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_threaded_socket_service_new.invokeExact(maxThreads);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link ThreadedSocketService} with no listeners. Listeners
     * must be added with one of the {@link SocketListener} "add" methods.
     * @param maxThreads the maximal number of threads to execute concurrently
     *   handling incoming clients, -1 means no limit
     */
    public ThreadedSocketService(int maxThreads) {
        super(constructNew(maxThreads));
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_threaded_socket_service_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Run} callback.
     */
    @FunctionalInterface
    public interface Run {
    
        /**
         * The ::run signal is emitted in a worker thread in response to an
         * incoming connection. This thread is dedicated to handling
         * {@code connection} and may perform blocking IO. The signal handler need
         * not return until the connection is closed.
         */
        boolean run(org.gtk.gio.SocketConnection connection, @Nullable org.gtk.gobject.GObject sourceObject);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceThreadedSocketService, MemoryAddress connection, MemoryAddress sourceObject) {
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Run.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * The ::run signal is emitted in a worker thread in response to an
     * incoming connection. This thread is dedicated to handling
     * {@code connection} and may perform blocking IO. The signal handler need
     * not return until the connection is closed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ThreadedSocketService.Run> onRun(ThreadedSocketService.Run handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("run", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ThreadedSocketService.Builder} object constructs a {@link ThreadedSocketService} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ThreadedSocketService.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.SocketService.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ThreadedSocketService} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ThreadedSocketService}.
         * @return A new instance of {@code ThreadedSocketService} with the properties 
         *         that were set in the Builder object.
         */
        public ThreadedSocketService build() {
            return (ThreadedSocketService) org.gtk.gobject.GObject.newWithProperties(
                ThreadedSocketService.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setMaxThreads(int maxThreads) {
            names.add("max-threads");
            values.add(org.gtk.gobject.Value.create(maxThreads));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_threaded_socket_service_new = Interop.downcallHandle(
                "g_threaded_socket_service_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_threaded_socket_service_get_type = Interop.downcallHandle(
                "g_threaded_socket_service_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_threaded_socket_service_get_type != null;
    }
}
