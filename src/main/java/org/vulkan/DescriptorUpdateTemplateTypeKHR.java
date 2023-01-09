package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DescriptorUpdateTemplateTypeKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDescriptorUpdateTemplateTypeKHR";
    
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
     * Allocate a new {@link DescriptorUpdateTemplateTypeKHR}
     * @return A new, uninitialized @{link DescriptorUpdateTemplateTypeKHR}
     */
    public static DescriptorUpdateTemplateTypeKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DescriptorUpdateTemplateTypeKHR newInstance = new DescriptorUpdateTemplateTypeKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DescriptorUpdateTemplateTypeKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DescriptorUpdateTemplateTypeKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DescriptorUpdateTemplateTypeKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DescriptorUpdateTemplateTypeKHR(input);
}
