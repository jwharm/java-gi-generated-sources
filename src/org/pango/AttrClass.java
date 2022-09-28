package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrClass} structure stores the type and operations for
 * a particular type of attribute.
 * <p>
 * The functions in this structure should not be called directly. Instead,
 * one should use the wrapper functions provided for {@code PangoAttribute}.
 */
public class AttrClass extends io.github.jwharm.javagi.ResourceBase {

    public AttrClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public AttrClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoAttrClass.allocate(Interop.getAllocator()).address()));
    }
    
}
