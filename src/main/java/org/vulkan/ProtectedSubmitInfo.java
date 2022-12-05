package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ProtectedSubmitInfo extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkProtectedSubmitInfo";
    
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
     * Allocate a new {@link ProtectedSubmitInfo}
     * @return A new, uninitialized @{link ProtectedSubmitInfo}
     */
    public static ProtectedSubmitInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ProtectedSubmitInfo newInstance = new ProtectedSubmitInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ProtectedSubmitInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ProtectedSubmitInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
