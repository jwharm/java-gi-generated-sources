package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CompositeAlphaFlagBitsKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkCompositeAlphaFlagBitsKHR";
    
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
     * Allocate a new {@link CompositeAlphaFlagBitsKHR}
     * @return A new, uninitialized @{link CompositeAlphaFlagBitsKHR}
     */
    public static CompositeAlphaFlagBitsKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CompositeAlphaFlagBitsKHR newInstance = new CompositeAlphaFlagBitsKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CompositeAlphaFlagBitsKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CompositeAlphaFlagBitsKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CompositeAlphaFlagBitsKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CompositeAlphaFlagBitsKHR(input);
}
