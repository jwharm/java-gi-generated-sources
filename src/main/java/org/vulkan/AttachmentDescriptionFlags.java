package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AttachmentDescriptionFlags extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkAttachmentDescriptionFlags";
    
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
     * Allocate a new {@link AttachmentDescriptionFlags}
     * @return A new, uninitialized @{link AttachmentDescriptionFlags}
     */
    public static AttachmentDescriptionFlags allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttachmentDescriptionFlags newInstance = new AttachmentDescriptionFlags(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AttachmentDescriptionFlags proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AttachmentDescriptionFlags(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AttachmentDescriptionFlags> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AttachmentDescriptionFlags(input, ownership);
}
