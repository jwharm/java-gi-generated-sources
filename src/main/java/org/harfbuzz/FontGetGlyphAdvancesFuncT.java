package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the advances for a sequence of glyphs.
 */
@FunctionalInterface
public interface FontGetGlyphAdvancesFuncT {
        void onFontGetGlyphAdvancesFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull int count, @NotNull CodepointT firstGlyph, @NotNull int glyphStride, @NotNull Out<PositionT> firstAdvance, @NotNull int advanceStride, @Nullable java.lang.foreign.MemoryAddress userData);
}
