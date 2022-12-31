package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GeometryInstanceFlagsNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkGeometryInstanceFlagsNV";
    
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
     * Allocate a new {@link GeometryInstanceFlagsNV}
     * @return A new, uninitialized @{link GeometryInstanceFlagsNV}
     */
    public static GeometryInstanceFlagsNV allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GeometryInstanceFlagsNV newInstance = new GeometryInstanceFlagsNV(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a GeometryInstanceFlagsNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GeometryInstanceFlagsNV(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GeometryInstanceFlagsNV> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GeometryInstanceFlagsNV(input, ownership);
}
