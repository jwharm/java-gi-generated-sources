package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDeviceDiscardRectanglePropertiesEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDeviceDiscardRectanglePropertiesEXT";
    
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
     * Allocate a new {@link PhysicalDeviceDiscardRectanglePropertiesEXT}
     * @return A new, uninitialized @{link PhysicalDeviceDiscardRectanglePropertiesEXT}
     */
    public static PhysicalDeviceDiscardRectanglePropertiesEXT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PhysicalDeviceDiscardRectanglePropertiesEXT newInstance = new PhysicalDeviceDiscardRectanglePropertiesEXT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDeviceDiscardRectanglePropertiesEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PhysicalDeviceDiscardRectanglePropertiesEXT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysicalDeviceDiscardRectanglePropertiesEXT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PhysicalDeviceDiscardRectanglePropertiesEXT(input);
}
