package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SparseImageMemoryRequirements2KHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSparseImageMemoryRequirements2KHR";
    
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
     * Allocate a new {@link SparseImageMemoryRequirements2KHR}
     * @return A new, uninitialized @{link SparseImageMemoryRequirements2KHR}
     */
    public static SparseImageMemoryRequirements2KHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SparseImageMemoryRequirements2KHR newInstance = new SparseImageMemoryRequirements2KHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SparseImageMemoryRequirements2KHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SparseImageMemoryRequirements2KHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SparseImageMemoryRequirements2KHR> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SparseImageMemoryRequirements2KHR(input, ownership);
}
