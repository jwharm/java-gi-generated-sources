package org.harfbuzz;

@FunctionalInterface
public interface FontGetFontExtentsFuncT {

    /**
     * This method should retrieve the extents for a font.
     */
    public BoolT onFontGetFontExtentsFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, FontExtentsT extents, jdk.incubator.foreign.MemoryAddress userData);
}
