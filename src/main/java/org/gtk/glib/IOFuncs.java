package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A table of functions used to handle different types of {@link IOChannel}
 * in a generic way.
 */
public class IOFuncs extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("io_read"),
        Interop.valueLayout.ADDRESS.withName("io_write"),
        Interop.valueLayout.ADDRESS.withName("io_seek"),
        Interop.valueLayout.ADDRESS.withName("io_close"),
        Interop.valueLayout.ADDRESS.withName("io_create_watch"),
        Interop.valueLayout.ADDRESS.withName("io_free"),
        Interop.valueLayout.ADDRESS.withName("io_set_flags"),
        Interop.valueLayout.ADDRESS.withName("io_get_flags")
    ).withName("GIOFuncs");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public IOFuncs(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
