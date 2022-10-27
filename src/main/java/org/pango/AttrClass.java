package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrClass} structure stores the type and operations for
 * a particular type of attribute.
 * <p>
 * The functions in this structure should not be called directly. Instead,
 * one should use the wrapper functions provided for {@code PangoAttribute}.
 */
public class AttrClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.pango.AttrType.getMemoryLayout().withName("type"),
        Interop.valueLayout.ADDRESS.withName("copy"),
        Interop.valueLayout.ADDRESS.withName("destroy"),
        Interop.valueLayout.ADDRESS.withName("equal")
    ).withName("PangoAttrClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public AttrClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
