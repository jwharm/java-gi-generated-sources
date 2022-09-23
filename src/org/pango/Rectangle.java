package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoRectangle} structure represents a rectangle.
 * <p>
 * {@code PangoRectangle} is frequently used to represent the logical or ink
 * extents of a single glyph or section of text. (See, for instance,
 * {@link Font#getGlyphExtents}.)
 */
public class Rectangle extends io.github.jwharm.javagi.ResourceBase {

    public Rectangle(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public Rectangle() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoRectangle.allocate(Interop.getAllocator()).address()));
    }
    
}
