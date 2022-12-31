package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCRTPTransceiverClass extends Struct {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCRTPTransceiverClass";
    
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
     * Allocate a new {@link WebRTCRTPTransceiverClass}
     * @return A new, uninitialized @{link WebRTCRTPTransceiverClass}
     */
    public static WebRTCRTPTransceiverClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        WebRTCRTPTransceiverClass newInstance = new WebRTCRTPTransceiverClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a WebRTCRTPTransceiverClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected WebRTCRTPTransceiverClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, WebRTCRTPTransceiverClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCRTPTransceiverClass(input, ownership);
}
