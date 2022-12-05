package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlaySignalAdapterClass extends Struct {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlaySignalAdapterClass";
    
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
     * Allocate a new {@link PlaySignalAdapterClass}
     * @return A new, uninitialized @{link PlaySignalAdapterClass}
     */
    public static PlaySignalAdapterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlaySignalAdapterClass newInstance = new PlaySignalAdapterClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlaySignalAdapterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlaySignalAdapterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
