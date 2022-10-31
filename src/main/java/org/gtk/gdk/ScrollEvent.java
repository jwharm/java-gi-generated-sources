package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to a scrolling motion.
 */
public class ScrollEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkScrollEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ScrollEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ScrollEvent if its GType is a (or inherits from) "GdkScrollEvent".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ScrollEvent" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkScrollEvent", a ClassCastException will be thrown.
     */
    public static ScrollEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkScrollEvent"))) {
            return new ScrollEvent(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkScrollEvent");
        }
    }
    
    /**
     * Extracts the scroll deltas of a scroll event.
     * <p>
     * The deltas will be zero unless the scroll direction
     * is {@link ScrollDirection#SMOOTH}.
     * @param deltaX return location for x scroll delta
     * @param deltaY return location for y scroll delta
     */
    public void getDeltas(Out<Double> deltaX, Out<Double> deltaY) {
        java.util.Objects.requireNonNull(deltaX, "Parameter 'deltaX' must not be null");
        java.util.Objects.requireNonNull(deltaY, "Parameter 'deltaY' must not be null");
        MemorySegment deltaXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment deltaYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        try {
            DowncallHandles.gdk_scroll_event_get_deltas.invokeExact(
                    handle(),
                    (Addressable) deltaXPOINTER.address(),
                    (Addressable) deltaYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        deltaX.set(deltaXPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        deltaY.set(deltaYPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
    }
    
    /**
     * Extracts the direction of a scroll event.
     * @return the scroll direction of {@code event}
     */
    public @NotNull org.gtk.gdk.ScrollDirection getDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_scroll_event_get_direction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ScrollDirection(RESULT);
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
     * @return {@code true} if the event is a scroll stop event
     */
    public boolean isStop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_scroll_event_is_stop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_scroll_event_get_deltas = Interop.downcallHandle(
            "gdk_scroll_event_get_deltas",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_scroll_event_get_direction = Interop.downcallHandle(
            "gdk_scroll_event_get_direction",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_scroll_event_is_stop = Interop.downcallHandle(
            "gdk_scroll_event_is_stop",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
