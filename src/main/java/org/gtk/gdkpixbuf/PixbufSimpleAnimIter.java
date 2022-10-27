package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PixbufSimpleAnimIter extends org.gtk.gdkpixbuf.PixbufAnimationIter {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public PixbufSimpleAnimIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PixbufSimpleAnimIter */
    public static PixbufSimpleAnimIter castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufSimpleAnimIter(gobject.refcounted());
    }
}
