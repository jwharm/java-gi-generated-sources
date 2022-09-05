package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphAdvancesFuncT {

    /**
     * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
     * 
     * This method should retrieve the advances for a sequence of glyphs.
     */
    public void onFontGetGlyphAdvancesFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, int count, CodepointT firstGlyph, int glyphStride, PositionT firstAdvance, int advanceStride, jdk.incubator.foreign.MemoryAddress userData);
}
