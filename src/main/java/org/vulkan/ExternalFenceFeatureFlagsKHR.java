package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ExternalFenceFeatureFlagsKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkExternalFenceFeatureFlagsKHR";
    
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
     * Allocate a new {@link ExternalFenceFeatureFlagsKHR}
     * @return A new, uninitialized @{link ExternalFenceFeatureFlagsKHR}
     */
    public static ExternalFenceFeatureFlagsKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ExternalFenceFeatureFlagsKHR newInstance = new ExternalFenceFeatureFlagsKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ExternalFenceFeatureFlagsKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ExternalFenceFeatureFlagsKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ExternalFenceFeatureFlagsKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ExternalFenceFeatureFlagsKHR(input);
}
