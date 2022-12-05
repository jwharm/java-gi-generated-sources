package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ResolveModeFlagBitsKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkResolveModeFlagBitsKHR";
    
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
     * Allocate a new {@link ResolveModeFlagBitsKHR}
     * @return A new, uninitialized @{link ResolveModeFlagBitsKHR}
     */
    public static ResolveModeFlagBitsKHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ResolveModeFlagBitsKHR newInstance = new ResolveModeFlagBitsKHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ResolveModeFlagBitsKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ResolveModeFlagBitsKHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
