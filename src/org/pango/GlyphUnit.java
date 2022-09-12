package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `PangoGlyphUnit` type is used to store dimensions within
 * Pango.
 * 
 * Dimensions are stored in 1/PANGO_SCALE of a device unit.
 * (A device unit might be a pixel for screen display, or
 * a point on a printer.) PANGO_SCALE is currently 1024, and
 * may change in the future (unlikely though), but you should not
 * depend on its exact value.
 * 
 * The PANGO_PIXELS() macro can be used to convert from glyph units
 * into device units with correct rounding.
 */
public class GlyphUnit {

    private final int value;
    
    public GlyphUnit(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
}
