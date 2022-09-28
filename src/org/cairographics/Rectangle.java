package org.cairographics;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class Rectangle extends io.github.jwharm.javagi.ResourceBase {

    public Rectangle(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public Rectangle() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.cairo_rectangle_t.allocate(Interop.getAllocator()).address()));
    }
    
}
