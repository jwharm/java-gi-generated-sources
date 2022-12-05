package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class EventControllerLegacyClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEventControllerLegacyClass";
    
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
     * Allocate a new {@link EventControllerLegacyClass}
     * @return A new, uninitialized @{link EventControllerLegacyClass}
     */
    public static EventControllerLegacyClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EventControllerLegacyClass newInstance = new EventControllerLegacyClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a EventControllerLegacyClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EventControllerLegacyClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
