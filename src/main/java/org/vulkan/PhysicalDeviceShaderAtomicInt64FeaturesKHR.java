package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDeviceShaderAtomicInt64FeaturesKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDeviceShaderAtomicInt64FeaturesKHR";
    
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
     * Allocate a new {@link PhysicalDeviceShaderAtomicInt64FeaturesKHR}
     * @return A new, uninitialized @{link PhysicalDeviceShaderAtomicInt64FeaturesKHR}
     */
    public static PhysicalDeviceShaderAtomicInt64FeaturesKHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PhysicalDeviceShaderAtomicInt64FeaturesKHR newInstance = new PhysicalDeviceShaderAtomicInt64FeaturesKHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDeviceShaderAtomicInt64FeaturesKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PhysicalDeviceShaderAtomicInt64FeaturesKHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
