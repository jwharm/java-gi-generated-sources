package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoGlyphInfo} structure represents a single glyph with
 * positioning information and visual attributes.
 */
public class GlyphInfo extends io.github.jwharm.javagi.ResourceBase {

    public GlyphInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public GlyphInfo() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoGlyphInfo.allocate(Interop.getAllocator()).address()));
    }
    
}
