package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The shadow parameters in a shadow node.
 */
public class Shadow extends io.github.jwharm.javagi.ResourceBase {

    public Shadow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public Shadow() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GskShadow.allocate(Interop.getAllocator()).address()));
    }
    
}
