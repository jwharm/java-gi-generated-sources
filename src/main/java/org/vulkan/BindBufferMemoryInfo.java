package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class BindBufferMemoryInfo extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkBindBufferMemoryInfo";
    
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
     * Allocate a new {@link BindBufferMemoryInfo}
     * @return A new, uninitialized @{link BindBufferMemoryInfo}
     */
    public static BindBufferMemoryInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BindBufferMemoryInfo newInstance = new BindBufferMemoryInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BindBufferMemoryInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BindBufferMemoryInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BindBufferMemoryInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BindBufferMemoryInfo(input);
}
