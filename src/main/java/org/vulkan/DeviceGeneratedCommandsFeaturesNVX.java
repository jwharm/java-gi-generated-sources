package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DeviceGeneratedCommandsFeaturesNVX extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDeviceGeneratedCommandsFeaturesNVX";
    
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
     * Allocate a new {@link DeviceGeneratedCommandsFeaturesNVX}
     * @return A new, uninitialized @{link DeviceGeneratedCommandsFeaturesNVX}
     */
    public static DeviceGeneratedCommandsFeaturesNVX allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DeviceGeneratedCommandsFeaturesNVX newInstance = new DeviceGeneratedCommandsFeaturesNVX(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DeviceGeneratedCommandsFeaturesNVX proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DeviceGeneratedCommandsFeaturesNVX(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DeviceGeneratedCommandsFeaturesNVX> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DeviceGeneratedCommandsFeaturesNVX(input);
}
