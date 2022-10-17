package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * This method should retrieve the kerning-adjustment value for a glyph-pair in
 * the specified font, for horizontal text segments.
 */
@FunctionalInterface
public interface FontGetGlyphKerningFuncT {
        PositionT onFontGetGlyphKerningFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull CodepointT firstGlyph, @NotNull CodepointT secondGlyph, @Nullable java.lang.foreign.MemoryAddress userData);
}
