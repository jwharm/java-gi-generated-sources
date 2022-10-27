package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PermissionClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("acquire"),
        Interop.valueLayout.ADDRESS.withName("acquire_async"),
        Interop.valueLayout.ADDRESS.withName("acquire_finish"),
        Interop.valueLayout.ADDRESS.withName("release"),
        Interop.valueLayout.ADDRESS.withName("release_async"),
        Interop.valueLayout.ADDRESS.withName("release_finish"),
        MemoryLayout.sequenceLayout(16, ValueLayout.ADDRESS).withName("reserved")
    ).withName("GPermissionClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PermissionClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
