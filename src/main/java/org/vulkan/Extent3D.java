package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Extent3D extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkExtent3D";
    
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
     * Allocate a new {@link Extent3D}
     * @return A new, uninitialized @{link Extent3D}
     */
    public static Extent3D allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Extent3D newInstance = new Extent3D(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Extent3D proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Extent3D(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Extent3D> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Extent3D(input);
}
