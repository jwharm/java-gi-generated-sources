package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphAdvancesFuncT {

        void onFontGetGlyphAdvancesFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, int count, CodepointT firstGlyph, int glyphStride, PositionT firstAdvance, int advanceStride);
}
