package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCRTPSenderClass extends Struct {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCRTPSenderClass";
    
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
     * Allocate a new {@link WebRTCRTPSenderClass}
     * @return A new, uninitialized @{link WebRTCRTPSenderClass}
     */
    public static WebRTCRTPSenderClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        WebRTCRTPSenderClass newInstance = new WebRTCRTPSenderClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a WebRTCRTPSenderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected WebRTCRTPSenderClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, WebRTCRTPSenderClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCRTPSenderClass(input);
}
