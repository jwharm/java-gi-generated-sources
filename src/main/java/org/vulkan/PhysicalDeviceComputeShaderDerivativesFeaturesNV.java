package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDeviceComputeShaderDerivativesFeaturesNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDeviceComputeShaderDerivativesFeaturesNV";
    
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
     * Allocate a new {@link PhysicalDeviceComputeShaderDerivativesFeaturesNV}
     * @return A new, uninitialized @{link PhysicalDeviceComputeShaderDerivativesFeaturesNV}
     */
    public static PhysicalDeviceComputeShaderDerivativesFeaturesNV allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PhysicalDeviceComputeShaderDerivativesFeaturesNV newInstance = new PhysicalDeviceComputeShaderDerivativesFeaturesNV(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDeviceComputeShaderDerivativesFeaturesNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PhysicalDeviceComputeShaderDerivativesFeaturesNV(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
