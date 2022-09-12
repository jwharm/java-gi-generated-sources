package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a scrolling motion.
 */
public class ScrollEvent extends Event {

    public ScrollEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ScrollEvent */
    public static ScrollEvent castFrom(org.gtk.gobject.Object gobject) {
        return new ScrollEvent(gobject.getReference());
    }
    
    /**
     * Extracts the direction of a scroll event.
     */
    public ScrollDirection getDirection() {
        var RESULT = gtk_h.gdk_scroll_event_get_direction(handle());
        return ScrollDirection.fromValue(RESULT);
    }
    
    /**
     * Check whether a scroll event is a stop scroll event.
     * 
     * Scroll sequences with smooth scroll information may provide
     * a stop scroll event once the interaction with the device finishes,
     * e.g. by lifting a finger. This stop scroll event is the signal
     * that a widget may trigger kinetic scrolling based on the current
     * velocity.
     * 
     * Stop scroll events always have a delta of 0/0.
     */
    public boolean isStop() {
        var RESULT = gtk_h.gdk_scroll_event_is_stop(handle());
        return (RESULT != 0);
    }
    
}
