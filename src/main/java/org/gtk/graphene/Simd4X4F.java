package org.gtk.graphene;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class Simd4X4F extends io.github.jwharm.javagi.ResourceBase {

    public Simd4X4F(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public Simd4X4F() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.graphene_simd4x4f_t.allocate(Interop.getAllocator()).address()));
    }
    
}
