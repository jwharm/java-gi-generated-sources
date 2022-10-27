package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for float properties.
 */
public class ParamSpecFloat extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        ValueLayout.JAVA_FLOAT.withName("minimum"),
        ValueLayout.JAVA_FLOAT.withName("maximum"),
        ValueLayout.JAVA_FLOAT.withName("default_value"),
        ValueLayout.JAVA_FLOAT.withName("epsilon")
    ).withName("GParamSpecFloat");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ParamSpecFloat(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecFloat */
    public static ParamSpecFloat castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecFloat(gobject.refcounted());
    }
}
