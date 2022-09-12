package org.harfbuzz;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the nominal glyph IDs for a sequence of
 * Unicode code points. Glyph IDs must be returned in a #hb_codepoint_t
 * output parameter.
 */
@FunctionalInterface
public interface FontGetNominalGlyphsFuncT {
        int onFontGetNominalGlyphsFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, int count, CodepointT firstUnicode, int unicodeStride, CodepointT firstGlyph, int glyphStride, jdk.incubator.foreign.MemoryAddress userData);
}
