package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class InputAttachmentAspectReferenceKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkInputAttachmentAspectReferenceKHR";
    
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
     * Allocate a new {@link InputAttachmentAspectReferenceKHR}
     * @return A new, uninitialized @{link InputAttachmentAspectReferenceKHR}
     */
    public static InputAttachmentAspectReferenceKHR allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InputAttachmentAspectReferenceKHR newInstance = new InputAttachmentAspectReferenceKHR(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a InputAttachmentAspectReferenceKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected InputAttachmentAspectReferenceKHR(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, InputAttachmentAspectReferenceKHR> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new InputAttachmentAspectReferenceKHR(input, ownership);
}
