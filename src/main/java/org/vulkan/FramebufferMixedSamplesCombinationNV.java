package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FramebufferMixedSamplesCombinationNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkFramebufferMixedSamplesCombinationNV";
    
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
     * Allocate a new {@link FramebufferMixedSamplesCombinationNV}
     * @return A new, uninitialized @{link FramebufferMixedSamplesCombinationNV}
     */
    public static FramebufferMixedSamplesCombinationNV allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FramebufferMixedSamplesCombinationNV newInstance = new FramebufferMixedSamplesCombinationNV(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FramebufferMixedSamplesCombinationNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FramebufferMixedSamplesCombinationNV(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FramebufferMixedSamplesCombinationNV> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FramebufferMixedSamplesCombinationNV(input, ownership);
}
