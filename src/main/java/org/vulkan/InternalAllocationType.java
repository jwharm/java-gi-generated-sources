package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class InternalAllocationType extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkInternalAllocationType";
    
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
     * Allocate a new {@link InternalAllocationType}
     * @return A new, uninitialized @{link InternalAllocationType}
     */
    public static InternalAllocationType allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        InternalAllocationType newInstance = new InternalAllocationType(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a InternalAllocationType proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected InternalAllocationType(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InternalAllocationType> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InternalAllocationType(input);
}
