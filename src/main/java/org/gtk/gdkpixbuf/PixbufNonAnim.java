package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PixbufNonAnim extends PixbufAnimation {

    public PixbufNonAnim(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PixbufNonAnim */
    public static PixbufNonAnim castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufNonAnim(gobject.refcounted());
    }
    
    private static Refcounted constructNew(Pixbuf pixbuf) {
        Refcounted RESULT = Refcounted.get(gtk_h.gdk_pixbuf_non_anim_new(pixbuf.handle()), true);
        return RESULT;
    }
    
    public PixbufNonAnim(Pixbuf pixbuf) {
        super(constructNew(pixbuf));
    }
    
}
