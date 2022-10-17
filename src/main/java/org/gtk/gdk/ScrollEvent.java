package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gdk_scroll_event_get_deltas = Interop.downcallHandle(
        "gdk_scroll_event_get_deltas",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the scroll deltas of a scroll event.
     * <p>
     * The deltas will be zero unless the scroll direction
     * is {@link ScrollDirection#SMOOTH}.
     */
    public @NotNull void getDeltas(@NotNull Out<Double> deltaX, @NotNull Out<Double> deltaY) {
        MemorySegment deltaXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment deltaYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            gdk_scroll_event_get_deltas.invokeExact(handle(), (Addressable) deltaXPOINTER.address(), (Addressable) deltaYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        deltaX.set(deltaXPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        deltaY.set(deltaYPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    private static final MethodHandle gdk_scroll_event_get_direction = Interop.downcallHandle(
        "gdk_scroll_event_get_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the direction of a scroll event.
     */
    public @NotNull ScrollDirection getDirection() {
        int RESULT;
        try {
            RESULT = (int) gdk_scroll_event_get_direction.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ScrollDirection(RESULT);
    }
    
    private static final MethodHandle gdk_scroll_event_is_stop = Interop.downcallHandle(
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
        int RESULT;
        try {
            RESULT = (int) gdk_scroll_event_is_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
