package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDevicePushDescriptorPropertiesKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDevicePushDescriptorPropertiesKHR";
    
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
     * Allocate a new {@link PhysicalDevicePushDescriptorPropertiesKHR}
     * @return A new, uninitialized @{link PhysicalDevicePushDescriptorPropertiesKHR}
     */
    public static PhysicalDevicePushDescriptorPropertiesKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PhysicalDevicePushDescriptorPropertiesKHR newInstance = new PhysicalDevicePushDescriptorPropertiesKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDevicePushDescriptorPropertiesKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PhysicalDevicePushDescriptorPropertiesKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysicalDevicePushDescriptorPropertiesKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PhysicalDevicePushDescriptorPropertiesKHR(input);
}
