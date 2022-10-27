package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link DBusInterfaceSkeleton}.
 * @version 2.30
 */
public class DBusInterfaceSkeletonClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_info"),
        Interop.valueLayout.ADDRESS.withName("get_vtable"),
        Interop.valueLayout.ADDRESS.withName("get_properties"),
        Interop.valueLayout.ADDRESS.withName("flush"),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("vfunc_padding"),
        Interop.valueLayout.ADDRESS.withName("g_authorize_method"),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("signal_padding")
    ).withName("GDBusInterfaceSkeletonClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public DBusInterfaceSkeletonClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
