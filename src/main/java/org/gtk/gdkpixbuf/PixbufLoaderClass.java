package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PixbufLoaderClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("size_prepared"),
        Interop.valueLayout.ADDRESS.withName("area_prepared"),
        Interop.valueLayout.ADDRESS.withName("area_updated"),
        Interop.valueLayout.ADDRESS.withName("closed")
    ).withName("GdkPixbufLoaderClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PixbufLoaderClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
