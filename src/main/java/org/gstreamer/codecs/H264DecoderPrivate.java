package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class H264DecoderPrivate extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH264DecoderPrivate";
    
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
     * Allocate a new {@link H264DecoderPrivate}
     * @return A new, uninitialized @{link H264DecoderPrivate}
     */
    public static H264DecoderPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        H264DecoderPrivate newInstance = new H264DecoderPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a H264DecoderPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected H264DecoderPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, H264DecoderPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new H264DecoderPrivate(input);
}
