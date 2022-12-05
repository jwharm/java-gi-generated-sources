package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class HarnessPrivate extends Struct {
    
    static {
        GstCheck.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstHarnessPrivate";
    
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
     * Allocate a new {@link HarnessPrivate}
     * @return A new, uninitialized @{link HarnessPrivate}
     */
    public static HarnessPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        HarnessPrivate newInstance = new HarnessPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a HarnessPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public HarnessPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
