package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Modules supporting animations must derive a type from
 * {@link PixbufAnimation}, providing suitable implementations of the
 * virtual functions.
 */
public class PixbufAnimationClass extends io.github.jwharm.javagi.ResourceBase {

    public PixbufAnimationClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PixbufAnimationClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GdkPixbufAnimationClass.allocate(Interop.getAllocator()).address()));
    }
    
}
