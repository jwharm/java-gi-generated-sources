package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ImagePlaneMemoryRequirementsInfoKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkImagePlaneMemoryRequirementsInfoKHR";
    
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
     * Allocate a new {@link ImagePlaneMemoryRequirementsInfoKHR}
     * @return A new, uninitialized @{link ImagePlaneMemoryRequirementsInfoKHR}
     */
    public static ImagePlaneMemoryRequirementsInfoKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ImagePlaneMemoryRequirementsInfoKHR newInstance = new ImagePlaneMemoryRequirementsInfoKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ImagePlaneMemoryRequirementsInfoKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ImagePlaneMemoryRequirementsInfoKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ImagePlaneMemoryRequirementsInfoKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ImagePlaneMemoryRequirementsInfoKHR(input);
}
