package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CompositeAlphaFlagsKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkCompositeAlphaFlagsKHR";
    
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
     * Allocate a new {@link CompositeAlphaFlagsKHR}
     * @return A new, uninitialized @{link CompositeAlphaFlagsKHR}
     */
    public static CompositeAlphaFlagsKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CompositeAlphaFlagsKHR newInstance = new CompositeAlphaFlagsKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CompositeAlphaFlagsKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CompositeAlphaFlagsKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CompositeAlphaFlagsKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CompositeAlphaFlagsKHR(input);
}
