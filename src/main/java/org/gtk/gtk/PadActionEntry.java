package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Struct defining a pad action entry.
 */
public class PadActionEntry extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.PadActionType.getMemoryLayout().withName("type"),
        ValueLayout.JAVA_INT.withName("index"),
        ValueLayout.JAVA_INT.withName("mode"),
        Interop.valueLayout.ADDRESS.withName("label"),
        Interop.valueLayout.ADDRESS.withName("action_name")
    ).withName("GtkPadActionEntry");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PadActionEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
