package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DebugMarkerMarkerInfoEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDebugMarkerMarkerInfoEXT";
    
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
     * Allocate a new {@link DebugMarkerMarkerInfoEXT}
     * @return A new, uninitialized @{link DebugMarkerMarkerInfoEXT}
     */
    public static DebugMarkerMarkerInfoEXT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DebugMarkerMarkerInfoEXT newInstance = new DebugMarkerMarkerInfoEXT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DebugMarkerMarkerInfoEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DebugMarkerMarkerInfoEXT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DebugMarkerMarkerInfoEXT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DebugMarkerMarkerInfoEXT(input);
}
