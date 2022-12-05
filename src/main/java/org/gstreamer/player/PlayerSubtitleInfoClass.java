package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayerSubtitleInfoClass extends Struct {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerSubtitleInfoClass";
    
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
     * Allocate a new {@link PlayerSubtitleInfoClass}
     * @return A new, uninitialized @{link PlayerSubtitleInfoClass}
     */
    public static PlayerSubtitleInfoClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayerSubtitleInfoClass newInstance = new PlayerSubtitleInfoClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlayerSubtitleInfoClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayerSubtitleInfoClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
