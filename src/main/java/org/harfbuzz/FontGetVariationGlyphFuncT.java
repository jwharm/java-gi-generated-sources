package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the glyph ID for a specified Unicode code point
 * followed by a specified Variation Selector code point. Glyph IDs must be
 * returned in a {@link CodepointT} output parameter.
 */
@FunctionalInterface
public interface FontGetVariationGlyphFuncT {
    org.harfbuzz.BoolT run(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, org.harfbuzz.CodepointT unicode, org.harfbuzz.CodepointT variationSelector, org.harfbuzz.CodepointT glyph, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default int upcall(MemoryAddress font, MemoryAddress fontData, int unicode, int variationSelector, MemoryAddress glyph, MemoryAddress userData) {
        org.harfbuzz.CodepointT glyphALIAS = new org.harfbuzz.CodepointT(glyph.get(Interop.valueLayout.C_INT, 0));
        var RESULT = run(org.harfbuzz.FontT.fromAddress.marshal(font, Ownership.NONE), fontData, new org.harfbuzz.CodepointT(unicode), new org.harfbuzz.CodepointT(variationSelector), glyphALIAS, userData);
        glyph.set(Interop.valueLayout.C_INT, 0, glyphALIAS.getValue());
        return RESULT.getValue().intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FontGetVariationGlyphFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
