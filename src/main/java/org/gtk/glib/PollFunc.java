package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_main_context_set_poll_func().
 * The semantics of the function should match those of the poll() system call.
 */
@FunctionalInterface
public interface PollFunc {
    int run(org.gtk.glib.PollFD ufds, int nfsd, int timeout);

    @ApiStatus.Internal default int upcall(MemoryAddress ufds, int nfsd, int timeout) {
        var RESULT = run(org.gtk.glib.PollFD.fromAddress.marshal(ufds, Ownership.NONE), nfsd, timeout);
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PollFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
