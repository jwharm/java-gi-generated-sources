package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Vp8DecoderPrivate extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp8DecoderPrivate";
    
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
     * Allocate a new {@link Vp8DecoderPrivate}
     * @return A new, uninitialized @{link Vp8DecoderPrivate}
     */
    public static Vp8DecoderPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp8DecoderPrivate newInstance = new Vp8DecoderPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Vp8DecoderPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vp8DecoderPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
