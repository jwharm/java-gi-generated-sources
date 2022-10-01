package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Font-wide extent values, measured in font units.
 * <p>
 * Note that typically {@code ascender} is positive and {@code descender}
 * negative, in coordinate systems that grow up.
 */
public class FontExtentsT extends io.github.jwharm.javagi.ResourceBase {

    public FontExtentsT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FontExtentsT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_font_extents_t.allocate(Interop.getAllocator()).address()));
    }
    
}
