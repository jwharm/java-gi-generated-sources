package org.harfbuzz;

@FunctionalInterface
public interface FontGetNominalGlyphsFuncT {

        void onFontGetNominalGlyphsFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, int count, CodepointT firstUnicode, int unicodeStride, CodepointT firstGlyph, int glyphStride);
}
