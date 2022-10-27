package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link SignalInvocationHint} structure is used to pass on additional information
 * to callbacks during a signal emission.
 */
public class SignalInvocationHint extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("signal_id"),
        ValueLayout.JAVA_INT.withName("detail"),
        org.gtk.gobject.SignalFlags.getMemoryLayout().withName("run_type")
    ).withName("GSignalInvocationHint");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public SignalInvocationHint(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
