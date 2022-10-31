package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the advance for a specified glyph, in
 * horizontal-direction text segments. Advances must be returned in
 * an {@link PositionT} output parameter.
 */
public interface FontGetGlyphHAdvanceFuncT extends org.harfbuzz.FontGetGlyphAdvanceFuncT {
}
