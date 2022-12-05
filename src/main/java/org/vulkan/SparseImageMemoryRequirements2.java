package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SparseImageMemoryRequirements2 extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSparseImageMemoryRequirements2";
    
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
     * Allocate a new {@link SparseImageMemoryRequirements2}
     * @return A new, uninitialized @{link SparseImageMemoryRequirements2}
     */
    public static SparseImageMemoryRequirements2 allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SparseImageMemoryRequirements2 newInstance = new SparseImageMemoryRequirements2(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SparseImageMemoryRequirements2 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SparseImageMemoryRequirements2(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
