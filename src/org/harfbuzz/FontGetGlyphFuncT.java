package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphFuncT {

    /**
     * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
     * 
     * This method should retrieve the glyph ID for a specified Unicode code point
     * font, with an optional variation selector.
     */
    public BoolT onFontGetGlyphFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT unicode, CodepointT variationSelector, CodepointT glyph, jdk.incubator.foreign.MemoryAddress userData);
}
