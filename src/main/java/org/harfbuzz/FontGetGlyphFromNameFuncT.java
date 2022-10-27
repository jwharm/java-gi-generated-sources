package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the glyph ID that corresponds to a glyph-name
 * string.
 */
@FunctionalInterface
public interface FontGetGlyphFromNameFuncT {
        org.harfbuzz.BoolT onFontGetGlyphFromNameFuncT(@NotNull org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, PointerString name, int len, @NotNull Out<org.harfbuzz.CodepointT> glyph, @Nullable java.lang.foreign.MemoryAddress userData);
}
