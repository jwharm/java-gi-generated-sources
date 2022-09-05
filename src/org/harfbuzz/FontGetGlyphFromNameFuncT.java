package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphFromNameFuncT {

    /**
     * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
     * 
     * This method should retrieve the glyph ID that corresponds to a glyph-name
     * string.
     */
    public BoolT onFontGetGlyphFromNameFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, java.lang.String[] name, int len, CodepointT glyph, jdk.incubator.foreign.MemoryAddress userData);
}
