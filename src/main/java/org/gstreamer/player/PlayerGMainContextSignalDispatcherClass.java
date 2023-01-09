package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayerGMainContextSignalDispatcherClass extends Struct {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerGMainContextSignalDispatcherClass";
    
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
     * Allocate a new {@link PlayerGMainContextSignalDispatcherClass}
     * @return A new, uninitialized @{link PlayerGMainContextSignalDispatcherClass}
     */
    public static PlayerGMainContextSignalDispatcherClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PlayerGMainContextSignalDispatcherClass newInstance = new PlayerGMainContextSignalDispatcherClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlayerGMainContextSignalDispatcherClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PlayerGMainContextSignalDispatcherClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayerGMainContextSignalDispatcherClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PlayerGMainContextSignalDispatcherClass(input);
}
