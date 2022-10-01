package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link glyph_position_t} is the structure that holds the positions of the
 * glyph in both horizontal and vertical directions. All positions in
 * {@link glyph_position_t} are relative to the current point.
 */
public class GlyphPositionT extends io.github.jwharm.javagi.ResourceBase {

    public GlyphPositionT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public GlyphPositionT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_glyph_position_t.allocate(Interop.getAllocator()).address()));
    }
    
}
