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
     */
    protected CrossingEvent(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CrossingEvent> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CrossingEvent(input);
    
    /**
     * Extracts the notify detail from a crossing event.
     * @return the notify detail of {@code event}
     */
    public org.gtk.gdk.NotifyType getDetail() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_detail.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.NotifyType.of(RESULT);
    }
    
    /**
     * Checks if the {@code event} surface is the focus surface.
     * @return {@code true} if the surface is the focus surface
     */
    public boolean getFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_focus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Extracts the crossing mode from a crossing event.
     * @return the mode of {@code event}
     */
    public org.gtk.gdk.CrossingMode getMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_crossing_event_get_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.CrossingMode.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_crossing_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_crossing_event_get_detail = Interop.downcallHandle(
                "gdk_crossing_event_get_detail",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_crossing_event_get_focus = Interop.downcallHandle(
                "gdk_crossing_event_get_focus",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_crossing_event_get_mode = Interop.downcallHandle(
                "gdk_crossing_event_get_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_crossing_event_get_type = Interop.downcallHandle(
                "gdk_crossing_event_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_crossing_event_get_type != null;
    }
}
