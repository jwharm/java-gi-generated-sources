package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Glyph extent values, measured in font units.
 * <p>
 * Note that {@code height} is negative, in coordinate systems that grow up.
 */
public class GlyphExtentsT extends io.github.jwharm.javagi.ResourceBase {

    public GlyphExtentsT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public GlyphExtentsT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_glyph_extents_t.allocate(Interop.getAllocator()).address()));
    }
    
}
