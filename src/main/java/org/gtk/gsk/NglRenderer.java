package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class NglRenderer extends Renderer {

    public NglRenderer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NglRenderer */
    public static NglRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new NglRenderer(gobject.refcounted());
    }
    
}
