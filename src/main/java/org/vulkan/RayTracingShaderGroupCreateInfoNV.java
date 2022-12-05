package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RayTracingShaderGroupCreateInfoNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkRayTracingShaderGroupCreateInfoNV";
    
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
     * Allocate a new {@link RayTracingShaderGroupCreateInfoNV}
     * @return A new, uninitialized @{link RayTracingShaderGroupCreateInfoNV}
     */
    public static RayTracingShaderGroupCreateInfoNV allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RayTracingShaderGroupCreateInfoNV newInstance = new RayTracingShaderGroupCreateInfoNV(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RayTracingShaderGroupCreateInfoNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RayTracingShaderGroupCreateInfoNV(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
