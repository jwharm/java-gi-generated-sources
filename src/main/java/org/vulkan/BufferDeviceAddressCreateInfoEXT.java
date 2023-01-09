package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class BufferDeviceAddressCreateInfoEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkBufferDeviceAddressCreateInfoEXT";
    
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
     * Allocate a new {@link BufferDeviceAddressCreateInfoEXT}
     * @return A new, uninitialized @{link BufferDeviceAddressCreateInfoEXT}
     */
    public static BufferDeviceAddressCreateInfoEXT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BufferDeviceAddressCreateInfoEXT newInstance = new BufferDeviceAddressCreateInfoEXT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BufferDeviceAddressCreateInfoEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BufferDeviceAddressCreateInfoEXT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BufferDeviceAddressCreateInfoEXT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BufferDeviceAddressCreateInfoEXT(input);
}
