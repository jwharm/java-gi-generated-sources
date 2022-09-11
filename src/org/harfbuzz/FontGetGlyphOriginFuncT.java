package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphOriginFuncT {

        void onFontGetGlyphOriginFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, PositionT x, PositionT y);
}
