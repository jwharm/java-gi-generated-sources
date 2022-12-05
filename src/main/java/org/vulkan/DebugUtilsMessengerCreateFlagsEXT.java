package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DebugUtilsMessengerCreateFlagsEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDebugUtilsMessengerCreateFlagsEXT";
    
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
     * Allocate a new {@link DebugUtilsMessengerCreateFlagsEXT}
     * @return A new, uninitialized @{link DebugUtilsMessengerCreateFlagsEXT}
     */
    public static DebugUtilsMessengerCreateFlagsEXT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DebugUtilsMessengerCreateFlagsEXT newInstance = new DebugUtilsMessengerCreateFlagsEXT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DebugUtilsMessengerCreateFlagsEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DebugUtilsMessengerCreateFlagsEXT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
