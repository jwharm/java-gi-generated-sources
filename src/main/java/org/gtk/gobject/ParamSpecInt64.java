package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for 64bit integer properties.
 */
public class ParamSpecInt64 extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        ValueLayout.JAVA_LONG.withName("minimum"),
        ValueLayout.JAVA_LONG.withName("maximum"),
        ValueLayout.JAVA_LONG.withName("default_value")
    ).withName("GParamSpecInt64");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ParamSpecInt64(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecInt64 */
    public static ParamSpecInt64 castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecInt64(gobject.refcounted());
    }
}
