package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Fully decompose {@code u} to its Unicode compatibility decomposition. The codepoints of the decomposition will be written to {@code decomposed}.
 * The complete length of the decomposition will be returned.
 * <p>
 * If {@code u} has no compatibility decomposition, zero should be returned.
 * <p>
 * The Unicode standard guarantees that a buffer of length {@code HB_UNICODE_MAX_DECOMPOSITION_LEN} codepoints will always be sufficient for any
 * compatibility decomposition plus an terminating value of 0.  Consequently, {@code decompose} must be allocated by the caller to be at least this length.  Implementations
 * of this function type must ensure that they do not write past the provided array.
 */
@FunctionalInterface
public interface UnicodeDecomposeCompatibilityFuncT {
    int run(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT u, org.harfbuzz.CodepointT decomposed, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default int upcall(MemoryAddress ufuncs, int u, MemoryAddress decomposed, MemoryAddress userData) {
        org.harfbuzz.CodepointT decomposedALIAS = new org.harfbuzz.CodepointT(decomposed.get(Interop.valueLayout.C_INT, 0));
        var RESULT = run(org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(ufuncs, Ownership.NONE), new org.harfbuzz.CodepointT(u), decomposedALIAS, userData);
        decomposed.set(Interop.valueLayout.C_INT, 0, decomposedALIAS.getValue());
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnicodeDecomposeCompatibilityFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
