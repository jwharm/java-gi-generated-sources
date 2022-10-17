package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the nominal glyph IDs for a sequence of
 * Unicode code points. Glyph IDs must be returned in a {@link codepoint_t}
 * output parameter.
 */
@FunctionalInterface
public interface FontGetNominalGlyphsFuncT {
        int onFontGetNominalGlyphsFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull int count, @NotNull CodepointT firstUnicode, @NotNull int unicodeStride, @NotNull Out<CodepointT> firstGlyph, @NotNull int glyphStride, @Nullable java.lang.foreign.MemoryAddress userData);
}
