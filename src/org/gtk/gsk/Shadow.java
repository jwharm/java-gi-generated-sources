package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The shadow parameters in a shadow node.
 */
public class Shadow extends io.github.jwharm.javagi.ResourceBase {

    public Shadow(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public Shadow() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GskShadow.allocate(Interop.getAllocator()).address()));
    }
    
}
