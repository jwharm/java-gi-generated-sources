package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DeviceEventTypeEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDeviceEventTypeEXT";
    
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
     * Allocate a new {@link DeviceEventTypeEXT}
     * @return A new, uninitialized @{link DeviceEventTypeEXT}
     */
    public static DeviceEventTypeEXT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DeviceEventTypeEXT newInstance = new DeviceEventTypeEXT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DeviceEventTypeEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DeviceEventTypeEXT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DeviceEventTypeEXT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DeviceEventTypeEXT(input, ownership);
}