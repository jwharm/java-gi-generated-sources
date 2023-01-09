package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DescriptorSetLayoutCreateInfo extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkDescriptorSetLayoutCreateInfo";
    
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
     * Allocate a new {@link DescriptorSetLayoutCreateInfo}
     * @return A new, uninitialized @{link DescriptorSetLayoutCreateInfo}
     */
    public static DescriptorSetLayoutCreateInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DescriptorSetLayoutCreateInfo newInstance = new DescriptorSetLayoutCreateInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DescriptorSetLayoutCreateInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DescriptorSetLayoutCreateInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DescriptorSetLayoutCreateInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DescriptorSetLayoutCreateInfo(input);
}
