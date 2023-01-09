package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SemaphoreImportFlagBitsKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSemaphoreImportFlagBitsKHR";
    
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
     * Allocate a new {@link SemaphoreImportFlagBitsKHR}
     * @return A new, uninitialized @{link SemaphoreImportFlagBitsKHR}
     */
    public static SemaphoreImportFlagBitsKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SemaphoreImportFlagBitsKHR newInstance = new SemaphoreImportFlagBitsKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SemaphoreImportFlagBitsKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SemaphoreImportFlagBitsKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SemaphoreImportFlagBitsKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SemaphoreImportFlagBitsKHR(input);
}
