package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AttachmentSampleLocationsEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkAttachmentSampleLocationsEXT";
    
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
     * Allocate a new {@link AttachmentSampleLocationsEXT}
     * @return A new, uninitialized @{link AttachmentSampleLocationsEXT}
     */
    public static AttachmentSampleLocationsEXT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttachmentSampleLocationsEXT newInstance = new AttachmentSampleLocationsEXT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AttachmentSampleLocationsEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AttachmentSampleLocationsEXT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
