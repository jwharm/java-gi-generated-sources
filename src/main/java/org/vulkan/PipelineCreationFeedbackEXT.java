package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PipelineCreationFeedbackEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPipelineCreationFeedbackEXT";
    
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
     * Allocate a new {@link PipelineCreationFeedbackEXT}
     * @return A new, uninitialized @{link PipelineCreationFeedbackEXT}
     */
    public static PipelineCreationFeedbackEXT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PipelineCreationFeedbackEXT newInstance = new PipelineCreationFeedbackEXT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PipelineCreationFeedbackEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PipelineCreationFeedbackEXT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PipelineCreationFeedbackEXT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PipelineCreationFeedbackEXT(input);
}
