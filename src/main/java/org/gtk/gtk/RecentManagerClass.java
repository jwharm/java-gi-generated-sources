package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkRecentManagerClass} contains only private data.
 */
public class RecentManagerClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRecentManagerClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("_gtk_recent1"),
        Interop.valueLayout.ADDRESS.withName("_gtk_recent2"),
        Interop.valueLayout.ADDRESS.withName("_gtk_recent3"),
        Interop.valueLayout.ADDRESS.withName("_gtk_recent4")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static RecentManagerClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RecentManagerClass newInstance = new RecentManagerClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public RecentManagerClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
