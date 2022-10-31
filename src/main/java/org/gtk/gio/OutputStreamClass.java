package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class OutputStreamClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOutputStreamClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("write_fn"),
        Interop.valueLayout.ADDRESS.withName("splice"),
        Interop.valueLayout.ADDRESS.withName("flush"),
        Interop.valueLayout.ADDRESS.withName("close_fn"),
        Interop.valueLayout.ADDRESS.withName("write_async"),
        Interop.valueLayout.ADDRESS.withName("write_finish"),
        Interop.valueLayout.ADDRESS.withName("splice_async"),
        Interop.valueLayout.ADDRESS.withName("splice_finish"),
        Interop.valueLayout.ADDRESS.withName("flush_async"),
        Interop.valueLayout.ADDRESS.withName("flush_finish"),
        Interop.valueLayout.ADDRESS.withName("close_async"),
        Interop.valueLayout.ADDRESS.withName("close_finish"),
        Interop.valueLayout.ADDRESS.withName("writev_fn"),
        Interop.valueLayout.ADDRESS.withName("writev_async"),
        Interop.valueLayout.ADDRESS.withName("writev_finish"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved6"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved7"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved8")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static OutputStreamClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OutputStreamClass newInstance = new OutputStreamClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public OutputStreamClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
