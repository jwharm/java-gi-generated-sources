package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class LFOControlSourcePrivate extends Struct {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstLFOControlSourcePrivate";
    
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
     * Allocate a new {@link LFOControlSourcePrivate}
     * @return A new, uninitialized @{link LFOControlSourcePrivate}
     */
    public static LFOControlSourcePrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        LFOControlSourcePrivate newInstance = new LFOControlSourcePrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a LFOControlSourcePrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LFOControlSourcePrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
