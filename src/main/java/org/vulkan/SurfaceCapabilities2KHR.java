package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SurfaceCapabilities2KHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSurfaceCapabilities2KHR";
    
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
     * Allocate a new {@link SurfaceCapabilities2KHR}
     * @return A new, uninitialized @{link SurfaceCapabilities2KHR}
     */
    public static SurfaceCapabilities2KHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SurfaceCapabilities2KHR newInstance = new SurfaceCapabilities2KHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SurfaceCapabilities2KHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SurfaceCapabilities2KHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SurfaceCapabilities2KHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SurfaceCapabilities2KHR(input);
}
