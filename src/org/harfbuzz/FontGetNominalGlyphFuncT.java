package org.harfbuzz;

@FunctionalInterface
public interface FontGetNominalGlyphFuncT {

    /**
     * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
     * 
     * This method should retrieve the nominal glyph ID for a specified Unicode code
     * point. Glyph IDs must be returned in a #hb_codepoint_t output parameter.
     */
    public BoolT onFontGetNominalGlyphFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT unicode, CodepointT glyph, jdk.incubator.foreign.MemoryAddress userData);
}
