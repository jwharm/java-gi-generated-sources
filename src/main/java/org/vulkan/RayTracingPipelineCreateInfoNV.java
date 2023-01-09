package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RayTracingPipelineCreateInfoNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkRayTracingPipelineCreateInfoNV";
    
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
     * Allocate a new {@link RayTracingPipelineCreateInfoNV}
     * @return A new, uninitialized @{link RayTracingPipelineCreateInfoNV}
     */
    public static RayTracingPipelineCreateInfoNV allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RayTracingPipelineCreateInfoNV newInstance = new RayTracingPipelineCreateInfoNV(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RayTracingPipelineCreateInfoNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RayTracingPipelineCreateInfoNV(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RayTracingPipelineCreateInfoNV> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RayTracingPipelineCreateInfoNV(input);
}
