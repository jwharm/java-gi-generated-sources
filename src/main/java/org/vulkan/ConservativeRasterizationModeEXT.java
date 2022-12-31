package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ConservativeRasterizationModeEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkConservativeRasterizationModeEXT";
    
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
     * Allocate a new {@link ConservativeRasterizationModeEXT}
     * @return A new, uninitialized @{link ConservativeRasterizationModeEXT}
     */
    public static ConservativeRasterizationModeEXT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ConservativeRasterizationModeEXT newInstance = new ConservativeRasterizationModeEXT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ConservativeRasterizationModeEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ConservativeRasterizationModeEXT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ConservativeRasterizationModeEXT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ConservativeRasterizationModeEXT(input, ownership);
}