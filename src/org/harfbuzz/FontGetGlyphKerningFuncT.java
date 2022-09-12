package org.harfbuzz;

/**
 * This method should retrieve the kerning-adjustment value for a glyph-pair in
 * the specified font, for horizontal text segments.
 */
@FunctionalInterface
public interface FontGetGlyphKerningFuncT {
        PositionT onFontGetGlyphKerningFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT firstGlyph, CodepointT secondGlyph, jdk.incubator.foreign.MemoryAddress userData);
}
