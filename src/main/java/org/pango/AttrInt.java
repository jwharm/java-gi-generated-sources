package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrInt} structure is used to represent attributes with
 * an integer or enumeration value.
 */
public class AttrInt extends io.github.jwharm.javagi.ResourceBase {

    public AttrInt(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public AttrInt() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoAttrInt.allocate(Interop.getAllocator()).address()));
    }
    
}
