package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DisplayPresentInfoKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDisplayPresentInfoKHR";
    
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
     * Allocate a new {@link DisplayPresentInfoKHR}
     * @return A new, uninitialized @{link DisplayPresentInfoKHR}
     */
    public static DisplayPresentInfoKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DisplayPresentInfoKHR newInstance = new DisplayPresentInfoKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DisplayPresentInfoKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DisplayPresentInfoKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DisplayPresentInfoKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DisplayPresentInfoKHR(input);
}
