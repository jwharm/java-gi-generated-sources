package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class BindImageMemoryDeviceGroupInfo extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkBindImageMemoryDeviceGroupInfo";
    
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
     * Allocate a new {@link BindImageMemoryDeviceGroupInfo}
     * @return A new, uninitialized @{link BindImageMemoryDeviceGroupInfo}
     */
    public static BindImageMemoryDeviceGroupInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BindImageMemoryDeviceGroupInfo newInstance = new BindImageMemoryDeviceGroupInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BindImageMemoryDeviceGroupInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BindImageMemoryDeviceGroupInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BindImageMemoryDeviceGroupInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BindImageMemoryDeviceGroupInfo(input);
}
