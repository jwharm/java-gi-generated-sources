package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayMediaInfoClass extends Struct {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayMediaInfoClass";
    
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
     * Allocate a new {@link PlayMediaInfoClass}
     * @return A new, uninitialized @{link PlayMediaInfoClass}
     */
    public static PlayMediaInfoClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayMediaInfoClass newInstance = new PlayMediaInfoClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlayMediaInfoClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayMediaInfoClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
