package org.harfbuzz;

/**
 * This method should retrieve the extents for a font.
 */
@FunctionalInterface
public interface FontGetFontExtentsFuncT {
        BoolT onFontGetFontExtentsFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, FontExtentsT extents, java.lang.foreign.MemoryAddress userData);
}
