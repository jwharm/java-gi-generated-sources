package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * I/O Job function.
 * <p>
 * Long-running jobs should periodically check the {@code cancellable}
 * to see if they have been cancelled.
 */
@FunctionalInterface
public interface IOSchedulerJobFunc {
    boolean run(org.gtk.gio.IOSchedulerJob job, @Nullable org.gtk.gio.Cancellable cancellable);

    @ApiStatus.Internal default int upcall(MemoryAddress job, MemoryAddress cancellable, MemoryAddress userData) {
        var RESULT = run(org.gtk.gio.IOSchedulerJob.fromAddress.marshal(job, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IOSchedulerJobFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
