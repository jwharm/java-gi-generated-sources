package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Simd4X4F extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_simd4x4f_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("x"),
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("y"),
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("z"),
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("w")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Simd4X4F allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Simd4X4F newInstance = new Simd4X4F(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public Simd4X4F(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
