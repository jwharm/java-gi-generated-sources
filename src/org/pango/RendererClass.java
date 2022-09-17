package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for <code>PangoRenderer</code>.
 * 
 * The following vfuncs take user space coordinates in Pango units
 * and have default implementations:
 * - draw_glyphs
 * - draw_rectangle
 * - draw_error_underline
 * - draw_shape
 * - draw_glyph_item
 * 
 * The default draw_shape implementation draws nothing.
 * 
 * The following vfuncs take device space coordinates as doubles
 * and must be implemented:
 * - draw_trapezoid
 * - draw_glyph
 */
public class RendererClass extends io.github.jwharm.javagi.ResourceBase {

    public RendererClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
