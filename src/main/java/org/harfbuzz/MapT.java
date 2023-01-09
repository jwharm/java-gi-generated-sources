package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding integer-to-integer hash maps.
 */
public class MapT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_map_t";
    
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
     * Allocate a new {@link MapT}
     * @return A new, uninitialized @{link MapT}
     */
    public static MapT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MapT newInstance = new MapT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MapT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MapT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MapT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MapT(input);
}
