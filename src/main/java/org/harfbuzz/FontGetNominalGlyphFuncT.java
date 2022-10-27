package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the nominal glyph ID for a specified Unicode code
 * point. Glyph IDs must be returned in a {@link CodepointT} output parameter.
 */
@FunctionalInterface
public interface FontGetNominalGlyphFuncT {
        org.harfbuzz.BoolT onFontGetNominalGlyphFuncT(@NotNull org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull org.harfbuzz.CodepointT unicode, @NotNull Out<org.harfbuzz.CodepointT> glyph, @Nullable java.lang.foreign.MemoryAddress userData);
}
