package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 */
@FunctionalInterface
public interface FontGetGlyphShapeFuncT {
        void onFontGetGlyphShapeFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull CodepointT glyph, @NotNull DrawFuncsT drawFuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @Nullable java.lang.foreign.MemoryAddress userData);
}
