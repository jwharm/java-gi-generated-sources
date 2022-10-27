package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the advances for a sequence of glyphs.
 */
@FunctionalInterface
public interface FontGetGlyphAdvancesFuncT {
        void onFontGetGlyphAdvancesFuncT(@NotNull org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, int count, @NotNull org.harfbuzz.CodepointT firstGlyph, int glyphStride, @NotNull Out<org.harfbuzz.PositionT> firstAdvance, int advanceStride, @Nullable java.lang.foreign.MemoryAddress userData);
}
