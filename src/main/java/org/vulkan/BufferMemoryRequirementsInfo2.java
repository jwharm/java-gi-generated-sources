package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class BufferMemoryRequirementsInfo2 extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkBufferMemoryRequirementsInfo2";
    
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
     * Allocate a new {@link BufferMemoryRequirementsInfo2}
     * @return A new, uninitialized @{link BufferMemoryRequirementsInfo2}
     */
    public static BufferMemoryRequirementsInfo2 allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BufferMemoryRequirementsInfo2 newInstance = new BufferMemoryRequirementsInfo2(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BufferMemoryRequirementsInfo2 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BufferMemoryRequirementsInfo2(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
