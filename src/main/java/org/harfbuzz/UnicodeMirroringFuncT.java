package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link UnicodeFuncsT} structure.
 * <p>
 * This method should retrieve the Bi-Directional Mirroring Glyph
 * code point for a specified Unicode code point.
 * <p>
 * &lt;note&gt;Note: If a code point does not have a specified
 * Bi-Directional Mirroring Glyph defined, the method should
 * return the original code point.&lt;/note&gt;
 */
@FunctionalInterface
public interface UnicodeMirroringFuncT {
    org.harfbuzz.CodepointT run(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT unicode, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default int upcall(MemoryAddress ufuncs, int unicode, MemoryAddress userData) {
        var RESULT = run(org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(ufuncs, Ownership.NONE), new org.harfbuzz.CodepointT(unicode), userData);
        return RESULT.getValue().intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnicodeMirroringFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
