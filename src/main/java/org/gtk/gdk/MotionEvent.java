package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a pointer or touch device motion.
 */
public class MotionEvent extends Event {

    public MotionEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MotionEvent */
    public static MotionEvent castFrom(org.gtk.gobject.Object gobject) {
        return new MotionEvent(gobject.refcounted());
    }
    
}
