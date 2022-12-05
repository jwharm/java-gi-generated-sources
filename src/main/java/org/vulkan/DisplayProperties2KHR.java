package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DisplayProperties2KHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDisplayProperties2KHR";
    
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
     * Allocate a new {@link DisplayProperties2KHR}
     * @return A new, uninitialized @{link DisplayProperties2KHR}
     */
    public static DisplayProperties2KHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DisplayProperties2KHR newInstance = new DisplayProperties2KHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DisplayProperties2KHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DisplayProperties2KHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
