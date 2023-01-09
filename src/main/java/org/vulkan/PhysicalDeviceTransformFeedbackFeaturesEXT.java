package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDeviceTransformFeedbackFeaturesEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDeviceTransformFeedbackFeaturesEXT";
    
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
     * Allocate a new {@link PhysicalDeviceTransformFeedbackFeaturesEXT}
     * @return A new, uninitialized @{link PhysicalDeviceTransformFeedbackFeaturesEXT}
     */
    public static PhysicalDeviceTransformFeedbackFeaturesEXT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PhysicalDeviceTransformFeedbackFeaturesEXT newInstance = new PhysicalDeviceTransformFeedbackFeaturesEXT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDeviceTransformFeedbackFeaturesEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PhysicalDeviceTransformFeedbackFeaturesEXT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysicalDeviceTransformFeedbackFeaturesEXT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PhysicalDeviceTransformFeedbackFeaturesEXT(input);
}
