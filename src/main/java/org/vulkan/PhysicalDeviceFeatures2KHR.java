package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDeviceFeatures2KHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDeviceFeatures2KHR";
    
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
     * Allocate a new {@link PhysicalDeviceFeatures2KHR}
     * @return A new, uninitialized @{link PhysicalDeviceFeatures2KHR}
     */
    public static PhysicalDeviceFeatures2KHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PhysicalDeviceFeatures2KHR newInstance = new PhysicalDeviceFeatures2KHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDeviceFeatures2KHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PhysicalDeviceFeatures2KHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysicalDeviceFeatures2KHR> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PhysicalDeviceFeatures2KHR(input, ownership);
}