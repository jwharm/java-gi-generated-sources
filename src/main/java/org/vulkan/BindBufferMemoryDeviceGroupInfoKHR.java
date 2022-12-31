package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class BindBufferMemoryDeviceGroupInfoKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkBindBufferMemoryDeviceGroupInfoKHR";
    
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
     * Allocate a new {@link BindBufferMemoryDeviceGroupInfoKHR}
     * @return A new, uninitialized @{link BindBufferMemoryDeviceGroupInfoKHR}
     */
    public static BindBufferMemoryDeviceGroupInfoKHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BindBufferMemoryDeviceGroupInfoKHR newInstance = new BindBufferMemoryDeviceGroupInfoKHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BindBufferMemoryDeviceGroupInfoKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BindBufferMemoryDeviceGroupInfoKHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BindBufferMemoryDeviceGroupInfoKHR> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BindBufferMemoryDeviceGroupInfoKHR(input, ownership);
}
