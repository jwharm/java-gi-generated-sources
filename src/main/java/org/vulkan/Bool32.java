package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Bool32 extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkBool32";
    
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
     * Allocate a new {@link Bool32}
     * @return A new, uninitialized @{link Bool32}
     */
    public static Bool32 allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Bool32 newInstance = new Bool32(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Bool32 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Bool32(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Bool32> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Bool32(input);
}
