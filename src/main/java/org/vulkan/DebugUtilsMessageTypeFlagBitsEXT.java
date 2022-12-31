package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DebugUtilsMessageTypeFlagBitsEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDebugUtilsMessageTypeFlagBitsEXT";
    
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
     * Allocate a new {@link DebugUtilsMessageTypeFlagBitsEXT}
     * @return A new, uninitialized @{link DebugUtilsMessageTypeFlagBitsEXT}
     */
    public static DebugUtilsMessageTypeFlagBitsEXT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DebugUtilsMessageTypeFlagBitsEXT newInstance = new DebugUtilsMessageTypeFlagBitsEXT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DebugUtilsMessageTypeFlagBitsEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DebugUtilsMessageTypeFlagBitsEXT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DebugUtilsMessageTypeFlagBitsEXT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DebugUtilsMessageTypeFlagBitsEXT(input, ownership);
}
