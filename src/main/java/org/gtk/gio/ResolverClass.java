package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ResolverClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("reload"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_address"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_address_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_address_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_service"),
        Interop.valueLayout.ADDRESS.withName("lookup_service_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_service_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_records"),
        Interop.valueLayout.ADDRESS.withName("lookup_records_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_records_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_with_flags_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_with_flags_finish"),
        Interop.valueLayout.ADDRESS.withName("lookup_by_name_with_flags")
    ).withName("GResolverClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ResolverClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
