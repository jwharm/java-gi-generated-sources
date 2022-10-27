package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Modules supporting animations must derive a type from
 * {@link PixbufAnimationIter}, providing suitable implementations of the
 * virtual functions.
 */
public class PixbufAnimationIterClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_delay_time"),
        Interop.valueLayout.ADDRESS.withName("get_pixbuf"),
        Interop.valueLayout.ADDRESS.withName("on_currently_loading_frame"),
        Interop.valueLayout.ADDRESS.withName("advance")
    ).withName("GdkPixbufAnimationIterClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PixbufAnimationIterClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
