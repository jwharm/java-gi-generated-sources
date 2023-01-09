package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Rect2D extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkRect2D";
    
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
     * Allocate a new {@link Rect2D}
     * @return A new, uninitialized @{link Rect2D}
     */
    public static Rect2D allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Rect2D newInstance = new Rect2D(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Rect2D proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Rect2D(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Rect2D> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Rect2D(input);
}
