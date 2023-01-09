package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ImageSparseMemoryRequirementsInfo2 extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkImageSparseMemoryRequirementsInfo2";
    
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
     * Allocate a new {@link ImageSparseMemoryRequirementsInfo2}
     * @return A new, uninitialized @{link ImageSparseMemoryRequirementsInfo2}
     */
    public static ImageSparseMemoryRequirementsInfo2 allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ImageSparseMemoryRequirementsInfo2 newInstance = new ImageSparseMemoryRequirementsInfo2(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ImageSparseMemoryRequirementsInfo2 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ImageSparseMemoryRequirementsInfo2(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ImageSparseMemoryRequirementsInfo2> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ImageSparseMemoryRequirementsInfo2(input);
}
