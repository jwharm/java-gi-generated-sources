package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the extents for a specified glyph. Extents must be
 * returned in an {@code hb_glyph_extents} output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphExtentsFuncT {
        BoolT onFontGetGlyphExtentsFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull CodepointT glyph, @NotNull Out<GlyphExtentsT> extents, @Nullable java.lang.foreign.MemoryAddress userData);
}
