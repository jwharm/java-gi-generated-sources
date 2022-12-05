package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AggregatorPadPrivate extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAggregatorPadPrivate";
    
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
     * Allocate a new {@link AggregatorPadPrivate}
     * @return A new, uninitialized @{link AggregatorPadPrivate}
     */
    public static AggregatorPadPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AggregatorPadPrivate newInstance = new AggregatorPadPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AggregatorPadPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AggregatorPadPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
