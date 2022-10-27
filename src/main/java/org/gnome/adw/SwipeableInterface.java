package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An interface for swipeable widgets.
 * @version 1.0
 */
public class SwipeableInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("get_distance"),
        Interop.valueLayout.ADDRESS.withName("get_snap_points"),
        Interop.valueLayout.ADDRESS.withName("get_progress"),
        Interop.valueLayout.ADDRESS.withName("get_cancel_progress"),
        Interop.valueLayout.ADDRESS.withName("get_swipe_area"),
        MemoryLayout.sequenceLayout(4, ValueLayout.ADDRESS).withName("padding")
    ).withName("AdwSwipeableInterface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public SwipeableInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
