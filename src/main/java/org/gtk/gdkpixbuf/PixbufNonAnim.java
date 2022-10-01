package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PixbufNonAnim extends PixbufAnimation {

    public PixbufNonAnim(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PixbufNonAnim */
    public static PixbufNonAnim castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufNonAnim(gobject.getReference());
    }
    
    private static Reference constructNew(Pixbuf pixbuf) {
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_non_anim_new(pixbuf.handle()), true);
        return RESULT;
    }
    
    public PixbufNonAnim(Pixbuf pixbuf) {
        super(constructNew(pixbuf));
    }
    
}
