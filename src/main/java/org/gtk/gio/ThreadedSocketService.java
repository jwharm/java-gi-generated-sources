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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketService.getMemoryLayout().withName("parent_instance"),
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
     * Create a ThreadedSocketService proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ThreadedSocketService(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ThreadedSocketService if its GType is a (or inherits from) "GThreadedSocketService".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ThreadedSocketService} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GThreadedSocketService", a ClassCastException will be thrown.
     */
    public static ThreadedSocketService castFrom(org.gtk.gobject.Object gobject) {
            return new ThreadedSocketService(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(int maxThreads) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_threaded_socket_service_new.invokeExact(
                    maxThreads);
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
        super(constructNew(maxThreads), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_threaded_socket_service_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Run {
        boolean signalReceived(ThreadedSocketService source, @NotNull org.gtk.gio.SocketConnection connection, @Nullable org.gtk.gobject.Object sourceObject);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("run"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ThreadedSocketService.Callbacks.class, "signalThreadedSocketServiceRun",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ThreadedSocketService.Run>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.SocketService.Build {
        
         /**
         * A {@link ThreadedSocketService.Build} object constructs a {@link ThreadedSocketService} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ThreadedSocketService} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ThreadedSocketService} using {@link ThreadedSocketService#castFrom}.
         * @return A new instance of {@code ThreadedSocketService} with the properties 
         *         that were set in the Build object.
         */
        public ThreadedSocketService construct() {
            return ThreadedSocketService.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ThreadedSocketService.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setMaxThreads(int maxThreads) {
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
    
    private static class Callbacks {
        
        public static boolean signalThreadedSocketServiceRun(MemoryAddress source, MemoryAddress connection, MemoryAddress sourceObject, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ThreadedSocketService.Run) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new ThreadedSocketService(source, Ownership.NONE), new org.gtk.gio.SocketConnection(connection, Ownership.NONE), new org.gtk.gobject.Object(sourceObject, Ownership.NONE));
        }
    }
}
