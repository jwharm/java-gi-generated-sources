package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PipelineCoverageModulationStateCreateFlagsNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPipelineCoverageModulationStateCreateFlagsNV";
    
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
     * Allocate a new {@link PipelineCoverageModulationStateCreateFlagsNV}
     * @return A new, uninitialized @{link PipelineCoverageModulationStateCreateFlagsNV}
     */
    public static PipelineCoverageModulationStateCreateFlagsNV allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PipelineCoverageModulationStateCreateFlagsNV newInstance = new PipelineCoverageModulationStateCreateFlagsNV(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PipelineCoverageModulationStateCreateFlagsNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PipelineCoverageModulationStateCreateFlagsNV(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PipelineCoverageModulationStateCreateFlagsNV> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PipelineCoverageModulationStateCreateFlagsNV(input);
}
