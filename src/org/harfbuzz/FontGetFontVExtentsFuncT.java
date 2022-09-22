package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the extents for a font, for vertical-direction
 * text segments. Extents must be returned in an {@code hb_glyph_extents} output
 * parameter.
 */
public interface FontGetFontVExtentsFuncT extends FontGetFontExtentsFuncT {

}
