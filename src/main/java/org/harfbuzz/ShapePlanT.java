package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding a shaping plan.
 * <p>
 * Shape plans contain information about how HarfBuzz will shape a
 * particular text segment, based on the segment's properties and the
 * capabilities in the font face in use.
 * <p>
 * Shape plans can be queried about how shaping will perform, given a set
 * of specific input parameters (script, language, direction, features,
 * etc.).
 */
public class ShapePlanT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_shape_plan_t";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ShapePlanT}
     * @return A new, uninitialized @{link ShapePlanT}
     */
    public static ShapePlanT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ShapePlanT newInstance = new ShapePlanT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ShapePlanT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ShapePlanT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShapePlanT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ShapePlanT(input);
}
