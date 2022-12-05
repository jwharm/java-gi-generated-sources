package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MemoryOverallocationBehaviorAMD extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkMemoryOverallocationBehaviorAMD";
    
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
     * Allocate a new {@link MemoryOverallocationBehaviorAMD}
     * @return A new, uninitialized @{link MemoryOverallocationBehaviorAMD}
     */
    public static MemoryOverallocationBehaviorAMD allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MemoryOverallocationBehaviorAMD newInstance = new MemoryOverallocationBehaviorAMD(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MemoryOverallocationBehaviorAMD proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MemoryOverallocationBehaviorAMD(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
