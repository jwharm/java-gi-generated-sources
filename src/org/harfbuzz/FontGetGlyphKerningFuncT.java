package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * This method should retrieve the kerning-adjustment value for a glyph-pair in
 * the specified font, for horizontal text segments.
 */
@FunctionalInterface
public interface FontGetGlyphKerningFuncT {
        PositionT onFontGetGlyphKerningFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, CodepointT firstGlyph, CodepointT secondGlyph, java.lang.foreign.MemoryAddress userData);
}
