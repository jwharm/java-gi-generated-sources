package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the extents for a specified glyph. Extents must be
 * returned in an {@code hb_glyph_extents} output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphExtentsFuncT {
        BoolT onFontGetGlyphExtentsFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, CodepointT glyph, GlyphExtentsT extents, java.lang.foreign.MemoryAddress userData);
}
