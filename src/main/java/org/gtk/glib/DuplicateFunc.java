package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of functions that are used to 'duplicate' an object.
 * What this means depends on the context, it could just be
 * incrementing the reference count, if {@code data} is a ref-counted
 * object.
 */
@FunctionalInterface
public interface DuplicateFunc {
    @Nullable java.lang.foreign.MemoryAddress run();

    @ApiStatus.Internal default Addressable upcall(MemoryAddress data, MemoryAddress userData) {
        var RESULT = run();
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DuplicateFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
