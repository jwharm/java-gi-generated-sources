package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphContourPointFuncT {

        void onFontGetGlyphContourPointFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, int pointIndex, PositionT x, PositionT y);
}
