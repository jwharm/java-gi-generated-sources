package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the nominal glyph IDs for a sequence of
 * Unicode code points. Glyph IDs must be returned in a {@link CodepointT}
 * output parameter.
 */
@FunctionalInterface
public interface FontGetNominalGlyphsFuncT {
    int run(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, int count, org.harfbuzz.CodepointT firstUnicode, int unicodeStride, org.harfbuzz.CodepointT firstGlyph, int glyphStride, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default int upcall(MemoryAddress font, MemoryAddress fontData, int count, MemoryAddress firstUnicode, int unicodeStride, MemoryAddress firstGlyph, int glyphStride, MemoryAddress userData) {
        org.harfbuzz.CodepointT firstUnicodeALIAS = new org.harfbuzz.CodepointT(firstUnicode.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.CodepointT firstGlyphALIAS = new org.harfbuzz.CodepointT(firstGlyph.get(Interop.valueLayout.C_INT, 0));
        var RESULT = run(org.harfbuzz.FontT.fromAddress.marshal(font, Ownership.NONE), fontData, count, firstUnicodeALIAS, unicodeStride, firstGlyphALIAS, glyphStride, userData);
        firstUnicode.set(Interop.valueLayout.C_INT, 0, firstUnicodeALIAS.getValue());
        firstGlyph.set(Interop.valueLayout.C_INT, 0, firstGlyphALIAS.getValue());
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FontGetNominalGlyphsFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
