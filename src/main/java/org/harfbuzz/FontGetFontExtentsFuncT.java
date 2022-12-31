package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This method should retrieve the extents for a font.
 */
@FunctionalInterface
public interface FontGetFontExtentsFuncT {
    org.harfbuzz.BoolT run(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, org.harfbuzz.FontExtentsT extents, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default int upcall(MemoryAddress font, MemoryAddress fontData, MemoryAddress extents, MemoryAddress userData) {
        var RESULT = run(org.harfbuzz.FontT.fromAddress.marshal(font, Ownership.NONE), fontData, org.harfbuzz.FontExtentsT.fromAddress.marshal(extents, Ownership.NONE), userData);
        return RESULT.getValue().intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FontGetFontExtentsFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
