package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayVideoOverlayVideoRendererClass extends Struct {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayVideoOverlayVideoRendererClass";
    
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
     * Allocate a new {@link PlayVideoOverlayVideoRendererClass}
     * @return A new, uninitialized @{link PlayVideoOverlayVideoRendererClass}
     */
    public static PlayVideoOverlayVideoRendererClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayVideoOverlayVideoRendererClass newInstance = new PlayVideoOverlayVideoRendererClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlayVideoOverlayVideoRendererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PlayVideoOverlayVideoRendererClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayVideoOverlayVideoRendererClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PlayVideoOverlayVideoRendererClass(input, ownership);
}
