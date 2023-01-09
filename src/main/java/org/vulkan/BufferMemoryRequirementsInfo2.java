package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class BufferMemoryRequirementsInfo2 extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkBufferMemoryRequirementsInfo2";
    
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
     * Allocate a new {@link BufferMemoryRequirementsInfo2}
     * @return A new, uninitialized @{link BufferMemoryRequirementsInfo2}
     */
    public static BufferMemoryRequirementsInfo2 allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BufferMemoryRequirementsInfo2 newInstance = new BufferMemoryRequirementsInfo2(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BufferMemoryRequirementsInfo2 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BufferMemoryRequirementsInfo2(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BufferMemoryRequirementsInfo2> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BufferMemoryRequirementsInfo2(input);
}
