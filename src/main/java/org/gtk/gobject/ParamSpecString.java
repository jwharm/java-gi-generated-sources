package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for string
 * properties.
 */
public class ParamSpecString extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("default_value"),
        Interop.valueLayout.ADDRESS.withName("cset_first"),
        Interop.valueLayout.ADDRESS.withName("cset_nth"),
        ValueLayout.JAVA_BYTE.withName("substitutor"),
        ValueLayout.JAVA_INT.withName("null_fold_if_empty"),
        ValueLayout.JAVA_INT.withName("ensure_non_null")
    ).withName("GParamSpecString");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ParamSpecString(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecString */
    public static ParamSpecString castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecString(gobject.refcounted());
    }
}
