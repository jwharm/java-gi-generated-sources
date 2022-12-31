package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DrawIndexedIndirectCommand extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDrawIndexedIndirectCommand";
    
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
     * Allocate a new {@link DrawIndexedIndirectCommand}
     * @return A new, uninitialized @{link DrawIndexedIndirectCommand}
     */
    public static DrawIndexedIndirectCommand allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DrawIndexedIndirectCommand newInstance = new DrawIndexedIndirectCommand(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DrawIndexedIndirectCommand proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DrawIndexedIndirectCommand(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DrawIndexedIndirectCommand> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DrawIndexedIndirectCommand(input, ownership);
}
