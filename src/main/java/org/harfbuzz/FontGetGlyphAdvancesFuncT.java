package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the advances for a sequence of glyphs.
 */
@FunctionalInterface
public interface FontGetGlyphAdvancesFuncT {
    void run(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, int count, org.harfbuzz.CodepointT firstGlyph, int glyphStride, org.harfbuzz.PositionT firstAdvance, int advanceStride, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default void upcall(MemoryAddress font, MemoryAddress fontData, int count, MemoryAddress firstGlyph, int glyphStride, MemoryAddress firstAdvance, int advanceStride, MemoryAddress userData) {
        org.harfbuzz.CodepointT firstGlyphALIAS = new org.harfbuzz.CodepointT(firstGlyph.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.PositionT firstAdvanceALIAS = new org.harfbuzz.PositionT(firstAdvance.get(Interop.valueLayout.C_INT, 0));
        run(org.harfbuzz.FontT.fromAddress.marshal(font, Ownership.NONE), fontData, count, firstGlyphALIAS, glyphStride, firstAdvanceALIAS, advanceStride, userData);
        firstGlyph.set(Interop.valueLayout.C_INT, 0, firstGlyphALIAS.getValue());
        firstAdvance.set(Interop.valueLayout.C_INT, 0, firstAdvanceALIAS.getValue());
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FontGetGlyphAdvancesFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
