package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphKerningFuncT {

        void onFontGetGlyphKerningFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT firstGlyph, CodepointT secondGlyph);
}
