package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ShortcutsSectionClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutsSectionClass";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ShortcutsSectionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ShortcutsSectionClass newInstance = new ShortcutsSectionClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public ShortcutsSectionClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
