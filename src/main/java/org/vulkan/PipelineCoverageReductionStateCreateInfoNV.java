package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PipelineCoverageReductionStateCreateInfoNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPipelineCoverageReductionStateCreateInfoNV";
    
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
     * Allocate a new {@link PipelineCoverageReductionStateCreateInfoNV}
     * @return A new, uninitialized @{link PipelineCoverageReductionStateCreateInfoNV}
     */
    public static PipelineCoverageReductionStateCreateInfoNV allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PipelineCoverageReductionStateCreateInfoNV newInstance = new PipelineCoverageReductionStateCreateInfoNV(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PipelineCoverageReductionStateCreateInfoNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PipelineCoverageReductionStateCreateInfoNV(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PipelineCoverageReductionStateCreateInfoNV> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PipelineCoverageReductionStateCreateInfoNV(input);
}
