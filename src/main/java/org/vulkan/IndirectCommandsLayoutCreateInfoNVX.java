package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class IndirectCommandsLayoutCreateInfoNVX extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkIndirectCommandsLayoutCreateInfoNVX";
    
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
     * Allocate a new {@link IndirectCommandsLayoutCreateInfoNVX}
     * @return A new, uninitialized @{link IndirectCommandsLayoutCreateInfoNVX}
     */
    public static IndirectCommandsLayoutCreateInfoNVX allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        IndirectCommandsLayoutCreateInfoNVX newInstance = new IndirectCommandsLayoutCreateInfoNVX(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IndirectCommandsLayoutCreateInfoNVX proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected IndirectCommandsLayoutCreateInfoNVX(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IndirectCommandsLayoutCreateInfoNVX> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IndirectCommandsLayoutCreateInfoNVX(input);
}
