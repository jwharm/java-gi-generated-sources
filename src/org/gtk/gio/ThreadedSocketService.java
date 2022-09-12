package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GThreadedSocketService is a simple subclass of #GSocketService
 * that handles incoming connections by creating a worker thread and
 * dispatching the connection to it by emitting the
 * #GThreadedSocketService::run signal in the new thread.
 * 
 * The signal handler may perform blocking IO and need not return
 * until the connection is closed.
 * 
 * The service is implemented using a thread pool, so there is a
 * limited amount of threads available to serve incoming requests.
 * The service automatically stops the #GSocketService from accepting
 * new connections when all threads are busy.
 * 
 * As with #GSocketService, you may connect to #GThreadedSocketService::run,
 * or subclass and override the default handler.
 */
public class ThreadedSocketService extends SocketService {

    public ThreadedSocketService(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ThreadedSocketService */
    public static ThreadedSocketService castFrom(org.gtk.gobject.Object gobject) {
        return new ThreadedSocketService(gobject.getReference());
    }
    
    private static Reference constructNew(int maxThreads) {
        Reference RESULT = References.get(gtk_h.g_threaded_socket_service_new(maxThreads), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GThreadedSocketService with no listeners. Listeners
     * must be added with one of the #GSocketListener "add" methods.
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
     * @connection and may perform blocking IO. The signal handler need
     * not return until the connection is closed.
     */
    public SignalHandle onRun(RunHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalThreadedSocketServiceRun", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("run").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
