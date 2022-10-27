package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for enum
 * properties.
 */
public class ParamSpecEnum extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        org.gtk.gobject.EnumClass.getMemoryLayout().withName("enum_class"),
        ValueLayout.JAVA_INT.withName("default_value")
    ).withName("GParamSpecEnum");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ParamSpecEnum(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecEnum */
    public static ParamSpecEnum castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecEnum(gobject.refcounted());
    }
}
