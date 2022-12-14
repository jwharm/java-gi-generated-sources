package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Offset3D extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkOffset3D";
    
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
     * Allocate a new {@link Offset3D}
     * @return A new, uninitialized @{link Offset3D}
     */
    public static Offset3D allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Offset3D newInstance = new Offset3D(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Offset3D proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Offset3D(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Offset3D> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Offset3D(input);
}
