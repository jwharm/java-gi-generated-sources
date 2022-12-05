package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AdapterClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAdapterClass";
    
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
     * Allocate a new {@link AdapterClass}
     * @return A new, uninitialized @{link AdapterClass}
     */
    public static AdapterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AdapterClass newInstance = new AdapterClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AdapterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AdapterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
