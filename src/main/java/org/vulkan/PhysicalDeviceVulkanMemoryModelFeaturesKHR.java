package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDeviceVulkanMemoryModelFeaturesKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDeviceVulkanMemoryModelFeaturesKHR";
    
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
     * Allocate a new {@link PhysicalDeviceVulkanMemoryModelFeaturesKHR}
     * @return A new, uninitialized @{link PhysicalDeviceVulkanMemoryModelFeaturesKHR}
     */
    public static PhysicalDeviceVulkanMemoryModelFeaturesKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PhysicalDeviceVulkanMemoryModelFeaturesKHR newInstance = new PhysicalDeviceVulkanMemoryModelFeaturesKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDeviceVulkanMemoryModelFeaturesKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PhysicalDeviceVulkanMemoryModelFeaturesKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysicalDeviceVulkanMemoryModelFeaturesKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PhysicalDeviceVulkanMemoryModelFeaturesKHR(input);
}
