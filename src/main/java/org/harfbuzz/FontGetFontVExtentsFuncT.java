package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the extents for a font, for vertical-direction
 * text segments. Extents must be returned in an {@code hb_glyph_extents} output
 * parameter.
 */
public interface FontGetFontVExtentsFuncT extends org.harfbuzz.FontGetFontExtentsFuncT {
}
