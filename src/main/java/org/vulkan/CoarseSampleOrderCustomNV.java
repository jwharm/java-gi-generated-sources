package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CoarseSampleOrderCustomNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkCoarseSampleOrderCustomNV";
    
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
     * Allocate a new {@link CoarseSampleOrderCustomNV}
     * @return A new, uninitialized @{link CoarseSampleOrderCustomNV}
     */
    public static CoarseSampleOrderCustomNV allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CoarseSampleOrderCustomNV newInstance = new CoarseSampleOrderCustomNV(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CoarseSampleOrderCustomNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CoarseSampleOrderCustomNV(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CoarseSampleOrderCustomNV> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CoarseSampleOrderCustomNV(input);
}
