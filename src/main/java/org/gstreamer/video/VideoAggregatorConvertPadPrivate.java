package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoAggregatorConvertPadPrivate extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorConvertPadPrivate";
    
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
     * Allocate a new {@link VideoAggregatorConvertPadPrivate}
     * @return A new, uninitialized @{link VideoAggregatorConvertPadPrivate}
     */
    public static VideoAggregatorConvertPadPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoAggregatorConvertPadPrivate newInstance = new VideoAggregatorConvertPadPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoAggregatorConvertPadPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoAggregatorConvertPadPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoAggregatorConvertPadPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoAggregatorConvertPadPrivate(input);
}
