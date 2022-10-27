package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure holding in-depth information for a specific signal.
 * <p>
 * See also: g_signal_query()
 */
public class SignalQuery extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("signal_id"),
        Interop.valueLayout.ADDRESS.withName("signal_name"),
        ValueLayout.JAVA_LONG.withName("itype"),
        org.gtk.gobject.SignalFlags.getMemoryLayout().withName("signal_flags"),
        ValueLayout.JAVA_LONG.withName("return_type"),
        ValueLayout.JAVA_INT.withName("n_params"),
        Interop.valueLayout.ADDRESS.withName("param_types")
    ).withName("GSignalQuery");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public SignalQuery(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
