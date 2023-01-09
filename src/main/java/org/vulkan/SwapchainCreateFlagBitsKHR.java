package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SwapchainCreateFlagBitsKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSwapchainCreateFlagBitsKHR";
    
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
     * Allocate a new {@link SwapchainCreateFlagBitsKHR}
     * @return A new, uninitialized @{link SwapchainCreateFlagBitsKHR}
     */
    public static SwapchainCreateFlagBitsKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SwapchainCreateFlagBitsKHR newInstance = new SwapchainCreateFlagBitsKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SwapchainCreateFlagBitsKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SwapchainCreateFlagBitsKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SwapchainCreateFlagBitsKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SwapchainCreateFlagBitsKHR(input);
}
