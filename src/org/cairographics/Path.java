package org.cairographics;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class Path extends io.github.jwharm.javagi.ResourceBase {

    public Path(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public Path() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.cairo_path_t.allocate(Interop.getAllocator()).address()));
    }
    
}
