package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ImageDrmFormatModifierExplicitCreateInfoEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkImageDrmFormatModifierExplicitCreateInfoEXT";
    
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
     * Allocate a new {@link ImageDrmFormatModifierExplicitCreateInfoEXT}
     * @return A new, uninitialized @{link ImageDrmFormatModifierExplicitCreateInfoEXT}
     */
    public static ImageDrmFormatModifierExplicitCreateInfoEXT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ImageDrmFormatModifierExplicitCreateInfoEXT newInstance = new ImageDrmFormatModifierExplicitCreateInfoEXT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ImageDrmFormatModifierExplicitCreateInfoEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ImageDrmFormatModifierExplicitCreateInfoEXT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ImageDrmFormatModifierExplicitCreateInfoEXT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ImageDrmFormatModifierExplicitCreateInfoEXT(input);
}
