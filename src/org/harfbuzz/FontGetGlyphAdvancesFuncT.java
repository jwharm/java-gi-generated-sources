package org.harfbuzz;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the advances for a sequence of glyphs.
 */
@FunctionalInterface
public interface FontGetGlyphAdvancesFuncT {
        void onFontGetGlyphAdvancesFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, int count, CodepointT firstGlyph, int glyphStride, PositionT firstAdvance, int advanceStride, jdk.incubator.foreign.MemoryAddress userData);
}
