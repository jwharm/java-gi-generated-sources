package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class BufferCreateInfo extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkBufferCreateInfo";
    
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
     * Allocate a new {@link BufferCreateInfo}
     * @return A new, uninitialized @{link BufferCreateInfo}
     */
    public static BufferCreateInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BufferCreateInfo newInstance = new BufferCreateInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BufferCreateInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BufferCreateInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BufferCreateInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BufferCreateInfo(input, ownership);
}
