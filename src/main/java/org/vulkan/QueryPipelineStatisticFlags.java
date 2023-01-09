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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        QueryPipelineStatisticFlags newInstance = new QueryPipelineStatisticFlags(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a QueryPipelineStatisticFlags proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected QueryPipelineStatisticFlags(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, QueryPipelineStatisticFlags> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new QueryPipelineStatisticFlags(input);
}
