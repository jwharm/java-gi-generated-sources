package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for the GInitiallyUnowned type.
 */
public class InitiallyUnownedClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
        org.gtk.glib.SList.getMemoryLayout().withName("construct_properties"),
        Interop.valueLayout.ADDRESS.withName("constructor"),
        Interop.valueLayout.ADDRESS.withName("set_property"),
        Interop.valueLayout.ADDRESS.withName("get_property"),
        Interop.valueLayout.ADDRESS.withName("dispose"),
        Interop.valueLayout.ADDRESS.withName("finalize"),
        Interop.valueLayout.ADDRESS.withName("dispatch_properties_changed"),
        Interop.valueLayout.ADDRESS.withName("notify"),
        Interop.valueLayout.ADDRESS.withName("constructed"),
        ValueLayout.JAVA_LONG.withName("flags"),
        MemoryLayout.sequenceLayout(6, ValueLayout.ADDRESS).withName("pdummy")
    ).withName("GInitiallyUnownedClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public InitiallyUnownedClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
