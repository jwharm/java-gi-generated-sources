package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SubgroupFeatureFlags extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSubgroupFeatureFlags";
    
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
     * Allocate a new {@link SubgroupFeatureFlags}
     * @return A new, uninitialized @{link SubgroupFeatureFlags}
     */
    public static SubgroupFeatureFlags allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SubgroupFeatureFlags newInstance = new SubgroupFeatureFlags(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SubgroupFeatureFlags proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SubgroupFeatureFlags(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SubgroupFeatureFlags> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SubgroupFeatureFlags(input);
}
