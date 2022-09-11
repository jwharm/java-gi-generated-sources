package org.harfbuzz;

@FunctionalInterface
public interface FontGetFontExtentsFuncT {

        void onFontGetFontExtentsFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, FontExtentsT extents);
}
