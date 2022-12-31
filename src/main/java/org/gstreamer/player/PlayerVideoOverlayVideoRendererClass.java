package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayerVideoOverlayVideoRendererClass extends Struct {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerVideoOverlayVideoRendererClass";
    
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
     * Allocate a new {@link PlayerVideoOverlayVideoRendererClass}
     * @return A new, uninitialized @{link PlayerVideoOverlayVideoRendererClass}
     */
    public static PlayerVideoOverlayVideoRendererClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayerVideoOverlayVideoRendererClass newInstance = new PlayerVideoOverlayVideoRendererClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlayerVideoOverlayVideoRendererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PlayerVideoOverlayVideoRendererClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayerVideoOverlayVideoRendererClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PlayerVideoOverlayVideoRendererClass(input, ownership);
}
