package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A virtual method for the {@link org.harfbuzz.font_funcs_t} of an {@link org.harfbuzz.font_t} object.
 * 
 * This method should retrieve the (X,Y) coordinates (in font units) of the
 * origin for a glyph, for horizontal-direction text segments. Each
 * coordinate must be returned in an {@link org.harfbuzz.position_t} output parameter.
 */
public interface FontGetGlyphHOriginFuncT extends FontGetGlyphOriginFuncT {

}
