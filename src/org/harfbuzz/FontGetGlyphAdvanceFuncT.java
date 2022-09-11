package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphAdvanceFuncT {

        void onFontGetGlyphAdvanceFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph);
}
