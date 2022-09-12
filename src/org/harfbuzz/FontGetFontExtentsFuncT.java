package org.harfbuzz;

/**
 * This method should retrieve the extents for a font.
 */
@FunctionalInterface
public interface FontGetFontExtentsFuncT {
        BoolT onFontGetFontExtentsFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, FontExtentsT extents, jdk.incubator.foreign.MemoryAddress userData);
}
