package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PeerMemoryFeatureFlagBitsKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPeerMemoryFeatureFlagBitsKHR";
    
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
     * Allocate a new {@link PeerMemoryFeatureFlagBitsKHR}
     * @return A new, uninitialized @{link PeerMemoryFeatureFlagBitsKHR}
     */
    public static PeerMemoryFeatureFlagBitsKHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PeerMemoryFeatureFlagBitsKHR newInstance = new PeerMemoryFeatureFlagBitsKHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PeerMemoryFeatureFlagBitsKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PeerMemoryFeatureFlagBitsKHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PeerMemoryFeatureFlagBitsKHR> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PeerMemoryFeatureFlagBitsKHR(input, ownership);
}
