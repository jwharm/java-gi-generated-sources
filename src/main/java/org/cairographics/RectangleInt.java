package org.cairographics;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class RectangleInt extends io.github.jwharm.javagi.ResourceBase {

    public RectangleInt(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public RectangleInt() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.cairo_rectangle_int_t.allocate(Interop.getAllocator()).address()));
    }
    
}
