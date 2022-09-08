package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a pointer or touch device motion.
 */
public class MotionEvent extends Event {

    public MotionEvent(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MotionEvent */
    public static MotionEvent castFrom(org.gtk.gobject.Object gobject) {
        return new MotionEvent(gobject.getReference());
    }
    
}
