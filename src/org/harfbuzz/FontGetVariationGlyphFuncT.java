package org.harfbuzz;

@FunctionalInterface
public interface FontGetVariationGlyphFuncT {

    /**
     * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
     * 
     * This method should retrieve the glyph ID for a specified Unicode code point
     * followed by a specified Variation Selector code point. Glyph IDs must be
     * returned in a #hb_codepoint_t output parameter.
     */
    public BoolT onFontGetVariationGlyphFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT unicode, CodepointT variationSelector, CodepointT glyph, jdk.incubator.foreign.MemoryAddress userData);
}
