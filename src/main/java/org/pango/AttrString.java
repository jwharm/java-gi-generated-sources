package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrString} structure is used to represent attributes with
 * a string value.
 */
public class AttrString extends io.github.jwharm.javagi.ResourceBase {

    public AttrString(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public AttrString() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoAttrString.allocate(Interop.getAllocator()).address()));
    }
    
}
