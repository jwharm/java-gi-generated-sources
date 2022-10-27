package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for double properties.
 */
public class ParamSpecDouble extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        ValueLayout.JAVA_DOUBLE.withName("minimum"),
        ValueLayout.JAVA_DOUBLE.withName("maximum"),
        ValueLayout.JAVA_DOUBLE.withName("default_value"),
        ValueLayout.JAVA_DOUBLE.withName("epsilon")
    ).withName("GParamSpecDouble");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ParamSpecDouble(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecDouble */
    public static ParamSpecDouble castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecDouble(gobject.refcounted());
    }
}
