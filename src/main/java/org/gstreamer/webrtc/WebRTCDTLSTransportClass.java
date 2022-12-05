package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCDTLSTransportClass extends Struct {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCDTLSTransportClass";
    
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
     * Allocate a new {@link WebRTCDTLSTransportClass}
     * @return A new, uninitialized @{link WebRTCDTLSTransportClass}
     */
    public static WebRTCDTLSTransportClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        WebRTCDTLSTransportClass newInstance = new WebRTCDTLSTransportClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a WebRTCDTLSTransportClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WebRTCDTLSTransportClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
