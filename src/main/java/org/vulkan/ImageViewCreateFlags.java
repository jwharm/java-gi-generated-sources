package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ImageViewCreateFlags extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkImageViewCreateFlags";
    
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
     * Allocate a new {@link ImageViewCreateFlags}
     * @return A new, uninitialized @{link ImageViewCreateFlags}
     */
    public static ImageViewCreateFlags allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ImageViewCreateFlags newInstance = new ImageViewCreateFlags(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ImageViewCreateFlags proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ImageViewCreateFlags(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ImageViewCreateFlags> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ImageViewCreateFlags(input);
}
