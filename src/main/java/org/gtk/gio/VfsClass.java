package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VfsClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("is_active"),
        Interop.valueLayout.ADDRESS.withName("get_file_for_path"),
        Interop.valueLayout.ADDRESS.withName("get_file_for_uri"),
        Interop.valueLayout.ADDRESS.withName("get_supported_uri_schemes"),
        Interop.valueLayout.ADDRESS.withName("parse_name"),
        Interop.valueLayout.ADDRESS.withName("local_file_add_info"),
        Interop.valueLayout.ADDRESS.withName("add_writable_namespaces"),
        Interop.valueLayout.ADDRESS.withName("local_file_set_attributes"),
        Interop.valueLayout.ADDRESS.withName("local_file_removed"),
        Interop.valueLayout.ADDRESS.withName("local_file_moved"),
        Interop.valueLayout.ADDRESS.withName("deserialize_icon"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved6")
    ).withName("GVfsClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public VfsClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
