package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ImageMemoryBarrier extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkImageMemoryBarrier";
    
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
     * Allocate a new {@link ImageMemoryBarrier}
     * @return A new, uninitialized @{link ImageMemoryBarrier}
     */
    public static ImageMemoryBarrier allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ImageMemoryBarrier newInstance = new ImageMemoryBarrier(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ImageMemoryBarrier proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ImageMemoryBarrier(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
