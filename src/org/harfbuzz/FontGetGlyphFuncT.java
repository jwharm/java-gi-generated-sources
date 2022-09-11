package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphFuncT {

        void onFontGetGlyphFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT unicode, CodepointT variationSelector, CodepointT glyph);
}
