package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RTPBaseDepayloadPrivate extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBaseDepayloadPrivate";
    
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
     * Allocate a new {@link RTPBaseDepayloadPrivate}
     * @return A new, uninitialized @{link RTPBaseDepayloadPrivate}
     */
    public static RTPBaseDepayloadPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RTPBaseDepayloadPrivate newInstance = new RTPBaseDepayloadPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RTPBaseDepayloadPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTPBaseDepayloadPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPBaseDepayloadPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTPBaseDepayloadPrivate(input);
}
