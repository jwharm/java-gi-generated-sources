package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link UnicodeFuncsT} structure.
 * <p>
 * This method should compose a sequence of two input Unicode code
 * points by canonical equivalence, returning the composed code
 * point in a {@link CodepointT} output parameter (if successful).
 * The method must return an {@link BoolT} indicating the success
 * of the composition.
 */
@FunctionalInterface
public interface UnicodeComposeFuncT {
    org.harfbuzz.BoolT run(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT a, org.harfbuzz.CodepointT b, org.harfbuzz.CodepointT ab, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default int upcall(MemoryAddress ufuncs, int a, int b, MemoryAddress ab, MemoryAddress userData) {
        org.harfbuzz.CodepointT abALIAS = new org.harfbuzz.CodepointT(ab.get(Interop.valueLayout.C_INT, 0));
        var RESULT = run(org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(ufuncs, Ownership.NONE), new org.harfbuzz.CodepointT(a), new org.harfbuzz.CodepointT(b), abALIAS, userData);
        ab.set(Interop.valueLayout.C_INT, 0, abALIAS.getValue());
        return RESULT.getValue().intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnicodeComposeFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
