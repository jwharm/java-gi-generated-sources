package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ExternalMemoryImageCreateInfoNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkExternalMemoryImageCreateInfoNV";
    
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
     * Allocate a new {@link ExternalMemoryImageCreateInfoNV}
     * @return A new, uninitialized @{link ExternalMemoryImageCreateInfoNV}
     */
    public static ExternalMemoryImageCreateInfoNV allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ExternalMemoryImageCreateInfoNV newInstance = new ExternalMemoryImageCreateInfoNV(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ExternalMemoryImageCreateInfoNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ExternalMemoryImageCreateInfoNV(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ExternalMemoryImageCreateInfoNV> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ExternalMemoryImageCreateInfoNV(input);
}
