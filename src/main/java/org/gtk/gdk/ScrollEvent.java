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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ScrollEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ScrollEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ScrollEvent> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ScrollEvent(input, ownership);
    
    /**
     * Extracts the scroll deltas of a scroll event.
     * <p>
     * The deltas will be zero unless the scroll direction
     * is {@link ScrollDirection#SMOOTH}.
     * <p>
     * For the representation unit of these deltas, see
     * {@link ScrollEvent#getUnit}.
     * @param deltaX return location for x scroll delta
     * @param deltaY return location for y scroll delta
     */
    public void getDeltas(Out<Double> deltaX, Out<Double> deltaY) {
        MemorySegment deltaXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment deltaYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        try {
            DowncallHandles.gdk_scroll_event_get_deltas.invokeExact(
                    handle(),
                    (Addressable) deltaXPOINTER.address(),
                    (Addressable) deltaYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        deltaX.set(deltaXPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        deltaY.set(deltaYPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
    }
    
    /**
     * Extracts the direction of a scroll event.
     * @return the scroll direction of {@code event}
     */
    public org.gtk.gdk.ScrollDirection getDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_scroll_event_get_direction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ScrollDirection.of(RESULT);
    }
    
    /**
     * Extracts the scroll delta unit of a scroll event.
     * <p>
     * The unit will always be {@link ScrollUnit#WHEEL} if the scroll direction is not
     * {@link ScrollDirection#SMOOTH}.
     * @return the scroll unit.
     */
    public org.gtk.gdk.ScrollUnit getUnit() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_scroll_event_get_unit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ScrollUnit.of(RESULT);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_scroll_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_scroll_event_get_deltas = Interop.downcallHandle(
            "gdk_scroll_event_get_deltas",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_scroll_event_get_direction = Interop.downcallHandle(
            "gdk_scroll_event_get_direction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_scroll_event_get_unit = Interop.downcallHandle(
            "gdk_scroll_event_get_unit",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_scroll_event_is_stop = Interop.downcallHandle(
            "gdk_scroll_event_is_stop",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_scroll_event_get_type = Interop.downcallHandle(
            "gdk_scroll_event_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
