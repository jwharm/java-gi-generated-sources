package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDeviceSurfaceInfo2KHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDeviceSurfaceInfo2KHR";
    
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
     * Allocate a new {@link PhysicalDeviceSurfaceInfo2KHR}
     * @return A new, uninitialized @{link PhysicalDeviceSurfaceInfo2KHR}
     */
    public static PhysicalDeviceSurfaceInfo2KHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PhysicalDeviceSurfaceInfo2KHR newInstance = new PhysicalDeviceSurfaceInfo2KHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDeviceSurfaceInfo2KHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PhysicalDeviceSurfaceInfo2KHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
