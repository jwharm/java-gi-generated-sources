package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RecentManagerPrivate extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRecentManagerPrivate";
    
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
     * Allocate a new {@link RecentManagerPrivate}
     * @return A new, uninitialized @{link RecentManagerPrivate}
     */
    public static RecentManagerPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RecentManagerPrivate newInstance = new RecentManagerPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RecentManagerPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RecentManagerPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
