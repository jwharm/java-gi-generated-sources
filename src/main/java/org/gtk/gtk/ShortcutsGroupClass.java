package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ShortcutsGroupClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutsGroupClass";
    
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
     * Allocate a new {@link ShortcutsGroupClass}
     * @return A new, uninitialized @{link ShortcutsGroupClass}
     */
    public static ShortcutsGroupClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ShortcutsGroupClass newInstance = new ShortcutsGroupClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ShortcutsGroupClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutsGroupClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
