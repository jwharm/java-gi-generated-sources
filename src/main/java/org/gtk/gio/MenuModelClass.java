package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MenuModelClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
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
    ).withName("GMenuModelClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public MenuModelClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
