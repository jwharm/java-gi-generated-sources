package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ImageMemoryRequirementsInfo2KHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkImageMemoryRequirementsInfo2KHR";
    
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
     * Allocate a new {@link ImageMemoryRequirementsInfo2KHR}
     * @return A new, uninitialized @{link ImageMemoryRequirementsInfo2KHR}
     */
    public static ImageMemoryRequirementsInfo2KHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ImageMemoryRequirementsInfo2KHR newInstance = new ImageMemoryRequirementsInfo2KHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ImageMemoryRequirementsInfo2KHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ImageMemoryRequirementsInfo2KHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ImageMemoryRequirementsInfo2KHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ImageMemoryRequirementsInfo2KHR(input);
}
