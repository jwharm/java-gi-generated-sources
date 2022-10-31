package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque class for defining and scheduling IO jobs.
 */
public class IOSchedulerJob extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOSchedulerJob";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static IOSchedulerJob allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IOSchedulerJob newInstance = new IOSchedulerJob(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public IOSchedulerJob(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Used from an I/O job to send a callback to be run in the thread
     * that the job was started from, waiting for the result (and thus
     * blocking the I/O job).
     * @param func a {@link org.gtk.glib.SourceFunc} callback that will be called in the original thread
     * @return The return value of {@code func}
     * @deprecated Use g_main_context_invoke().
     */
    @Deprecated
    public boolean sendToMainloop(@NotNull org.gtk.glib.SourceFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_scheduler_job_send_to_mainloop.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Used from an I/O job to send a callback to be run asynchronously in
     * the thread that the job was started from. The callback will be run
     * when the main loop is available, but at that time the I/O job might
     * have finished. The return value from the callback is ignored.
     * <p>
     * Note that if you are passing the {@code user_data} from g_io_scheduler_push_job()
     * on to this function you have to ensure that it is not freed before
     * {@code func} is called, either by passing {@code null} as {@code notify} to
     * g_io_scheduler_push_job() or by using refcounting for {@code user_data}.
     * @param func a {@link org.gtk.glib.SourceFunc} callback that will be called in the original thread
     * @deprecated Use g_main_context_invoke().
     */
    @Deprecated
    public void sendToMainloopAsync(@NotNull org.gtk.glib.SourceFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.g_io_scheduler_job_send_to_mainloop_async.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_io_scheduler_job_send_to_mainloop = Interop.downcallHandle(
            "g_io_scheduler_job_send_to_mainloop",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_io_scheduler_job_send_to_mainloop_async = Interop.downcallHandle(
            "g_io_scheduler_job_send_to_mainloop_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
