package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MenuModelClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMenuModelClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("is_mutable"),
        Interop.valueLayout.ADDRESS.withName("get_n_items"),
        Interop.valueLayout.ADDRESS.withName("get_item_attributes"),
        Interop.valueLayout.ADDRESS.withName("iterate_item_attributes"),
        Interop.valueLayout.ADDRESS.withName("get_item_attribute_value"),
        Interop.valueLayout.ADDRESS.withName("get_item_links"),
        Interop.valueLayout.ADDRESS.withName("iterate_item_links"),
        Interop.valueLayout.ADDRESS.withName("get_item_link")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static MenuModelClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MenuModelClass newInstance = new MenuModelClass(Refcounted.get(segment.address()));
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
    public MenuModelClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
