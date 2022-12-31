package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CoverageModulationModeNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkCoverageModulationModeNV";
    
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
     * Allocate a new {@link CoverageModulationModeNV}
     * @return A new, uninitialized @{link CoverageModulationModeNV}
     */
    public static CoverageModulationModeNV allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CoverageModulationModeNV newInstance = new CoverageModulationModeNV(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CoverageModulationModeNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CoverageModulationModeNV(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CoverageModulationModeNV> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CoverageModulationModeNV(input, ownership);
}
