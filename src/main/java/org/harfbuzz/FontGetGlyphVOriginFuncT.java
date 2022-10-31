package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the (X,Y) coordinates (in font units) of the
 * origin for a glyph, for vertical-direction text segments. Each coordinate
 * must be returned in an {@link PositionT} output parameter.
 */
public interface FontGetGlyphVOriginFuncT extends org.harfbuzz.FontGetGlyphOriginFuncT {
}
