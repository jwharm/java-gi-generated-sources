package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DescriptorUpdateTemplateCreateInfoKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDescriptorUpdateTemplateCreateInfoKHR";
    
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
     * Allocate a new {@link DescriptorUpdateTemplateCreateInfoKHR}
     * @return A new, uninitialized @{link DescriptorUpdateTemplateCreateInfoKHR}
     */
    public static DescriptorUpdateTemplateCreateInfoKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DescriptorUpdateTemplateCreateInfoKHR newInstance = new DescriptorUpdateTemplateCreateInfoKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DescriptorUpdateTemplateCreateInfoKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DescriptorUpdateTemplateCreateInfoKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DescriptorUpdateTemplateCreateInfoKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DescriptorUpdateTemplateCreateInfoKHR(input);
}
