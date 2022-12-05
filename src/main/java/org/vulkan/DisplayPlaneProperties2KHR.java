package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DisplayPlaneProperties2KHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDisplayPlaneProperties2KHR";
    
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
     * Allocate a new {@link DisplayPlaneProperties2KHR}
     * @return A new, uninitialized @{link DisplayPlaneProperties2KHR}
     */
    public static DisplayPlaneProperties2KHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DisplayPlaneProperties2KHR newInstance = new DisplayPlaneProperties2KHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DisplayPlaneProperties2KHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DisplayPlaneProperties2KHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
