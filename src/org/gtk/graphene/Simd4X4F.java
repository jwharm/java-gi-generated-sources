package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class Simd4X4F extends io.github.jwharm.javagi.ResourceBase {

    public Simd4X4F(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public Simd4X4F() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.graphene_simd4x4f_t.allocate(Interop.getAllocator()).address()));
    }
    
}
