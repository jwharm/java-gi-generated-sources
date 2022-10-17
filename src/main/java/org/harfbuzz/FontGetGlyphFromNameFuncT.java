package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the glyph ID that corresponds to a glyph-name
 * string.
 */
@FunctionalInterface
public interface FontGetGlyphFromNameFuncT {
        BoolT onFontGetGlyphFromNameFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull PointerString name, @NotNull int len, @NotNull Out<CodepointT> glyph, @Nullable java.lang.foreign.MemoryAddress userData);
}
