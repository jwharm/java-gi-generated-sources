package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ListItemFactoryClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkListItemFactoryClass";
    
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
     * Allocate a new {@link ListItemFactoryClass}
     * @return A new, uninitialized @{link ListItemFactoryClass}
     */
    public static ListItemFactoryClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ListItemFactoryClass newInstance = new ListItemFactoryClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ListItemFactoryClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ListItemFactoryClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ListItemFactoryClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ListItemFactoryClass(input, ownership);
}
