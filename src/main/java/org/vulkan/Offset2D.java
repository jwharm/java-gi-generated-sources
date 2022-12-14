package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Offset2D extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkOffset2D";
    
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
     * Allocate a new {@link Offset2D}
     * @return A new, uninitialized @{link Offset2D}
     */
    public static Offset2D allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Offset2D newInstance = new Offset2D(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Offset2D proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Offset2D(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Offset2D> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Offset2D(input);
}
