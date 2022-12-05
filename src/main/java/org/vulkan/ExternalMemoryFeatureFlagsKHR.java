package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ExternalMemoryFeatureFlagsKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkExternalMemoryFeatureFlagsKHR";
    
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
     * Allocate a new {@link ExternalMemoryFeatureFlagsKHR}
     * @return A new, uninitialized @{link ExternalMemoryFeatureFlagsKHR}
     */
    public static ExternalMemoryFeatureFlagsKHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ExternalMemoryFeatureFlagsKHR newInstance = new ExternalMemoryFeatureFlagsKHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ExternalMemoryFeatureFlagsKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ExternalMemoryFeatureFlagsKHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
