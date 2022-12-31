package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link UnicodeFuncsT} structure.
 */
@FunctionalInterface
public interface UnicodeEastasianWidthFuncT {
    int run(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT unicode, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default int upcall(MemoryAddress ufuncs, int unicode, MemoryAddress userData) {
        var RESULT = run(org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(ufuncs, Ownership.NONE), new org.harfbuzz.CodepointT(unicode), userData);
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnicodeEastasianWidthFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
