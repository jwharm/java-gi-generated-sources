package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCSCTPTransportClass extends Struct {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCSCTPTransportClass";
    
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
     * Allocate a new {@link WebRTCSCTPTransportClass}
     * @return A new, uninitialized @{link WebRTCSCTPTransportClass}
     */
    public static WebRTCSCTPTransportClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        WebRTCSCTPTransportClass newInstance = new WebRTCSCTPTransportClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a WebRTCSCTPTransportClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WebRTCSCTPTransportClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
