package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GOptionEntry struct defines a single option. To have an effect, they
 * must be added to a {@link OptionGroup} with g_option_context_add_main_entries()
 * or g_option_group_add_entries().
 */
public class OptionEntry extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("long_name"),
        ValueLayout.JAVA_BYTE.withName("short_name"),
        ValueLayout.JAVA_INT.withName("flags"),
        org.gtk.glib.OptionArg.getMemoryLayout().withName("arg"),
        Interop.valueLayout.ADDRESS.withName("arg_data"),
        Interop.valueLayout.ADDRESS.withName("description"),
        Interop.valueLayout.ADDRESS.withName("arg_description")
    ).withName("GOptionEntry");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public OptionEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
