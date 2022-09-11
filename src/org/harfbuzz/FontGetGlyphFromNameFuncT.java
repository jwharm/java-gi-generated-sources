package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphFromNameFuncT {

        void onFontGetGlyphFromNameFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, java.lang.String[] name, int len, CodepointT glyph);
}
