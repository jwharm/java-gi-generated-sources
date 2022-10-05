package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a scrolling motion.
 */
public class ScrollEvent extends Event {

    public ScrollEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ScrollEvent */
    public static ScrollEvent castFrom(org.gtk.gobject.Object gobject) {
        return new ScrollEvent(gobject.refcounted());
    }
    
    static final MethodHandle gdk_scroll_event_get_deltas = Interop.downcallHandle(
        "gdk_scroll_event_get_deltas",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the scroll deltas of a scroll event.
     * <p>
     * The deltas will be zero unless the scroll direction
     * is {@link ScrollDirection#SMOOTH}.
     */
    public void getDeltas(PointerDouble deltaX, PointerDouble deltaY) {
        try {
            gdk_scroll_event_get_deltas.invokeExact(handle(), deltaX.handle(), deltaY.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_scroll_event_get_direction = Interop.downcallHandle(
        "gdk_scroll_event_get_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the direction of a scroll event.
     */
    public ScrollDirection getDirection() {
        try {
            var RESULT = (int) gdk_scroll_event_get_direction.invokeExact(handle());
            return new ScrollDirection(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_scroll_event_is_stop = Interop.downcallHandle(
        "gdk_scroll_event_is_stop",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) gdk_scroll_event_is_stop.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
