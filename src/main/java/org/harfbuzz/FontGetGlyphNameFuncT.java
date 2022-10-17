package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the glyph name that corresponds to a
 * glyph ID. The name should be returned in a string output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphNameFuncT {
        BoolT onFontGetGlyphNameFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull CodepointT glyph, @NotNull Out<java.lang.String[]> name, @NotNull Out<Integer> size, @Nullable java.lang.foreign.MemoryAddress userData);
}
