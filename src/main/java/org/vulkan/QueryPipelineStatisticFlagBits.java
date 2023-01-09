package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class QueryPipelineStatisticFlagBits extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkQueryPipelineStatisticFlagBits";
    
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
     * Allocate a new {@link QueryPipelineStatisticFlagBits}
     * @return A new, uninitialized @{link QueryPipelineStatisticFlagBits}
     */
    public static QueryPipelineStatisticFlagBits allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        QueryPipelineStatisticFlagBits newInstance = new QueryPipelineStatisticFlagBits(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a QueryPipelineStatisticFlagBits proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected QueryPipelineStatisticFlagBits(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, QueryPipelineStatisticFlagBits> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new QueryPipelineStatisticFlagBits(input);
}
