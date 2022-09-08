package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class NglRenderer extends Renderer {

    public NglRenderer(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NglRenderer */
    public static NglRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new NglRenderer(gobject.getReference());
    }
    
}
