package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class IndirectCommandsTokenNVX extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkIndirectCommandsTokenNVX";
    
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
     * Allocate a new {@link IndirectCommandsTokenNVX}
     * @return A new, uninitialized @{link IndirectCommandsTokenNVX}
     */
    public static IndirectCommandsTokenNVX allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IndirectCommandsTokenNVX newInstance = new IndirectCommandsTokenNVX(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IndirectCommandsTokenNVX proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected IndirectCommandsTokenNVX(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, IndirectCommandsTokenNVX> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new IndirectCommandsTokenNVX(input, ownership);
}
