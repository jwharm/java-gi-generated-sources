package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MemoryHostPointerPropertiesEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkMemoryHostPointerPropertiesEXT";
    
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
     * Allocate a new {@link MemoryHostPointerPropertiesEXT}
     * @return A new, uninitialized @{link MemoryHostPointerPropertiesEXT}
     */
    public static MemoryHostPointerPropertiesEXT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MemoryHostPointerPropertiesEXT newInstance = new MemoryHostPointerPropertiesEXT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MemoryHostPointerPropertiesEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MemoryHostPointerPropertiesEXT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MemoryHostPointerPropertiesEXT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MemoryHostPointerPropertiesEXT(input);
}
