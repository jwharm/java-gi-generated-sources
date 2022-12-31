package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function of this signature is used to copy the node data
 * when doing a deep-copy of a tree.
 * @version 2.4
 */
@FunctionalInterface
public interface CopyFunc {
    java.lang.foreign.MemoryAddress run(java.lang.foreign.MemoryAddress src);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress src, MemoryAddress userData) {
        var RESULT = run(src);
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CopyFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
