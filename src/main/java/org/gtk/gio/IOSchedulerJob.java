package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque class for defining and scheduling IO jobs.
 */
public class IOSchedulerJob extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOSchedulerJob";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link IOSchedulerJob}
     * @return A new, uninitialized @{link IOSchedulerJob}
     */
    public static IOSchedulerJob allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IOSchedulerJob newInstance = new IOSchedulerJob(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IOSchedulerJob proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected IOSchedulerJob(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, IOSchedulerJob> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new IOSchedulerJob(input, ownership);
    
    /**
     * Used from an I/O job to send a callback to be run in the thread
     * that the job was started from, waiting for the result (and thus
     * blocking the I/O job).
     * @param func a {@link org.gtk.glib.SourceFunc} callback that will be called in the original thread
     * @param notify a {@link org.gtk.glib.DestroyNotify} for {@code user_data}, or {@code null}
     * @return The return value of {@code func}
     * @deprecated Use g_main_context_invoke().
     */
    @Deprecated
    public boolean sendToMainloop(org.gtk.glib.SourceFunc func, @Nullable org.gtk.glib.DestroyNotify notify) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_scheduler_job_send_to_mainloop.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param notify a {@link org.gtk.glib.DestroyNotify} for {@code user_data}, or {@code null}
     * @deprecated Use g_main_context_invoke().
     */
    @Deprecated
    public void sendToMainloopAsync(org.gtk.glib.SourceFunc func, @Nullable org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.g_io_scheduler_job_send_to_mainloop_async.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_io_scheduler_job_send_to_mainloop = Interop.downcallHandle(
            "g_io_scheduler_job_send_to_mainloop",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_scheduler_job_send_to_mainloop_async = Interop.downcallHandle(
            "g_io_scheduler_job_send_to_mainloop_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
