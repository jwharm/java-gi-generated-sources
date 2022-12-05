package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class QueryPipelineStatisticFlags extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkQueryPipelineStatisticFlags";
    
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
     * Allocate a new {@link QueryPipelineStatisticFlags}
     * @return A new, uninitialized @{link QueryPipelineStatisticFlags}
     */
    public static QueryPipelineStatisticFlags allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        QueryPipelineStatisticFlags newInstance = new QueryPipelineStatisticFlags(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a QueryPipelineStatisticFlags proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public QueryPipelineStatisticFlags(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
