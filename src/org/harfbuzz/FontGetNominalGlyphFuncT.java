package org.harfbuzz;

@FunctionalInterface
public interface FontGetNominalGlyphFuncT {

        void onFontGetNominalGlyphFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT unicode, CodepointT glyph);
}
