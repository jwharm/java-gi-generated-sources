package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the extents for a specified glyph. Extents must be
 * returned in an {@code hb_glyph_extents} output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphExtentsFuncT {
        org.harfbuzz.BoolT onFontGetGlyphExtentsFuncT(@NotNull org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull org.harfbuzz.CodepointT glyph, @NotNull Out<org.harfbuzz.GlyphExtentsT> extents, @Nullable java.lang.foreign.MemoryAddress userData);
}
