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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Surface newInstance = new Surface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Surface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Surface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
