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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        WebRTCRTPTransceiverClass newInstance = new WebRTCRTPTransceiverClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a WebRTCRTPTransceiverClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected WebRTCRTPTransceiverClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, WebRTCRTPTransceiverClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCRTPTransceiverClass(input);
}
