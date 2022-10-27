package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Simd4X4F extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("x"),
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("y"),
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("z"),
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("w")
    ).withName("graphene_simd4x4f_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Simd4X4F(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
