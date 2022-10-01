package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrColor} structure is used to represent attributes that
 * are colors.
 */
public class AttrColor extends io.github.jwharm.javagi.ResourceBase {

    public AttrColor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public AttrColor() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.PangoAttrColor.allocate(Interop.getAllocator()).address()));
    }
    
}
