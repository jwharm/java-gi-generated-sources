package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SemaphoreImportFlags extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSemaphoreImportFlags";
    
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
     * Allocate a new {@link SemaphoreImportFlags}
     * @return A new, uninitialized @{link SemaphoreImportFlags}
     */
    public static SemaphoreImportFlags allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SemaphoreImportFlags newInstance = new SemaphoreImportFlags(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SemaphoreImportFlags proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SemaphoreImportFlags(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SemaphoreImportFlags> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SemaphoreImportFlags(input);
}
