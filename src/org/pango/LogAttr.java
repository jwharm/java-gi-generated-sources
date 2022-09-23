package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoLogAttr} structure stores information about the attributes of a
 * single character.
 */
public class LogAttr extends io.github.jwharm.javagi.ResourceBase {

    public LogAttr(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public LogAttr() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoLogAttr.allocate(Interop.getAllocator()).address()));
    }
    
}
