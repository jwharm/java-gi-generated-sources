package org.harfbuzz;

@FunctionalInterface
public interface FontGetGlyphExtentsFuncT {

        void onFontGetGlyphExtentsFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, GlyphExtentsT extents);
}
