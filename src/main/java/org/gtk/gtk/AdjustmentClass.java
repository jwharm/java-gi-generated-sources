package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AdjustmentClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAdjustmentClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.InitiallyUnownedClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("value_changed"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved4")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static AdjustmentClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AdjustmentClass newInstance = new AdjustmentClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.InitiallyUnownedClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.InitiallyUnownedClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public AdjustmentClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
