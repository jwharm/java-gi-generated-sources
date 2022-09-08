package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for `PangoRenderer`.
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
public class RendererClass extends io.github.jwharm.javagi.interop.ResourceBase {

    public RendererClass(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}
