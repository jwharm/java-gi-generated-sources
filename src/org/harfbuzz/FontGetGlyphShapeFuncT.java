package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphShapeFuncT {

        void onFontGetGlyphShapeFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, DrawFuncsT drawFuncs, jdk.incubator.foreign.MemoryAddress drawData);
}
