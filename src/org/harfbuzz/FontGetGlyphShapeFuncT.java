package org.harfbuzz;

/**
 * A virtual method for the {@link org.harfbuzz.font_funcs_t} of an {@link org.harfbuzz.font_t} object.
 */
@FunctionalInterface
public interface FontGetGlyphShapeFuncT {
        void onFontGetGlyphShapeFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, DrawFuncsT drawFuncs, jdk.incubator.foreign.MemoryAddress drawData, jdk.incubator.foreign.MemoryAddress userData);
}
