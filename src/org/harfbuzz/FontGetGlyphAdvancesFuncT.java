package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the advances for a sequence of glyphs.
 */
@FunctionalInterface
public interface FontGetGlyphAdvancesFuncT {
        void onFontGetGlyphAdvancesFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, int count, CodepointT firstGlyph, int glyphStride, PositionT firstAdvance, int advanceStride, java.lang.foreign.MemoryAddress userData);
}
