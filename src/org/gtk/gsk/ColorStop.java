package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A color stop in a gradient node.
 */
public class ColorStop extends io.github.jwharm.javagi.ResourceBase {

    public ColorStop(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ColorStop() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GskColorStop.allocate(Interop.getAllocator()).address()));
    }
    
}
