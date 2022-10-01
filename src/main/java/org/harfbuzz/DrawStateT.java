package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Current drawing state.
 */
public class DrawStateT extends io.github.jwharm.javagi.ResourceBase {

    public DrawStateT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public DrawStateT() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.hb_draw_state_t.allocate(Interop.getAllocator()).address()));
    }
    
}
