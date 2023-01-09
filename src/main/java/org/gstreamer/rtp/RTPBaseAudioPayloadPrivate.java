package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RTPBaseAudioPayloadPrivate extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBaseAudioPayloadPrivate";
    
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
     * Allocate a new {@link RTPBaseAudioPayloadPrivate}
     * @return A new, uninitialized @{link RTPBaseAudioPayloadPrivate}
     */
    public static RTPBaseAudioPayloadPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RTPBaseAudioPayloadPrivate newInstance = new RTPBaseAudioPayloadPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RTPBaseAudioPayloadPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTPBaseAudioPayloadPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPBaseAudioPayloadPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTPBaseAudioPayloadPrivate(input);
}
