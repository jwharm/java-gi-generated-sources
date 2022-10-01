package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class ThreadedSocketService extends SocketService {

    public ThreadedSocketService(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ThreadedSocketService */
    public static ThreadedSocketService castFrom(org.gtk.gobject.Object gobject) {
        return new ThreadedSocketService(gobject.refcounted());
    }
    
    private static Refcounted constructNew(int maxThreads) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_threaded_socket_service_new(maxThreads), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link ThreadedSocketService} with no listeners. Listeners
     * must be added with one of the {@link SocketListener} "add" methods.
     */
    public ThreadedSocketService(int maxThreads) {
        super(constructNew(maxThreads));
    }
    
    @FunctionalInterface
    public interface RunHandler {
        boolean signalReceived(ThreadedSocketService source, SocketConnection connection, org.gtk.gobject.Object sourceObject);
    }
    
    /**
     * The ::run signal is emitted in a worker thread in response to an
     * incoming connection. This thread is dedicated to handling
     * {@code connection} and may perform blocking IO. The signal handler need
     * not return until the connection is closed.
     */
    public SignalHandle onRun(RunHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("run").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ThreadedSocketService.Callbacks.class, "signalThreadedSocketServiceRun",
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
    
    public static class Callbacks {
    
        public static boolean signalThreadedSocketServiceRun(MemoryAddress source, MemoryAddress connection, MemoryAddress sourceObject, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ThreadedSocketService.RunHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new ThreadedSocketService(Refcounted.get(source)), new SocketConnection(Refcounted.get(connection, false)), new org.gtk.gobject.Object(Refcounted.get(sourceObject, false)));
        }
        
    }
}
