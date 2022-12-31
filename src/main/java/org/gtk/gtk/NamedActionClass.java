package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class NamedActionClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNamedActionClass";
    
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
     * Allocate a new {@link NamedActionClass}
     * @return A new, uninitialized @{link NamedActionClass}
     */
    public static NamedActionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NamedActionClass newInstance = new NamedActionClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a NamedActionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NamedActionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NamedActionClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NamedActionClass(input, ownership);
}
