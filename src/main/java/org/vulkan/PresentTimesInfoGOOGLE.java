package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PresentTimesInfoGOOGLE extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPresentTimesInfoGOOGLE";
    
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
     * Allocate a new {@link PresentTimesInfoGOOGLE}
     * @return A new, uninitialized @{link PresentTimesInfoGOOGLE}
     */
    public static PresentTimesInfoGOOGLE allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PresentTimesInfoGOOGLE newInstance = new PresentTimesInfoGOOGLE(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PresentTimesInfoGOOGLE proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PresentTimesInfoGOOGLE(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PresentTimesInfoGOOGLE> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PresentTimesInfoGOOGLE(input);
}
