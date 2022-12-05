package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class BindImagePlaneMemoryInfoKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkBindImagePlaneMemoryInfoKHR";
    
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
     * Allocate a new {@link BindImagePlaneMemoryInfoKHR}
     * @return A new, uninitialized @{link BindImagePlaneMemoryInfoKHR}
     */
    public static BindImagePlaneMemoryInfoKHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BindImagePlaneMemoryInfoKHR newInstance = new BindImagePlaneMemoryInfoKHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BindImagePlaneMemoryInfoKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BindImagePlaneMemoryInfoKHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
