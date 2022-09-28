package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@code PangoRenderer}.
 * <p>
 * The following vfuncs take user space coordinates in Pango units
 * and have default implementations:
 * <ul>
 * <li>draw_glyphs
 * <li>draw_rectangle
 * <li>draw_error_underline
 * <li>draw_shape
 * <li>draw_glyph_item
 * </ul>
 * <p>
 * The default draw_shape implementation draws nothing.
 * <p>
 * The following vfuncs take device space coordinates as doubles
 * and must be implemented:
 * <ul>
 * <li>draw_trapezoid
 * <li>draw_glyph
 */
public class RendererClass extends io.github.jwharm.javagi.ResourceBase {

    public RendererClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public RendererClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoRendererClass.allocate(Interop.getAllocator()).address()));
    }
    
}
