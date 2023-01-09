package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ImageSparseMemoryRequirementsInfo2KHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkImageSparseMemoryRequirementsInfo2KHR";
    
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
     * Allocate a new {@link ImageSparseMemoryRequirementsInfo2KHR}
     * @return A new, uninitialized @{link ImageSparseMemoryRequirementsInfo2KHR}
     */
    public static ImageSparseMemoryRequirementsInfo2KHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ImageSparseMemoryRequirementsInfo2KHR newInstance = new ImageSparseMemoryRequirementsInfo2KHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ImageSparseMemoryRequirementsInfo2KHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ImageSparseMemoryRequirementsInfo2KHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ImageSparseMemoryRequirementsInfo2KHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ImageSparseMemoryRequirementsInfo2KHR(input);
}
