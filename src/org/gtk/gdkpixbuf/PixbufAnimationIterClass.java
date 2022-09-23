package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Modules supporting animations must derive a type from
 * {@link PixbufAnimationIter}, providing suitable implementations of the
 * virtual functions.
 */
public class PixbufAnimationIterClass extends io.github.jwharm.javagi.ResourceBase {

    public PixbufAnimationIterClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PixbufAnimationIterClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GdkPixbufAnimationIterClass.allocate(Interop.getAllocator()).address()));
    }
    
}
