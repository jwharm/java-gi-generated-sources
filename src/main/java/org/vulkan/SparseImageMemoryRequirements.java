package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SparseImageMemoryRequirements extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSparseImageMemoryRequirements";
    
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
     * Allocate a new {@link SparseImageMemoryRequirements}
     * @return A new, uninitialized @{link SparseImageMemoryRequirements}
     */
    public static SparseImageMemoryRequirements allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SparseImageMemoryRequirements newInstance = new SparseImageMemoryRequirements(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SparseImageMemoryRequirements proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SparseImageMemoryRequirements(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SparseImageMemoryRequirements> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SparseImageMemoryRequirements(input);
}
