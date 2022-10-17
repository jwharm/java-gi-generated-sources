package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PixbufSimpleAnimIter extends PixbufAnimationIter {

    public PixbufSimpleAnimIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PixbufSimpleAnimIter */
    public static PixbufSimpleAnimIter castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufSimpleAnimIter(gobject.refcounted());
    }
    
}
