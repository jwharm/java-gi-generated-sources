package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link SettingsBackend}.
 */
public class SettingsBackendClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("read"),
        Interop.valueLayout.ADDRESS.withName("get_writable"),
        Interop.valueLayout.ADDRESS.withName("write"),
        Interop.valueLayout.ADDRESS.withName("write_tree"),
        Interop.valueLayout.ADDRESS.withName("reset"),
        Interop.valueLayout.ADDRESS.withName("subscribe"),
        Interop.valueLayout.ADDRESS.withName("unsubscribe"),
        Interop.valueLayout.ADDRESS.withName("sync"),
        Interop.valueLayout.ADDRESS.withName("get_permission"),
        Interop.valueLayout.ADDRESS.withName("read_user_value"),
        MemoryLayout.sequenceLayout(23, ValueLayout.ADDRESS).withName("padding")
    ).withName("GSettingsBackendClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public SettingsBackendClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
