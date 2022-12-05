package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ValidationFlagsEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkValidationFlagsEXT";
    
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
     * Allocate a new {@link ValidationFlagsEXT}
     * @return A new, uninitialized @{link ValidationFlagsEXT}
     */
    public static ValidationFlagsEXT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ValidationFlagsEXT newInstance = new ValidationFlagsEXT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ValidationFlagsEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ValidationFlagsEXT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
