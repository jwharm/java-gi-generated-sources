package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ShortcutTriggerClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutTriggerClass";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ShortcutTriggerClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ShortcutTriggerClass newInstance = new ShortcutTriggerClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ShortcutTriggerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutTriggerClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}