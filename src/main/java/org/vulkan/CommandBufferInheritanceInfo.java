package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CommandBufferInheritanceInfo extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkCommandBufferInheritanceInfo";
    
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
     * Allocate a new {@link CommandBufferInheritanceInfo}
     * @return A new, uninitialized @{link CommandBufferInheritanceInfo}
     */
    public static CommandBufferInheritanceInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CommandBufferInheritanceInfo newInstance = new CommandBufferInheritanceInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CommandBufferInheritanceInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CommandBufferInheritanceInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CommandBufferInheritanceInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CommandBufferInheritanceInfo(input);
}
