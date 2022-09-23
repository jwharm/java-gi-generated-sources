package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Pairs of glyph and color index.
 */
public class OtColorLayerT extends io.github.jwharm.javagi.ResourceBase {

    public OtColorLayerT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public OtColorLayerT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_ot_color_layer_t.allocate(Interop.getAllocator()).address()));
    }
    
}
