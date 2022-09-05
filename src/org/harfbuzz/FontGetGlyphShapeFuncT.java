package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphShapeFuncT {

    /**
     * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
     */
    public void onFontGetGlyphShapeFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, DrawFuncsT drawFuncs, jdk.incubator.foreign.MemoryAddress drawData, jdk.incubator.foreign.MemoryAddress userData);
}
