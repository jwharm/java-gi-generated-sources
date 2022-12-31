package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AlternativeTriggerClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAlternativeTriggerClass";
    
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
     * Allocate a new {@link AlternativeTriggerClass}
     * @return A new, uninitialized @{link AlternativeTriggerClass}
     */
    public static AlternativeTriggerClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AlternativeTriggerClass newInstance = new AlternativeTriggerClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AlternativeTriggerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AlternativeTriggerClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AlternativeTriggerClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AlternativeTriggerClass(input, ownership);
}
