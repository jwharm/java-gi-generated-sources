package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event caused by a pointing device moving between surfaces.
 */
public class CrossingEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkCrossingEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CrossingEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CrossingEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CrossingEvent if its GType is a (or inherits from) "GdkCrossingEvent".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CrossingEvent" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkCrossingEvent", a ClassCastException will be thrown.
     */
    public static CrossingEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkCrossingEvent"))) {
            return new CrossingEvent(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkCrossingEvent");
        }
    }
    
    /**
     * Extracts the notify detail from a crossing event.
     * @return the notify detail of {@code event}
     */
    public @NotNull org.gtk.gdk.NotifyType getDetail() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_detail.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.NotifyType(RESULT);
    }
    
    /**
     * Checks if the {@code event} surface is the focus surface.
     * @return {@code true} if the surface is the focus surface
     */
    public boolean getFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_focus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Extracts the crossing mode from a crossing event.
     * @return the mode of {@code event}
     */
    public @NotNull org.gtk.gdk.CrossingMode getMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.CrossingMode(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_crossing_event_get_detail = Interop.downcallHandle(
            "gdk_crossing_event_get_detail",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_crossing_event_get_focus = Interop.downcallHandle(
            "gdk_crossing_event_get_focus",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_crossing_event_get_mode = Interop.downcallHandle(
            "gdk_crossing_event_get_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
