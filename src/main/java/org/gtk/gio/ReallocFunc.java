package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Changes the size of the memory block pointed to by {@code data} to
 * {@code size} bytes.
 * <p>
 * The function should have the same semantics as realloc().
 */
@FunctionalInterface
public interface ReallocFunc {
    @Nullable java.lang.foreign.MemoryAddress run(long size);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress data, long size) {
        var RESULT = run(size);
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReallocFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
