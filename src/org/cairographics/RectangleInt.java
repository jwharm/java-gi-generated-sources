package org.cairographics;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class RectangleInt extends io.github.jwharm.javagi.ResourceBase {

    public RectangleInt(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public RectangleInt() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.cairo_rectangle_int_t.allocate(Interop.getAllocator()).address()));
    }
    
}
