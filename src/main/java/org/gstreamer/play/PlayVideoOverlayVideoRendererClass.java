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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PlayVideoOverlayVideoRendererClass newInstance = new PlayVideoOverlayVideoRendererClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlayVideoOverlayVideoRendererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PlayVideoOverlayVideoRendererClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayVideoOverlayVideoRendererClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PlayVideoOverlayVideoRendererClass(input);
}
