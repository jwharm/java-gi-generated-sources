package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque handle representing a GstHarness stress testing thread.
 * @version 1.6
 */
public class HarnessThread extends Struct {
    
    static {
        GstCheck.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstHarnessThread";
    
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
     * Allocate a new {@link HarnessThread}
     * @return A new, uninitialized @{link HarnessThread}
     */
    public static HarnessThread allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        HarnessThread newInstance = new HarnessThread(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a HarnessThread proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected HarnessThread(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, HarnessThread> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new HarnessThread(input, ownership);
}
