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
    @ApiStatus.Internal
    public ScrollEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ScrollEvent if its GType is a (or inherits from) "GdkScrollEvent".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ScrollEvent} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkScrollEvent", a ClassCastException will be thrown.
     */
    public static ScrollEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ScrollEvent.getType())) {
            return new ScrollEvent(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkScrollEvent");
        }
    }
    
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
        java.util.Objects.requireNonNull(deltaX, "Parameter 'deltaX' must not be null");
        MemorySegment deltaXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(deltaY, "Parameter 'deltaY' must not be null");
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
    public @NotNull org.gtk.gdk.ScrollDirection getDirection() {
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
    public @NotNull org.gtk.gdk.ScrollUnit getUnit() {
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
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_scroll_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdk.Event.Build {
        
         /**
         * A {@link ScrollEvent.Build} object constructs a {@link ScrollEvent} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ScrollEvent} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ScrollEvent} using {@link ScrollEvent#castFrom}.
         * @return A new instance of {@code ScrollEvent} with the properties 
         *         that were set in the Build object.
         */
        public ScrollEvent construct() {
            return ScrollEvent.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ScrollEvent.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
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
