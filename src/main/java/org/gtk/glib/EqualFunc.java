package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of a function used to test two values for
 * equality. The function should return {@code true} if both values are equal
 * and {@code false} otherwise.
 */
@FunctionalInterface
public interface EqualFunc {
    boolean run(@Nullable java.lang.foreign.MemoryAddress a, @Nullable java.lang.foreign.MemoryAddress b);

    @ApiStatus.Internal default int upcall(MemoryAddress a, MemoryAddress b) {
        var RESULT = run(a, b);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EqualFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
