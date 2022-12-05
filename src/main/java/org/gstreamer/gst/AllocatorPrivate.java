package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AllocatorPrivate extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAllocatorPrivate";
    
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
     * Allocate a new {@link AllocatorPrivate}
     * @return A new, uninitialized @{link AllocatorPrivate}
     */
    public static AllocatorPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AllocatorPrivate newInstance = new AllocatorPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AllocatorPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AllocatorPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
