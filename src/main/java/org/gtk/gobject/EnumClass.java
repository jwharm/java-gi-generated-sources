package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class of an enumeration type holds information about its
 * possible values.
 */
public class EnumClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
        ValueLayout.JAVA_INT.withName("minimum"),
        ValueLayout.JAVA_INT.withName("maximum"),
        ValueLayout.JAVA_INT.withName("n_values"),
        org.gtk.gobject.EnumValue.getMemoryLayout().withName("values")
    ).withName("GEnumClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public EnumClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
