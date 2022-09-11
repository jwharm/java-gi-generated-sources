package org.harfbuzz;

@FunctionalInterface
public interface FontGetVariationGlyphFuncT {

        void onFontGetVariationGlyphFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT unicode, CodepointT variationSelector, CodepointT glyph);
}
