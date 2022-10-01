package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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
     * Extracts the scroll deltas of a scroll event.
     * <p>
     * The deltas will be zero unless the scroll direction
     * is {@link ScrollDirection#SMOOTH}.
     */
    public void getDeltas(PointerDouble deltaX, PointerDouble deltaY) {
        gtk_h.gdk_scroll_event_get_deltas(handle(), deltaX.handle(), deltaY.handle());
    }
    
    /**
     * Extracts the direction of a scroll event.
     */
    public ScrollDirection getDirection() {
        var RESULT = gtk_h.gdk_scroll_event_get_direction(handle());
        return new ScrollDirection(RESULT);
    }
    
    /**
     * Check whether a scroll event is a stop scroll event.
     * <p>
     * Scroll sequences with smooth scroll information may provide
     * a stop scroll event once the interaction with the device finishes,
     * e.g. by lifting a finger. This stop scroll event is the signal
     * that a widget may trigger kinetic scrolling based on the current
     * velocity.
     * <p>
     * Stop scroll events always have a delta of 0/0.
     */
    public boolean isStop() {
        var RESULT = gtk_h.gdk_scroll_event_is_stop(handle());
        return RESULT != 0;
    }
    
}
