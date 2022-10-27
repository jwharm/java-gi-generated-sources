package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Meta-data to be passed to gtk_recent_manager_add_full() when
 * registering a recently used resource.
 */
public class RecentData extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("display_name"),
        Interop.valueLayout.ADDRESS.withName("description"),
        Interop.valueLayout.ADDRESS.withName("mime_type"),
        Interop.valueLayout.ADDRESS.withName("app_name"),
        Interop.valueLayout.ADDRESS.withName("app_exec"),
        Interop.valueLayout.ADDRESS.withName("groups"),
        ValueLayout.JAVA_INT.withName("is_private")
    ).withName("GtkRecentData");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public RecentData(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
