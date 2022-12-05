package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PtpClockPrivate extends Struct {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPtpClockPrivate";
    
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
     * Allocate a new {@link PtpClockPrivate}
     * @return A new, uninitialized @{link PtpClockPrivate}
     */
    public static PtpClockPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PtpClockPrivate newInstance = new PtpClockPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PtpClockPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PtpClockPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
