package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PipelineCoverageToColorStateCreateFlagsNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPipelineCoverageToColorStateCreateFlagsNV";
    
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
     * Allocate a new {@link PipelineCoverageToColorStateCreateFlagsNV}
     * @return A new, uninitialized @{link PipelineCoverageToColorStateCreateFlagsNV}
     */
    public static PipelineCoverageToColorStateCreateFlagsNV allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PipelineCoverageToColorStateCreateFlagsNV newInstance = new PipelineCoverageToColorStateCreateFlagsNV(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PipelineCoverageToColorStateCreateFlagsNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PipelineCoverageToColorStateCreateFlagsNV(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PipelineCoverageToColorStateCreateFlagsNV> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PipelineCoverageToColorStateCreateFlagsNV(input, ownership);
}
