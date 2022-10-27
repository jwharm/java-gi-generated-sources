package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link ApplicationCommandLineClass}-struct
 * contains private data only.
 * @version 2.28
 */
public class ApplicationCommandLineClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("print_literal"),
        Interop.valueLayout.ADDRESS.withName("printerr_literal"),
        Interop.valueLayout.ADDRESS.withName("get_stdin"),
        MemoryLayout.sequenceLayout(11, ValueLayout.ADDRESS).withName("padding")
    ).withName("GApplicationCommandLineClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ApplicationCommandLineClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
