package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrFloat} structure is used to represent attributes with
 * a float or double value.
 */
public class AttrFloat extends io.github.jwharm.javagi.ResourceBase {

    public AttrFloat(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public AttrFloat() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoAttrFloat.allocate(Interop.getAllocator()).address()));
    }
    
}
