package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A location in a parse buffer.
 */
public class ParseLocation extends io.github.jwharm.javagi.ResourceBase {

    public ParseLocation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ParseLocation() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GskParseLocation.allocate(Interop.getAllocator()).address()));
    }
    
}
