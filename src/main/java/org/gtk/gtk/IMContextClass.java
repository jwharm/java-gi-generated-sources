package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class IMContextClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIMContextClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("preedit_start"),
        Interop.valueLayout.ADDRESS.withName("preedit_end"),
        Interop.valueLayout.ADDRESS.withName("preedit_changed"),
        Interop.valueLayout.ADDRESS.withName("commit"),
        Interop.valueLayout.ADDRESS.withName("retrieve_surrounding"),
        Interop.valueLayout.ADDRESS.withName("delete_surrounding"),
        Interop.valueLayout.ADDRESS.withName("set_client_widget"),
        Interop.valueLayout.ADDRESS.withName("get_preedit_string"),
        Interop.valueLayout.ADDRESS.withName("filter_keypress"),
        Interop.valueLayout.ADDRESS.withName("focus_in"),
        Interop.valueLayout.ADDRESS.withName("focus_out"),
        Interop.valueLayout.ADDRESS.withName("reset"),
        Interop.valueLayout.ADDRESS.withName("set_cursor_location"),
        Interop.valueLayout.ADDRESS.withName("set_use_preedit"),
        Interop.valueLayout.ADDRESS.withName("set_surrounding"),
        Interop.valueLayout.ADDRESS.withName("get_surrounding"),
        Interop.valueLayout.ADDRESS.withName("set_surrounding_with_selection"),
        Interop.valueLayout.ADDRESS.withName("get_surrounding_with_selection"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved5")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static IMContextClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IMContextClass newInstance = new IMContextClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public IMContextClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
