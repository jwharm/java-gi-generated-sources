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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ShapePlanT newInstance = new ShapePlanT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ShapePlanT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShapePlanT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ShapePlanT struct;
        
         /**
         * A {@link ShapePlanT.Build} object constructs a {@link ShapePlanT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ShapePlanT.allocate();
        }
        
         /**
         * Finish building the {@link ShapePlanT} struct.
         * @return A new instance of {@code ShapePlanT} with the fields 
         *         that were set in the Build object.
         */
        public ShapePlanT construct() {
            return struct;
        }
    }
}
