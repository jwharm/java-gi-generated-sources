package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RenderPassCreateInfo2KHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkRenderPassCreateInfo2KHR";
    
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
     * Allocate a new {@link RenderPassCreateInfo2KHR}
     * @return A new, uninitialized @{link RenderPassCreateInfo2KHR}
     */
    public static RenderPassCreateInfo2KHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RenderPassCreateInfo2KHR newInstance = new RenderPassCreateInfo2KHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RenderPassCreateInfo2KHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RenderPassCreateInfo2KHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RenderPassCreateInfo2KHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RenderPassCreateInfo2KHR(input);
}
