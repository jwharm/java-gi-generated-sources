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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayerGMainContextSignalDispatcherClass newInstance = new PlayerGMainContextSignalDispatcherClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PlayerGMainContextSignalDispatcherClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PlayerGMainContextSignalDispatcherClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayerGMainContextSignalDispatcherClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PlayerGMainContextSignalDispatcherClass(input, ownership);
}