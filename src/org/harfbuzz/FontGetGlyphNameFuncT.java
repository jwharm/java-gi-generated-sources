package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphNameFuncT {

        void onFontGetGlyphNameFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, java.lang.String[] name, int size);
}
