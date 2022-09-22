package org.harfbuzz;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 */
@FunctionalInterface
public interface FontGetGlyphShapeFuncT {
        void onFontGetGlyphShapeFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, CodepointT glyph, DrawFuncsT drawFuncs, java.lang.foreign.MemoryAddress drawData, java.lang.foreign.MemoryAddress userData);
}
