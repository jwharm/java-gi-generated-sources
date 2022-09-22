package org.harfbuzz;

/**
 * This method should retrieve the kerning-adjustment value for a glyph-pair in
 * the specified font, for horizontal text segments.
 */
@FunctionalInterface
public interface FontGetGlyphKerningFuncT {
        PositionT onFontGetGlyphKerningFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, CodepointT firstGlyph, CodepointT secondGlyph, java.lang.foreign.MemoryAddress userData);
}
