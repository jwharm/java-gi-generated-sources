package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PixbufSimpleAnimIter extends PixbufAnimationIter {

    public PixbufSimpleAnimIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PixbufSimpleAnimIter */
    public static PixbufSimpleAnimIter castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufSimpleAnimIter(gobject.getReference());
    }
    
}
