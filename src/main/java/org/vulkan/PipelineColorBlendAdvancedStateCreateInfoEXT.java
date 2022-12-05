package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PipelineColorBlendAdvancedStateCreateInfoEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPipelineColorBlendAdvancedStateCreateInfoEXT";
    
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
     * Allocate a new {@link PipelineColorBlendAdvancedStateCreateInfoEXT}
     * @return A new, uninitialized @{link PipelineColorBlendAdvancedStateCreateInfoEXT}
     */
    public static PipelineColorBlendAdvancedStateCreateInfoEXT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PipelineColorBlendAdvancedStateCreateInfoEXT newInstance = new PipelineColorBlendAdvancedStateCreateInfoEXT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PipelineColorBlendAdvancedStateCreateInfoEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PipelineColorBlendAdvancedStateCreateInfoEXT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
