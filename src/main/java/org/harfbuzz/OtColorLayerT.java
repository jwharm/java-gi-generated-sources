package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Pairs of glyph and color index.
 */
public class OtColorLayerT extends io.github.jwharm.javagi.ResourceBase {

    public OtColorLayerT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public OtColorLayerT() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.hb_ot_color_layer_t.allocate(Interop.getAllocator()).address()));
    }
    
}
