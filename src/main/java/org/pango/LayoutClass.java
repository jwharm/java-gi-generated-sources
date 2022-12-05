package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class LayoutClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoLayoutClass";
    
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
     * Allocate a new {@link LayoutClass}
     * @return A new, uninitialized @{link LayoutClass}
     */
    public static LayoutClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        LayoutClass newInstance = new LayoutClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a LayoutClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LayoutClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
