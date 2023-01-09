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
/**
 * Functional interface declaration of the {@code IOSchedulerJobFunc} callback.
 */
@FunctionalInterface
public interface IOSchedulerJobFunc {

    /**
     * I/O Job function.
     * <p>
     * Long-running jobs should periodically check the {@code cancellable}
     * to see if they have been cancelled.
     */
    boolean run(org.gtk.gio.IOSchedulerJob job, @Nullable org.gtk.gio.Cancellable cancellable);
    
    @ApiStatus.Internal default int upcall(MemoryAddress job, MemoryAddress cancellable, MemoryAddress userData) {
        var RESULT = run(org.gtk.gio.IOSchedulerJob.fromAddress.marshal(job, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IOSchedulerJobFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
