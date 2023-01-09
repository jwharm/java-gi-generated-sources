package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link UnicodeFuncsT} structure.
 * <p>
 * This method should decompose an input Unicode code point,
 * returning the two decomposed code points in {@link CodepointT}
 * output parameters (if successful). The method must return an
 * {@link BoolT} indicating the success of the composition.
 */
/**
 * Functional interface declaration of the {@code UnicodeDecomposeFuncT} callback.
 */
@FunctionalInterface
public interface UnicodeDecomposeFuncT {

    /**
     * A virtual method for the {@link UnicodeFuncsT} structure.
     * <p>
     * This method should decompose an input Unicode code point,
     * returning the two decomposed code points in {@link CodepointT}
     * output parameters (if successful). The method must return an
     * {@link BoolT} indicating the success of the composition.
     */
    org.harfbuzz.BoolT run(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT ab, org.harfbuzz.CodepointT a, org.harfbuzz.CodepointT b, @Nullable java.lang.foreign.MemoryAddress userData);
    
    @ApiStatus.Internal default int upcall(MemoryAddress ufuncs, int ab, MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            org.harfbuzz.CodepointT aALIAS = new org.harfbuzz.CodepointT(a.get(Interop.valueLayout.C_INT, 0));
            org.harfbuzz.CodepointT bALIAS = new org.harfbuzz.CodepointT(b.get(Interop.valueLayout.C_INT, 0));
            var RESULT = run(org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(ufuncs, null), new org.harfbuzz.CodepointT(ab), aALIAS, bALIAS, userData);
            a.set(Interop.valueLayout.C_INT, 0, aALIAS.getValue());
            b.set(Interop.valueLayout.C_INT, 0, bALIAS.getValue());
            return RESULT.getValue().intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnicodeDecomposeFuncT.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
