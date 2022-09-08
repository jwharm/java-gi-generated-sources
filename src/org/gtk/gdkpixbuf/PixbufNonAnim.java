package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class PixbufNonAnim extends PixbufAnimation {

    public PixbufNonAnim(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PixbufNonAnim */
    public static PixbufNonAnim castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufNonAnim(gobject.getReference());
    }
    
    public PixbufNonAnim(Pixbuf pixbuf) {
        super(References.get(gtk_h.gdk_pixbuf_non_anim_new(pixbuf.handle()), true));
    }
    
}
