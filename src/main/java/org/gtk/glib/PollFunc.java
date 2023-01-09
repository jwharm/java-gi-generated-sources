package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_main_context_set_poll_func().
 * The semantics of the function should match those of the poll() system call.
 */
/**
 * Functional interface declaration of the {@code PollFunc} callback.
 */
@FunctionalInterface
public interface PollFunc {

    /**
     * Specifies the type of function passed to g_main_context_set_poll_func().
     * The semantics of the function should match those of the poll() system call.
     */
    int run(org.gtk.glib.PollFD ufds, int nfsd, int timeout);
    
    @ApiStatus.Internal default int upcall(MemoryAddress ufds, int nfsd, int timeout) {
        var RESULT = run(org.gtk.glib.PollFD.fromAddress.marshal(ufds, null), nfsd, timeout);
        return RESULT;
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PollFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
