package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDeviceSparseImageFormatInfo2 extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDeviceSparseImageFormatInfo2";
    
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
     * Allocate a new {@link PhysicalDeviceSparseImageFormatInfo2}
     * @return A new, uninitialized @{link PhysicalDeviceSparseImageFormatInfo2}
     */
    public static PhysicalDeviceSparseImageFormatInfo2 allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PhysicalDeviceSparseImageFormatInfo2 newInstance = new PhysicalDeviceSparseImageFormatInfo2(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDeviceSparseImageFormatInfo2 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PhysicalDeviceSparseImageFormatInfo2(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysicalDeviceSparseImageFormatInfo2> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PhysicalDeviceSparseImageFormatInfo2(input, ownership);
}
