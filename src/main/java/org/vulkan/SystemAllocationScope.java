package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SystemAllocationScope extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSystemAllocationScope";
    
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
     * Allocate a new {@link SystemAllocationScope}
     * @return A new, uninitialized @{link SystemAllocationScope}
     */
    public static SystemAllocationScope allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SystemAllocationScope newInstance = new SystemAllocationScope(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SystemAllocationScope proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SystemAllocationScope(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SystemAllocationScope> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SystemAllocationScope(input, ownership);
}
