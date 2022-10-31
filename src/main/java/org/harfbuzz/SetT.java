package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding a set of integers. {@link SetT}'s are
 * used to gather and contain glyph IDs, Unicode code
 * points, and various other collections of discrete
 * values.
 */
public class SetT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_set_t";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static SetT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SetT newInstance = new SetT(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public SetT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
