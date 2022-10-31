package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class EditableInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEditableInterface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
        Interop.valueLayout.ADDRESS.withName("insert_text"),
        Interop.valueLayout.ADDRESS.withName("delete_text"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("get_text"),
        Interop.valueLayout.ADDRESS.withName("do_insert_text"),
        Interop.valueLayout.ADDRESS.withName("do_delete_text"),
        Interop.valueLayout.ADDRESS.withName("get_selection_bounds"),
        Interop.valueLayout.ADDRESS.withName("set_selection_bounds"),
        Interop.valueLayout.ADDRESS.withName("get_delegate")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static EditableInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EditableInterface newInstance = new EditableInterface(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_iface}
     * @return The value of the field {@code base_iface}
     */
    public org.gtk.gobject.TypeInterface base_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_iface"));
        return new org.gtk.gobject.TypeInterface(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public EditableInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
