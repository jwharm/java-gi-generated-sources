package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PrintOperationClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintOperationClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("done"),
        Interop.valueLayout.ADDRESS.withName("begin_print"),
        Interop.valueLayout.ADDRESS.withName("paginate"),
        Interop.valueLayout.ADDRESS.withName("request_page_setup"),
        Interop.valueLayout.ADDRESS.withName("draw_page"),
        Interop.valueLayout.ADDRESS.withName("end_print"),
        Interop.valueLayout.ADDRESS.withName("status_changed"),
        Interop.valueLayout.ADDRESS.withName("create_custom_widget"),
        Interop.valueLayout.ADDRESS.withName("custom_widget_apply"),
        Interop.valueLayout.ADDRESS.withName("preview"),
        Interop.valueLayout.ADDRESS.withName("update_custom_widget"),
        MemoryLayout.paddingLayout(256),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static PrintOperationClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PrintOperationClass newInstance = new PrintOperationClass(Refcounted.get(segment.address()));
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
    public PrintOperationClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
