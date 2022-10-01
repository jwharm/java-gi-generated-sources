package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrFloat} structure is used to represent attributes with
 * a float or double value.
 */
public class AttrFloat extends io.github.jwharm.javagi.ResourceBase {

    public AttrFloat(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public AttrFloat() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoAttrFloat.allocate(Interop.getAllocator()).address()));
    }
    
}
