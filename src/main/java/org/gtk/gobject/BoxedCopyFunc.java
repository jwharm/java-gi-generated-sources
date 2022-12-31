package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function is provided by the user and should produce a copy
 * of the passed in boxed structure.
 */
@FunctionalInterface
public interface BoxedCopyFunc {
    java.lang.foreign.MemoryAddress run(java.lang.foreign.MemoryAddress boxed);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress boxed) {
        var RESULT = run(boxed);
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BoxedCopyFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
