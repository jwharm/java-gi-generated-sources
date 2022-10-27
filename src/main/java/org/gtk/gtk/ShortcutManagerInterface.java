package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of functions that can be implemented for the {@code GtkShortcutManager}
 * interface.
 * <p>
 * Note that no function is mandatory to implement, the default implementation
 * will work fine.
 */
public class ShortcutManagerInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("add_controller"),
        Interop.valueLayout.ADDRESS.withName("remove_controller")
    ).withName("GtkShortcutManagerInterface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ShortcutManagerInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
