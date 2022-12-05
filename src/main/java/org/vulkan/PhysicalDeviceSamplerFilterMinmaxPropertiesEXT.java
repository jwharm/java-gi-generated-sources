package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDeviceSamplerFilterMinmaxPropertiesEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT";
    
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
     * Allocate a new {@link PhysicalDeviceSamplerFilterMinmaxPropertiesEXT}
     * @return A new, uninitialized @{link PhysicalDeviceSamplerFilterMinmaxPropertiesEXT}
     */
    public static PhysicalDeviceSamplerFilterMinmaxPropertiesEXT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PhysicalDeviceSamplerFilterMinmaxPropertiesEXT newInstance = new PhysicalDeviceSamplerFilterMinmaxPropertiesEXT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDeviceSamplerFilterMinmaxPropertiesEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PhysicalDeviceSamplerFilterMinmaxPropertiesEXT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
