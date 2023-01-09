package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ExternalBufferPropertiesKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkExternalBufferPropertiesKHR";
    
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
     * Allocate a new {@link ExternalBufferPropertiesKHR}
     * @return A new, uninitialized @{link ExternalBufferPropertiesKHR}
     */
    public static ExternalBufferPropertiesKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ExternalBufferPropertiesKHR newInstance = new ExternalBufferPropertiesKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ExternalBufferPropertiesKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ExternalBufferPropertiesKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ExternalBufferPropertiesKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ExternalBufferPropertiesKHR(input);
}
