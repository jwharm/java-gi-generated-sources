package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the (X,Y) coordinates (in font units) of the
 * origin for a glyph. Each coordinate must be returned in an {@link PositionT}
 * output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphOriginFuncT {
    org.harfbuzz.BoolT run(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, org.harfbuzz.CodepointT glyph, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default int upcall(MemoryAddress font, MemoryAddress fontData, int glyph, MemoryAddress x, MemoryAddress y, MemoryAddress userData) {
        org.harfbuzz.PositionT xALIAS = new org.harfbuzz.PositionT(x.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.PositionT yALIAS = new org.harfbuzz.PositionT(y.get(Interop.valueLayout.C_INT, 0));
        var RESULT = run(org.harfbuzz.FontT.fromAddress.marshal(font, Ownership.NONE), fontData, new org.harfbuzz.CodepointT(glyph), xALIAS, yALIAS, userData);
        x.set(Interop.valueLayout.C_INT, 0, xALIAS.getValue());
        y.set(Interop.valueLayout.C_INT, 0, yALIAS.getValue());
        return RESULT.getValue().intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FontGetGlyphOriginFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
