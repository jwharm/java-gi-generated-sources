package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDevice8BitStorageFeaturesKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDevice8BitStorageFeaturesKHR";
    
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
     * Allocate a new {@link PhysicalDevice8BitStorageFeaturesKHR}
     * @return A new, uninitialized @{link PhysicalDevice8BitStorageFeaturesKHR}
     */
    public static PhysicalDevice8BitStorageFeaturesKHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PhysicalDevice8BitStorageFeaturesKHR newInstance = new PhysicalDevice8BitStorageFeaturesKHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDevice8BitStorageFeaturesKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PhysicalDevice8BitStorageFeaturesKHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysicalDevice8BitStorageFeaturesKHR> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PhysicalDevice8BitStorageFeaturesKHR(input, ownership);
}
