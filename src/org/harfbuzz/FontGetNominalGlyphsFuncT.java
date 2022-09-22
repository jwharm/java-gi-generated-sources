package org.harfbuzz;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the nominal glyph IDs for a sequence of
 * Unicode code points. Glyph IDs must be returned in a {@link codepoint_t}
 * output parameter.
 */
@FunctionalInterface
public interface FontGetNominalGlyphsFuncT {
        int onFontGetNominalGlyphsFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, int count, CodepointT firstUnicode, int unicodeStride, CodepointT firstGlyph, int glyphStride, java.lang.foreign.MemoryAddress userData);
}
