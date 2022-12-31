package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VertexInputBindingDescription extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkVertexInputBindingDescription";
    
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
     * Allocate a new {@link VertexInputBindingDescription}
     * @return A new, uninitialized @{link VertexInputBindingDescription}
     */
    public static VertexInputBindingDescription allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VertexInputBindingDescription newInstance = new VertexInputBindingDescription(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VertexInputBindingDescription proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VertexInputBindingDescription(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VertexInputBindingDescription> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VertexInputBindingDescription(input, ownership);
}
