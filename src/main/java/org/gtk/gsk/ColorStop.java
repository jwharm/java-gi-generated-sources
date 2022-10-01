package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A color stop in a gradient node.
 */
public class ColorStop extends io.github.jwharm.javagi.ResourceBase {

    public ColorStop(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public ColorStop() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GskColorStop.allocate(Interop.getAllocator()).address()));
    }
    
}
