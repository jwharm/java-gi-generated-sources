package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PipelineViewportShadingRateImageStateCreateInfoNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPipelineViewportShadingRateImageStateCreateInfoNV";
    
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
     * Allocate a new {@link PipelineViewportShadingRateImageStateCreateInfoNV}
     * @return A new, uninitialized @{link PipelineViewportShadingRateImageStateCreateInfoNV}
     */
    public static PipelineViewportShadingRateImageStateCreateInfoNV allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PipelineViewportShadingRateImageStateCreateInfoNV newInstance = new PipelineViewportShadingRateImageStateCreateInfoNV(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PipelineViewportShadingRateImageStateCreateInfoNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PipelineViewportShadingRateImageStateCreateInfoNV(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PipelineViewportShadingRateImageStateCreateInfoNV> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PipelineViewportShadingRateImageStateCreateInfoNV(input);
}
