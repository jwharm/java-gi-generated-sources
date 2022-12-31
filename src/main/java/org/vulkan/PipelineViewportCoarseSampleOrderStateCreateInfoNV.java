package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PipelineViewportCoarseSampleOrderStateCreateInfoNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPipelineViewportCoarseSampleOrderStateCreateInfoNV";
    
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
     * Allocate a new {@link PipelineViewportCoarseSampleOrderStateCreateInfoNV}
     * @return A new, uninitialized @{link PipelineViewportCoarseSampleOrderStateCreateInfoNV}
     */
    public static PipelineViewportCoarseSampleOrderStateCreateInfoNV allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PipelineViewportCoarseSampleOrderStateCreateInfoNV newInstance = new PipelineViewportCoarseSampleOrderStateCreateInfoNV(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PipelineViewportCoarseSampleOrderStateCreateInfoNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PipelineViewportCoarseSampleOrderStateCreateInfoNV(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PipelineViewportCoarseSampleOrderStateCreateInfoNV> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PipelineViewportCoarseSampleOrderStateCreateInfoNV(input, ownership);
}
