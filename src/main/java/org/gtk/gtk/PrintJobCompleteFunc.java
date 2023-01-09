package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of callback that is passed to gtk_print_job_send().
 * <p>
 * It is called when the print job has been completely sent.
 */
/**
 * Functional interface declaration of the {@code PrintJobCompleteFunc} callback.
 */
@FunctionalInterface
public interface PrintJobCompleteFunc {

    /**
     * The type of callback that is passed to gtk_print_job_send().
     * <p>
     * It is called when the print job has been completely sent.
     */
    void run(org.gtk.gtk.PrintJob printJob, org.gtk.glib.Error error);
    
    @ApiStatus.Internal default void upcall(MemoryAddress printJob, MemoryAddress userData, MemoryAddress error) {
        run((org.gtk.gtk.PrintJob) Interop.register(printJob, org.gtk.gtk.PrintJob.fromAddress).marshal(printJob, null), org.gtk.glib.Error.fromAddress.marshal(error, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrintJobCompleteFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
