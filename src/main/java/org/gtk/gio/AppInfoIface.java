package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Application Information interface, for operating system portability.
 */
public class AppInfoIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("dup"),
        Interop.valueLayout.ADDRESS.withName("equal"),
        Interop.valueLayout.ADDRESS.withName("get_id"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("get_description"),
        Interop.valueLayout.ADDRESS.withName("get_executable"),
        Interop.valueLayout.ADDRESS.withName("get_icon"),
        Interop.valueLayout.ADDRESS.withName("launch"),
        Interop.valueLayout.ADDRESS.withName("supports_uris"),
        Interop.valueLayout.ADDRESS.withName("supports_files"),
        Interop.valueLayout.ADDRESS.withName("launch_uris"),
        Interop.valueLayout.ADDRESS.withName("should_show"),
        Interop.valueLayout.ADDRESS.withName("set_as_default_for_type"),
        Interop.valueLayout.ADDRESS.withName("set_as_default_for_extension"),
        Interop.valueLayout.ADDRESS.withName("add_supports_type"),
        Interop.valueLayout.ADDRESS.withName("can_remove_supports_type"),
        Interop.valueLayout.ADDRESS.withName("remove_supports_type"),
        Interop.valueLayout.ADDRESS.withName("can_delete"),
        Interop.valueLayout.ADDRESS.withName("do_delete"),
        Interop.valueLayout.ADDRESS.withName("get_commandline"),
        Interop.valueLayout.ADDRESS.withName("get_display_name"),
        Interop.valueLayout.ADDRESS.withName("set_as_last_used_for_type"),
        Interop.valueLayout.ADDRESS.withName("get_supported_types"),
        Interop.valueLayout.ADDRESS.withName("launch_uris_async"),
        Interop.valueLayout.ADDRESS.withName("launch_uris_finish")
    ).withName("GAppInfoIface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public AppInfoIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
