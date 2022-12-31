package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class EventControllerMotionClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEventControllerMotionClass";
    
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
     * Allocate a new {@link EventControllerMotionClass}
     * @return A new, uninitialized @{link EventControllerMotionClass}
     */
    public static EventControllerMotionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EventControllerMotionClass newInstance = new EventControllerMotionClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a EventControllerMotionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EventControllerMotionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, EventControllerMotionClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EventControllerMotionClass(input, ownership);
}
