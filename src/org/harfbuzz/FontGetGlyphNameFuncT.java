package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphNameFuncT {

    /**
     * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
     * 
     * This method should retrieve the glyph name that corresponds to a
     * glyph ID. The name should be returned in a string output parameter.
     */
    public BoolT onFontGetGlyphNameFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, java.lang.String[] name, int size, jdk.incubator.foreign.MemoryAddress userData);
}
