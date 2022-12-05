package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DebugMarkerObjectNameInfoEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDebugMarkerObjectNameInfoEXT";
    
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
     * Allocate a new {@link DebugMarkerObjectNameInfoEXT}
     * @return A new, uninitialized @{link DebugMarkerObjectNameInfoEXT}
     */
    public static DebugMarkerObjectNameInfoEXT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DebugMarkerObjectNameInfoEXT newInstance = new DebugMarkerObjectNameInfoEXT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DebugMarkerObjectNameInfoEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DebugMarkerObjectNameInfoEXT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
