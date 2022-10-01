package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link glyph_info_t} is the structure that holds information about the
 * glyphs and their relation to input text.
 */
public class GlyphInfoT extends io.github.jwharm.javagi.ResourceBase {

    public GlyphInfoT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public GlyphInfoT() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.hb_glyph_info_t.allocate(Interop.getAllocator()).address()));
    }
    
}
