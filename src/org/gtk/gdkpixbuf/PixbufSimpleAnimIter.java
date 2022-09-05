package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class PixbufSimpleAnimIter extends PixbufAnimationIter {

    public PixbufSimpleAnimIter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PixbufSimpleAnimIter */
    public static PixbufSimpleAnimIter castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufSimpleAnimIter(gobject.getProxy());
    }
    
}
