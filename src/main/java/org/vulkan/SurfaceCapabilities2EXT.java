package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SurfaceCapabilities2EXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSurfaceCapabilities2EXT";
    
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
     * Allocate a new {@link SurfaceCapabilities2EXT}
     * @return A new, uninitialized @{link SurfaceCapabilities2EXT}
     */
    public static SurfaceCapabilities2EXT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SurfaceCapabilities2EXT newInstance = new SurfaceCapabilities2EXT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SurfaceCapabilities2EXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SurfaceCapabilities2EXT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SurfaceCapabilities2EXT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SurfaceCapabilities2EXT(input);
}
