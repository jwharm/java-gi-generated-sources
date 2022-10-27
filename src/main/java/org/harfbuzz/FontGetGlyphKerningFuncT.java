package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This method should retrieve the kerning-adjustment value for a glyph-pair in
 * the specified font, for horizontal text segments.
 */
@FunctionalInterface
public interface FontGetGlyphKerningFuncT {
        org.harfbuzz.PositionT onFontGetGlyphKerningFuncT(@NotNull org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull org.harfbuzz.CodepointT firstGlyph, @NotNull org.harfbuzz.CodepointT secondGlyph, @Nullable java.lang.foreign.MemoryAddress userData);
}
