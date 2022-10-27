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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketService.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.ThreadedSocketServicePrivate.getMemoryLayout().withName("priv")
    ).withName("GThreadedSocketService");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ThreadedSocketService(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ThreadedSocketService */
    public static ThreadedSocketService castFrom(org.gtk.gobject.Object gobject) {
        return new ThreadedSocketService(gobject.refcounted());
    }
    
    private static Refcounted constructNew(int maxThreads) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_threaded_socket_service_new.invokeExact(maxThreads), true);
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
     */
    public Signal<ThreadedSocketService.Run> onRun(ThreadedSocketService.Run handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("run"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ThreadedSocketService.Callbacks.class, "signalThreadedSocketServiceRun",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ThreadedSocketService.Run>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_threaded_socket_service_new = Interop.downcallHandle(
            "g_threaded_socket_service_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalThreadedSocketServiceRun(MemoryAddress source, MemoryAddress connection, MemoryAddress sourceObject, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ThreadedSocketService.Run) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new ThreadedSocketService(Refcounted.get(source)), new org.gtk.gio.SocketConnection(Refcounted.get(connection, false)), new org.gtk.gobject.Object(Refcounted.get(sourceObject, false)));
        }
    }
}
