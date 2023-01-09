package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Surface extends Struct {
    
    static {
        Cairo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "cairo_surface_t";
    
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
     * Allocate a new {@link Surface}
     * @return A new, uninitialized @{link Surface}
     */
    public static Surface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Surface newInstance = new Surface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Surface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Surface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Surface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Surface(input);
}
