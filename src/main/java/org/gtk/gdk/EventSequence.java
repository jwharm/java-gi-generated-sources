package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkEventSequence} is an opaque type representing a sequence
 * of related touch events.
 */
public class EventSequence extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkEventSequence";
    
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
     * Allocate a new {@link EventSequence}
     * @return A new, uninitialized @{link EventSequence}
     */
    public static EventSequence allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        EventSequence newInstance = new EventSequence(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a EventSequence proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EventSequence(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EventSequence> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EventSequence(input);
}
