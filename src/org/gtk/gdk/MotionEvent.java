package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a pointer or touch device motion.
 */
public class MotionEvent extends Event {

    public MotionEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MotionEvent */
    public static MotionEvent castFrom(org.gtk.gobject.Object gobject) {
        return new MotionEvent(gobject.getReference());
    }
    
}
