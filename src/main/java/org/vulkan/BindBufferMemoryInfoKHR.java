package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class BindBufferMemoryInfoKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkBindBufferMemoryInfoKHR";
    
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
     * Allocate a new {@link BindBufferMemoryInfoKHR}
     * @return A new, uninitialized @{link BindBufferMemoryInfoKHR}
     */
    public static BindBufferMemoryInfoKHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BindBufferMemoryInfoKHR newInstance = new BindBufferMemoryInfoKHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BindBufferMemoryInfoKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BindBufferMemoryInfoKHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BindBufferMemoryInfoKHR> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BindBufferMemoryInfoKHR(input, ownership);
}
