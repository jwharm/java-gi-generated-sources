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
        int onFontGetNominalGlyphsFuncT(@NotNull org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, int count, @NotNull org.harfbuzz.CodepointT firstUnicode, int unicodeStride, @NotNull Out<org.harfbuzz.CodepointT> firstGlyph, int glyphStride, @Nullable java.lang.foreign.MemoryAddress userData);
}
