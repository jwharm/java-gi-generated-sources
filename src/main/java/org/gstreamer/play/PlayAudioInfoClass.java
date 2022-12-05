package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayAudioInfoClass extends Struct {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayAudioInfoClass";
    
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
     * Allocate a new {@link PlayAudioInfoClass}
     * @return A new, uninitialized @{link PlayAudioInfoClass}
     */
    public static PlayAudioInfoClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayAudioInfoClass newInstance = new PlayAudioInfoClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlayAudioInfoClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayAudioInfoClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
