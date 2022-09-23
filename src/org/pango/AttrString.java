package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoAttrString} structure is used to represent attributes with
 * a string value.
 */
public class AttrString extends io.github.jwharm.javagi.ResourceBase {

    public AttrString(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public AttrString() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoAttrString.allocate(Interop.getAllocator()).address()));
    }
    
}
