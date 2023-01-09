package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TessellationDomainOriginKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkTessellationDomainOriginKHR";
    
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
     * Allocate a new {@link TessellationDomainOriginKHR}
     * @return A new, uninitialized @{link TessellationDomainOriginKHR}
     */
    public static TessellationDomainOriginKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TessellationDomainOriginKHR newInstance = new TessellationDomainOriginKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TessellationDomainOriginKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TessellationDomainOriginKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TessellationDomainOriginKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TessellationDomainOriginKHR(input);
}
