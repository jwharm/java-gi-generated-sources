package org.cairographics;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class Matrix extends io.github.jwharm.javagi.ResourceBase {

    public Matrix(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public Matrix() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.cairo_matrix_t.allocate(Interop.getAllocator()).address()));
    }
    
}
