package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@code GtkNativeDialog}.
 */
public class NativeDialogClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNativeDialogClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("response"),
        Interop.valueLayout.ADDRESS.withName("show"),
        Interop.valueLayout.ADDRESS.withName("hide"),
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
    
    public static NativeDialogClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NativeDialogClass newInstance = new NativeDialogClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public NativeDialogClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
