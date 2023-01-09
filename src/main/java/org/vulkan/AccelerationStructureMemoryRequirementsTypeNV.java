package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AccelerationStructureMemoryRequirementsTypeNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkAccelerationStructureMemoryRequirementsTypeNV";
    
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
     * Allocate a new {@link AccelerationStructureMemoryRequirementsTypeNV}
     * @return A new, uninitialized @{link AccelerationStructureMemoryRequirementsTypeNV}
     */
    public static AccelerationStructureMemoryRequirementsTypeNV allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AccelerationStructureMemoryRequirementsTypeNV newInstance = new AccelerationStructureMemoryRequirementsTypeNV(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AccelerationStructureMemoryRequirementsTypeNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AccelerationStructureMemoryRequirementsTypeNV(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AccelerationStructureMemoryRequirementsTypeNV> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AccelerationStructureMemoryRequirementsTypeNV(input);
}
