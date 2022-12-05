package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WriteDescriptorSetAccelerationStructureNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkWriteDescriptorSetAccelerationStructureNV";
    
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
     * Allocate a new {@link WriteDescriptorSetAccelerationStructureNV}
     * @return A new, uninitialized @{link WriteDescriptorSetAccelerationStructureNV}
     */
    public static WriteDescriptorSetAccelerationStructureNV allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        WriteDescriptorSetAccelerationStructureNV newInstance = new WriteDescriptorSetAccelerationStructureNV(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a WriteDescriptorSetAccelerationStructureNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WriteDescriptorSetAccelerationStructureNV(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
