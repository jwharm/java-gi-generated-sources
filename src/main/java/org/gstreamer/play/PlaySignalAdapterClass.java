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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PlaySignalAdapterClass newInstance = new PlaySignalAdapterClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlaySignalAdapterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PlaySignalAdapterClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlaySignalAdapterClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PlaySignalAdapterClass(input);
}
