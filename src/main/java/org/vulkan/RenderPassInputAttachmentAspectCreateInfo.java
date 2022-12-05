package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RenderPassInputAttachmentAspectCreateInfo extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkRenderPassInputAttachmentAspectCreateInfo";
    
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
     * Allocate a new {@link RenderPassInputAttachmentAspectCreateInfo}
     * @return A new, uninitialized @{link RenderPassInputAttachmentAspectCreateInfo}
     */
    public static RenderPassInputAttachmentAspectCreateInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RenderPassInputAttachmentAspectCreateInfo newInstance = new RenderPassInputAttachmentAspectCreateInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RenderPassInputAttachmentAspectCreateInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RenderPassInputAttachmentAspectCreateInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
