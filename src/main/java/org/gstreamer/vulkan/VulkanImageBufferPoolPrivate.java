package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanImageBufferPoolPrivate extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanImageBufferPoolPrivate";
    
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
     * Allocate a new {@link VulkanImageBufferPoolPrivate}
     * @return A new, uninitialized @{link VulkanImageBufferPoolPrivate}
     */
    public static VulkanImageBufferPoolPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VulkanImageBufferPoolPrivate newInstance = new VulkanImageBufferPoolPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VulkanImageBufferPoolPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanImageBufferPoolPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanImageBufferPoolPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanImageBufferPoolPrivate(input);
}
