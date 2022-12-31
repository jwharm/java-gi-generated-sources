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
@FunctionalInterface
public interface PrintJobCompleteFunc {
    void run(org.gtk.gtk.PrintJob printJob, org.gtk.glib.Error error);

    @ApiStatus.Internal default void upcall(MemoryAddress printJob, MemoryAddress userData, MemoryAddress error) {
        run((org.gtk.gtk.PrintJob) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(printJob)), org.gtk.gtk.PrintJob.fromAddress).marshal(printJob, Ownership.NONE), org.gtk.glib.Error.fromAddress.marshal(error, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrintJobCompleteFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
