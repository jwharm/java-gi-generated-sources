package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TagMuxPrivate extends Struct {
    
    static {
        GstTag.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTagMuxPrivate";
    
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
     * Allocate a new {@link TagMuxPrivate}
     * @return A new, uninitialized @{link TagMuxPrivate}
     */
    public static TagMuxPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TagMuxPrivate newInstance = new TagMuxPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TagMuxPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TagMuxPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
