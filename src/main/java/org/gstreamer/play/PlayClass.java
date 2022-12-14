package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayClass extends Struct {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayClass";
    
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
     * Allocate a new {@link PlayClass}
     * @return A new, uninitialized @{link PlayClass}
     */
    public static PlayClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PlayClass newInstance = new PlayClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlayClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PlayClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PlayClass(input);
}
