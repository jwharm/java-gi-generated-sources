package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PresentTimeGOOGLE extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPresentTimeGOOGLE";
    
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
     * Allocate a new {@link PresentTimeGOOGLE}
     * @return A new, uninitialized @{link PresentTimeGOOGLE}
     */
    public static PresentTimeGOOGLE allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PresentTimeGOOGLE newInstance = new PresentTimeGOOGLE(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PresentTimeGOOGLE proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PresentTimeGOOGLE(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PresentTimeGOOGLE> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PresentTimeGOOGLE(input, ownership);
}
