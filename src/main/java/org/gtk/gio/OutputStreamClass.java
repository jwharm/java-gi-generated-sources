package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class OutputStreamClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("write_fn"),
        Interop.valueLayout.ADDRESS.withName("splice"),
        Interop.valueLayout.ADDRESS.withName("flush"),
        Interop.valueLayout.ADDRESS.withName("close_fn"),
        Interop.valueLayout.ADDRESS.withName("write_async"),
        Interop.valueLayout.ADDRESS.withName("write_finish"),
        Interop.valueLayout.ADDRESS.withName("splice_async"),
        Interop.valueLayout.ADDRESS.withName("splice_finish"),
        Interop.valueLayout.ADDRESS.withName("flush_async"),
        Interop.valueLayout.ADDRESS.withName("flush_finish"),
        Interop.valueLayout.ADDRESS.withName("close_async"),
        Interop.valueLayout.ADDRESS.withName("close_finish"),
        Interop.valueLayout.ADDRESS.withName("writev_fn"),
        Interop.valueLayout.ADDRESS.withName("writev_async"),
        Interop.valueLayout.ADDRESS.withName("writev_finish"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved6"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved7"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved8")
    ).withName("GOutputStreamClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public OutputStreamClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
