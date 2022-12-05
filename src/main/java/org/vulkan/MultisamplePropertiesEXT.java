package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MultisamplePropertiesEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkMultisamplePropertiesEXT";
    
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
     * Allocate a new {@link MultisamplePropertiesEXT}
     * @return A new, uninitialized @{link MultisamplePropertiesEXT}
     */
    public static MultisamplePropertiesEXT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MultisamplePropertiesEXT newInstance = new MultisamplePropertiesEXT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MultisamplePropertiesEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MultisamplePropertiesEXT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
