package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Current drawing state.
 */
public class DrawStateT extends io.github.jwharm.javagi.ResourceBase {

    public DrawStateT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DrawStateT() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.hb_draw_state_t.allocate(Interop.getAllocator()).address()));
    }
    
}
